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

public class Medicine {
    private String name;
    private String reference;
    private String component;
    private String effect;
    private String indications;
    private float sellprice;
    private float gram;
    private float cost;
    private float scoop;
    private String lastUpdateDateTime;
    private String createDateTime;
    private String code;
    private String medicine;
    private String user;
    private String appliance;
    private String property;
    protected Statement st = connect.connection();
    ResultSet rs;
    private int referenceForNotDuplicateMedicineName;
    
    public Medicine(){}
    
    public Medicine(String name)
    {
        this.name = name;
    }
    
    public Medicine(String reference, int referenceForNotDuplicateMedicineName)
    {
        this.reference = reference;
        this.referenceForNotDuplicateMedicineName = referenceForNotDuplicateMedicineName;
    }
    
    public Medicine(String name, String user)
    {
        this.name = name;
        this.user = user;
    }
    
    public Medicine(String name, String reference, String user)
    {
        this.name = name;
        this.reference = reference;
        this.user = user;
    }
    
    public Medicine(String name, String reference, float sellprice, float gram, String code, String medicine, String user)
    {
        this.name = name;
        this.reference = reference;
        this.sellprice = sellprice;
        this.gram = gram;
        this.code = code;
        this.medicine = medicine;
        this.user = user;
    }
    
    public Medicine(String name, String reference, String effect, float scoop, float sellprice, float gram, float cost, String createDateTime, String lastUpdateDateTime, String code, String medicine, String user){
        this.name = name;
        this.reference = reference;
        this.effect = effect;
        this.scoop = scoop;
        this.sellprice = sellprice;
        this.gram = gram;
        this.cost = cost;
        this.lastUpdateDateTime = lastUpdateDateTime;
        this.createDateTime = createDateTime;
        this.code = code;
        this.medicine = medicine;
        this.user = user;
    }
    
    public Medicine(String name, String reference, String component, String indications, String effect, float scoop, float sellprice, float gram, float cost, String createDateTime, String lastUpdateDateTime, String code, String medicine, String user){
        this.name = name;
        this.reference = reference;
        this.component = component;
        this.indications = indications;
        this.effect = effect;
        this.scoop = scoop;
        this.sellprice = sellprice;
        this.gram = gram;
        this.cost = cost;
        this.lastUpdateDateTime = lastUpdateDateTime;
        this.createDateTime = createDateTime;
        this.code = code;
        this.medicine = medicine;
        this.user = user;
    }

    public Medicine(String name, String reference, String component, String indications, String property, String appliance,String effect, float scoop, float sellprice, float gram, float cost, String createDateTime, String lastUpdateDateTime, String code, String medicine, String user){
        this.name = name;
        this.reference = reference;
        this.component = component;
        this.indications = indications;
        this.effect = effect;
        this.scoop = scoop;
        this.sellprice = sellprice;
        this.gram = gram;
        this.cost = cost;
        this.lastUpdateDateTime = lastUpdateDateTime;
        this.createDateTime = createDateTime;
        this.code = code;
        this.medicine = medicine;
        this.user = user;
        this.property = property;
        this.appliance = appliance;
    }
    
    /**
     * @return the name
     */
    public float getScoop() {
        return scoop;
    }

    /**
     * @param name the name to set
     */
    public void setScoop(float scoop) {
        this.scoop = scoop;
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
     * @return the component
     */
    public String getComponent() {
        return component;
    }

    /**
     * @param component the component to set
     */
    public void setComponent(String component) {
        this.component = component;
    }

    /**
     * @return the effect
     */
    public String getEffect() {
        return effect;
    }

    /**
     * @param effect the effect to set
     */
    public void setEffect(String effect) {
        this.effect = effect;
    }

    /**
     * @return the indications
     */
    public String getIndications() {
        return indications;
    }

    /**
     * @param indications the indications to set
     */
    public void setIndications(String indications) {
        this.indications = indications;
    }

    /**
     * @return the sellprice
     */
    public float getSellprice() {
        return sellprice;
    }

    /**
     * @param sellprice the sellprice to set
     */
    public void setSellprice(float sellprice) {
        this.sellprice = sellprice;
    }

    /**
     * @return the gram
     */
    public float getGram() {
        return gram;
    }

    /**
     * @param gram the gram to set
     */
    public void setGram(float gram) {
        this.gram = gram;
    }

    /**
     * @return the cost
     */
    public float getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(float cost) {
        this.cost = cost;
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
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }
  
    /**
     * @return the medicine
     */
    public String getMedicine() {
        return medicine;
    }

    /**
     * @param medicine the medicine to set
     */
    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }
    
    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @return the appliance
     */
    public String getAppliance() {
        return appliance;
    }

