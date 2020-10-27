/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaClass;

import javaClass.Code;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sheng
 */
public class Disease extends Patient{
    
    private String diseaseID;
    private String symptom;
    private int temperature;
    private String bloodPressure;
    private String pulseCondition;
    private String tongueQuality;
    private String tongueCoating;
    private String peeshit;
    private String patientID;
    private String lastUpdateDateTime;
    private String createDateTime;
    private String history;
    private String category;
    private String user;
    public Statement st = connect.connection();
    ResultSet rs;
    
    public Disease(){}
    
    public Disease(String diseaseID)
    {
        this.diseaseID = diseaseID;
    }
    
    public Disease(String diseaseID, String user)
    {
        this.diseaseID = diseaseID;
        this.user = user;
    }
    
    public Disease(String IC, String name, String phone, String User)
    {
        super(IC, name, phone, User);
    }
    
    public Disease(String symptom, int temperature, String bloodPressure, String pulseCondition, String tongueQuality, 
            String tongueCoating, String peeshit, String category, String history, String patientID, String DiseaseID, String user){
        this.symptom = symptom;
        this.temperature = temperature;
        this.bloodPressure = bloodPressure;
        this.pulseCondition = pulseCondition;
        this.tongueQuality = tongueQuality;
        this.tongueCoating = tongueCoating;
        this.peeshit = peeshit;
        this.patientID = patientID;
        this.category = category;
        this.history = history;
        this.diseaseID = DiseaseID;
        this.user = user;
    }
    
    public Disease(String symptom, int temperature, String bloodPressure, String pulseCondition, String tongueQuality, 
            String tongueCoating, String peeshit, String category, String history, String IC, String name, String phoneNo, String User){
        super(IC,name,phoneNo, User);
        this.symptom = symptom;
        this.temperature = temperature;
        this.bloodPressure = bloodPressure;
        this.pulseCondition = pulseCondition;
        this.tongueQuality = tongueQuality;
        this.tongueCoating = tongueCoating;
        this.peeshit = peeshit;
        this.category = category;
        this.history = history;
    }
    
    public Disease(String symptom, int temperature, String bloodPressure, String pulseCondition, String tongueQuality, 
            String tongueCoating, String peeshit, String category, String history, String patientID, String DiseaseID, String lastUpdateDateTime, String createDateTime, String user){
        this.symptom = symptom;
        this.temperature = temperature;
        this.bloodPressure = bloodPressure;
        this.pulseCondition = pulseCondition;
        this.tongueQuality = tongueQuality;
        this.tongueCoating = tongueCoating;
        this.peeshit = peeshit;
        this.category = category;
        this.history = history;
        this.diseaseID = DiseaseID;
        this.patientID =patientID;
        this.lastUpdateDateTime = lastUpdateDateTime;
        this.createDateTime = createDateTime;
        this.user = user;
    }
    
    public Disease(String symptom, int temperature, String bloodPressure, String pulseCondition, String tongueQuality, 
            String tongueCoating, String peeshit, String category, String history,
            String IC, String name, String phoneNo, String gender, String address, int age, String User){
        super(IC,name,gender,age,phoneNo,address,User);
        this.symptom = symptom;
        this.temperature = temperature;
        this.bloodPressure = bloodPressure;
        this.pulseCondition = pulseCondition;
        this.tongueQuality = tongueQuality;
        this.tongueCoating = tongueCoating;
        this.peeshit = peeshit;
        this.category = category;
        this.history = history;
        
    }
    
    public Disease(String symptom, int temperature, String bloodPressure, String pulseCondition, String tongueQuality, 
            String tongueCoating, String peeshit, String category, String history, String patientID, String DiseaseID, String lastUpdateDateTime, String createDateTime,
            String IC, String name, String phoneNo, String User){
        super(IC,name,phoneNo,User);
        this.symptom = symptom;
        this.temperature = temperature;
        this.bloodPressure = bloodPressure;
        this.pulseCondition = pulseCondition;
        this.tongueQuality = tongueQuality;
        this.tongueCoating = tongueCoating;
        this.peeshit = peeshit;
        this.category = category;
        this.history = history;
        this.diseaseID = DiseaseID;
        this.patientID =patientID;
        this.lastUpdateDateTime = lastUpdateDateTime;
        this.createDateTime = createDateTime;
    
}
    /**
     * @return the symptom
     */
    public String getSymptom() {
        return symptom;
    }

    /**
     * @param symptom the symptom to set
     */
    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    /**
     * @return the temperature
     */
    public int getTemperature() {
        return temperature;
    }

    /**
     * @param temperature the temperature to set
     */
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    /**
     * @return the bloodPressure
     */
    public String getBloodPressure() {
        return bloodPressure;
    }

    /**
     * @param bloodPressure the bloodPressure to set
     */
    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    /**
     * @return the pulseCondition
     */
    public String getPulseCondition() {
        return pulseCondition;
    }

    /**
     * @param pulseCondition the pulseCondition to set
     */
    public void setPulseCondition(String pulseCondition) {
        this.pulseCondition = pulseCondition;
    }

