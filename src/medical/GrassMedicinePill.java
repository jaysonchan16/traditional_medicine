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

/**
 *
 * @author Sheng
 */
public class GrassMedicinePill extends Medicine{//药丸
    
    protected Statement st = connect.connection();
    ResultSet rs;
    
    public GrassMedicinePill(){}
    
    public GrassMedicinePill(String name){
        super(name);
    }
    
    public GrassMedicinePill(String name, String component, String indications, String effect, float scoop, float sellprice, float gram, float cost, String createDateTime, String lastUpdateDateTime, String code){
        super(name,component,indications,effect,scoop,sellprice,gram,cost,createDateTime,lastUpdateDateTime,code);
    }
    
    public HashMap<String,String> AddGrassMedicinePill(String name, String component, String indications, String effect, float scoop, float sellprice, float gram, float cost, String createDateTime, String lastUpdateDateTime, String code)
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
            
            if(map.get("messages").equalsIgnoreCase("") && validateGrassMedicinePill("name", name) == 0)
            {
                String query = "insert into GrassMedicinePill(ID, name, component, effect, indications, scoop, cost, gram, sellprice, createDateTime, lastUpdateDateTime)"
                        + "Select '"+map.get("data")+"',trim('"+name+"'), trim('"+component+"'), trim('"+effect+"'), trim('"+indications+"'), trim('"+scoop1+"'), trim('"+sellprice1+"'), "
                        + "trim('"+gram1+"'), trim('"+cost1+"'), datetime('now','localtime'),datetime('now','localtime')";
                
                SQLQuery sql = new SQLQuery();
                
                returnMessage.put("returnMessage",sql.AddEditDeleteQuery(query));
                returnMessage.put("ID", map.get("data"));
                return returnMessage;
            }
            else
            {
                returnMessage.put("returnMessage",code1.validateMedicID(name).get("messages"));
                returnMessage.put("ID","");
                return returnMessage;
            }
        } catch (SQLException ex) {
            returnMessage.put("returnMessage",ex.getMessage());
            returnMessage.put("ID","");
            return returnMessage;
        }
    }
    
    public int validateGrassMedicinePill(String attribute, String data) throws SQLException
    {
        try {
            String query = "Select count(1) as count from GrassMedicinePill where "+attribute+" = '"+data+"'";
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
    
    public List<GrassMedicinePill> getGrassMedicinePill() throws SQLException{
        List<GrassMedicinePill> grassMedicinePillList = new ArrayList<>();
            String query = "Select ID,name,component,effect,indications,scoop,gram,sellprice,cost,createDateTime,lastUpdateDateTime from GrassMedicinePill";
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                 grassMedicinePillList.add(new GrassMedicinePill(rs.getString("name"),rs.getString("component"),
                         rs.getString("indications"),rs.getString("effect"),
                         rs.getFloat("scoop"),rs.getFloat("sellprice"),rs.getFloat("gram"),rs.getFloat("cost"),
                         rs.getString("createDateTime"), rs.getString("lastUpdateDateTime"), rs.getString("ID")));
            } 
        } 
        catch (Exception e)
        {
            throw(new NoSuchElementException(e.getMessage()));
        }
        return grassMedicinePillList;
    }
    
    public List<GrassMedicinePill> findGrassMedicinePillDetails(String attribute, String data) throws SQLException{
        List<GrassMedicinePill> grassMedicinePillList = new ArrayList<>();
        String query = "Select ID,name,component,effect,indications,scoop,gram,sellprice,cost,createDateTime,lastUpdateDateTime from GrassMedicinePill where "+attribute+" = '"+data+"' order by 1 desc";
        System.out.println(query);
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                 grassMedicinePillList.add(new GrassMedicinePill(rs.getString("name"),rs.getString("component"),
                         rs.getString("indications"),rs.getString("effect"),
                         rs.getFloat("scoop"),rs.getFloat("sellprice"),rs.getFloat("gram"),rs.getFloat("cost"),
                         rs.getString("createDateTime"), rs.getString("lastUpdateDateTime"), rs.getString("ID")));
            } 
        } 
        catch (Exception e)
        {
            throw(new NoSuchElementException(e.getMessage()));
        }
        return grassMedicinePillList;
    }
    
    public String EditGrassMedicinePill(String ID, String name, String component, String indication, String effect, String scoop, String gram, String cost, String price) throws SQLException{
        String query = "Update GrassMedicinePill Set name = trim('"+name+"'), component = trim('"+component+"'), indications = trim('"+indication+"'), effect = trim('"+effect+"'), scoop = trim('"+scoop+"'), gram = trim('"+gram+"'),"
                + " cost = trim('"+cost+"'), sellprice = trim('"+price+"'), lastUpdateDateTime = datetime('now','localtime')"
                 + "where ID = '"+ID+"'";
         
        SQLQuery sql = new SQLQuery();
        
        return sql.AddEditDeleteQuery(query);
    }
    
    public String DeleteGrassMedicinePill(String ID) throws SQLException{
        String query = "Delete From GrassMedicinePill where ID = '"+ID+"'";
          
        SQLQuery sql = new SQLQuery();
        
        return sql.AddEditDeleteQuery(query);
    }
    
    public List<GrassMedicinePill> comboName() throws SQLException{
        List<GrassMedicinePill> name = new ArrayList<>();
        String query = "Select name from GrassMedicinePill";
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                System.out.println(rs.getString("name"));
                 name.add(new GrassMedicinePill(rs.getString("name")));
            } 
        } 
        catch (Exception e)
        {
            throw(new NoSuchElementException(e.getMessage()));
        }
        return name;
    }
    
    public String findGrassMedicinePillName(String name) throws SQLException{
        
        String query = "Select sellprice from GrassMedicinePill where name='"+name+"' order by 1 desc";
        rs = st.executeQuery(query);
        try {
            return rs.getString("sellprice");
        } 
        catch (Exception e)
        {
            return e.getMessage();
        }
    }
}
