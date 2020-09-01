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
public class TraditionalMedicinePill extends Medicine{
    
    private String property;
    private String appliance;
    protected Statement st = connect.connection();
    ResultSet rs;
    
    public TraditionalMedicinePill(){}
    
    public TraditionalMedicinePill(String name, String effect, float scoop, float sellprice, float gram, float cost, String createDateTime, String lastUpdateDateTime, String property, String appliance, String code){
        super(name,effect,scoop,sellprice,gram,cost,createDateTime,lastUpdateDateTime,code);
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
    
    public HashMap<String,String> AddTraditionalMedicinePill(String name, String effect, float scoop, float sellprice, float gram, float cost, String createDateTime, String lastUpdateDateTime, String property, String appliance, String code)
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
            if(map.get("messages").equalsIgnoreCase("") && validateAddTraditionalMedicinePill(name) == 0)
            {
                String query = "insert into TraditionalMedicinePill(ID, name, property, appliance, effect, scoop, cost, gram, sellprice, createDateTime, lastUpdateDateTime)"
                        + "Select '"+map.get("data")+"',trim('"+name+"'), trim('"+property+"'), trim('"+appliance+"'), trim('"+effect+"'), trim('"+scoop1+"'), trim('"+sellprice1+"'), "
                        + "trim('"+gram1+"'), trim('"+cost1+"'), datetime('now','localtime'),datetime('now','localtime')";
                
                SQLQuery sql = new SQLQuery();
                returnMessage.put("returnMessage",sql.AddEditDeleteQuery(query));
                returnMessage.put("ID", map.get("data"));
                return returnMessage;
            }
            else
            {
                returnMessage.put("returnMessage",code1.validateMedicID(name).get("messages"));
                returnMessage.put("ID", "");
                return returnMessage;
            }
        } catch (SQLException ex) {
            returnMessage.put("returnMessage",ex.getMessage());
            returnMessage.put("ID", "");
            return returnMessage;
        }
    }
    
    public int validateAddTraditionalMedicinePill(String name) throws SQLException
    {
        try {
            String query = "Select count(1) as count from TraditionalMedicinePill where name = '"+name+"'";
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
    
    public List<TraditionalMedicinePill> getTraditionalMedicinePill() throws SQLException{
        List<TraditionalMedicinePill> traditionalMedicinePillList = new ArrayList<>();
            String query = "Select ID,name,property,appliance,effect,scoop,sellprice,gram,cost,createDateTime,lastUpdateDateTime from TraditionalMedicinePill";
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                 traditionalMedicinePillList.add(new TraditionalMedicinePill(rs.getString("name"),rs.getString("effect"),
                         rs.getFloat("scoop"),rs.getFloat("sellprice"),
                         rs.getFloat("gram"),rs.getFloat("cost"),rs.getString("createDateTime"),rs.getString("lastUpdateDateTime"),
                         rs.getString("property"), rs.getString("appliance"), rs.getString("ID")));
            } 
        } 
        catch (Exception e)
        {
            throw(new NoSuchElementException(e.getMessage()));
        }
        return traditionalMedicinePillList;
    }
}
