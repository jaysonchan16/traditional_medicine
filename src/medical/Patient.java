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

public class Patient {
    private String name;
    private String gender;
    private int age;
    private String IC;
    private String phone;
    private String address;
    private int ID;
    public Statement st = connect.connection();
    ResultSet rs;
    
    public Patient(){}
    
    public Patient(String _IC){
        this.IC = _IC;
    }
    
    public Patient(String _IC, String _name, String _gender, int _age, String _phone, String _address){
        this.name = _name;
        this.gender = _gender;
        this.age = _age;
        this.IC = _IC;
        this.phone = _phone;
        this.address = _address;
    }
    
    public Patient(int _ID,String _IC, String _name, String _gender, int _age, String _phone, String _address){
        this.ID = _ID;
        this.name = _name;
        this.gender = _gender;
        this.age = _age;
        this.IC = _IC;
        this.phone = _phone;
        this.address = _address;
    }

    public int getID() {
        return ID;
    }

    /**
     * @param name the name to set
     */
    public void setID(int _ID) {
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
    
    public int AddNewPatient(){
        /* String query = "insert into Patient(IC, name, gender, age, phone, address) values('"+IC+"','"+name+"','"+gender+"',"
                + "'"+age+"','"+phone+"','"+address+"')";*/
        String query = "insert into Patient(IC, name, gender, age, phone, address)"
                + "Select trim('"+IC+"'), trim('"+name+"'), trim('"+gender+"'), trim('"+age+"'), trim('"+phone+"'), trim('"+address+"')";
        try {
            st.executeUpdate(query);
            st.close(); 
            return 1;
            
        } catch (SQLException ex) {
            Logger.getLogger(NewPatient.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public int EditPatient(String name, String gender, int age, String IC, String phone, String address){
         String query = "Update Patient Set name = trim('"+name+"'), gender = trim('"+gender+"'), age = "+age+", phone = trim('"+phone+"'), address = trim('"+address+"')"
                 + "where IC = '"+IC+"'";
        try {
            st.executeUpdate(query);
            st.close(); 
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(NewPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
            return 0;
    }
    
    public int DeletePatient() throws SQLException{
         String query = "Delete From Patient where IC = '"+IC+"'";
          System.out.println(query);
        try {
            st.executeUpdate(query);
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(NewPatient.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        finally
        {
            st.close();
        }
    }
    
    public Patient getPatient(String IC) throws SQLException{
        String query = "Select ID,IC,name,gender,age,phone,address from Patient where IC = '"+IC+"'";
        rs = st.executeQuery(query);
        try {
             while (rs.next()) {
                 return new Patient(rs.getInt("ID"),rs.getString("IC"), rs.getString("name"),rs.getString("gender"),
                 rs.getInt("age"),rs.getString("phone"),rs.getString("address"));
            }   
        } 
        catch (NullPointerException e)
        {
            //throw(new NoSuchElementException(e.getMessage()));
            return new Patient("1");
        }
        finally{
            st.close(); 
        }
        return new Patient("1");
    }
    
    public List<Patient> getPatients() throws SQLException{
        List<Patient> patientList = new ArrayList<>();
        String query = "Select IC,name,gender,age,phone,address from Patient";
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                 patientList.add(new Patient(rs.getString("IC"), rs.getString("name"),rs.getString("gender"),
                 rs.getInt("age"),rs.getString("phone"),rs.getString("address")));
            } 
        } 
        catch (Exception e)
        {
            throw(new NoSuchElementException(e.getMessage()));
        }
        return patientList;
    }
}
