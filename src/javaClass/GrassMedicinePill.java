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
public class GrassMedicinePill extends Medicine{//药丸
    
    protected Statement st = connect.connection();
    ResultSet rs;
    
    public GrassMedicinePill(){}
    
    public GrassMedicinePill(String name){
        super(name);
    }

    public GrassMedicinePill(String name, String user){
        super(name,user);
    }
    
    public GrassMedicinePill(String reference, int referenceForNotDuplicateMedicineName){
        super(reference,referenceForNotDuplicateMedicineName);
    }
    
    public GrassMedicinePill(String name, String reference, String user){
        super(name,reference,user);
    }
    
    public GrassMedicinePill(String name, String reference, float sellprice, float gram, String code, String medicine, String user){
        super(name, reference, sellprice,gram,code,medicine,user);
    }
    
    public GrassMedicinePill(String name, String reference, String component, String indications, String effect, float scoop, float sellprice, float gram, float cost, String createDateTime, String lastUpdateDateTime, String code, String medicine, String user){
        super(name,reference,component,indications,effect,scoop,sellprice,gram,cost,createDateTime,lastUpdateDateTime,code,medicine,user);
    }
    
    public HashMap<String,String> AddGrassMedicinePill(String name, String reference, String component, String indications, String effect, float scoop, float sellprice, float gram, float cost, String createDateTime, String lastUpdateDateTime, String code, String User)
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
            
