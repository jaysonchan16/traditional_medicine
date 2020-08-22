/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Sheng
 */
public class Code {
    
    private String code;
    private int number;
    protected Statement st = connect.connection();
    ResultSet rs;
    
    public Code() {}
    
    public Code(String code, int number)
    {
        this.code = code;
        this.number = number;
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
    
    public int validateID(String name) throws SQLException{
        String upperName = name.substring(0,1).toUpperCase();
        int Number;
        
        
        String query = "Select Number from Maintcode where Code = '"+upperName+"'";
        try {
            rs = st.executeQuery(query);
            Number = rs.getInt("Number");
            
            return Number;
        } 
        catch (NullPointerException e)
        {
            //throw(new NoSuchElementException(e.getMessage()));
            return 0;
        }
        finally{
            st.close(); 
        }
    }
}
