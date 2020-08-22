/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical;

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
            Logger.getLogger(NewPatient.class.getName()).log(Level.SEVERE, null, ex);
            return ex.getMessage();
        }
        finally
        {
            st.close();
        }
    }
}
