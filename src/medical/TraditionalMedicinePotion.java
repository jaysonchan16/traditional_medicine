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
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sheng
 */
public class TraditionalMedicinePotion extends Medicine{
    
    protected Statement st = connect.connection();
    ResultSet rs;
    
    public TraditionalMedicinePotion() {}
    
    public TraditionalMedicinePotion(String name) {
        super(name);
    }
    
    public TraditionalMedicinePotion(String name, String component, String effect, String indications, float scoop, float sellprice, float gram, float cost, String createDateTime, String lastUpdateDateTime,String code){
        super(name,component,effect,indications,scoop,sellprice,gram,cost,createDateTime,lastUpdateDateTime,code);
    }
    
    public HashMap<String,String> AddTraditionalMedicinePotion(String name, String component, String effect, String indications, float scoop, float sellprice, float gram, float cost, String createDateTime, String lastUpdateDateTime, String code)
    {
        HashMap<String,String> returnMessage = new HashMap<String,String>();
        try {
            Code code1 = new Code();
            HashMap<String, String> map = new HashMap<String,String>();
            map = code1.validateMedicID(code);
            double scoop1 = scoop;
            double sellprice1 = sellprice;
            double gram1 = gram;
            double cost1 = cost;
            if(map.get("messages").equalsIgnoreCase("") && validateTraditionalMedicinePotion(name) == 0)
            {
                String query = "insert into TraditionalMedicinePotion(ID, name, component, effect, indications, scoop, cost, gram, sellprice, createDateTime, lastUpdateDateTime)"
                        + "Select '"+map.get("data")+"',trim('"+name+"'), trim('"+component+"'), trim('"+effect+"'), trim('"+indications+"'), trim('"+scoop1+"'), trim('"+sellprice1+"'), "
                        + "trim('"+gram1+"'), trim('"+cost1+"'), datetime('now','localtime'),datetime('now','localtime')";
                
                SQLQuery sql = new SQLQuery();
                
                returnMessage.put("returnMessage", sql.AddEditDeleteQuery(query));
                returnMessage.put("ID",map.get("data"));
                return returnMessage;
            }
            else
            {
                returnMessage.put("returnMessage", code1.validateMedicID(name).get("messages"));
                returnMessage.put("ID","");
                return returnMessage;
            }
        } catch (SQLException ex) {
            returnMessage.put("returnMessage",ex.getMessage());
            returnMessage.put("ID","");
            return returnMessage;
        }
    }
    
    public int validateTraditionalMedicinePotion(String name) throws SQLException
    {
        try {
            String query = "Select count(1) as count from TraditionalMedicinePotion where name = '"+name+"'";
            System.out.println(query);
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
    
    public int EditTraditionalMedicinePotion(String name, String component, String effect, String indications, float scoop, float sellprice, float gram, float cost, String createDateTime, String lastUpdateDateTime, String ID) throws SQLException{
         String query = "Update TraditionalMedicinePotion Set name = trim('"+name+"'), component = trim('"+component+"'),"
                 + " indications = trim('"+indications+"'), scoop = trim('"+scoop+"'), sellprice = trim('"+sellprice+"'),"
                 + " gram = trim('"+gram+"'), cost = trim('"+cost+"'), lastUpdateDateTime = datetime('now','localtime')"
                 + " where ID = "+ID+" order by 1 desc";
        try {
            st.executeUpdate(query);
            st.close(); 
            return 1;
        } catch (SQLException ex) {
             return 0;
        }finally
        {
            st.close();
        }
    }
    
    
    public int DeleteTraditionalMedicinePotion(String name, String component, String effect, String indications, float scoop, float sellprice, float gram, float cost, String createDateTime, String lastUpdateDateTime, String ID) throws SQLException{
         String query = "Delete From TraditionalMedicinePotion where ID ="+ID+" order by 1 desc";
        try {
            st.executeUpdate(query);
            return 1;
        } catch (SQLException ex) {
            
            return 0;
        }
        finally
        {
            st.close();
        }
    }
    
    /*public TraditionalMedicinePotion getTraditionalMedicinePotion(String ID) throws SQLException{
        String query = "Select ID, name, component, effect, indications, scoop, sellprice, gram, cost,createDateTime,lastUpdateDateTime where ID = '"+ID+"'";
        String name, String component, String effect, String indications, float scoop, float sellprice, float gram, float cost, String createDateTime, String lastUpdateDateTime,String code
        rs = st.executeQuery(query);
        try {
             while (rs.next()) {
                 return new TraditionalMedicinePotion(rs.getString("ID"),rs.getInt("Temperature"),
                         rs.getString("BloodPressure"),rs.getString("PulseCondition"),
                         rs.getString("TongueQuality"),rs.getString("TongueCoating"),rs.getString("Pee"),rs.getString("Shit"),
                         rs.getInt("ID"),rs.getString("lastUpdateDateTime"),rs.getString("createDateTime"),rs.getString("IC"), rs.getString("name"), rs.getString("phone"));
            }   
        } 
        catch (NullPointerException e)
        {
            //throw(new NoSuchElementException(e.getMessage()));
            return new TraditionalMedicinePotion("1");
        }
        finally{
            st.close(); 
        }
        return new TraditionalMedicinePotion("1");
    }
    
    public List<TraditionalMedicinePotion> getTraditionalMedicinePotions() throws SQLException{
        List<TraditionalMedicinePotion> TraditionalMedicinePotionList = new ArrayList<>();
            String query = "Select b.Symptom, b.Temperature, b.BloodPressure, b.PulseCondition,"
                + "b.TongueQuality, b.TongueCoating, b.Pee, b.Shit,a.ID,b.lastUpdateDateTime,b.createDateTime, a.IC,a.name,a.phone,"
                + "from Patient a Inner Join Disease b "
                + "ON a.ID = b.PatientID";
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                 TraditionalMedicinePotionList.add(new TraditionalMedicinePotion(rs.getString("Symptom"),rs.getInt("Temperature"),
                         rs.getString("BloodPressure"),rs.getString("PulseCondition"),
                         rs.getString("TongueQuality"),rs.getString("TongueCoating"),rs.getString("Pee"),rs.getString("Shit"),
                         rs.getInt("ID"),rs.getString("lastUpdateDateTime"),rs.getString("createDateTime"),rs.getString("IC"), rs.getString("name"), rs.getString("phone")));
            } 
        } 
        catch (Exception e)
        {
            throw(new NoSuchElementException(e.getMessage()));
        }
        return TraditionalMedicinePotionList;
    }*/
}
