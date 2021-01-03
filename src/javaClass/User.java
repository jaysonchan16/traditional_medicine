/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaClass;

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
import form.NewPatient;

public class User {
    private String userid;
    private String password;
    protected Statement st = connect.connection();
    ResultSet rs;
    
    public User(){}
    
    public User(String userid)
    {
        this.userid = userid;
    }
    
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
    
    public int validateReference()
    {
        int count = 0;
        try {
            String countID = "Select count(*) as ID from Reference";
            rs = st.executeQuery(countID);
            count = rs.getInt("ID");
            if(count == 0)
            {
                return registerReference();
            }
            else
            {
                return 0;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
         return 0;
    }
    
    public int validateID(String User)
    {
        int count = 0;
        try {
            String countID = "Select count(*)as ID from Maintcode where User ='"+User+"'";
            rs = st.executeQuery(countID);
            try {
                count = rs.getInt("ID");
                if(count == 0)
                {
                    return registerMaintcode(User);
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
    
    public int registerMaintcode(String User) throws SQLException
    {
        try {
            String query = "insert into Maintcode(Code,Number,Remark,User)"
                    + "Select 'A',0,'PatientID','"+User+"' UNION ALL "
                    + "Select 'B',0,'PatientID','"+User+"' UNION ALL "
                    + "Select 'C',0,'PatientID','"+User+"' UNION ALL "
                    + "Select 'D',0,'PatientID','"+User+"' UNION ALL "
                    + "Select 'E',0,'PatientID','"+User+"' UNION ALL "
                    + "Select 'F',0,'PatientID','"+User+"' UNION ALL "
                    + "Select 'G',0,'PatientID','"+User+"' UNION ALL "
                    + "Select 'H',0,'PatientID','"+User+"' UNION ALL "
                    + "Select 'I',0,'PatientID','"+User+"' UNION ALL "
                    + "Select 'J',0,'PatientID','"+User+"' UNION ALL "
                    + "Select 'K',0,'PatientID','"+User+"' UNION ALL "
                    + "Select 'L',0,'PatientID','"+User+"' UNION ALL "
                    + "Select 'M',0,'PatientID','"+User+"' UNION ALL "
                    + "Select 'N',0,'PatientID','"+User+"' UNION ALL "
                    + "Select 'O',0,'PatientID','"+User+"' UNION ALL "
                    + "Select 'P',0,'PatientID','"+User+"' UNION ALL "
                    + "Select 'Q',0,'PatientID','"+User+"' UNION ALL "
                    + "Select 'R',0,'PatientID','"+User+"' UNION ALL "
                    + "Select 'S',0,'PatientID','"+User+"' UNION ALL "
                    + "Select 'T',0,'PatientID','"+User+"' UNION ALL "
                    + "Select 'U',0,'PatientID','"+User+"' UNION ALL "
                    + "Select 'V',0,'PatientID','"+User+"' UNION ALL "
                    + "Select 'W',0,'PatientID','"+User+"' UNION ALL "
                    + "Select 'X',0,'PatientID','"+User+"' UNION ALL "
                    + "Select 'Y',0,'PatientID','"+User+"' UNION ALL "
                    + "Select 'Z',0,'PatientID','"+User+"' UNION ALL "
                    + "Select 'GrasMedPi',0,'MedicineID','"+User+"' UNION ALL "
                    + "Select 'GrasMedPo',0,'MedicineID','"+User+"' UNION ALL "
                    + "Select 'TradMedPi',0,'MedicineID','"+User+"' UNION ALL "
                    + "Select 'TradMedPo',0,'MedicineID','"+User+"' UNION ALL "
                    + "Select '复方药粉',0,'ComboMedicine','"+User+"' UNION ALL "
                    + "Select '药丸', 0,'ComboMedicine','"+User+"' UNION ALL "
                    + "Select '药水', 0,'ComboMedicine','"+User+"' UNION ALL "
                    + "Select '单味药粉', 0,'ComboMedicine','"+User+"' UNION ALL "
                    + "Select 'Disease', 0, 'DiseaseID','"+User+"' UNION ALL "
                    + "Select 'Prescription', 0, 'PrescriptionID','"+User+"' UNION ALL "
                    + "Select 'isUpgrade', 0, 'User','"+User+"'";
            
            st.executeUpdate(query);
            st.close();
            return 1;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return 0;
        }
    }
    
    public int registerReference() throws SQLException
    {
        try {
            String query = "insert into Reference(Reference)"
                    + "Select '解表剂' UNION ALL "
                    + "Select '泻下剂' UNION ALL "
                    + "Select '和解剂' UNION ALL "
                    + "Select '清热剂' UNION ALL "
                    + "Select '祛暑剂' UNION ALL "
                    + "Select '温里剂' UNION ALL "
                    + "Select '表里双解剂' UNION ALL "
                    + "Select '补益剂' UNION ALL "
                    + "Select '固涩剂' UNION ALL "
                    + "Select '安神剂' UNION ALL "
                    + "Select '开窍剂' UNION ALL "
                    + "Select '理气剂' UNION ALL "
                    + "Select '理血剂' UNION ALL "
                    + "Select '治凤剂' UNION ALL "
                    + "Select '治燥剂' UNION ALL "
                    + "Select '祛湿剂' UNION ALL "
                    + "Select '祛痰剂' UNION ALL "
                    + "Select '消食剂' UNION ALL "
                    + "Select '驱虫剂' UNION ALL "
                    + "Select '涌吐剂' UNION ALL "
                    + "Select '治痛痒剂'";
            
            st.executeUpdate(query);
            st.close();
            return 1;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return 0;
        }
    }
    
    public String registerUser(String position) throws SQLException
    {
        try {
            String query = "insert into User(userid,password,position) "
                    + "Select '"+userid+"','"+password+"','"+position+"'";
            System.out.println(query);
            st.executeUpdate(query);
            st.close();
            return "1";
        } catch (SQLException ex) {
            return "User.registerUser get error on line 231, "+ex.getMessage();
        }
    }
    
    public Boolean validateBeginner(String username) throws SQLException
    {
        System.out.println(username);
        int isBeginner = 0;
        String isUpgrade = "Select Number from Maintcode where Code='isUpgrade' and User = '"+username+"'";
        rs = st.executeQuery(isUpgrade);
        isBeginner = rs.getInt("Number");
        if(isBeginner == 0)
        {
            rs.close();
            return true;
        }
        else
        {
            rs.close();
            return false;
        }
    }
    
    public String UpdateMaintcode(String user) throws SQLException{
        String query = "Update Maintcode Set Number = trim('1') where Code = 'isUpgrade' and User = '"+user+"'";
        System.out.println(query);
        SQLQuery sql = new SQLQuery();

        return sql.AddEditDeleteQuery(query);
    }
    
    public String UpdateUsername(String olduser, String newuser) throws SQLException{
        String query = "Update User Set userid = '"+newuser+"' where userid = '"+olduser+"'";
        System.out.println(query);
        SQLQuery sql = new SQLQuery();
        String result = sql.AddEditDeleteQuery(query);
        setUserid(newuser);
        return result;
    }
    
    public String UpdatePassword(String userid, String newPassword) throws SQLException
    {
        String query = "Update User Set password = '"+newPassword+"' where userid = '"+userid+"'";
        System.out.println(query);
        SQLQuery sql = new SQLQuery();
        String result = sql.AddEditDeleteQuery(query);
        setPassword(newPassword);
        return result;
    }
    
    public Boolean ValidateUser(String username) throws SQLException
    {
        System.out.println(username);
        int user = 0;
        String isUpgrade = "Select count(1) as Number from User where userid = '"+username+"'";
        rs = st.executeQuery(isUpgrade);
        user = rs.getInt("Number");
        if(user == 0)
        {
            rs.close();
            return true;
        }
        else
        {
            rs.close();
            return false;
        }
    }
    
    public Boolean ValidateAdmin(String username) throws SQLException
    {
        System.out.println(username);
        int user = 0;
        String isUpgrade = "Select count(1) as Number from User where userid = '"+username+"' and position = 'Admin'";
        rs = st.executeQuery(isUpgrade);
        user = rs.getInt("Number");
        if(user == 0)
        {
            rs.close();
            return true;
        }
        else
        {
            rs.close();
            return false;
        }
    }
    
    public String DeleteUser(String User) throws SQLException{
        String query = "Delete From User where userid ='"+User+"' and position ='Supervisor'";
          
        SQLQuery sql = new SQLQuery();
        
        return sql.AddEditDeleteQuery(query);
    }
    
    public String DeleteUsername(String user) throws SQLException
    {
        String query = "Delete From User where userid ='"+user+"'";
        SQLQuery sql = new SQLQuery();
        return sql.AddEditDeleteQuery(query);
    }
    
    public Boolean ValidateSupervisor() throws SQLException
    {
        int user = 0;
        String isUpgrade = "Select count(1) as Number from User where position = 'Supervisor'";
        rs = st.executeQuery(isUpgrade);
        user = rs.getInt("Number");
        if(user == 0)
        {
            rs.close();
            return true;
        }
        else
        {
            rs.close();
            return false;
        }
    }
    
    public List<User> comboName() throws SQLException{
        List<User> name = new ArrayList<>();
        String query = "Select userid from User where position ='Supervisor'";
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                 name.add(new User(rs.getString("userid")));
            } 
        } 
        catch (Exception e)
        {
            throw(new NoSuchElementException(e.getMessage()));
        }
        rs.close();
        st.close();
        return name;
    }
}