    /**
     * @param appliance the appliance to set
     */
    public void setAppliance(String appliance) {
        this.appliance = appliance;
    }

    /**
     * @return the property
     */
    public String getProperty() {
        return property;
    }

    /**
     * @param property the property to set
     */
    public void setProperty(String property) {
        this.property = property;
    }
    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }
    
    public List<Medicine> getDetail(String contribute, String detail, String User) throws SQLException{
     List<Medicine> medicineList = new ArrayList<>();
        String query = "";
    
        query = "Select ID, name, reference, component, indications, '' as property, '' as appliance, effect, scoop, sellprice, gram, cost, createDateTime, lastUpdateDateTime, medicine, User From GrassMedicinePill where "+contribute+" like '%"+detail+"%' and User = '"+User+"' UNION ALL "
                + "Select ID, name, reference, component, indications, '' as property, '' as appliance, effect, scoop, sellprice, gram, cost, createDateTime, lastUpdateDateTime, medicine, User From GrassMedicinePotion where "+contribute+" like '%"+detail+"%' and User = '"+User+"' UNION ALL "
                + "Select ID, name, reference, component, indications, '' as property, '' as appliance, effect, scoop, sellprice, gram, cost, createDateTime, lastUpdateDateTime, medicine, User From TraditionalMedicinePotion where "+contribute+" like '%"+detail+"%' and User = '"+User+"' UNION ALL "
                + "Select ID, name, reference, '' as component, '' as indications, property, appliance, effect, scoop, sellprice, gram, cost, createDateTime, lastUpdateDateTime, medicine, User From TraditionalMedicinePill where "+contribute+" like '%"+detail+"%' and User = '"+User+"'";
     
        System.out.println(query);
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                 medicineList.add(new Medicine(rs.getString("name"), rs.getString("reference"),
                         rs.getString("component"),rs.getString("indications"), rs.getString("property"),rs.getString("appliance"),
                         rs.getString("effect"),rs.getFloat("scoop"),rs.getFloat("sellprice"),
                         rs.getFloat("gram"),rs.getFloat("cost"),rs.getString("createDateTime"),rs.getString("lastUpdateDateTime"),rs.getString("ID"), rs.getString("medicine"), rs.getString("User")));
            } 
        } 
        catch (Exception e)
        {
            throw(new NoSuchElementException(e.getMessage()));
        }
        return medicineList;
    }
    
    public List<Medicine> getAllDetail(String User) throws SQLException{
        List<Medicine> medicineList = new ArrayList<>();
         
        String query = "Select ID, name, reference, component, indications, '' as property, '' as appliance, effect, scoop, sellprice, gram, cost, createDateTime, lastUpdateDateTime, medicine, User From GrassMedicinePill where User ='"+User+"' UNION ALL "
                + "Select ID, name, reference, component, indications, '' as property, '' as appliance,effect, scoop, sellprice, gram, cost, createDateTime, lastUpdateDateTime, medicine, User From GrassMedicinePotion where User ='"+User+"' UNION ALL "
                + "Select ID, name, reference, component, indications, '' as property, '' as appliance,effect, scoop, sellprice, gram, cost, createDateTime, lastUpdateDateTime, medicine, User From TraditionalMedicinePotion where User ='"+User+"' UNION ALL "
                + "Select ID, name, reference, '' as component, '' as indications, property, appliance, effect, scoop, sellprice, gram, cost, createDateTime, lastUpdateDateTime, medicine, User From TraditionalMedicinePill where User ='"+User+"'";

        System.out.println(query);
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                 medicineList.add(new Medicine(rs.getString("name"),rs.getString("reference"),
                         rs.getString("component"),rs.getString("indications"), rs.getString("property"),rs.getString("appliance"),
                         rs.getString("effect"),rs.getFloat("scoop"),rs.getFloat("sellprice"),
                         rs.getFloat("gram"),rs.getFloat("cost"),rs.getString("createDateTime"),rs.getString("lastUpdateDateTime"),rs.getString("ID"), rs.getString("medicine"), rs.getString("User")));
            } 
        } 
        catch (Exception e)
        {
            throw(new NoSuchElementException(e.getMessage()));
        }
        return medicineList;
    }
    
    public List<Medicine> getDetailMedicineReferenceName(String medic, String reference, String name, String User) throws SQLException{
        List<Medicine> medicineList = new ArrayList<>();
         
        String query = "Select ID, name, reference, component, indications, '' as property, '' as appliance, effect, scoop, sellprice, gram, cost, createDateTime, lastUpdateDateTime, medicine, User From GrassMedicinePill where medicine='"+medic+"' and reference='"+reference+"' and name = '"+name+"' and User ='"+User+"' UNION ALL "
                + "Select ID, name, reference, component, indications, '' as property, '' as appliance,effect, scoop, sellprice, gram, cost, createDateTime, lastUpdateDateTime, medicine, User From GrassMedicinePotion where medicine='"+medic+"' and reference='"+reference+"' and name = '"+name+"' and User ='"+User+"' UNION ALL "
                + "Select ID, name, reference, component, indications, '' as property, '' as appliance,effect, scoop, sellprice, gram, cost, createDateTime, lastUpdateDateTime, medicine, User From TraditionalMedicinePotion where medicine='"+medic+"' and reference='"+reference+"' and name = '"+name+"' and User ='"+User+"' UNION ALL "
                + "Select ID, name, reference, '' as component, '' as indications, property, appliance, effect, scoop, sellprice, gram, cost, createDateTime, lastUpdateDateTime, medicine, User From TraditionalMedicinePill where medicine='"+medic+"' and reference='"+reference+"' and name = '"+name+"' and User ='"+User+"'";

        System.out.println(query);
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                 medicineList.add(new Medicine(rs.getString("name"),rs.getString("reference"),
                         rs.getString("component"),rs.getString("indications"), rs.getString("property"),rs.getString("appliance"),
                         rs.getString("effect"),rs.getFloat("scoop"),rs.getFloat("sellprice"),
                         rs.getFloat("gram"),rs.getFloat("cost"),rs.getString("createDateTime"),rs.getString("lastUpdateDateTime"),rs.getString("ID"), rs.getString("medicine"), rs.getString("User")));
            } 
        } 
        catch (Exception e)
        {
            throw(new NoSuchElementException(e.getMessage()));
        }
        return medicineList;
    }

    public List<Medicine> getMedicineDetail(String name, String reference, String component, String indications, 
            String property, String appliance,String effect, float scoop, float sellprice, float gram, 
            float cost, String code, String medicine, String user) throws SQLException{
        List<Medicine> medicineList = new ArrayList<>();
        
        String query = "Select ID, name, reference, component, indications, '' as property, '' as appliance, "
                + "effect, scoop, sellprice, gram, cost, createDateTime, lastUpdateDateTime, medicine, User "
                + "From GrassMedicinePill "
                + "where name like '%"+name+"%' and reference like '%"+reference+"%' and component like '%"+component+"%' "
                + "and indications like '%"+indications+"%' and property like '%"+property+"%' and appliance like '%"+appliance+"%' and effect like '%"+effect+"%' and scoop like '%"+scoop+"%' and sellprice like '%"+sellprice+"%' and gram like '%"+gram+"%' and appliance like '%"+appliance+"%' and medicine like '%"+medicine+"%' "
                + "and ID like '%"+code+"%' and User ='"+user+"' UNION ALL "
                + "Select ID, name, reference, component, indications, '' as property, '' as appliance,"
                + "effect, scoop, sellprice, gram, cost, createDateTime, lastUpdateDateTime, medicine, User "
                + "From GrassMedicinePotion where name like '%"+name+"%' and reference like '%"+reference+"%' "
                + "and component like '%"+component+"%' and indications like '%"+indications+"%' "
                + "and property like '%"+property+"%' and appliance like '%"+appliance+"%' "
                + "and effect like '%"+effect+"%' and scoop like '%"+scoop+"%' and sellprice like '%"+sellprice+"%' "
                + "and gram like '%"+gram+"%' and appliance like '%"+appliance+"%' and medicine like '%"+medicine+"%' "
                + "and ID like '%"+code+"%' and User ='"+user+"' UNION ALL "
                + "Select ID, name, reference, component, indications, '' as property, '' as appliance,effect, "
                + "scoop, sellprice, gram, cost, createDateTime, lastUpdateDateTime, medicine, User "
                + "From TraditionalMedicinePotion where name like '%"+name+"%' and reference like '%"+reference+"%' "
                + "and component like '%"+component+"%' and indications like '%"+indications+"%' "
                + "and property like '%"+property+"%' and appliance like '%"+appliance+"%' "
                + "and effect like '%"+effect+"%' and scoop like '%"+scoop+"%' and sellprice like '%"+sellprice+"%' "
                + "and gram like '%"+gram+"%' and appliance like '%"+appliance+"%' and medicine like '%"+medicine+"%' "
                + "and ID like '%"+code+"%' and User ='"+user+"' UNION ALL "
                + "Select ID, name, reference, '' as component, '' as indications, property, appliance, "
                + "effect, scoop, sellprice, gram, cost, createDateTime, lastUpdateDateTime, medicine, User "
                + "From TraditionalMedicinePill where name like '%"+name+"%' and reference like '%"+reference+"%' "
                + "and component like '%"+component+"%' and indications like '%"+indications+"%' "
                + "and property like '%"+property+"%' and appliance like '%"+appliance+"%' "
                + "and effect like '%"+effect+"%' and scoop like '%"+scoop+"%' and sellprice like '%"+sellprice+"%' "
                + "and gram like '%"+gram+"%' and appliance like '%"+appliance+"%' and medicine like '%"+medicine+"%' "
                + "and ID like '%"+code+"%' and User ='"+user+"'";
          
        System.out.println(query);
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                 medicineList.add(new Medicine(rs.getString("name"),rs.getString("reference"),
                 rs.getString("component"),rs.getString("indications"),rs.getString("property"),rs.getString("appliance"),
                 rs.getString("effect"),rs.getFloat("scoop"),rs.getFloat("sellprice"),rs.getFloat("gram"),
                 rs.getFloat("cost"),rs.getString("createDateTime"),rs.getString("lastUpdateDateTime"),
                 rs.getString("ID"), rs.getString("medicine"), rs.getString("User")));
            } 
        } 
        catch (Exception e)
        {
            throw(new NoSuchElementException(e.getMessage()));
        }
        return medicineList;
    }
    
    /**
     * @return the reference
     */
    public String getReference() {
        return reference;
    }

    /**
     * @param reference the reference to set
     */
    public void setReference(String reference) {
        this.reference = reference;
    }

    /**
     * @return the referenceForNotDuplicateMedicineName
     */
    public int getReferenceForNotDuplicateMedicineName() {
        return referenceForNotDuplicateMedicineName;
    }

    /**
     * @param referenceForNotDuplicateMedicineName the referenceForNotDuplicateMedicineName to set
     */
    public void setReferenceForNotDuplicateMedicineName(int referenceForNotDuplicateMedicineName) {
        this.referenceForNotDuplicateMedicineName = referenceForNotDuplicateMedicineName;
    }

    

    

    
}
