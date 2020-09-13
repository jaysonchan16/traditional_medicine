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
public class Code {
    
    private String code;
    private int number;
    private String remark;
    protected Statement st = connect.connection();
    ResultSet rs;
    
    public Code() {}
    
    public Code(String code)
    {
        this.code = code;
    }
    
    public Code(String code, int number, String remark)
    {
        this.code = code;
        this.number = number;
        this.remark = remark;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }
    
        /**
     * @return the remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark the remark to set
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }
    
    public HashMap<String,String> validatePatientID(String name) throws SQLException{
        HashMap<String,String> data= new HashMap<String,String>();
        String upperName = name.substring(0,1).toUpperCase();
        
        int Number;
        System.out.println(upperName);
        
        if(countID(upperName) == 1) //英文名
        {
            if(plusOneID(upperName).equalsIgnoreCase("1")) // ID + 1
            {
                String query = "Select Number from Maintcode where Code = '"+upperName+"'";
                try {
                    rs = st.executeQuery(query);
                    Number = rs.getInt("Number");
                    st.close();
                    rs.close();
                    System.out.println("Here" + upperName + "-" + Number);
                    data.put("data", upperName + "-" + Number);
                    data.put("messages", "");
                    return data;
                } 
                catch (NullPointerException e)
                {
                    data.put("data", "");
                    data.put("messages", e.getMessage());
                    return data;
                }
                finally{
                    st.close(); 
                }
            }
            else
            {
                data.put("data", "");
                data.put("messages", plusOneID(upperName));
                return data;
            }
        }
        else
        {
            data.put("data", "");
            data.put("messages", "名字只需用英文名！");
            return data;
        }
    }
    
    public String plusOneID(String upperName) throws SQLException{
        String query = "Update Maintcode Set Number = Number + 1 "
                 + "where Code = '"+upperName+"'";
        
        System.out.println(query);
        SQLQuery sql = new SQLQuery();
        st.close();
        return sql.AddEditDeleteQuery(query);
    }

    public int countID(String upperName) throws SQLException
    {
        String query = "Select count(*) as Number from Maintcode where Code = '"+upperName+"'";
        
        int Number;
        
        try {
            rs = st.executeQuery(query);
            Number = rs.getInt("Number");
            st.close();
            rs.close();
            return Number;
        } 
        catch (NullPointerException e)
        {
            return 0;
        } 
        catch (SQLException ex) {
            ex.printStackTrace();
            return 0;
        }
        finally{
            rs.close();
            st.close(); 
        }
    }
    
    public HashMap<String,String> validateID(String name) throws SQLException{
        HashMap<String,String> data= new HashMap<String,String>();        
        System.out.println(name);
        int Number;
        if(countID(name) == 1)
        {
            if(plusOneID(name).equalsIgnoreCase("1"))
            {
                String query = "Select Number from Maintcode where Code = '"+name+"'";
                System.out.println(query);
                try {
                    rs = st.executeQuery(query);
                    Number = rs.getInt("Number");
                    st.close();
                    rs.close();
                    System.out.println("Here" + name + "-" + Number);
                    data.put("data", name + "-" + Number);
                    data.put("messages", "");
                    return data;
                } 
                catch (NullPointerException e)
                {
                    data.put("data", "");
                    data.put("messages", e.getMessage());
                    return data;
                }
                finally{
                    rs.close();
                    st.close(); 
                }
            }
            else
            {
                data.put("data", "");
                data.put("messages", plusOneID(name));
                return data;
            }
        }
        else
        {
            data.put("data", "");
            data.put("messages", "系统已有资料！");
            return data;
        }
    }
    
    public List<Code> getComboMedicine() throws SQLException
    {
        List<Code> comboMedicine = new ArrayList<>();
        String query;

        query = "Select Code from Maintcode where Remark = 'ComboMedicine'";

        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                comboMedicine.add(new Code(rs.getString("Code")));
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
        return comboMedicine;
    }
}
