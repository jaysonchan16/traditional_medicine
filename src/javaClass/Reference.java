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
import java.util.List;
import java.util.NoSuchElementException;

/**
 *
 * @author Sheng
 */
public class Reference {
    
    protected Statement st = connect.connection();
    ResultSet rs;
    private String reference;
    
    public Reference(){}
    
    public Reference(String reference){
        this.reference = reference;
    }

    /**
     * @return the reference
     */
    public String getReference() {
        return reference;
    }
    
    public List<Reference> getReferences() throws SQLException{
        List<Reference> referenceList = new ArrayList<>();
            String query = "Select Reference from Reference";
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                 referenceList.add(new Reference(rs.getString("Reference")));
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
        return referenceList;
    }
}
