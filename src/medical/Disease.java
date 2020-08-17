/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sheng
 */
public class Disease {
    
    private String symptom;
    private int temperature;
    private String bloodPressure;
    private String pulseCondition;
    private String tongueQuality;
    private String tongueCoating;
    private String pee;
    private String shit;
    private int patientID;
    private String IC;
    private String name;
    private String phoneNo;
    private String lastUpdateDateTime;
    private String createDateTime;
    public Statement st = connect.connection();
    ResultSet rs;
    
    public Disease(){}
    
    public Disease(String symptom)
    {
        this.symptom = symptom;
    }
    
    public Disease(String symptom, int temperature, String bloodPressure, String pulseCondition, String tongueQuality, 
            String tongueCoating, String pee, String shit, int patientID){
        this.symptom = symptom;
        this.temperature = temperature;
        this.bloodPressure = bloodPressure;
        this.pulseCondition = pulseCondition;
        this.tongueQuality = tongueQuality;
        this.tongueCoating = tongueCoating;
        this.pee = pee;
        this.shit = shit;
        this.patientID = patientID;
    }
    
    public Disease(String symptom, int temperature, String bloodPressure, String pulseCondition, String tongueQuality, 
            String tongueCoating, String pee, String shit, int patientID, String lastUpdateDateTime, String createDateTime,
            String IC, String name, String phoneNo){
        this.symptom = symptom;
        this.temperature = temperature;
        this.bloodPressure = bloodPressure;
        this.pulseCondition = pulseCondition;
        this.tongueQuality = tongueQuality;
        this.tongueCoating = tongueCoating;
        this.pee = pee;
        this.shit = shit;
        this.patientID = patientID;
        this.lastUpdateDateTime = lastUpdateDateTime;
        this.createDateTime = createDateTime;
        this.IC = IC;
        this.name = name;
        this.phoneNo = phoneNo;
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
    public String getPee() {
        return pee;
    }

    /**
     * @param pee the pee to set
     */
    public void setPee(String pee) {
        this.pee = pee;
    }

    /**
     * @return the shit
     */
    public String getShit() {
        return shit;
    }

    /**
     * @param shit the shit to set
     */
    public void setShit(String shit) {
        this.shit = shit;
    }

    /**
     * @return the patientID
     */
    public int getPatientID() {
        return patientID;
    }

    /**
     * @param patientID the patientID to set
     */
    public void setPatientID(int patientID) {
        this.patientID = patientID;
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
     * @return the phoneNo
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * @param phoneNo the phoneNo to set
     */
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
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
    
    public int AddDisease(){
        String query = "Insert into Disease(Symptom, Temperature, BloodPressure, PulseCondition, TongueQuality, TongueCoating, Pee, Shit, PatientID, lastUpateDateTime, createDateTime)"
                + "Select trim('"+symptom+"'), trim('"+temperature+"'), trim('"+bloodPressure+"'), trim('"+pulseCondition+"'),"
                + "trim('"+tongueQuality+"'), trim('"+tongueCoating+"'), trim('"+pee+"'), trim('"+shit+"'), trim('"+patientID+"'), lastUpdateDateTime = datetime('now','localtime'), createDateTime = datetime('now','localtime')";
        try {
            st.executeUpdate(query);
            st.close(); 
            return 1;
            
        } catch (SQLException ex) {
            Logger.getLogger(NewPatient.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public int EditDisease(){
         String query = "Update Disease Set Symptom = trim('"+symptom+"'), Temperature = "+temperature+","
                 + " BloodPressure = trim('"+bloodPressure+"'), PulseCondition = trim('"+pulseCondition+"'), TongueQuality = trim('"+tongueQuality+"'),"
                 + " TongueCoating = trim('"+tongueCoating+"'), Pee = trim('"+pee+"'), Shit = trim('"+shit+"'), lastUpdateDateTime = datetime('now','localtime')"
                 + " where patientID = "+patientID+" order by 1 desc";
        try {
            st.executeUpdate(query);
            st.close(); 
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(NewPatient.class.getName()).log(Level.SEVERE, null, ex);
        }
            return 0;
    }
    
    public int DeleteDisease() throws SQLException{
         String query = "Delete From Disease where patientID ="+patientID+" order by 1 desc";
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
    
    public Disease getDisease(String IC) throws SQLException{
        String query = "Select b.Symptom, b.Temperature, b.BloodPressure, b.PulseCondition,"
                + "b.TongueQuality, b.TongueCoating, b.Pee, b.Shit,a.ID,b.lastUpdateDateTime,b.createDateTime, a.IC,a.name,a.phone,"
                + "from Patient a Inner Join Disease b "
                + "ON a.ID = b.PatientID where a.IC = '"+IC+"'";
        rs = st.executeQuery(query);
        try {
             while (rs.next()) {
                 return new Disease(rs.getString("Symptom"),rs.getInt("Temperature"),
                         rs.getString("BloodPressure"),rs.getString("PulseCondition"),
                         rs.getString("TongueQuality"),rs.getString("TongueCoating"),rs.getString("Pee"),rs.getString("Shit"),
                         rs.getInt("ID"),rs.getString("lastUpdateDateTime"),rs.getString("createDateTime"),rs.getString("IC"), rs.getString("name"), rs.getString("phone"));
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
    
    public List<Disease> getDiseases() throws SQLException{
        List<Disease> diseaseList = new ArrayList<>();
            String query = "Select b.Symptom, b.Temperature, b.BloodPressure, b.PulseCondition,"
                + "b.TongueQuality, b.TongueCoating, b.Pee, b.Shit,a.ID,b.lastUpdateDateTime,b.createDateTime, a.IC,a.name,a.phone,"
                + "from Patient a Inner Join Disease b "
                + "ON a.ID = b.PatientID";
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                 diseaseList.add(new Disease(rs.getString("Symptom"),rs.getInt("Temperature"),
                         rs.getString("BloodPressure"),rs.getString("PulseCondition"),
                         rs.getString("TongueQuality"),rs.getString("TongueCoating"),rs.getString("Pee"),rs.getString("Shit"),
                         rs.getInt("ID"),rs.getString("lastUpdateDateTime"),rs.getString("createDateTime"),rs.getString("IC"), rs.getString("name"), rs.getString("phone")));
            } 
        } 
        catch (Exception e)
        {
            throw(new NoSuchElementException(e.getMessage()));
        }
        return diseaseList;
    }

    


}
