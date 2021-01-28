/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaClass;

import javaClass.connect;
import javaClass.Disease;
import javaClass.Code;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;

/**
 *
 * @author Sheng
 */
public class Prescription extends Disease{
    
    private String prescriptionID;
    private int chufang;
    private String categorytable;
    private String nametable;
    private int jiliang;
    private float price;
    private float totalprice;
    private String patientID;
    private String diseaseID;
    private String lastUpdateDateTime;
    private String createDateTime;
    private String userid;
    private String user;
    private float initialWeight;
    private String reference;
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
    
     /**
     * @return the prscriptionID
     */
    public String getPrescriptionID() {
        return prescriptionID;
    }

    /**
     * @param prscriptionID the prscriptionID to set
     */
    public void setPrescriptionID(String prescriptionID) {
        this.prescriptionID = prescriptionID;
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
    
    /**
     * @return the initialWeight
     */
    public float getInitialWeight() {
        return initialWeight;
    }
    
    /**
     * @param initialWeight the initialWeight to set
     */
    public void setInitialWeight(float initialWeight) {
        this.initialWeight = initialWeight;
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
    
    public Prescription(){}
    
    /*public Prescription(String prescriptionID){
        this.prescriptionID = prescriptionID;
    }*/
    
    public Prescription(String prescriptionID, String user){
        this.prescriptionID = prescriptionID;
        this.user = user;
    }
    
    public Prescription(String prescriptionID, String categorytable, String nametable, int jiliang, float price, float totalprice, String user)
    {
        this.prescriptionID = prescriptionID;
        this.categorytable = categorytable;
        this.nametable = nametable;
        this.jiliang = jiliang;
        this.price = price;
        this.totalprice = totalprice;
        this.user = user;
    }
    
    public Prescription(String prescriptionID, int chufang, String categorytable, String nametable, int jiliang, float price, float totalprice, String patientID, String IC, String name, String phone, String user)
    {
        super(IC, name, phone, user);
        this.prescriptionID = prescriptionID;
        this.categorytable = categorytable;
        this.nametable = nametable;
        this.jiliang = jiliang;
        this.price = price;
        this.chufang = chufang;
        this.totalprice = totalprice;
        this.patientID = patientID;
        //this.diseaseID = diseaseID;
    }
    
    public Prescription(int chufang, String categorytable, String nametable, int jiliang, float price, float totalprice, String prescriptionID, String patientID, String diseaseID, 
            String lastUpdateDateTime, String createDateTime, String symptom, int temperature,String bloodPressure, String pulseCondition, String tongueQuality, String tongueCoating, String peeshit, String category,
            String history, String IC, String name, String phoneNo, String user)
    {
        super(symptom,temperature,bloodPressure,pulseCondition,tongueQuality,tongueCoating,peeshit,category,history,IC,name,phoneNo, user);
        this.chufang = chufang;
        this.categorytable = categorytable;
        this.nametable = nametable;
        this.jiliang = jiliang;
        this.price = price;
        this.totalprice = totalprice;
        this.patientID = patientID;
        this.diseaseID = diseaseID;
        this.prescriptionID = prescriptionID;
        this.lastUpdateDateTime = lastUpdateDateTime;
        this.createDateTime = createDateTime;
    }
    
    public Prescription(int chufang, String categorytable, String reference, String nametable, int jiliang, float price, float totalprice, float initialweight, String prescriptionID, String patientID, String diseaseID, 
            String lastUpdateDateTime, String createDateTime, String symptom, int temperature,String bloodPressure, String pulseCondition, String tongueQuality, String tongueCoating, String peeshit, String category,
            String history, int latest, int billno, String IC, String name, String phoneNo, int age, String gender, String address, String user)
    {
        super(symptom,temperature,bloodPressure,pulseCondition,tongueQuality,tongueCoating,
                peeshit,category,history,IC,name,phoneNo,gender,address,age,latest,billno,user);
        this.chufang = chufang;
        this.categorytable = categorytable;
        this.reference = reference;
        this.nametable = nametable;
        this.jiliang = jiliang;
        this.price = price;
        this.totalprice = totalprice;
        this.patientID = patientID;
        this.diseaseID = diseaseID;
        this.prescriptionID = prescriptionID;
        this.lastUpdateDateTime = lastUpdateDateTime;
        this.createDateTime = createDateTime;
        this.initialWeight = initialweight;
    }
    
    public HashMap<String,String> addPrescription(int chufang, String categorytable, String reference, String nametable, int jiliang, float price, float totalprice, String patientID, String diseaseID, String maintcode, String user, String remaining, String medicineID, float weight)
    {
        HashMap<String,String> returnMessage = new HashMap<String,String>();
        try {
            Code code = new Code();
            HashMap<String, String> map = new HashMap<String,String>();
            map = code.validateID(maintcode,user);
            if(map.get("messages").equalsIgnoreCase(""))
            {
                String query = "Insert into Prescription(ID, Chufang, Category, Name, Jiliang, Price, TotalPrice, PatientID, DiseaseID, lastUpdateDateTime, createDateTime, User, weight, Reference)"
                        + "Select '"+map.get("data")+"', trim('"+chufang+"'), trim('"+categorytable+"'), trim('"+nametable+"'), trim('"+jiliang+"'),"
                        + " trim('"+price+"'), trim('"+totalprice+"'), trim('"+patientID+"'),trim('"+diseaseID+"'),datetime('now','localtime'), datetime('now','localtime'), trim('"+user+"'), trim('"+weight+"'),trim('"+reference+"')";
                SQLQuery sql = new SQLQuery();
                //returnMessage.put("returnMessage", sql.AddEditDeleteQuery(query));

                if(sql.AddEditDeleteQuery(query).equalsIgnoreCase("1"))
                {
                    returnMessage.put("ID", map.get("data"));
                    if(categorytable.equalsIgnoreCase("复方药粉"))
                    {
                        String query1 = "Update TraditionalMedicinePotion Set gram = trim('"+remaining+"') "
                                    + " where ID = '"+medicineID+"' and User = '"+user+"'";
                        System.out.println(query1);
                        returnMessage.put("returnMessage", sql.AddEditDeleteQuery(query1));
                    }
                    else if(categorytable.equalsIgnoreCase("药丸"))
                    {
                        String query1 = "Update GrassMedicinePill Set gram = trim('"+remaining+"') "
                                    + " where ID = '"+medicineID+"' and User = '"+user+"'";
                        System.out.println(query1);
                        returnMessage.put("returnMessage", sql.AddEditDeleteQuery(query1));
                    }
                    else if(categorytable.equalsIgnoreCase("药水"))
                    {
                        String query1 = "Update GrassMedicinePotion Set gram = trim('"+remaining+"') "
                                    + " where ID = '"+medicineID+"' and User = '"+user+"'";
                        System.out.println(query1);
                        returnMessage.put("returnMessage", sql.AddEditDeleteQuery(query1));
                    }
                    else if(categorytable.equalsIgnoreCase("单味药粉"))
                    {
                        String query1 = "Update TraditionalMedicinePill Set gram = trim('"+remaining+"') "
                                    + " where ID = '"+medicineID+"' and User = '"+user+"'";
                        System.out.println(query1);
                        returnMessage.put("returnMessage", sql.AddEditDeleteQuery(query1));
                    }
                    return returnMessage;
                }
                else
                {
                    returnMessage.put("returnMessage","Insert database Prescription error, "+map.get("messages"));
                    returnMessage.put("ID", "");
                    return returnMessage;
                }
            }
            else
            {
                returnMessage.put("returnMessage","Prescription.addPrescription get error on line 176, "+map.get("messages"));
                returnMessage.put("ID", "");
                return returnMessage;
            }
        } catch (SQLException ex) {
            returnMessage.put("returnMessage","Prescription.addPrescription get error on line 181, "+ex.getMessage());
            returnMessage.put("ID", "");
            return returnMessage;
        }
    }
    
    public String EditPrescription() throws SQLException{
         String query = "Update Prescription Set Category = trim('"+categorytable+"'), Name = '"+nametable+"',"
                 + " Jiliang = trim('"+jiliang+"'), Price = trim('"+price+"'), TotalPrice = trim('"+totalprice+"'),"
                 + " lastUpdateDateTime = datetime('now','localtime')"
                 + " where ID = '"+prescriptionID+"' and User = '"+user+"'";
        System.out.println(query);
         SQLQuery sql = new SQLQuery();

        return sql.AddEditDeleteQuery(query);
    }
    
    public String DeletePrescription() throws SQLException{
        String query = "Delete From Prescription where ID = '"+prescriptionID+"' and User ='"+user+"'";
        System.out.println(query);
        SQLQuery sql = new SQLQuery();

        return sql.AddEditDeleteQuery(query);
    }
    
    public Prescription getPrescription(String IC, String User) throws SQLException{
        String query = "Select a.ID as PrescriptionID, a.Chufang, a.Category as categorytable, a.Name as medicineName, a.Jiliang, a.Price, a.TotalPrice, a.PatientID, "
                + "b.IC, b.name, b.ID, b.phone,b.User as User "
                + "from Prescription a Inner Join Patient b "
                + "ON a.PatientID = b.ID where b.IC = '"+IC+"' and b.User = '"+User+"' limit 1";
        System.out.println(query);
        rs = st.executeQuery(query);
        try {
             while (rs.next()) {
                 return new Prescription(rs.getString("PrescriptionID"),rs.getInt("Chufang"),
                         rs.getString("categorytable"),rs.getString("medicineName"),
                         rs.getInt("Jiliang"),rs.getFloat("Price"),rs.getFloat("TotalPrice"), rs.getString("PatientID"), 
                         rs.getString("IC"), rs.getString("name"), rs.getString("phone"),rs.getString("User"));
            }   
        } 
        catch (NullPointerException e)
        {
            //throw(new NoSuchElementException(e.getMessage()));
            return new Prescription("1",user);
        }
        finally{
            st.close(); 
        }
        return new Prescription("1",user);
    }
    
    public List<Prescription> getPrescriptions(String User) throws SQLException{
        List<Prescription> prescriptionList = new ArrayList<>();
                
            String query = "Select a.ID as PrescriptionID, a.Chufang, a.Category as categorytable, a.Reference, a.Name as nametable, a.Jiliang, a.Price, a.weight, a.TotalPrice, a.PatientID, a.DiseaseID, a.lastUpdateDateTime, a.createDateTime, "
                + "b.Symptom, b.Temperature, b.BloodPressure, b.PulseCondition, b.TongueQuality, b.TongueCoating, b.PeeShit, b.Category, b.History, b.latest, b.billNo, c.IC, c.name, c.phone,c.age, c.gender, c.address,c.User as User  "
                + "from Prescription a "
                + "Inner Join Disease b ON a.DiseaseID = b.ID "
                + "Inner Join Patient c ON a.PatientID = c.ID "
                + "where c.User = '"+User+"' order by a.createDateTime desc";
            System.out.println(query);
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                 prescriptionList.add(new Prescription(rs.getInt("Chufang"),
                         rs.getString("categorytable"),rs.getString("Reference"),rs.getString("nametable"),rs.getInt("Jiliang"),rs.getFloat("Price"),rs.getFloat("TotalPrice"),rs.getFloat("weight"),
                         rs.getString("PrescriptionID"),rs.getString("PatientID"),rs.getString("DiseaseID"),rs.getString("lastUpdateDateTime"),rs.getString("createDateTime"), 
                         rs.getString("Symptom"),rs.getInt("Temperature"),rs.getString("BloodPressure"),rs.getString("PulseCondition"),
                         rs.getString("TongueQuality"),rs.getString("TongueCoating"),rs.getString("PeeShit"), rs.getString("Category"),
                         rs.getString("History"), rs.getInt("latest"), rs.getInt("billNo"), rs.getString("IC"), rs.getString("name"), rs.getString("phone"), rs.getInt("age"), rs.getString("gender"), rs.getString("address"),rs.getString("User")));
            } 
        } 
        catch (Exception e)
        {
            throw(new NoSuchElementException(e.getMessage()));
        }
        return prescriptionList;
    }
    