    /**
     * @return the tongueQuality
     */
    public String getTongueQuality() {
        return tongueQuality;
    }

    /**
     * @param tongueQuality the tongueQuality to set
     */
    public void setTongueQuality(String tongueQuality) {
        this.tongueQuality = tongueQuality;
    }

    /**
     * @return the tongueCoating
     */
    public String getTongueCoating() {
        return tongueCoating;
    }

    /**
     * @param tongueCoating the tongueCoating to set
     */
    public void setTongueCoating(String tongueCoating) {
        this.tongueCoating = tongueCoating;
    }

    /**
     * @return the pee
     */
    public String getPeeShit() {
        return peeshit;
    }

    /**
     * @param pee the pee to set
     */
    public void setPeeShit(String peeshit) {
        this.peeshit = peeshit;
    }

    /**
     * @return the patientID
     */
    public String getPatientID() {
        return patientID;
    }

    /**
     * @param patientID the patientID to set
     */
    public void setPatientID(String patientID) {
        this.patientID = patientID;
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
     * @return the history
     */
    public String getHistory() {
        return history;
    }

    /**
     * @param history the history to set
     */
    public void setHistory(String history) {
        this.history = history;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }
    
        /**
     * @return the diseaseID
     */
    public String getDiseaseID() {
        return diseaseID;
    }

    /**
     * @param diseaseID the diseaseID to set
     */
    public void setDiseaseID(String diseaseID) {
        this.diseaseID = diseaseID;
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
    
    public HashMap<String,String> AddDisease() throws SQLException{
        HashMap<String,String> returnMessage = new HashMap<String,String>();
        try {
            Code code = new Code();
            HashMap<String, String> map = new HashMap<String,String>();
            map = code.validateID("Disease",user);
            if(map.get("messages").equalsIgnoreCase(""))
            {
                String query = "Insert into Disease(ID, Symptom, Temperature, BloodPressure, PulseCondition, TongueQuality, TongueCoating, PeeShit, Category, History, PatientID, lastUpdateDateTime, createDateTime, User)"
                        + "Select '"+map.get("data")+"', trim('"+symptom+"'), trim('"+temperature+"'), trim('"+bloodPressure+"'), trim('"+pulseCondition+"'),"
                        + "trim('"+tongueQuality+"'), trim('"+tongueCoating+"'), trim('"+peeshit+"'), trim('"+category+"'),trim('"+history+"'),trim('"+patientID+"'), datetime('now','localtime'), datetime('now','localtime'), trim('"+user+"')";
                System.out.println(query);
                SQLQuery sql = new SQLQuery();
                returnMessage.put("returnMessage", sql.AddEditDeleteQuery(query));
                returnMessage.put("ID", map.get("data"));
                return returnMessage;
            }
            else
            {
                returnMessage.put("returnMessage","Disease.AddDisease class line 281 get error, "+map.get("messages"));
                returnMessage.put("ID", "");
                return returnMessage;
            }
        } catch (SQLException ex) {
            returnMessage.put("returnMessage",ex.getMessage());
            returnMessage.put("ID", "");
            return returnMessage;
        }
    }
    
    public String EditDisease() throws SQLException{
         String query = "Update Disease Set Symptom = trim('"+symptom+"'), Temperature = "+temperature+","
                 + " BloodPressure = trim('"+bloodPressure+"'), PulseCondition = trim('"+pulseCondition+"'), TongueQuality = trim('"+tongueQuality+"'),"
                 + " TongueCoating = trim('"+tongueCoating+"'), PeeShit = trim('"+peeshit+"'), Category = trim('"+category+"'), History = trim('"+history+"'), lastUpdateDateTime = datetime('now','localtime')"
                 + " where ID = '"+diseaseID+"' and User = '"+user+"'";
        System.out.println(query);
         SQLQuery sql = new SQLQuery();

        return sql.AddEditDeleteQuery(query);
    }
    
    public String DeleteDisease() throws SQLException{
        String query = "Delete From Disease where ID = '"+diseaseID+"' and User = '"+user+"'";
        System.out.println(query);
        SQLQuery sql = new SQLQuery();

        return sql.AddEditDeleteQuery(query);
    }
    
    public Disease getDisease(String IC, String User) throws SQLException{
        String query = "Select b.ID as DiseaseID, b.Symptom, b.Temperature, b.BloodPressure, b.PulseCondition,"
                + "b.TongueQuality, b.TongueCoating, b.PeeShit,b.Category, b.History, a.ID,b.lastUpdateDateTime,b.createDateTime, a.IC,a.name,a.phone,a.User "
                + "from Patient a Inner Join Disease b "
                + "ON a.ID = b.PatientID where a.IC = '"+IC+"' and a.User ='"+User+"'";
        rs = st.executeQuery(query);
        try {
             while (rs.next()) {
                 return new Disease(rs.getString("Symptom"),rs.getInt("Temperature"),
                         rs.getString("BloodPressure"),rs.getString("PulseCondition"),
                         rs.getString("TongueQuality"),rs.getString("TongueCoating"),rs.getString("PeeShit"), rs.getString("Category"), rs.getString("History"),
                         rs.getString("ID"), rs.getString("DiseaseID"),rs.getString("lastUpdateDateTime"),rs.getString("createDateTime"),rs.getString("IC"), rs.getString("name"), rs.getString("phone"),rs.getString("User"));
            }   
        } 
        catch (NullPointerException e)
        {
            //throw(new NoSuchElementException(e.getMessage()));
            return new Disease("1");
        }
        finally{
            st.close(); 
        }
        return new Disease("1");
    }
    
    public List<Disease> getDiseases(String User) throws SQLException{
        List<Disease> diseaseList = new ArrayList<>();
            String query = "Select b.ID as DiseaseID, b.Symptom, b.Temperature, b.BloodPressure, b.PulseCondition,"
                + "b.TongueQuality, b.TongueCoating, b.PeeShit,b.Category, b.History, a.ID,b.lastUpdateDateTime,b.createDateTime, a.IC,a.name,a.phone,a.User "
                + "from Patient a Inner Join Disease b "
                + "ON a.ID = b.PatientID "
                + "Where a.User = '"+User+"'";
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                 diseaseList.add(new Disease(rs.getString("Symptom"),rs.getInt("Temperature"),
                         rs.getString("BloodPressure"),rs.getString("PulseCondition"),
                         rs.getString("TongueQuality"),rs.getString("TongueCoating"),rs.getString("PeeShit"),rs.getString("Category"), rs.getString("History"),
                         rs.getString("ID"),rs.getString("DiseaseID"),rs.getString("lastUpdateDateTime"),rs.getString("createDateTime"),rs.getString("IC"), rs.getString("name"), rs.getString("phone"),rs.getString("User")));
            } 
        } 
        catch (Exception e)
        {
            throw(new NoSuchElementException(e.getMessage()));
        }
        return diseaseList;
    }

