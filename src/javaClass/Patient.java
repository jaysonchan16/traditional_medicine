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
import javaClass.connect;
import javaClass.Code;
import java.io.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Patient {
    protected String name;
    protected String gender;
    protected int age;
    protected String IC;
    protected String phone;
    protected String address;
    protected String ID;
    protected String lastUpdateDateTime;
    protected String createDateTime;
    private String user;
    protected Statement st = connect.connection();
    ResultSet rs;
    
    public Patient(){}
    
    public Patient(String _IC){
        this.IC = _IC;
    }
    
    public Patient(String _IC, String user){
        this.IC = _IC;
        this.user = user;
    }
    
    public Patient(String _IC, String _name, String _phone, String user){
        this.IC = _IC;
        this.name = _name;
        this.phone = _phone;
        this.user = user;
    }
    
    public Patient(String _IC, String _name, String _gender, int _age, String _phone, String _address,String _user){
        this.name = _name;
        this.gender = _gender;
        this.age = _age;
        this.IC = _IC;
        this.phone = _phone;
        this.address = _address;
        this.user = _user;
    }
    
    public Patient(String _IC, String _name, String _gender, int _age, String _phone, String _address, String _ID, String _user){
        this.name = _name;
        this.gender = _gender;
        this.age = _age;
        this.IC = _IC;
        this.phone = _phone;
        this.address = _address;
        this.ID = _ID;
        this.user = _user;
    }
    
    public Patient(String _IC, String _name, String _gender, int _age, String _phone, String _address,String lastUpdateDateTime, String createDateTime, String _user){
        this.name = _name;
        this.gender = _gender;
        this.age = _age;
        this.IC = _IC;
        this.phone = _phone;
        this.address = _address;
        this.lastUpdateDateTime = lastUpdateDateTime;
        this.createDateTime = createDateTime;
        this.user = _user;
    }
    
    public Patient(String _IC, String _name, String _gender, int _age, String _phone, String _address,String lastUpdateDateTime, String createDateTime,String _ID, String _user){
        this.ID = _ID;
        this.name = _name;
        this.gender = _gender;
        this.age = _age;
        this.IC = _IC;
        this.phone = _phone;
        this.address = _address;
        this.lastUpdateDateTime = lastUpdateDateTime;
        this.createDateTime = createDateTime;
        this.user = _user;
    }

    public String getID() {
        return ID;
    }

    /**
     * @param name the name to set
     */
    public void setID(String _ID) {
        this.ID = _ID;
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the IC
     */
    public String getIC() {
        return IC;
    }

    /**
     * @param IC the IC to set
     */
    public void setIC(String IC) {
        this.IC = IC;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
    /**
     * @return the lastUpdateDateTime
     */
    public String getLastUpdateDateTime() {
        return lastUpdateDateTime;
    }

    /**
     * @param lastUpdateDateTime the lastUpdateDateTime to set
     */
    public void setLastUpdateDateTime(String lastUpdateDateTime) {
        this.lastUpdateDateTime = lastUpdateDateTime;
    }
    
       /**
     * @return the createDateTime
     */
    public String getCreateDateTime() {
        return createDateTime;
    }

    /**
     * @param createDateTime the createDateTime to set
     */
    public void setCreateDateTime(String createDateTime) {
        this.createDateTime = createDateTime;
    }
    
        /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }
    
    public HashMap<String,String> AddNewPatient() throws SQLException{
        Code code = new Code();
        HashMap<String, String> map = new HashMap<String,String>();
        map = code.validatePatientID(name,user);
        HashMap<String,String> returnMessage = new HashMap<String,String>();
        if(map.get("messages").equalsIgnoreCase("") && validatePatient(IC,user) == 0)
        {        
            String query = "insert into Patient(ID, IC, name, gender, age, phone, address,lastUpdateDateTime,createDateTime,User)"
                    + "Select '"+map.get("data")+"',trim('"+IC+"'), trim('"+name+"'), trim('"+gender+"'), trim('"+age+"'), trim('"+phone+"'), trim('"+address+"'), datetime('now','localtime'),datetime('now','localtime'), trim('"+user+"')";

            SQLQuery sql = new SQLQuery();
            returnMessage.put("returnMessage", sql.AddEditDeleteQuery(query));
            returnMessage.put("ID", map.get("data"));
            return returnMessage;
        }
        else
        {
            returnMessage.put("returnMessage","Patient.AddNewPatient() get error on line 217, "+map.get("messages"));
            returnMessage.put("ID","");
            return returnMessage;
        }
        
    }
    
    public String EditPatient() throws SQLException{
        String query = "Update Patient Set IC = trim('"+IC+"'), name = trim('"+name+"'), gender = trim('"+gender+"'), age = "+age+", phone = trim('"+phone+"'), address = trim('"+address+"'), lastUpdateDateTime = datetime('now','localtime')"
                 + "where ID = '"+ID+"' and User = '"+user+"'";
         
        SQLQuery sql = new SQLQuery();
        
        return sql.AddEditDeleteQuery(query);
    }
    
    public String DeletePatient() throws SQLException{
        String query = "Delete From Patient where ID = '"+ID+"' and User = '"+user+"'";
          
        SQLQuery sql = new SQLQuery();
        
        return sql.AddEditDeleteQuery(query);
    }
    
    public Patient getPatient(String IC, String ID, String user) throws SQLException{
        String query ="";
        if(ID.equalsIgnoreCase(""))
        {
            query = "Select ID,IC,name,gender,age,phone,address,lastUpdateDateTime,createDateTime,User from Patient where IC = '"+IC+"' and User = '"+user+"'";
        }
        else
        {
            query = "Select ID,IC,name,gender,age,phone,address,lastUpdateDateTime,createDateTime,User from Patient where ID = '"+ID+"' and User = '"+user+"'";
        }
        rs = st.executeQuery(query);
        try {
             while (rs.next()) {
                 return new Patient(rs.getString("IC"), rs.getString("name"),rs.getString("gender"),
                 rs.getInt("age"),rs.getString("phone"),rs.getString("address"),rs.getString("lastUpdateDateTime"),rs.getString("createDateTime"),
                         rs.getString("ID"),rs.getString("User")
                 );
            }   
        } 
        catch (NullPointerException e)
        {
            throw(new NoSuchElementException(e.getMessage()));
        }
        finally{
            rs.close();
            st.close(); 
        }
        return new Patient("1");
    }
    
    public List<Patient> getPatients() throws SQLException{
        List<Patient> patientList = new ArrayList<>();
        String query = "Select ID,IC,name,gender,age,phone,address,lastUpdateDateTime,createDateTime from Patient";
        
        System.out.println(query);
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                 patientList.add(new Patient(rs.getString("IC"), rs.getString("name"),rs.getString("gender"),
                 rs.getInt("age"),rs.getString("phone"),rs.getString("address"),rs.getString("lastUpdateDateTime"),
                 rs.getString("createDateTime"),rs.getString("ID")));
            } 
        } 
        catch (Exception e)
        {
            throw(new NoSuchElementException(e.getMessage()));
        }
        return patientList;
    }
    
    public List<Patient> getPatients(String from, String to, String IC, String ID, String user) throws SQLException{
        List<Patient> patientList = new ArrayList<>();
        String query="";
        query = "Select ID,IC,name,gender,age,phone,address,lastUpdateDateTime,createDateTime,User from Patient where (IC=trim('"+IC+"') or ID=trim('"+ID+"') or (createDateTime>='"+from+"' and createDateTime<='"+to+"')) and User ='"+user+"'";
        /*if(from.equalsIgnoreCase("") || to.equalsIgnoreCase(""))
        {
            query = "Select ID,IC,name,gender,age,phone,address,lastUpdateDateTime,createDateTime from Patient where IC=trim('"+IC+"') and ID=trim('"+ID+"')";
        }
        else if(IC.equalsIgnoreCase("") && ID.equalsIgnoreCase(""))
        {
            query = "Select ID,IC,name,gender,age,phone,address,lastUpdateDateTime,createDateTime from Patient where createDateTime>='"+from+"' and createDateTime<='"+to+"'";
        }
        else if(IC.equalsIgnoreCase("") && (from.equalsIgnoreCase("") || to.equalsIgnoreCase("")))
        {
            query = "Select ID,IC,name,gender,age,phone,address,lastUpdateDateTime,createDateTime from Patient where ID=trim('"+ID+"')";
        }
        else if(ID.equalsIgnoreCase("") && (from.equalsIgnoreCase("") || to.equalsIgnoreCase("")))
        {
            query = "Select ID,IC,name,gender,age,phone,address,lastUpdateDateTime,createDateTime from Patient where IC=trim('"+IC+"')";
        }
        else if(IC.equalsIgnoreCase(""))
        {
            query = "Select ID,IC,name,gender,age,phone,address,lastUpdateDateTime,createDateTime from Patient where ID='"+ID+"' and createDateTime>='"+from+"' and createDateTime<='"+to+"'";
        }
        else if(ID.equalsIgnoreCase(""))
        {
            query = "Select ID,IC,name,gender,age,phone,address,lastUpdateDateTime,createDateTime from Patient where IC='"+IC+"' and createDateTime>='"+from+"' and createDateTime<='"+to+"'";
        }
        else
        {
            query = "Select ID,IC,name,gender,age,phone,address,lastUpdateDateTime,createDateTime from Patient where ID='"+ID+"' and IC='"+IC+"' and createDateTime>='"+from+"' and createDateTime<='"+to+"'";
        }*/
        System.out.println(query);
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                 patientList.add(new Patient(rs.getString("IC"), rs.getString("name"),rs.getString("gender"),
                 rs.getInt("age"),rs.getString("phone"),rs.getString("address"),rs.getString("lastUpdateDateTime"),
                 rs.getString("createDateTime"),rs.getString("ID"),rs.getString("User")));
            } 
        } 
        catch (Exception e)
        {
            throw(new NoSuchElementException(e.getMessage()));
        }
        return patientList;
    }

    public int validatePatient(String IC, String user) throws SQLException
    {
        try {
            String query = "Select count(1) as count from Patient where IC = '"+IC+"' and User = '"+user+"'";
            int count = 0;
            rs = st.executeQuery(query);
            count = rs.getInt("count");
            rs.close();
            st.close();
            return count;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return 1;
        }
        finally{
            rs.close();
            st.close();
        }
        
    }
    
    public List<Patient> getDetail(String contribute, String detail, String arrangement) throws SQLException{
        List<Patient> patientList = new ArrayList<>();
        String query="";
        
        query = "Select ID,IC,name,gender,age,phone,address,lastUpdateDateTime,createDateTime,User from Patient where "+contribute+" like '%"+detail+"%' order by "+contribute+" "+arrangement+"";
          
        System.out.println(query);
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                 patientList.add(new Patient(rs.getString("IC"), rs.getString("name"),rs.getString("gender"),
                 rs.getInt("age"),rs.getString("phone"),rs.getString("address"),rs.getString("lastUpdateDateTime"),
                 rs.getString("createDateTime"),rs.getString("ID"),rs.getString("User")));
            } 
        } 
        catch (Exception e)
        {
            throw(new NoSuchElementException(e.getMessage()));
        }
        return patientList;
    }
    
    public List<Patient> getAllDetail(String ID, String IC, String name, String gender, String age, String phone, String arrangement, String user) throws SQLException{
        List<Patient> patientList = new ArrayList<>();
        String query="";
        
        query = "Select ID,IC,name,gender,age,phone,address,lastUpdateDateTime,createDateTime, User from Patient where ID like '%"+ID+"%' and IC like '%"+IC+"%' and "
                + "name like '%"+name+"%' and gender like '%"+gender+"%' and age like '%"+age+"%' and phone like '%"+phone+"%' and User ='"+user+"' order by ID "+arrangement+"";
          
        System.out.println(query);
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                 patientList.add(new Patient(rs.getString("IC"), rs.getString("name"),rs.getString("gender"),
                 rs.getInt("age"),rs.getString("phone"),rs.getString("address"),rs.getString("lastUpdateDateTime"),
                 rs.getString("createDateTime"),rs.getString("ID"),rs.getString("User")));
            } 
        } 
        catch (Exception e)
        {
            throw(new NoSuchElementException(e.getMessage()));
        }
        return patientList;
    }
    
    public String UpdateUser(String oldUser, String newUser) throws SQLException
    {
        SQLQuery sql = new SQLQuery();
        return sql.UpdateUser("Patient", oldUser, newUser);
    }
    
    public String DeleteUser(String User) throws SQLException
    {
        SQLQuery sql = new SQLQuery();
        return sql.DeleteUser("Patient", user);
    }
    
}
