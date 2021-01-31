/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaClass;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;

/**
 *
 * @author Sheng
 */

public class Bill extends Prescription{
    private int items;
    private double subtotal;
    private String createDateTime;
    private String lastUpdateTime;
    private String billDate;
    private String user;
    /**
     * @return the items
     */
    public int getItems() {
        return items;
    }

    /**
     * @param items the items to set
     */
    public void setItems(int items) {
        this.items = items;
    }

    /**
     * @return the subtotal
     */
    public double getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    
    /**
     * @return the createDateTime
     */
    public String getCreateDateTime() {
        return createDateTime;
    }

    /**
     * @param createDateTime the createDateTime to set
     */
    public void setCreateDateTime(String createDateTime) {
        this.createDateTime = createDateTime;
    }

    /**
     * @return the lastUpdateTime
     */
    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    /**
     * @param lastUpdateTime the lastUpdateTime to set
     */
    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
    
        /**
     * @return the billDate
     */
    public String getBillDate() {
        return billDate;
    }

    /**
     * @param billDate the billDate to set
     */
    public void setBillDate(String billDate) {
        this.billDate = billDate;
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
    
    public Bill(){}
    
    public Bill(String billDate, int billno, String user, int items, double subtotal)
    {
        super(billno);
        this.billDate = billDate;
        this.user = user;
        this.items = items;
        this.subtotal = subtotal;
    }
    
    public HashMap<String,String> AddBill()
    {
        HashMap<String,String> returnMessage = new HashMap<String,String>();
        try {
            String query = "insert into Bill(Items,BillNo,BillDate,User,SubTotal,createDateTime,lastUpdateDateTime)"
                    + "Select trim('"+items+"'), trim('"+billno+"'), date('now','localtime'), trim('"+user+"'), trim('"+subtotal+"'), datetime('now','localtime'),datetime('now','localtime')";

            SQLQuery sql = new SQLQuery();

            returnMessage.put("returnMessage",sql.AddEditDeleteQuery(query));
            return returnMessage;
        } catch (SQLException ex) {
            returnMessage.put("returnMessage",ex.getMessage());
            return returnMessage;
        }
    }
    
    public String EditBill() throws SQLException{
         String query = "Update Bill Set Items = trim('"+items+"'), BillDate = 'datetime('now','localtime')',"
                 + " SubTotal = trim('"+subtotal+"'), lastUpdateDateTime = datetime('now','localtime') "
                 + " where Bill = '"+billno+"' and User = '"+getUser()+"'";
        System.out.println(query);
        SQLQuery sql = new SQLQuery();

        return sql.AddEditDeleteQuery(query);
    }
    
    public String DeleteBill() throws SQLException{
        String query = "Delete From Prescription where BillNo = '"+billno+"' and User ='"+getUser()+"'";
        System.out.println(query);
        SQLQuery sql = new SQLQuery();

        return sql.AddEditDeleteQuery(query);
    }
    
    public List<Bill> getBills(String User) throws SQLException{
        List<Bill> billList = new ArrayList<>();
                
            String query = "Select Items,BillNo,BillDate,User,SubTotal from Bill";
            System.out.println(query);
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                 billList.add(new Bill(rs.getString("BillDate"),rs.getInt("BillNo"),
                         rs.getString("User"),rs.getInt("Items"),rs.getDouble("SubTotal")));
            } 
        } 
        catch (Exception e)
        {
            throw(new NoSuchElementException(e.getMessage()));
        }
        return billList;
    }
    
    public List<Bill> getBillsByDate(String User, String from, String to) throws SQLException{
        List<Bill> billList = new ArrayList<>();
                
            String query = "Select Items,BillNo,BillDate,User,SubTotal from Bill where (BillDate>='"+from+"' and BillDate<='"+to+"')";
            System.out.println(query);
        rs = st.executeQuery(query);
        try {
            while (rs.next()) {
                 billList.add(new Bill(rs.getString("BillDate"),rs.getInt("BillNo"),
                         rs.getString("User"),rs.getInt("Items"),rs.getDouble("SubTotal")));
            } 
        } 
        catch (Exception e)
        {
            throw(new NoSuchElementException(e.getMessage()));
        }
        return billList;
    }

    


}
