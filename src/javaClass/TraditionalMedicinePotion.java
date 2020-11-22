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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

/**
 *
 * @author Sheng
 */
public class TraditionalMedicinePotion extends Medicine{// 复方药粉
    
    protected Statement st = connect.connection();
    ResultSet rs;
    
    public TraditionalMedicinePotion() {}
    
    public TraditionalMedicinePotion(String name) {
        super(name);
    }
    
    public TraditionalMedicinePotion(String name,String user) {
        super(name,user);
    }
    
    public TraditionalMedicinePotion(String name, float sellprice, float gram, String code, String medicine, String user){
        super(name,sellprice,gram,code,medicine,user);
    }
    
    public TraditionalMedicinePotion(String name, String component, String indications, String effect, float scoop, float sellprice, float gram, float cost, String createDateTime, String lastUpdateDateTime,String code,String medicine,String user){
        super(name,component,indications,effect,scoop,sellprice,gram,cost,createDateTime,lastUpdateDateTime,code, medicine, user);
    }
    
    public HashMap<String,String> AddTraditionalMedicinePotion(String name, String component, String effect, String indications, float scoop, float sellprice, float gram, float cost, String createDateTime, String lastUpdateDateTime, String code, String User)
    {
        HashMap<String,String> returnMessage = new HashMap<String,String>();
        try {
            Code code1 = new Code();
            HashMap<String, String> map = new HashMap<String,String>();
            map = code1.validateID(code,User);
            double scoop1 = scoop;
            double sellprice1 = sellprice;
            double gram1 = gram;
            double cost1 = cost;
            if(map.get("messages").equalsIgnoreCase("") && validateTraditionalMedicinePotion("name",name,User) == 0)
            {
                String query = "insert into TraditionalMedicinePotion(ID, name, component, effect, indications, scoop, cost, gram, sellprice, createDateTime, lastUpdateDateTime,medicine,User)"
                        + "Select '"+map.get("data")+"',trim('"+name+"'), trim('"+component+"'), trim('"+effect+"'), trim('"+indications+"'), trim('"+scoop1+"'), trim('"+sellprice1+"'), "
                        + "trim('"+gram1+"'), trim('"+cost1+"'), datetime('now','localtime'),datetime('now','localtime'),'复方药粉', trim('"+User+"')";
                
                SQLQuery sql = new SQLQuery();
                
                returnMessage.put("returnMessage", sql.AddEditDeleteQuery(query));
                returnMessage.put("ID",map.get("data"));
                return returnMessage;
            }
            else
            {
                returnMessage.put("returnMessage",map.get("messages"));
                returnMessage.put("ID","");
                return returnMessage;
            }
        } catch (SQLException ex) {
            returnMessage.put("returnMessage",ex.getMessage());
            returnMessage.put("ID","");
            return returnMessage;
        }
    }
    
    public int validateTraditionalMedicinePotion(String attribute, String data, String User) throws SQLException
    {
        try {
            String query = "Select count(1) as count from TraditionalMedicinePotion where "+attribute+" = '"+data+"' and User ='"+User+"'";
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
    
    public String EditTraditionalMedicinePotion(String ID, String name, String component, String indication, String effect, String scoop, String gram, String cost, String price, String User) throws SQLException{
        if(validateTraditionalMedicinePotion("name",name,User) == 0)
        {
            String query = "Update TraditionalMedicinePotion Set name = trim('"+name+"'), component = trim('"+component+"'), effect = trim('"+effect+"'), "
                    + " indications = trim('"+indication+"'), scoop = trim('"+scoop+"'), sellprice = trim('"+price+"'),"
                    + " gram = trim('"+gram+"'), cost = trim('"+cost+"'), lastUpdateDateTime = datetime('now','localtime')"
                    + " where ID = '"+ID+"' and User ='"+User+"'";

            SQLQuery sql = new SQLQuery();

           return sql.AddEditDeleteQuery(query);
        }
        else
        {
            return "这名字已经存在";
        }
    }
    
    
    public String DeleteTraditionalMedicinePotion(String ID,String User) throws SQLException{
        String query = "Delete From TraditionalMedicinePotion where ID ="+ID+" and User ='"+User+"' order by 1 desc";
        
        SQLQuery sql = new SQLQuery();
        
        return sql.AddEditDeleteQuery(query);
    }
    
    public List<TraditionalMedicinePotion> getTraditionalMedicinePotion(String User) throws SQLException{
        List<TraditionalMedicinePotion> traditionalMedicinePotionList = new ArrayList<>();
            String query = "Select ID,name,component,effect,indications,scoop,gram,sellprice,cost,createDateTime,lastUpdateDateTime,medicine,User from TraditionalMedicinePotion where User ='"+User+"'";
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                 traditionalMedicinePotionList.add(new TraditionalMedicinePotion(rs.getString("name"),rs.getString("component"),
                         rs.getString("indications"),rs.getString("effect"),
                         rs.getFloat("scoop"),rs.getFloat("sellprice"),rs.getFloat("gram"),rs.getFloat("cost"),
                         rs.getString("createDateTime"), rs.getString("lastUpdateDateTime"), rs.getString("ID"),rs.getString("medicine"),rs.getString("User")));
            } 
        } 
        catch (Exception e)
        {
            throw(new NoSuchElementException(e.getMessage()));
        }
        finally
        {
            rs.close();
            st.close();
        }
        rs.close();
        st.close();        
        return traditionalMedicinePotionList;
    }
    
