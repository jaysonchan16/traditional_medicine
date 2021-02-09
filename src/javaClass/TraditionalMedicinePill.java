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
public class TraditionalMedicinePill extends Medicine{//单味药粉
    
    private String property;
    private String appliance;
    protected Statement st = connect.connection();
    ResultSet rs;
    
    public TraditionalMedicinePill(){}
    
    public TraditionalMedicinePill(String name){
        super(name);
    }
    
    public TraditionalMedicinePill(String reference, int referenceForNotDuplicateMedicineName){
        super(reference,referenceForNotDuplicateMedicineName);
    }
    
    public TraditionalMedicinePill(String name,String user){
        super(name,user);
    }
    
    public TraditionalMedicinePill(String name,String reference, String user){
        super(name,reference,user);
    }
    
    public TraditionalMedicinePill(String name, String reference, float sellprice,float gram, String code, String medicine, String user){
        super(name,reference,sellprice,gram,code,medicine,user);
    }
    
    public TraditionalMedicinePill(String name, String reference, String effect, float scoop, float sellprice, float gram, float cost, String createDateTime, String lastUpdateDateTime, String property, String appliance, String code,String medicine, String user){
        super(name,reference,effect,scoop,sellprice,gram,cost,createDateTime,lastUpdateDateTime,code, medicine, user);
        this.appliance = appliance;
        this.property = property;
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
     * @return the utilize
     */
    public String getAppliance() {
        return appliance;
    }

    /**
     * @param utilize the utilize to set
     */
    public void setAppliance(String appliance) {
        this.appliance = appliance;
    }
    
    public HashMap<String,String> AddTraditionalMedicinePill(String name, String reference, String effect, float scoop, float sellprice, float gram, float cost, String createDateTime, String lastUpdateDateTime, String property, String appliance, String code, String User)
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
            if(map.get("messages").equalsIgnoreCase("") && validateTraditionalMedicinePillReferenceName(reference,name,User) == 0)
            {
                String query = "insert into TraditionalMedicinePill(ID, name, reference, property, appliance, effect, scoop, cost, gram, sellprice, createDateTime, lastUpdateDateTime,medicine, User)"
                        + "Select '"+map.get("data")+"',trim('"+name+"'), trim('"+reference+"'), trim('"+property+"'), trim('"+appliance+"'), trim('"+effect+"'), trim('"+scoop1+"'), trim('"+sellprice1+"'), "
                        + "trim('"+gram1+"'), trim('"+cost1+"'), datetime('now','localtime'),datetime('now','localtime'),'单味药粉', trim('"+User+"')";
                
                SQLQuery sql = new SQLQuery();
                returnMessage.put("returnMessage",sql.AddEditDeleteQuery(query));
                returnMessage.put("ID", map.get("data"));
                return returnMessage;
            }
            else
            {
                returnMessage.put("returnMessage",code1.validateID(name,User).get("messages"));
                returnMessage.put("ID", "");
                return returnMessage;
            }
        } catch (SQLException ex) {
            returnMessage.put("returnMessage",ex.getMessage());
            returnMessage.put("ID", "");
            return returnMessage;
        }
    }
    
    public int validateAddTraditionalMedicinePill(String attribute, String data, String User) throws SQLException
    {
        try {
            String query = "Select count(1) as count from TraditionalMedicinePill where "+attribute+" = '"+data+"' and User ='"+User+"'";
            System.out.println(query);
            int count = 0;
            rs = st.executeQuery(query);
            count = rs.getInt("count");
            rs.close();
            st.close();
            return count;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return -1;
        }
        finally{
            rs.close();
            st.close();
        }
    }
    
    public List<TraditionalMedicinePill> getTraditionalMedicinePill(String User) throws SQLException{
        List<TraditionalMedicinePill> traditionalMedicinePillList = new ArrayList<>();
            String query = "Select ID,name,reference,property,appliance,effect,scoop,sellprice,gram,cost,createDateTime,lastUpdateDateTime,medicine,User from TraditionalMedicinePill where User ='"+User+"'";
        rs = st.executeQuery(query);
        try {
           while (rs.next()) {
                 traditionalMedicinePillList.add(new TraditionalMedicinePill(rs.getString("name"),rs.getString("reference"),rs.getString("effect"),
                         rs.getFloat("scoop"),rs.getFloat("sellprice"),
                         rs.getFloat("gram"),rs.getFloat("cost"),rs.getString("createDateTime"),rs.getString("lastUpdateDateTime"),
                         rs.getString("property"), rs.getString("appliance"), rs.getString("ID"),rs.getString("medicine"),rs.getString("User")));
            } 
        } 
        catch (Exception e)
        {
            throw(new NoSuchElementException(e.getMessage()));
        }
        rs.close();
        st.close();        
        return traditionalMedicinePillList;
    }
    
    public List<TraditionalMedicinePill> findTraditionalMedicinePillDetails(String attribute, String data, String User) throws SQLException{
        List<TraditionalMedicinePill> traditionalMedicinePillList = new ArrayList<>();
            String query = "Select ID,name,reference,property,appliance,effect,scoop,sellprice,gram,cost,createDateTime,lastUpdateDateTime,medicine,User from TraditionalMedicinePill where "+attribute+"='"+data+"' and User = '"+User+"' order by 1 desc";
            System.out.println(query);
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                 traditionalMedicinePillList.add(new TraditionalMedicinePill(rs.getString("name"),rs.getString("reference"),rs.getString("effect"),
                         rs.getFloat("scoop"),rs.getFloat("sellprice"),
                         rs.getFloat("gram"),rs.getFloat("cost"),rs.getString("createDateTime"),rs.getString("lastUpdateDateTime"),
                         rs.getString("property"), rs.getString("appliance"), rs.getString("ID"),rs.getString("medicine"),rs.getString("User")));
            } 
        } 
        catch (Exception e)
        {
            throw(new NoSuchElementException(e.getMessage()));
        }
        finally
        {
            st.close();
            rs.close();
        }
        rs.close();
        st.close();        
        return traditionalMedicinePillList;
    }
    
    
    public String EditTraditionalMedicinePill(String ID, String name, String reference, String component, String indication, String effect, String scoop, String gram, String cost, String price, int referenceName, int details, String User) throws SQLException{
        String query="";
        SQLQuery sql = new SQLQuery();
        String message = "";
        if(referenceName == 1)
        {
            if(validateTraditionalMedicinePillReferenceName(reference,name,User) == 0)
            {
                query = "Update TraditionalMedicinePill Set name = trim('"+name+"'), reference = trim('"+reference+"'), lastUpdateDateTime = datetime('now','localtime')"
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
            query = "Update TraditionalMedicinePill Set property = trim('"+component+"'), appliance = trim('"+indication+"'), effect = trim('"+effect+"'), "
                        + "scoop = trim('"+scoop+"'), gram = ('"+gram+"'), cost = ('"+cost+"'), sellprice = ('"+price+"'), lastUpdateDateTime = datetime('now','localtime')"
                         + "where ID = '"+ID+"' and User ='"+User+"'";

            message = sql.AddEditDeleteQuery(query);
        }
        return message;
    }
    
    public String EditSubTotalTraditionalMedicinePill(String name, String reference, String gram, String User) throws SQLException{

            String query = "Update TraditionalMedicinePill Set gram = ('"+gram+"'), lastUpdateDateTime = datetime('now','localtime')"
                     + "where name = '"+name+"' and reference = '"+reference+"' and User ='"+User+"'";

            SQLQuery sql = new SQLQuery();

            return sql.AddEditDeleteQuery(query); 
    }
    
    public int validateTraditionalMedicinePillReferenceName(String reference, String name, String User) throws SQLException
    {
        try {
            String query = "Select count(1) as count from TraditionalMedicinePill where name = '"+name+"' and reference = '"+reference+"' and User ='"+User+"'";
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
    
    public String DeleteTraditionalMedicinePill(String ID, String User) throws SQLException{
        String query = "Delete From TraditionalMedicinePill where ID = '"+ID+"' and User ='"+User+"'";
          
        SQLQuery sql = new SQLQuery();
        
        return sql.AddEditDeleteQuery(query);
    }
    
    public List<TraditionalMedicinePill> comboName(String User) throws SQLException{
        List<TraditionalMedicinePill> name = new ArrayList<>();
        String query = "Select name from TraditionalMedicinePill where User ='"+User+"'";
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                System.out.println(rs.getString("name"));
                name.add(new TraditionalMedicinePill(rs.getString("name")));
            } 
        } 
        catch (Exception e)
        {
            throw(new NoSuchElementException(e.getMessage()));
        }
        rs.close();
        st.close();
        return name;
    }
    
    public List<TraditionalMedicinePill> comboNameReference(String medicine, String reference, String User) throws SQLException{

        List<TraditionalMedicinePill> traditionalMedicinePillList = new ArrayList<>();
        String query = "Select name from TraditionalMedicinePill where medicine='"+medicine+"' and User='"+User+"' and reference='"+reference+"'";
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                traditionalMedicinePillList.add(new TraditionalMedicinePill(rs.getString("name")));
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
        return traditionalMedicinePillList;
    }
    
    public List<TraditionalMedicinePill> findTraditionalMedicinePillName(String name, String reference, String User) throws SQLException{
        List<TraditionalMedicinePill> traditionalMedicinePillList = new ArrayList<>();
        String query = "Select ID,name,reference,sellprice,gram,medicine,User from TraditionalMedicinePill where name='"+name+"' and reference='"+reference+"' and User = '"+User+"' order by 1 desc";
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                System.out.println(rs.getString("name"));
                traditionalMedicinePillList.add(new TraditionalMedicinePill(rs.getString("name"),rs.getString("reference"),
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
        return traditionalMedicinePillList;
    }
    
    public String countTraditionalMedicinePillName(String User) throws SQLException
    {
        String query = "Select count(1) as count from TraditionalMedicinePill where User='"+User+"'";
        rs = st.executeQuery(query);
        try {
            return rs.getString("count");
        } 
        catch (Exception e)
        {
            return "TraditionalMedicinePill.validateTraditionalMedicinePillName get error on line 251"+e.getMessage();
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
        return sql.UpdateUser("TraditionalMedicinePill", oldUser, newUser);
    }
    
    public String DeleteUser(String user) throws SQLException
    {
        SQLQuery sql = new SQLQuery();
        return sql.DeleteUser("TraditionalMedicinePill", user);
    }
    
    public List<TraditionalMedicinePill> findReference(String name, String User) throws SQLException{
        System.out.println(name);
        System.out.println(User);
        List<TraditionalMedicinePill> traditionalMedicinePillList = new ArrayList<>();
        String query = "Select DISTINCT reference, '1' as referenceForNotDuplicateMedicineName from TraditionalMedicinePill where medicine='"+name+"' and User ='"+User+"' order by 1 desc";
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                traditionalMedicinePillList.add(new TraditionalMedicinePill(rs.getString("reference"),rs.getInt("referenceForNotDuplicateMedicineName")));
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
        return traditionalMedicinePillList;
    }
    
    public List<HashMap<String,String>> findReferenceName(String medicine, String User) throws SQLException{
        System.out.println("TraditionalMedicinePill:"+medicine);
        
        List<HashMap<String,String>> traditionalMedicinePillList = new ArrayList<>();
        HashMap<String,String> referenceName = new HashMap<String,String>();
        //String repeatation = "";
        
        String query = "Select reference, name, user from TraditionalMedicinePill where medicine='"+medicine+"' and User ='"+User+"' order by reference";
        
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                /*if(repeatation.equalsIgnoreCase(""))
                {*/
                    referenceName.put(rs.getString("name"), rs.getString("reference"));
                    traditionalMedicinePillList.add(referenceName);
                //    repeatation = rs.getString("reference");
                /*}
                else if(repeatation.equalsIgnoreCase(rs.getString("reference")))
                {
                    
                }*/
                //traditionalMedicinePillList.add(new TraditionalMedicinePill(rs.getString("name"),rs.getString("reference"), rs.getString("user")));
                
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
        return traditionalMedicinePillList;
    }
}
