/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical;

/**
 *
 * @author Sheng
 */
import java.io.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class User {
    private String userid;
    private String password;
    private Statement st =connect.connection(); 
    ResultSet rs;
    
    public User(){}
    
    public User(String userid, String password){
        this.userid = userid;
        this.password = password;
    }

    /**
     * @return the userid
     */
    public String getUserid() {
        return userid;
    }

    /**
     * @param userid the userid to set
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /*public void login(String userid, String password)
    {
        st = connect.connection();
        String query = "Select * from User where userid = '"+userid+"'";
        System.out.println(query);
         try {
             ResultSet rs = st.executeQuery(query);
            
            // loop through the result set
            while (rs.next()) {
                
                //System.out.println(rs.getString("userid") + "\t" +
                //                   rs.getString("password"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
       // return(password.equals(theResident.getPassword()));
    }*/
    
    public User getUser(String username) throws SQLException{
        List<User> user = new ArrayList<>();
        String query = "Select * from User where userid = '"+username+"'";
        rs = st.executeQuery(query);
        try {
                /*while ((line = br.readLine()) != null) {
                  String arr[] = line.split(",");
                  if(arr.length != 9)
                  {
                      continue;
                  }
                  if(username.equals(arr[0]))
                  {
                      return new Resident(arr[0],arr[1],arr[2],arr[3],arr[4],
                              Double.valueOf(arr[5]),arr[6],
                              Integer.valueOf(arr[7]),Integer.valueOf(arr[8]));
                  }
                }*/
                 while (rs.next()) {
                     return new User(rs.getString("userid"), rs.getString("password"));
                //System.out.println(rs.getString("userid") + "\t" +
                //                   rs.getString("password"));
                   }
               
        } 
        catch (Exception e)
        {
            throw(new NoSuchElementException(e.getMessage()));
        }
        finally
        {
            st.close();
        }
        return new User();
    }
    
    public Boolean login(String username, String password) throws SQLException
    {
        User theUser = getUser(username);
        return(password.equals(theUser.getPassword()));
    }
    
    public int validateID()
    {
        int count = 0;
        try {
            String countID = "Select count(*)as ID from maintcode";
            rs = st.executeQuery(countID);
            try {
                count = rs.getInt("ID");
                System.out.println(count);
                if(count == 0)
                {
                    String query = "insert into maintcode(Code,Number)"
                            + "Select 'A',1 UNION ALL "
                            + "Select 'B',1 UNION ALL "
                            + "Select 'C',1 UNION ALL "
                            + "Select 'D',1 UNION ALL "
                            + "Select 'E',1 UNION ALL "
                            + "Select 'F',1 UNION ALL "
                            + "Select 'G',1 UNION ALL "
                            + "Select 'H',1 UNION ALL "
                            + "Select 'I',1 UNION ALL "
                            + "Select 'J',1 UNION ALL "
                            + "Select 'K',1 UNION ALL "
                            + "Select 'L',1 UNION ALL "
                            + "Select 'M',1 UNION ALL "
                            + "Select 'N',1 UNION ALL "
                            + "Select 'O',1 UNION ALL "
                            + "Select 'P',1 UNION ALL "
                            + "Select 'Q',1 UNION ALL "
                            + "Select 'R',1 UNION ALL "
                            + "Select 'S',1 UNION ALL "
                            + "Select 'T',1 UNION ALL "
                            + "Select 'U',1 UNION ALL "
                            + "Select 'V',1 UNION ALL "
                            + "Select 'W',1 UNION ALL "
                            + "Select 'X',1 UNION ALL "
                            + "Select 'Y',1 UNION ALL "
                            + "Select 'Z',1";
                    
                    st.executeUpdate(query);
                    st.close();
                    
                    return 1;
                }
                else
                {
                    return 0;
                }
            } catch (SQLException ex) {
                Logger.getLogger(NewPatient.class.getName()).log(Level.SEVERE, null, ex);
                return 0;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }
}