    public List<Prescription> getPrescriptions(String from, String to, String IC, String ID, String User) throws SQLException{
            List<Prescription> prescriptionList = new ArrayList<>();

            String query = "Select a.ID as PrescriptionID, a.Chufang, a.Category as categorytable, a.Reference, "
                    + "a.Name as nametable, a.Jiliang, a.Price, a.TotalPrice, a.weight, a.PatientID, a.DiseaseID, "
                    + "a.lastUpdateDateTime, a.createDateTime, "
                    + "b.Symptom, b.Temperature, b.BloodPressure, b.PulseCondition, b.TongueQuality, b.TongueCoating, "
                    + "b.PeeShit, b.Category, b.History, b.latest, b.billNo, c.IC, c.name, c.phone, c.gender, c.age, c.address,c.User as User  "
                + "from Prescription a "
                + "Inner Join Disease b ON a.DiseaseID = b.ID "
                + "Inner Join Patient c ON a.PatientID = c.ID "
                + "where ((b.createDateTime>='"+from+"' and b.createDateTime<='"+to+"') or "
                + "c.IC=trim('"+IC+"') or c.ID=trim('"+ID+"')) "
                + "and c.User='"+User+"' order by a.createdatetime desc";
            System.out.println(query);
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                 prescriptionList.add(new Prescription(rs.getInt("Chufang"),
                         rs.getString("categorytable"),rs.getString("Reference"),rs.getString("nametable"),rs.getInt("Jiliang"),rs.getFloat("Price"),rs.getFloat("TotalPrice"),
                         rs.getFloat("weight"),rs.getString("PrescriptionID"),rs.getString("PatientID"),rs.getString("DiseaseID"),rs.getString("lastUpdateDateTime"),rs.getString("createDateTime"), 
                         rs.getString("Symptom"),rs.getInt("Temperature"),rs.getString("BloodPressure"),rs.getString("PulseCondition"),
                         rs.getString("TongueQuality"),rs.getString("TongueCoating"),rs.getString("PeeShit"), rs.getString("Category"),
                         rs.getString("History"), rs.getInt("latest"),rs.getInt("billNo"),rs.getString("IC"), rs.getString("name"), rs.getString("phone"),
                         rs.getInt("age"), rs.getString("gender"), rs.getString("address"),rs.getString("User")));
            } 
        } 
        catch (Exception e)
        {
            throw(new NoSuchElementException(e.getMessage()));
        }
        return prescriptionList;
    }
    
    public List<Prescription> getPrescriptionsID(String PrescriptionID, String User) throws SQLException{
        List<Prescription> prescriptionList = new ArrayList<>();
        
            String query = "Select a.ID as PrescriptionID, a.Chufang, a.Category as categorytable, a.Reference, a.Name as nametable, a.Jiliang, a.Price, a.TotalPrice, a.weight, a.PatientID, a.DiseaseID, a.lastUpdateDateTime, a.createDateTime, "
                + "b.Symptom, b.Temperature, b.BloodPressure, b.PulseCondition, b.TongueQuality, b.TongueCoating, b.PeeShit, b.Category, b.History, b.latest, b.billNo, c.IC, c.name, c.phone, c.age, c.User as User, c.gender, c.address  "
                + "from Prescription a "
                + "Inner Join Disease b ON a.DiseaseID = b.ID "
                + "Inner Join Patient c ON a.PatientID = c.ID "
                + "where a.ID = '"+PrescriptionID+"' order by a.createDateTime desc";
            System.out.println(query);
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                 prescriptionList.add(new Prescription(rs.getInt("Chufang"),
                         rs.getString("categorytable"),rs.getString("Reference"),rs.getString("nametable"),rs.getInt("Jiliang"),rs.getFloat("Price"),rs.getFloat("TotalPrice"),
                         rs.getFloat("weight"),rs.getString("PrescriptionID"),rs.getString("PatientID"),rs.getString("DiseaseID"),rs.getString("lastUpdateDateTime"),rs.getString("createDateTime"), 
                         rs.getString("Symptom"),rs.getInt("Temperature"),rs.getString("BloodPressure"),rs.getString("PulseCondition"),
                         rs.getString("TongueQuality"),rs.getString("TongueCoating"),rs.getString("PeeShit"), rs.getString("Category"),
                         rs.getString("History"), rs.getInt("latest"),rs.getInt("billNo"),rs.getString("IC"), rs.getString("name"), rs.getString("phone"),
                         rs.getInt("age"), rs.getString("gender"), rs.getString("address"),rs.getString("User")));
            } 
        } 
        catch (Exception e)
        {
            throw(new NoSuchElementException(e.getMessage()));
        }
        return prescriptionList;
    }
    
    public List<Prescription> getPrescriptionDetail(String contribute, String detail, String User) throws SQLException{
         List<Prescription> prescriptionList = new ArrayList<>();

            String query = "Select a.ID as PrescriptionID, a.Chufang, a.Reference, a.Category as categorytable, "
                    + "a.Name as nametable, a.Jiliang, a.Price, a.TotalPrice, a.PatientID, a.DiseaseID, "
                    + "a.lastUpdateDateTime, a.createDateTime, a.weight, "
                    + "b.Symptom, b.Temperature, b.BloodPressure, b.PulseCondition, b.TongueQuality, b.TongueCoating, "
                    + "b.PeeShit, b.Category, b.History, b.latest,b.billNo, c.IC, c.name, c.phone, c.gender, c.age, c.address, c.User as User  "
                + "from Prescription a "
                + "Inner Join Disease b ON a.DiseaseID = b.ID "
                + "Inner Join Patient c ON a.PatientID = c.ID "
                + "where "+contribute+" like '%"+detail+"%' order by a.createDateTime desc";
            System.out.println(query);
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                prescriptionList.add(new Prescription(rs.getInt("Chufang"),
                        rs.getString("categorytable"),rs.getString("Reference"),rs.getString("nametable"),rs.getInt("Jiliang"),rs.getFloat("Price"),rs.getFloat("TotalPrice"),
                        rs.getFloat("weight"),rs.getString("PrescriptionID"),rs.getString("PatientID"),rs.getString("DiseaseID"),rs.getString("lastUpdateDateTime"),rs.getString("createDateTime"), 
                        rs.getString("Symptom"),rs.getInt("Temperature"),rs.getString("BloodPressure"),rs.getString("PulseCondition"),
                        rs.getString("TongueQuality"),rs.getString("TongueCoating"),rs.getString("PeeShit"), rs.getString("Category"),
                        rs.getString("History"), rs.getInt("latest"),rs.getInt("billNo"),rs.getString("IC"), rs.getString("name"), rs.getString("phone"),
                        rs.getInt("age"), rs.getString("gender"), rs.getString("address"),rs.getString("User")));
           } 
        } 
        catch (Exception e)
        {
            throw(new NoSuchElementException(e.getMessage()));
        }
        return prescriptionList;
    }
    
    public List<Prescription> getAllDetail(String ID, String IC, String Name, String Gender, String Age, String Phone, String Symptom,
            String Category, String Pulse, String Quality, String Coating, String Shit, String History, String Temperature,
            String Blood, String MedicCategory, String MedicName, String Jiliang, String User) throws SQLException{
        List<Prescription> prescriptionList = new ArrayList<>();
         
        String query = "Select a.ID as PrescriptionID, a.Chufang, a.Reference, a.Category as categorytable, "
                    + "a.Name as nametable, a.Jiliang, a.Price, a.TotalPrice, a.PatientID, a.DiseaseID, "
                    + "a.lastUpdateDateTime, a.createDateTime, a.weight, "
                    + "b.Symptom, b.Temperature, b.BloodPressure, b.PulseCondition, b.TongueQuality, b.TongueCoating, "
                    + "b.PeeShit, b.Category, b.History, b.latest, b.billNo, c.IC, c.name, c.phone, c.gender, c.age, c.address, c.User as User  "
                + "from Prescription a "
                + "Inner Join Disease b ON a.DiseaseID = b.ID "
                + "Inner Join Patient c ON a.PatientID = c.ID "
                + "where a.PatientID like '%"+ID+"%' and c.IC like '%"+IC+"%' and c.name like '%"+Name+"%' and "
                + "c.phone like '%"+Phone+"%' and c.gender like '%"+Gender+"%' and  c.age like '%"+Age+"%' and "
                + "b.Symptom like '%"+Symptom+"%' and b.Category like '%"+Category+"%' and b.PulseCondition like '%"+Pulse+"%' and "
                + "b.TongueQuality like '%"+Quality+"%' and b.TongueCoating like '%"+Coating+"%' and "
                + "b.PeeShit like '%"+Shit+"%' and b.History like '%"+History+"%' and b.Temperature like '%"+Temperature+"%' and "
                + "b.BloodPressure like '%"+Blood+"%' and a.Category like '%"+MedicCategory+"%' and a.Name like '%"+MedicName+"%' and a.Jiliang like '%"+Jiliang+"%' and c.User ='"+User+"' order by a.createDateTime desc";          
        System.out.println(query);
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                 prescriptionList.add(new Prescription(rs.getInt("Chufang"),
                         rs.getString("categorytable"),rs.getString("Reference"),rs.getString("nametable"),rs.getInt("Jiliang"),rs.getFloat("Price"),rs.getFloat("TotalPrice"),
                         rs.getFloat("weight"),rs.getString("PrescriptionID"),rs.getString("PatientID"),rs.getString("DiseaseID"),rs.getString("lastUpdateDateTime"),rs.getString("createDateTime"), 
                         rs.getString("Symptom"),rs.getInt("Temperature"),rs.getString("BloodPressure"),rs.getString("PulseCondition"),
                         rs.getString("TongueQuality"),rs.getString("TongueCoating"),rs.getString("PeeShit"), rs.getString("Category"),
                         rs.getString("History"), rs.getInt("latest"),rs.getInt("billNo"),rs.getString("IC"), rs.getString("name"), rs.getString("phone"),
                         rs.getInt("age"), rs.getString("gender"), rs.getString("address"),rs.getString("User")));
            }  
        } 
        catch (Exception e)
        {
            throw(new NoSuchElementException(e.getMessage()));
        }
        return prescriptionList;
    }
    
    public List<Prescription> getDiseaseDetail(String contribute, String detail) throws SQLException{
        List<Prescription> prescriptionList = new ArrayList<>();

           String query = "Select a.ID as PrescriptionID, a.Chufang, a.Reference, a.Category as categorytable, "
                   + "a.Name as nametable, a.Jiliang, a.Price, a.TotalPrice, a.PatientID, a.DiseaseID, a.weight,"
                   + "a.lastUpdateDateTime, a.createDateTime, "
                   + "b.Symptom, b.Temperature, b.BloodPressure, b.PulseCondition, b.TongueQuality, b.TongueCoating, "
                   + "b.PeeShit, b.Category, b.History, b.latest, b.billNo, c.IC, c.name, c.phone, c.gender, c.age, c.address, c.User as User  "
               + "from Prescription a "
               + "Inner Join Disease b ON a.DiseaseID = b.ID "
               + "Inner Join Patient c ON a.PatientID = c.ID "
               + "where "+contribute+" = '"+detail+"' order by a.createDateTime desc";
           System.out.println(query);
       rs = st.executeQuery(query);
       try {
           while (rs.next()) {
                 prescriptionList.add(new Prescription(rs.getInt("Chufang"),
                         rs.getString("categorytable"),rs.getString("Reference"),rs.getString("nametable"),rs.getInt("Jiliang"),rs.getFloat("Price"),rs.getFloat("TotalPrice"),
                         rs.getFloat("weight"),rs.getString("PrescriptionID"),rs.getString("PatientID"),rs.getString("DiseaseID"),rs.getString("lastUpdateDateTime"),rs.getString("createDateTime"), 
                         rs.getString("Symptom"),rs.getInt("Temperature"),rs.getString("BloodPressure"),rs.getString("PulseCondition"),
                         rs.getString("TongueQuality"),rs.getString("TongueCoating"),rs.getString("PeeShit"), rs.getString("Category"),
                         rs.getString("History"), rs.getInt("latest"),rs.getInt("billNo"),rs.getString("IC"), rs.getString("name"), rs.getString("phone"),
                         rs.getInt("age"), rs.getString("gender"), rs.getString("address"),rs.getString("User")));
            } 
       } 
       catch (Exception e)
       {
           throw(new NoSuchElementException(e.getMessage()));
       }
       return prescriptionList;
    }

    public String UpdateUser(String oldUser, String newUser) throws SQLException
    {
        SQLQuery sql = new SQLQuery();
        return sql.UpdateUser("Prescription", oldUser, newUser);
    }

    public String DeleteUser(String User) throws SQLException
    {
        SQLQuery sql = new SQLQuery();
        return sql.DeleteUser("Prescription", user);
    }

    

    
    
}
