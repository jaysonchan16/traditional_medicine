/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaClass;

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
    private String user;
    
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
    
    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }
    
    public HashMap<String,String> validatePatientID(String name, String User) throws SQLException{
        HashMap<String,String> data= new HashMap<String,String>();
        String upperName = name.substring(0,1).toUpperCase();
        
        int Number;
        System.out.println(upperName);
        
        if(countID(upperName,User) == 1) //英文名
        {
            if(plusOneID(upperName,User).equalsIgnoreCase("1")) // ID + 1
            {
                String query = "Select Number from Maintcode where Code = '"+upperName+"' and User ='"+User+"'";
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
                data.put("messages", plusOneID(upperName,User));
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
    
    public String plusOneID(String upperName, String User) throws SQLException{
        String query = "Update Maintcode Set Number = Number + 1 "
                 + "where Code = '"+upperName+"' and User = '"+User+"'";
        
        System.out.println(query);
        SQLQuery sql = new SQLQuery();
        return sql.AddEditDeleteQuery(query);
    }

    public int countID(String upperName, String User) throws SQLException
    {
        String query = "Select count(*) as Number from Maintcode where Code = '"+upperName+"' and User='"+User+"'";
        
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
    
    public HashMap<String,String> validateID(String name, String User) throws SQLException{
        HashMap<String,String> data= new HashMap<String,String>();        
        System.out.println(name);
        int Number;
        String resultplus = plusOneID(name,User);
        if(countID(name,User) == 1)
        {
            if(resultplus.equalsIgnoreCase("1"))
            {
                String query = "Select Number from Maintcode where Code = '"+name+"' and User='"+User+"'";
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
                data.put("messages", resultplus);
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
    
    public List<Code> getComboMedicine(String User) throws SQLException
    {
        List<Code> comboMedicine = new ArrayList<>();
        String query;

        query = "Select Code from Maintcode where Remark = 'ComboMedicine' and User='"+User+"'";

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

    public String UpdateUser(String oldUser, String newUser) throws SQLException
    {
        SQLQuery sql = new SQLQuery();
        return sql.UpdateUser("Maintcode", oldUser, newUser);
    }
    
    public String DeleteUser(String user) throws SQLException
    {
        SQLQuery sql = new SQLQuery();
        return sql.DeleteUser("Maintcode", user);
    }
}