    public List<TraditionalMedicinePotion> findTraditionalMedicinePotionDetails(String attribute, String data,String User) throws SQLException{
        List<TraditionalMedicinePotion> traditionalMedicinePotionList = new ArrayList<>();
        String query = "Select ID,name,component,effect,indications,scoop,gram,sellprice,cost,createDateTime,lastUpdateDateTime,medicine,User from TraditionalMedicinePotion where "+attribute+"='"+data+"' and User ='"+User+"' order by 1 desc";
        System.out.println(query);
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                 traditionalMedicinePotionList.add(new TraditionalMedicinePotion(rs.getString("name"),rs.getString("component"),
                         rs.getString("indications"),rs.getString("effect"),
                         rs.getFloat("scoop"),rs.getFloat("sellprice"),rs.getFloat("gram"),rs.getFloat("cost"),
                         rs.getString("createDateTime"), rs.getString("lastUpdateDateTime"), rs.getString("ID"),rs.getString("medicine"),rs.getString("User")));
            } 
        } 
        catch (Exception e)
        {
            throw(new NoSuchElementException(e.getMessage()));
        }
        finally
        {
            rs.close();
            st.close();
        }
        rs.close();
        st.close();        
        return traditionalMedicinePotionList;
    }
    
    
    public List<TraditionalMedicinePotion> comboName(String User) throws SQLException{
        List<TraditionalMedicinePotion> name = new ArrayList<>();
        String query = "Select name from TraditionalMedicinePotion where User='"+User+"'";
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                System.out.println(rs.getString("name"));
                name.add(new TraditionalMedicinePotion(rs.getString("name")));
            } 
        } 
        catch (Exception e)
        {
            throw(new NoSuchElementException(e.getMessage()));
        }
        finally
        {
            rs.close();
            st.close();
        }
        rs.close();
        st.close();        
        return name;
    }
    
    public List<TraditionalMedicinePotion> findTraditionalMedicinePotionName(String name, String User) throws SQLException{
        List<TraditionalMedicinePotion> traditionalMedicinePotionList = new ArrayList<>();
        System.out.println(name);
        System.out.println(User);
        String query = "Select ID,name,sellprice,gram,medicine,User from TraditionalMedicinePotion where name='"+name+"' and User='"+User+"' order by 1 desc";
        System.out.println(query);
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                System.out.println(rs.getString("name"));
                traditionalMedicinePotionList.add(new TraditionalMedicinePotion(rs.getString("name"),
                        rs.getFloat("sellprice"),rs.getFloat("gram"),rs.getString("ID"),rs.getString("medicine"),
                        rs.getString("User")));
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
        return traditionalMedicinePotionList;
    }
    
    public String countTraditionalMedicinePotion(String User) throws SQLException
    {
        String query = "Select count(1) as count from TraditionalMedicinePotion where User='"+User+"'";
        rs = st.executeQuery(query);
        try {
            return rs.getString("count");
        } 
        catch (Exception e)
        {
            return "TraditionalMedicinePotion.validateTraditionalMedicinePotion get error on line 233"+e.getMessage();
        }
        finally
        {
            rs.close();
            st.close();
        }
    }
    
    public String UpdateUser(String oldUser, String newUser) throws SQLException
    {
        SQLQuery sql = new SQLQuery();
        return sql.UpdateUser("TraditionalMedicinePotion", oldUser, newUser);
    }
    
    public String DeleteUser(String user) throws SQLException
    {
        SQLQuery sql = new SQLQuery();
        return sql.DeleteUser("TraditionalMedicinePotion", user);
    }
    
    
}
