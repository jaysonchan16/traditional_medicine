/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

/**
 *
 * @author Sheng
 */
public class TraditionalMedicinePotion extends Medicine{
    
    protected Statement st = connect.connection();
    ResultSet rs;
    
    public TraditionalMedicinePotion() {}
    
    public TraditionalMedicinePotion(String name, String component, String effect, String indications, float scoop, float sellprice, float gram, float cost, String createDateTime, String lastUpdateDateTime,String code){
        super(name,component,effect,indications,scoop,sellprice,gram,cost,createDateTime,lastUpdateDateTime,code);
    }
    
    public String AddTraditionalMedicinePotion(String name, String component, String effect, String indications, float scoop, float sellprice, float gram, float cost, String createDateTime, String lastUpdateDateTime, String code)
    {
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
                
                return sql.AddEditDeleteQuery(query);
            }
            else
            {
                return code1.validateMedicID(name).get("messages");
            }
        } catch (SQLException ex) {
            return ex.getMessage();
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
}
