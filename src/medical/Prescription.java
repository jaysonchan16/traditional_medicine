/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

/**
 *
 * @author Sheng
 */
public class Prescription {
    
    private int chufang;
    private String categorytable;
    private String nametable;
    private int jiliang;
    private float price;
    private float totalprice;
    private String patientID;
    private String diseaseID;
    public Statement st = connect.connection();
    ResultSet rs;

    /**
     * @return the chufang
     */
    public int getChufang() {
        return chufang;
    }

    /**
     * @param chufang the chufang to set
     */
    public void setChufang(int chufang) {
        this.chufang = chufang;
    }

    /**
     * @return the categorytable
     */
    public String getCategorytable() {
        return categorytable;
    }

    /**
     * @param categorytable the categorytable to set
     */
    public void setCategorytable(String categorytable) {
        this.categorytable = categorytable;
    }

    /**
     * @return the nametable
     */
    public String getNametable() {
        return nametable;
    }

    /**
     * @param nametable the nametable to set
     */
    public void setNametable(String nametable) {
        this.nametable = nametable;
    }

    /**
     * @return the jiliang
     */
    public int getJiliang() {
        return jiliang;
    }

    /**
     * @param jiliang the jiliang to set
     */
    public void setJiliang(int jiliang) {
        this.jiliang = jiliang;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the totalprice
     */
    public float getTotalprice() {
        return totalprice;
    }

    /**
     * @param totalprice the totalprice to set
     */
    public void setTotalprice(float totalprice) {
        this.totalprice = totalprice;
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
    
    public Prescription(){}
    
    public Prescription(int chufang, String categorytable, String nametable, int jiliang, float price, float totalprice, String patientID, String diseaseID)
    {
        this.chufang = chufang;
        this.categorytable = categorytable;
        this.nametable = nametable;
        this.jiliang = jiliang;
        this.price = price;
        this.totalprice = totalprice;
        this.patientID = patientID;
        this.diseaseID = diseaseID;
    }
    
    public HashMap<String,String> addPrescription(int chufang, String categorytable, String nametable, int jiliang, float price, float totalprice, String patientID, String diseaseID, String maintcode)
    {
        HashMap<String,String> returnMessage = new HashMap<String,String>();
        try {
            Code code = new Code();
            HashMap<String, String> map = new HashMap<String,String>();
            map = code.validateID(maintcode);
            if(map.get("messages").equalsIgnoreCase(""))
            {
                String query = "Insert into Prescription(ID, Chufang, Category, Name, Jiliang, Price, TotalPrice, PatientID, DiseaseID, lastUpdateDateTime, createDateTime)"
                        + "Select '"+map.get("data")+"', trim('"+chufang+"'), trim('"+categorytable+"'), trim('"+nametable+"'), trim('"+jiliang+"'),"
                        + " trim('"+price+"'), trim('"+totalprice+"'), trim('"+patientID+"'),trim('"+diseaseID+"'),datetime('now','localtime'), datetime('now','localtime')";
                SQLQuery sql = new SQLQuery();
                returnMessage.put("returnMessage", sql.AddEditDeleteQuery(query));
                returnMessage.put("ID", map.get("data"));
                return returnMessage;
            }
            else
            {
                returnMessage.put("returnMessage",code.validateID(maintcode).get("messages"));
                returnMessage.put("ID", "");
                return returnMessage;
            }
        } catch (SQLException ex) {
            returnMessage.put("returnMessage",ex.getMessage());
            returnMessage.put("ID", "");
            return returnMessage;
        }
    }

}