    public List<Disease> getDiseasePatients(String from, String to, String IC, String ID, String User) throws SQLException{
        List<Disease> patientDisease = new ArrayList<>();
        String query = "";
        query = "Select Symptom,Temperature,BloodPressure,PulseCondition,TongueQuality,TongueCoating,PeeShit,Category, "
                + "History,d.ID as DiseaseID, d.PatientID as PatientID, d.lastUpdateDateTime as lastUpdateDateTime,"
                + "d.createDateTime as createDateTime, d.User as User from Disease d "
                + "left join Patient p on d.PatientID = p.ID "
                + "where (p.IC=trim('"+IC+"') or p.ID=trim('"+ID+"') "
                + "or (d.createDateTime>='"+from+"' and d.createDateTime<='"+to+"')) "
                + "and d.User = '"+User+"'";

        System.out.println(query);
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                 patientDisease.add(new Disease(rs.getString("Symptom"),rs.getInt("Temperature"),
                         rs.getString("BloodPressure"),rs.getString("PulseCondition"),
                         rs.getString("TongueQuality"),rs.getString("TongueCoating"),rs.getString("PeeShit"),rs.getString("Category"), rs.getString("History"),
                         rs.getString("PatientID"),rs.getString("DiseaseID"),rs.getString("lastUpdateDateTime"),rs.getString("createDateTime"),rs.getString("User")));
            } 
        } 
        catch (Exception e)
        {
            throw(new NoSuchElementException(e.getMessage()));
        }
        return patientDisease;
    }

    public List<Disease> getDiseaseIDPatients(String diseaseID, String User) throws SQLException{
        List<Disease> patientDisease = new ArrayList<>();
        String query = "";
        query = "Select Symptom,Temperature,BloodPressure,PulseCondition,TongueQuality,TongueCoating,PeeShit,Category, "
                + "History,d.ID as DiseaseID, d.PatientID as PatientID, d.lastUpdateDateTime as lastUpdateDateTime,"
                + "d.createDateTime as createDateTime,p.IC, p.name, p.phone, p.User as User "
                + "from Disease d inner join Patient p on d.PatientID = p.ID where d.ID = '"+diseaseID+"' and p.User ='"+User+"'";

        System.out.println(query);
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                 patientDisease.add(new Disease(rs.getString("Symptom"),rs.getInt("Temperature"),
                         rs.getString("BloodPressure"),rs.getString("PulseCondition"),
                         rs.getString("TongueQuality"),rs.getString("TongueCoating"),rs.getString("PeeShit"),rs.getString("Category"), rs.getString("History"),
                         rs.getString("PatientID"),rs.getString("DiseaseID"),rs.getString("lastUpdateDateTime"),rs.getString("createDateTime"),rs.getString("User")));
            } 
        } 
        catch (Exception e)
        {
            throw(new NoSuchElementException(e.getMessage()));
        }
        return patientDisease;
    }

    public String UpdateUser(String oldUser, String newUser) throws SQLException
    {
        SQLQuery sql = new SQLQuery();
        return sql.UpdateUser("Disease", oldUser, newUser);
    }
}
