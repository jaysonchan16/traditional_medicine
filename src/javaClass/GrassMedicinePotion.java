/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaClass;

import javaClass.connect;
import javaClass.Medicine;
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
public class GrassMedicinePotion extends Medicine {// 药水
    
    protected Statement st = connect.connection();
    ResultSet rs;
    
    public GrassMedicinePotion(){}
    
    public GrassMedicinePotion(String name){
        super(name);
    }
    
    public GrassMedicinePotion(String name, String component, String indications, String effect, float scoop, float sellprice, float gram, float cost, String createDateTime, String lastUpdateDateTime, String code, String medicine){
        super(name,component,indications,effect,scoop,sellprice,gram,cost,createDateTime,lastUpdateDateTime,code, medicine);
    }
    
    public HashMap<String,String> AddGrassMedicinePotion(String name, String component, String effect, String indications, float scoop, float sellprice, float gram, float cost, String createDateTime, String lastUpdateDateTime, String code)
    {
        HashMap<String,String> returnMessage = new HashMap<String,String>();
        try {
            Code code1 = new Code();
            HashMap<String, String> map = new HashMap<String,String>();
            map = code1.validateID(code);
            double scoop1 = scoop;
            double sellprice1 = sellprice;
            double gram1 = gram;
            double cost1 = cost;
            if(map.get("messages").equalsIgnoreCase("") && validateAddGrassMedicinePotion("name",name) == 0)
            {
                String query = "insert into GrassMedicinePotion(ID, name, component, effect, indications, scoop, cost, gram, sellprice, createDateTime, lastUpdateDateTime,medicine)"
                        + "Select '"+map.get("data")+"',trim('"+name+"'), trim('"+component+"'), trim('"+effect+"'), trim('"+indications+"'), trim('"+scoop1+"'), trim('"+sellprice1+"'), "
                        + "trim('"+gram1+"'), trim('"+cost1+"'), datetime('now','localtime'),datetime('now','localtime'),'药水'";
                
                SQLQuery sql = new SQLQuery();
                
                returnMessage.put("returnMessage", sql.AddEditDeleteQuery(query));
                returnMessage.put("ID", map.get("data"));
                return returnMessage;
            }
            else
            {
                returnMessage.put("returnMessage", code1.validateID(name).get("messages"));
                returnMessage.put("ID", "");
                return returnMessage;
            }
        } catch (SQLException ex) {
            returnMessage.put("returnMessage", ex.getMessage());
            returnMessage.put("ID", "");
            return returnMessage;
        }
        
    }
    
    public int validateAddGrassMedicinePotion(String attribute, String data) throws SQLException
    {
        try {
            String query = "Select count(1) as count from GrassMedicinePotion where "+attribute+" = '"+data+"'";
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
    
    public List<GrassMedicinePotion> getGrassMedicinePotion() throws SQLException{
        List<GrassMedicinePotion> grassMedicinePotionList = new ArrayList<>();
            String query = "Select ID,name,component,effect,indications,scoop,gram,sellprice,cost,createDateTime,lastUpdateDateTime,medicine from GrassMedicinePotion";
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                 grassMedicinePotionList.add(new GrassMedicinePotion(rs.getString("name"),rs.getString("component"),
                         rs.getString("indications"),rs.getString("effect"),
                         rs.getFloat("scoop"),rs.getFloat("sellprice"),rs.getFloat("gram"),rs.getFloat("cost"),
                         rs.getString("createDateTime"), rs.getString("lastUpdateDateTime"), rs.getString("ID"),rs.getString("medicine")));
            } 
        } 
        catch (Exception e)
        {
            throw(new NoSuchElementException(e.getMessage()));
        }
        finally{
            rs.close();
            st.close();
        }
        return grassMedicinePotionList;
    }
    
    public List<GrassMedicinePotion> findGrassMedicinePotionDetails(String attribute, String data) throws SQLException{
        List<GrassMedicinePotion> grassMedicinePotionList = new ArrayList<>();
            String query = "Select ID,name,component,effect,indications,scoop,gram,sellprice,cost,createDateTime,lastUpdateDateTime, medicine from GrassMedicinePotion where "+attribute+" = '"+data+"' order by 1 desc";
            System.out.println(query);
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                 grassMedicinePotionList.add(new GrassMedicinePotion(rs.getString("name"),rs.getString("component"),
                         rs.getString("indications"),rs.getString("effect"),
                         rs.getFloat("scoop"),rs.getFloat("sellprice"),rs.getFloat("gram"),rs.getFloat("cost"),
                         rs.getString("createDateTime"), rs.getString("lastUpdateDateTime"), rs.getString("ID"),rs.getString("medicine")));
            } 
        } 
        catch (Exception e)
        {
            throw(new NoSuchElementException(e.getMessage()));
        }finally{
            rs.close();
            st.close();
        }
        rs.close();
        st.close();
        return grassMedicinePotionList;
    }
    
    public String EditGrassMedicinePotion(String ID, String name, String component, String indication, String effect, String scoop, String gram, String cost, String price) throws SQLException{
        if(validateAddGrassMedicinePotion("name",name) == 0)
        {
            String query = "Update GrassMedicinePotion Set name = trim('"+name+"'), component = trim('"+component+"'), effect = trim('"+effect+"'), indications = trim('"+indication+"'),"
                    + " scoop = trim('"+scoop+"'), sellprice = trim('"+price+"'), gram = trim('"+gram+"'), cost = trim('"+cost+"'), lastUpdateDateTime = datetime('now','localtime')"
                     + "where ID = '"+ID+"'";

            SQLQuery sql = new SQLQuery();

            return sql.AddEditDeleteQuery(query);
        }
        else
        {
            return "这名字已经存在";
        }
    }
    
    public String DeleteGrassMedicinePotion(String ID) throws SQLException{
        String query = "Delete From GrassMedicinePotion where ID = '"+ID+"'";
          
        SQLQuery sql = new SQLQuery();
        
        return sql.AddEditDeleteQuery(query);
    }
    
    public List<GrassMedicinePotion> comboName() throws SQLException{
        List<GrassMedicinePotion> name = new ArrayList<>();
        String query = "Select name from GrassMedicinePotion";
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                System.out.println(rs.getString("name"));
                 name.add(new GrassMedicinePotion(rs.getString("name")));
            } 
        } 
        catch (Exception e)
        {
            throw(new NoSuchElementException(e.getMessage()));
        }
        finally{
            rs.close();
            st.close();
        }
        rs.close();
        st.close();        
        return name;
    }
    
    public String findGrassMedicinePotionName(String name) throws SQLException{
        
        String query = "Select sellprice from GrassMedicinePotion where name='"+name+"' order by 1 desc";
        rs = st.executeQuery(query);
        try {
            return rs.getString("sellprice");
        } 
        catch (Exception e)
        {
            return e.getMessage();
        }
        finally{
            rs.close();
            st.close();
        }
    }
}
