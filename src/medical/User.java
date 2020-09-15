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
    protected Statement st = connect.connection();
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
            rs.close();
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
            String countID = "Select count(*)as ID from Maintcode";
            rs = st.executeQuery(countID);
            try {
                count = rs.getInt("ID");
                if(count == 0)
                {
                    return registerMaintcode();
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
    
    public int validateUser() throws SQLException
    {
        int count = 0;
        String countID = "Select count(*)as ID from User";
        rs = st.executeQuery(countID);
        count = rs.getInt("ID");
        if(count == 0)
        {
            st.close();
            rs.close();
            return 1;
        }
        else 
        {
            st.close();
            rs.close();
            return 0;
        }
        
    }
    
    public int registerMaintcode() throws SQLException
    {
        try {
            String query = "insert into Maintcode(Code,Number,Remark)"
                    + "Select 'A',0,'PatientID' UNION ALL "
                    + "Select 'B',0,'PatientID' UNION ALL "
                    + "Select 'C',0,'PatientID' UNION ALL "
                    + "Select 'D',0,'PatientID' UNION ALL "
                    + "Select 'E',0,'PatientID' UNION ALL "
                    + "Select 'F',0,'PatientID' UNION ALL "
                    + "Select 'G',0,'PatientID' UNION ALL "
                    + "Select 'H',0,'PatientID' UNION ALL "
                    + "Select 'I',0,'PatientID' UNION ALL "
                    + "Select 'J',0,'PatientID' UNION ALL "
                    + "Select 'K',0,'PatientID' UNION ALL "
                    + "Select 'L',0,'PatientID' UNION ALL "
                    + "Select 'M',0,'PatientID' UNION ALL "
                    + "Select 'N',0,'PatientID' UNION ALL "
                    + "Select 'O',0,'PatientID' UNION ALL "
                    + "Select 'P',0,'PatientID' UNION ALL "
                    + "Select 'Q',0,'PatientID' UNION ALL "
                    + "Select 'R',0,'PatientID' UNION ALL "
                    + "Select 'S',0,'PatientID' UNION ALL "
                    + "Select 'T',0,'PatientID' UNION ALL "
                    + "Select 'U',0,'PatientID' UNION ALL "
                    + "Select 'V',0,'PatientID' UNION ALL "
                    + "Select 'W',0,'PatientID' UNION ALL "
                    + "Select 'X',0,'PatientID' UNION ALL "
                    + "Select 'Y',0,'PatientID' UNION ALL "
                    + "Select 'Z',0,'PatientID' UNION ALL "
                    + "Select 'GrasMedPi',0,'MedicineID' UNION ALL "
                    + "Select 'GrasMedPo',0,'MedicineID' UNION ALL "
                    + "Select 'TradMedPi',0,'MedicineID' UNION ALL "
                    + "Select 'TradMedPo',0,'MedicineID' UNION ALL "
                    + "Select '复方药粉',0,'ComboMedicine' UNION ALL "
                    + "Select '药丸', 0,'ComboMedicine' UNION ALL "
                    + "Select '药水', 0,'ComboMedicine' UNION ALL "
                    + "Select '单味药粉', 0,'ComboMedicine' UNION ALL "
                    + "Select 'Disease', 0, 'DiseaseID' UNION ALL "
                    + "Select 'Prescription', 0, 'PrescriptionID'";
            
            st.executeUpdate(query);
            st.close();
            return 1;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return 0;
        }
    }
    
    public String registerUser() throws SQLException
    {
        try {
            String query = "insert into User(userid,password) "
                    + "Select '"+userid+"','"+password+"'";
            System.out.println(query);
            st.executeUpdate(query);
            st.close();
            return "1";
        } catch (SQLException ex) {
            return "User.registerUser get error on line 231, "+ex.getMessage();
        }
    }
}