            if(map.get("messages").equalsIgnoreCase("") && validateGrassMedicinePillReferenceName(reference, name,User) == 0)
            {
                String query = "insert into GrassMedicinePill(ID, name, reference, component, effect, indications, scoop, cost, gram, sellprice, createDateTime, lastUpdateDateTime, medicine, User)"
                        + "Select '"+map.get("data")+"',trim('"+name+"'), trim('"+reference+"'), trim('"+component+"'), trim('"+effect+"'), trim('"+indications+"'), trim('"+scoop1+"'), trim('"+sellprice1+"'), "
                        + "trim('"+gram1+"'), trim('"+cost1+"'), datetime('now','localtime'),datetime('now','localtime'), '药丸', trim('"+User+"')";
                
                SQLQuery sql = new SQLQuery();
                
                returnMessage.put("returnMessage",sql.AddEditDeleteQuery(query));
                returnMessage.put("ID", map.get("data"));
                return returnMessage;
            }
            else
            {
                returnMessage.put("returnMessage",code1.validateID(name,User).get("messages"));
                returnMessage.put("ID","");
                return returnMessage;
            }
        } catch (SQLException ex) {
            returnMessage.put("returnMessage",ex.getMessage());
            returnMessage.put("ID","");
            return returnMessage;
        }
    }
    
    public int validateGrassMedicinePill(String attribute, String data, String User) throws SQLException
    {
        try {
            String query = "Select count(1) as count from GrassMedicinePill where "+attribute+" = '"+data+"' and User = '"+User+"'";
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
    
    public int validateGrassMedicinePillReferenceName(String reference, String name, String User) throws SQLException
    {
        try {
            String query = "Select count(1) as count from GrassMedicinePill where reference = '"+reference+"' and name ='"+name+"' "
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
    
    public int validateMedicine(String reference, String name, String User) throws SQLException
    {
        try {
            String query = "Select count(1) as count from GrassMedicinePill where name = '"+name+"' and reference = '"+reference+"' and User ='"+User+"'";
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
    
    public List<GrassMedicinePill> getGrassMedicinePill(String User) throws SQLException{
        List<GrassMedicinePill> grassMedicinePillList = new ArrayList<>();
            String query = "Select ID,name,reference,component,effect,indications,scoop,gram,sellprice,cost,createDateTime,lastUpdateDateTime, medicine, User from GrassMedicinePill where User = '"+User+"'";
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                 grassMedicinePillList.add(new GrassMedicinePill(rs.getString("name"),rs.getString("reference"), rs.getString("component"),
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
        rs.close();
        st.close();        
        return grassMedicinePillList;
    }
    
    public List<GrassMedicinePill> findGrassMedicinePillDetails(String attribute, String data, String User) throws SQLException{
        List<GrassMedicinePill> grassMedicinePillList = new ArrayList<>();
        String query = "Select ID,name,reference,component,effect,indications,scoop,gram,sellprice,cost,createDateTime,lastUpdateDateTime, medicine,User from GrassMedicinePill where "+attribute+" = '"+data+"' and User ='"+User+"' order by 1 desc";
        System.out.println(query);
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                 grassMedicinePillList.add(new GrassMedicinePill(rs.getString("name"),rs.getString("reference"), rs.getString("component"),
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
        rs.close();
        st.close();        
        return grassMedicinePillList;
    }
    
    public String EditGrassMedicinePill(String ID, String name, String reference, String component, String indication, String effect, String scoop, String gram, String cost, String price, int referenceName, int details, String User) throws SQLException{
        String query="";
        SQLQuery sql = new SQLQuery();
        String message = "";
        if(referenceName == 1)
        {
            if(validateGrassMedicinePillReferenceName(reference, name, User) == 0)
            {
                query = "Update GrassMedicinePill Set name = trim('"+name+"'), reference = trim('"+reference+"'),lastUpdateDateTime = datetime('now','localtime') "
                     + "where ID = '"+ID+"' and User ='"+User+"'";

                message = sql.AddEditDeleteQuery(query);
            }
            else
            {
                message =  "这名字已经存在";
            }
        }
        else if(details == 1)
        {
            query = "Update GrassMedicinePill Set component = trim('"+component+"'), indications = trim('"+indication+"'), effect = trim('"+effect+"'), scoop = trim('"+scoop+"'), gram = trim('"+gram+"'),"
                    + " cost = trim('"+cost+"'), sellprice = trim('"+price+"'), lastUpdateDateTime = datetime('now','localtime')"
                     + "where ID = '"+ID+"' and User ='"+User+"'";

            message = sql.AddEditDeleteQuery(query);
        }
        return message;
    }
    
    public String EditSubTotalGrassMedicinePill(String name, String reference, String gram, String User) throws SQLException{

            String query = "Update GrassMedicinePill Set gram = ('"+gram+"'), lastUpdateDateTime = datetime('now','localtime')"
                     + "where name = '"+name+"' and reference = '"+reference+"' and User ='"+User+"'";

            SQLQuery sql = new SQLQuery();

            return sql.AddEditDeleteQuery(query); 
    }
    
    public String DeleteGrassMedicinePill(String ID, String User) throws SQLException{
        String count = countGrassMedicinePillName(User);
        int counted = Integer.parseInt(count);
        if(counted > 1)
        {
            String query = "Delete From GrassMedicinePill where ID = '"+ID+"' and User ='"+User+"'";
          
            SQLQuery sql = new SQLQuery();
        
            return sql.AddEditDeleteQuery(query);
        }
        else
        {
            return "要留一个资料";
        }
    }
    
     public List<GrassMedicinePill> comboNameReference(String medicine, String reference, String User) throws SQLException{
        List<GrassMedicinePill> name = new ArrayList<>();
        String query = "Select name from GrassMedicinePill where medicine='"+medicine+"' and User='"+User+"' and reference='"+reference+"'";
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
        finally{
            rs.close();
            st.close();
        }
        rs.close();
        st.close();        
        return name;
    }
    
     public List<GrassMedicinePill> comboName(String User) throws SQLException{
        List<GrassMedicinePill> name = new ArrayList<>();
        String query = "Select name from GrassMedicinePill where User='"+User+"'";
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
        finally{
            rs.close();
            st.close();
        }
        rs.close();
        st.close();        
        return name;
    }
     
    public List<GrassMedicinePill> findGrassMedicinePillName(String name, String reference, String User) throws SQLException{
        List<GrassMedicinePill> grassMedicinePillList = new ArrayList<>();
        String query = "Select ID,name,reference,sellprice,gram,medicine,User from GrassMedicinePill where name='"+name+"' and reference ='"+reference+"' and User ='"+User+"' order by 1 desc";
        System.out.println(query);
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                System.out.println(rs.getString("name"));
                grassMedicinePillList.add(new GrassMedicinePill(rs.getString("name"),rs.getString("reference"),
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
        return grassMedicinePillList;
    }
    
    public String countGrassMedicinePillName(String User) throws SQLException
    {
        String query = "Select count(1) as count from GrassMedicinePill where User='"+User+"'";
        rs = st.executeQuery(query);
        try {
            return rs.getString("count");
        } 
        catch (Exception e)
        {
            return "GrassMedicinePillName.validateGrassMedicinePillName get error on line 225"+e.getMessage();
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
        return sql.UpdateUser("GrassMedicinePill", oldUser, newUser);
    }
    
    public String DeleteUser(String user) throws SQLException
    {
        SQLQuery sql = new SQLQuery();
        return sql.DeleteUser("GrassMedicinePill", user);
    }
   
    public List<GrassMedicinePill> findReference(String name, String User) throws SQLException{
        System.out.println("GrassMedicinePill:"+name);
        List<GrassMedicinePill> grassMedicinePillList = new ArrayList<>();
        String query = "Select DISTINCT reference, '1' as referenceForNotDuplicateMedicineName from GrassMedicinePill where medicine='"+name+"' and User ='"+User+"' order by 1 desc";
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                grassMedicinePillList.add(new GrassMedicinePill(rs.getString("reference"),rs.getInt("referenceForNotDuplicateMedicineName")));
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
        return grassMedicinePillList;
    }
    
    public List<GrassMedicinePill> findReferenceName(String medicine, String User) throws SQLException{
        System.out.println("GrassMedicinePill:"+medicine);
        List<GrassMedicinePill> grassMedicinePillList = new ArrayList<>();
        String query = "Select reference, name, user from GrassMedicinePill where medicine='"+medicine+"' and User ='"+User+"' order by 1 desc";
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                grassMedicinePillList.add(new GrassMedicinePill(rs.getString("name"),rs.getString("reference"), rs.getString("user")));
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
        return grassMedicinePillList;
    }
}
