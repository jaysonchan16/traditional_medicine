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
import javax.swing.JComboBox;

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
    
    public GrassMedicinePotion(String reference, int referenceForNotDuplicateMedicineName){
        super(reference,referenceForNotDuplicateMedicineName);
    }
    
    public GrassMedicinePotion(String name, String user){
        super(name,user);
    }
    
    public GrassMedicinePotion(String name, String reference, String user){
        super(name,reference,user);
    }
    
    public GrassMedicinePotion(String name, String reference, float sellprice, float gram, String code, String medicine, String user){
        super(name,reference,sellprice,gram,code,medicine,user);
    }
    
    public GrassMedicinePotion(String name, String reference, String component, String indications, String effect, float scoop, float sellprice, float gram, float cost, String createDateTime, String lastUpdateDateTime, String code, String medicine, String user){
        super(name,reference,component,indications,effect,scoop,sellprice,gram,cost,createDateTime,lastUpdateDateTime,code, medicine,user);
    }
    
    public HashMap<String,String> AddGrassMedicinePotion(String name, String reference, String component, String effect, String indications, float scoop, float sellprice, float gram, float cost, String createDateTime, String lastUpdateDateTime, String code, String User)
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
            if(map.get("messages").equalsIgnoreCase("") && validateGrassMedicinePotionReferenceName(reference,name,User) == 0)
            {
                String query = "insert into GrassMedicinePotion(ID, name, reference, component, effect, indications, scoop, cost, gram, sellprice, createDateTime, lastUpdateDateTime,medicine,User)"
                        + "Select '"+map.get("data")+"',trim('"+name+"'), trim('"+reference+"'), trim('"+component+"'), trim('"+effect+"'), trim('"+indications+"'), trim('"+scoop1+"'), trim('"+sellprice1+"'), "
                        + "trim('"+gram1+"'), trim('"+cost1+"'), datetime('now','localtime'),datetime('now','localtime'),'药水', trim('"+User+"')";
                
                SQLQuery sql = new SQLQuery();
                
                returnMessage.put("returnMessage", sql.AddEditDeleteQuery(query));
                returnMessage.put("ID", map.get("data"));
                return returnMessage;
            }
            else
            {
                returnMessage.put("returnMessage", code1.validateID(name,User).get("messages"));
                returnMessage.put("ID", "");
                return returnMessage;
            }
        } catch (SQLException ex) {
            returnMessage.put("returnMessage", ex.getMessage());
            returnMessage.put("ID", "");
            return returnMessage;
        }
        
    }
    
    public int validateAddGrassMedicinePotion(String attribute, String data, String User) throws SQLException
    {
        try {
            String query = "Select count(1) as count from GrassMedicinePotion where "+attribute+" = '"+data+"' and User = '"+User+"'";
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
    
    public int validateGrassMedicinePotionReferenceName(String reference, String name, String User) throws SQLException
    {
        try {
            String query = "Select count(1) as count from GrassMedicinePotion where reference = '"+reference+"' and name ='"+name+"' "
                    + "and User = '"+User+"'";
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
    
    public List<GrassMedicinePotion> getGrassMedicinePotion(String User) throws SQLException{
        List<GrassMedicinePotion> grassMedicinePotionList = new ArrayList<>();
            String query = "Select ID,name,reference,component,effect,indications,scoop,gram,sellprice,cost,createDateTime,lastUpdateDateTime,medicine,User from GrassMedicinePotion where User = '"+User+"'";
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                 grassMedicinePotionList.add(new GrassMedicinePotion(rs.getString("name"),rs.getString("reference"),rs.getString("component"),
                         rs.getString("indications"),rs.getString("effect"),
                         rs.getFloat("scoop"),rs.getFloat("sellprice"),rs.getFloat("gram"),rs.getFloat("cost"),
                         rs.getString("createDateTime"), rs.getString("lastUpdateDateTime"), rs.getString("ID"),rs.getString("medicine"),rs.getString("User")));
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
    
    public List<GrassMedicinePotion> findGrassMedicinePotionDetails(String attribute, String data, String User) throws SQLException{
        List<GrassMedicinePotion> grassMedicinePotionList = new ArrayList<>();
            String query = "Select ID,name,reference,component,effect,indications,scoop,gram,sellprice,cost,createDateTime,lastUpdateDateTime, medicine, User from GrassMedicinePotion where "+attribute+" = '"+data+"' and User = '"+User+"' order by 1 desc";
            System.out.println(query);
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                 grassMedicinePotionList.add(new GrassMedicinePotion(rs.getString("name"),rs.getString("reference"),rs.getString("component"),
                         rs.getString("indications"),rs.getString("effect"),
                         rs.getFloat("scoop"),rs.getFloat("sellprice"),rs.getFloat("gram"),rs.getFloat("cost"),
                         rs.getString("createDateTime"), rs.getString("lastUpdateDateTime"), rs.getString("ID"),rs.getString("medicine"),rs.getString("User")));
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
    
    public String EditGrassMedicinePotion(String ID, String name, String reference, String component, String indication, String effect, String scoop, String gram, String cost, String price, int referenceName, int details, String User) throws SQLException{
        String query="";
        SQLQuery sql = new SQLQuery();
        String message = "";
        if(referenceName == 1)
        {
            if(validateGrassMedicinePotionReferenceName(reference, name, User) == 0)
            {
                query = "Update GrassMedicinePotion Set name = trim('"+name+"'), reference = trim('"+reference+"'),lastUpdateDateTime = datetime('now','localtime') "
                     + "where ID = '"+ID+"' and User ='"+User+"'";

                message =  sql.AddEditDeleteQuery(query);
            }
            else
            {
                message = "这名字已经存在";
            }
        }
        else if(details == 1)
        {
            query = "Update GrassMedicinePotion Set component = trim('"+component+"'), effect = trim('"+effect+"'), indications = trim('"+indication+"'),"
                    + " scoop = trim('"+scoop+"'), sellprice = trim('"+price+"'), gram = trim('"+gram+"'), cost = trim('"+cost+"'), lastUpdateDateTime = datetime('now','localtime')"
                     + "where ID = '"+ID+"' and User ='"+User+"'";

            message = sql.AddEditDeleteQuery(query);
        }
        return message;
    }
    
    public String EditSubTotalGrassMedicinePotion(String name, String reference, String gram, String User) throws SQLException{

            String query = "Update GrassMedicinePotion Set gram = ('"+gram+"'), lastUpdateDateTime = datetime('now','localtime')"
                     + "where name = '"+name+"' and reference = '"+reference+"' and User ='"+User+"'";

            SQLQuery sql = new SQLQuery();

            return sql.AddEditDeleteQuery(query); 
    }
    
    public String DeleteGrassMedicinePotion(String ID, String User) throws SQLException{
        String count = countGrassMedicinePotionName(User);
        int counted = Integer.parseInt(count);
        if(counted > 1)
        {
            String query = "Delete From GrassMedicinePotion where ID = '"+ID+"' and User ='"+User+"'";

            SQLQuery sql = new SQLQuery();

            return sql.AddEditDeleteQuery(query);
        }
        else
        {
            return "要留一个资料";
        }
    }
    
    public List<GrassMedicinePotion> comboName(String User) throws SQLException{
        List<GrassMedicinePotion> name = new ArrayList<>();
        String query = "Select name from GrassMedicinePotion where User ='"+User+"'";
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
    
    public List<GrassMedicinePotion> comboNameReference(String medicine, String reference, String User) throws SQLException{
        List<GrassMedicinePotion> name = new ArrayList<>();
        String query = "Select name from GrassMedicinePotion where medicine='"+medicine+"' and User ='"+User+"' and reference ='"+reference+"'";
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
    
    public List<GrassMedicinePotion> findGrassMedicinePotionName(String name, String reference, String User) throws SQLException{
        List<GrassMedicinePotion> grassMedicinePotionList = new ArrayList<>();
        String query = "Select ID,name,reference,sellprice,gram,medicine,User from GrassMedicinePotion where name='"+name+"' and reference ='"+reference+"' and User = '"+User+"' order by 1 desc";
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                System.out.println(rs.getString("name"));
                grassMedicinePotionList.add(new GrassMedicinePotion(rs.getString("name"),rs.getString("reference"),
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
        return grassMedicinePotionList;
    }
    
    public String countGrassMedicinePotionName(String User) throws SQLException
    {
        String query = "Select count(1) as count from GrassMedicinePotion where User='"+User+"'";
        rs = st.executeQuery(query);
        try {
            return rs.getString("count");
        } 
        catch (Exception e)
        {
            return "GrassMedicinePotion.validateGrassMedicinePotionName get error on line 223"+e.getMessage();
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
        return sql.UpdateUser("GrassMedicinePotion", oldUser, newUser);
    }
    
    public String DeleteUser(String user) throws SQLException
    {
        SQLQuery sql = new SQLQuery();
        return sql.DeleteUser("GrassMedicinePotion", user);
    }
    
    public List<GrassMedicinePotion> findReference(String name, String User) throws SQLException{
        List<GrassMedicinePotion> grassMedicinePotionList = new ArrayList<>();
        String query = "Select DISTINCT reference, '1' as referenceForNotDuplicateMedicineName from GrassMedicinePotion where medicine='"+name+"' and User ='"+User+"' order by 1 desc";
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                grassMedicinePotionList.add(new GrassMedicinePotion(rs.getString("reference"),rs.getInt("referenceForNotDuplicateMedicineName")));
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
        return grassMedicinePotionList;
    }
    
    public List<GrassMedicinePotion> findReferenceName(String medicine, String User) throws SQLException{
        System.out.println("GrassMedicinePotion:"+medicine);
        List<GrassMedicinePotion> grassMedicinePotionList = new ArrayList<>();
        String query = "Select reference, name, user from GrassMedicinePotion where medicine='"+medicine+"' and User ='"+User+"' order by 1 desc";
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                grassMedicinePotionList.add(new GrassMedicinePotion(rs.getString("name"),rs.getString("reference"), rs.getString("user")));
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
        return grassMedicinePotionList;
    }
}
