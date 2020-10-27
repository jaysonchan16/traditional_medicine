/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaClass;

import javaClass.connect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sheng
 */
public class SQLQuery {
    
    protected Statement st = connect.connection();
    
    public String AddEditDeleteQuery(String query) throws SQLException
    {
        try {
            st.executeUpdate(query);
            st.close(); 
            return "1";
            
        } catch (SQLException ex) {
            return ex.getMessage();
        }
        finally
        {
            st.close();
        }
    }
    
    public String UpdateUser(String table, String oldUser, String newUser) throws SQLException
    {
        String query = "Update '"+table+"' Set User ='"+newUser+"' "
                + " where User = '"+oldUser+"'";
        System.out.println(query);
        
        return AddEditDeleteQuery(query);
    }
}
