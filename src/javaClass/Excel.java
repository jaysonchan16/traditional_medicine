/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaClass;

import javaClass.connect;
import java.awt.Component;
import java.awt.FontMetrics;
import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
/**
 *
 * @author Sheng
 */
public class Excel {

    public Statement st = connect.connection();
     
    public int exportToExcel(JTable table, String filePath) throws Exception {
        TableModel model = table.getModel();
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet();
        Row row;
        Cell cell;

        // write the column headers
        row = sheet.createRow(0);
        for (int c = 0; c < model.getColumnCount(); c++) {
            cell = row.createCell(c);
            cell.setCellValue(model.getColumnName(c));
        }

        // write the data rows
        for (int r = 0; r < model.getRowCount(); r++) {
            row = sheet.createRow(r + 1);
            for (int c = 0; c < model.getColumnCount(); c++) {
                cell = row.createCell(c);
                Object value = model.getValueAt(r, c);
                if (value instanceof String) {
                    cell.setCellValue((String) value);
                } else if (value instanceof Float) {
                    cell.setCellValue((Float) value);
                } else if (value instanceof Double) {
                    cell.setCellValue((Double) value);
                } else if (value instanceof Integer) {
                    cell.setCellValue((Integer) value);
                } 
                
            }
        }

        FileOutputStream out = new FileOutputStream(filePath);
        workbook.write(out);
        out.close();
        workbook.close();
        return 1;
    }
    
    
    public void Print(javax.swing.JTable table){
        MessageFormat header = new MessageFormat("Report Print");

        MessageFormat footer = new MessageFormat("Page{0,number,integer}");

        try {
            table.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (java.awt.print.PrinterException e) {
            System.err.format("Cannot print %s%n", e.getMessage());
        }
    }
    
    public HashMap<String, String> checkMonthYearIC(String frommonth, String tomonth, String fromyear, String toyear, String IC, String ID){
        String to = "";
        String from = "";
        HashMap<String,String> data = new HashMap<String,String>();
        if (frommonth.equalsIgnoreCase("") && tomonth.equalsIgnoreCase("") && fromyear.equalsIgnoreCase("") && toyear.equalsIgnoreCase("") && IC.equalsIgnoreCase("") && ID.equalsIgnoreCase("")) {
            data.put("From",from);
            data.put("To", to);
            data.put("IC",IC);
            data.put("ID", ID);
            data.put("Messages", "请填月份或者IC或者ID！");
            return data;
            //JOptionPane.showMessageDialog(rootPane, "请填月份或者IC！");
        } else if (tomonth.length() > 2 || frommonth.length() > 2) {
            data.put("From",from);
            data.put("To", to);
            data.put("IC",IC);
            data.put("ID", ID);
            data.put("Messages", "月份错误！");
            return data;
            //JOptionPane.showMessageDialog(rootPane, "月份错误！");
        } else if (toyear.length() > 4 || (toyear.length() > 0 && toyear.length() < 4) || fromyear.length() > 4 || (fromyear.length() > 0 && fromyear.length() < 4)) {
            data.put("From",from);
            data.put("To", to);
            data.put("IC",IC);
            data.put("ID", ID);
            data.put("Messages", "年份错误！");
            return data;
            //JOptionPane.showMessageDialog(rootPane, "年份错误！");
        } else if (!IC.equalsIgnoreCase("") && ID.equalsIgnoreCase("") && (frommonth.equalsIgnoreCase("") && tomonth.equalsIgnoreCase("") && fromyear.equalsIgnoreCase("") && toyear.equalsIgnoreCase(""))) {
            data.put("From",from);
            data.put("To", to);
            data.put("IC",IC);
            data.put("ID",ID);
            data.put("Messages", "");
            return data;
        } else if (!ID.equalsIgnoreCase("") && IC.equalsIgnoreCase("") && (frommonth.equalsIgnoreCase("") && tomonth.equalsIgnoreCase("") && fromyear.equalsIgnoreCase("") && toyear.equalsIgnoreCase(""))) {
            data.put("From",from);
            data.put("To", to);
            data.put("IC",IC);
            data.put("ID",ID);
            data.put("Messages", "");
            return data;
        } else if((!frommonth.equalsIgnoreCase("") && fromyear.equalsIgnoreCase("") && tomonth.equalsIgnoreCase("") && toyear.equalsIgnoreCase("")) ||
                (frommonth.equalsIgnoreCase("") && !fromyear.equalsIgnoreCase("") && tomonth.equalsIgnoreCase("") && toyear.equalsIgnoreCase("")) ||
                (frommonth.equalsIgnoreCase("") && fromyear.equalsIgnoreCase("") && !tomonth.equalsIgnoreCase("") && toyear.equalsIgnoreCase("")) ||
                (frommonth.equalsIgnoreCase("") && fromyear.equalsIgnoreCase("") && tomonth.equalsIgnoreCase("") && !toyear.equalsIgnoreCase("")) ||
                (!frommonth.equalsIgnoreCase("") && !fromyear.equalsIgnoreCase("") && tomonth.equalsIgnoreCase("") && toyear.equalsIgnoreCase("")) ||
                (!frommonth.equalsIgnoreCase("") && fromyear.equalsIgnoreCase("") && !tomonth.equalsIgnoreCase("") && toyear.equalsIgnoreCase("")) ||
                 (!frommonth.equalsIgnoreCase("") && fromyear.equalsIgnoreCase("") && tomonth.equalsIgnoreCase("") && !toyear.equalsIgnoreCase("")) ||
                (frommonth.equalsIgnoreCase("") && fromyear.equalsIgnoreCase("") && !tomonth.equalsIgnoreCase("") && !toyear.equalsIgnoreCase("")) ||
                (frommonth.equalsIgnoreCase("") && !fromyear.equalsIgnoreCase("") && !tomonth.equalsIgnoreCase("") && toyear.equalsIgnoreCase(""))){
            data.put("From",from);
            data.put("To", to);
            data.put("IC",IC);
            data.put("ID",ID);
            data.put("Messages", "请填写完整月份和年份");
            return data;
        } else if(Integer.parseInt(frommonth) > 12){
            data.put("From",from);
            data.put("To", to);
            data.put("IC",IC);
            data.put("ID",ID);
            data.put("Messages", "月份错误");
            return data;
        } else {
            if (tomonth.length() == 1) {
                tomonth = "0" + tomonth;
            }
            if (frommonth.length() == 1) {
                frommonth = "0" + frommonth;
            }
            
            from = fromyear + "-" + frommonth + "-01";
            
            switch (Integer.parseInt(tomonth)) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    to = toyear + "-" + tomonth + "-31";
                    data.put("From",from);
                    data.put("To", to);
                    data.put("IC",IC);
                    data.put("ID",ID);
                    data.put("Messages", "");
                    break;
                case 2:
                    if (Integer.parseInt(toyear) % 4 == 0) {
                        to = toyear + "-" + tomonth + "-29";
                        data.put("From",from);
                        data.put("To", to);
                        data.put("IC",IC);
                        data.put("ID",ID);
                        data.put("Messages","");
                    } else {
                        to = toyear + "-" + tomonth + "-28";
                        data.put("From",from);
                        data.put("To", to);
                        data.put("IC",IC);
                        data.put("ID",ID);
                        data.put("Messages","");
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    to = toyear + "-" + tomonth + "-30";
                    data.put("From",from);
                    data.put("To", to);
                    data.put("IC",IC);
                    data.put("ID",ID);
                    data.put("Messages","");
                    break;
                default:
                    data.put("From",from);
                    data.put("To", to);
                    data.put("IC",IC);
                    data.put("ID",ID);
                    data.put("Messages","月份错误");
                    break;
            }
            return data;
        }
    }
    
       public int countModel(DefaultTableModel model,String ExcelName)
        {
            int result = 0;
            int nRow = model.getRowCount(), nCol = model.getColumnCount();
            Object columnsName[] = new Object[nCol];
            Object[][] tableData = new Object[nRow][nCol];
            for(int z=0; z< nCol;z++)
            {
                columnsName[z] = model.getColumnName(z);
                System.out.print(model.getColumnName(z));
            }

            for (int i = 0 ; i < nRow ; i++){
                for (int j = 0 ; j < nCol ; j++){
                    tableData[i][j] = model.getValueAt(i,j);
                    System.out.print(tableData[i][j]);
                }
            }
            JTable table = new JTable(tableData,columnsName);
            
            try {
                result = exportToExcel(table, ExcelName+".xlsx");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            return result;
        }
    
    public HashMap<String, String> checkMonthYear(String frommonth, String tomonth, String fromyear, String toyear){
        String to = "";
        String from = "";
        HashMap<String,String> data = new HashMap<String,String>();
        if (frommonth.equalsIgnoreCase("") && tomonth.equalsIgnoreCase("") && fromyear.equalsIgnoreCase("") && toyear.equalsIgnoreCase("") ) {
            data.put("From",from);
            data.put("To", to);
            //data.put("Messages", "请填月份");
            data.put("Messages", "");
            return data;
            //JOptionPane.showMessageDialog(rootPane, "请填月份或者IC！");
        } else if (tomonth.length() > 2 || frommonth.length() > 2) {
            data.put("From",from);
            data.put("To", to);
            data.put("Messages", "月份错误！");
            return data;
            //JOptionPane.showMessageDialog(rootPane, "月份错误！");
        } else if (toyear.length() > 4 || (toyear.length() > 0 && toyear.length() < 4) || fromyear.length() > 4 || (fromyear.length() > 0 && fromyear.length() < 4)) {
            data.put("From",from);
            data.put("To", to);
            data.put("Messages", "年份错误！");
            return data;
            //JOptionPane.showMessageDialog(rootPane, "年份错误！");
        } else if((!frommonth.equalsIgnoreCase("") && fromyear.equalsIgnoreCase("") && tomonth.equalsIgnoreCase("") && toyear.equalsIgnoreCase("")) ||
                (frommonth.equalsIgnoreCase("") && !fromyear.equalsIgnoreCase("") && tomonth.equalsIgnoreCase("") && toyear.equalsIgnoreCase("")) ||
                (frommonth.equalsIgnoreCase("") && fromyear.equalsIgnoreCase("") && !tomonth.equalsIgnoreCase("") && toyear.equalsIgnoreCase("")) ||
                (frommonth.equalsIgnoreCase("") && fromyear.equalsIgnoreCase("") && tomonth.equalsIgnoreCase("") && !toyear.equalsIgnoreCase("")) ||
                (!frommonth.equalsIgnoreCase("") && !fromyear.equalsIgnoreCase("") && tomonth.equalsIgnoreCase("") && toyear.equalsIgnoreCase("")) ||
                (!frommonth.equalsIgnoreCase("") && fromyear.equalsIgnoreCase("") && !tomonth.equalsIgnoreCase("") && toyear.equalsIgnoreCase("")) ||
                 (!frommonth.equalsIgnoreCase("") && fromyear.equalsIgnoreCase("") && tomonth.equalsIgnoreCase("") && !toyear.equalsIgnoreCase("")) ||
                (frommonth.equalsIgnoreCase("") && fromyear.equalsIgnoreCase("") && !tomonth.equalsIgnoreCase("") && !toyear.equalsIgnoreCase("")) ||
                (frommonth.equalsIgnoreCase("") && !fromyear.equalsIgnoreCase("") && !tomonth.equalsIgnoreCase("") && toyear.equalsIgnoreCase(""))){
            data.put("From",from);
            data.put("To", to);
            data.put("Messages", "请填写完整月份和年份");
            return data;
        } else if(Integer.parseInt(frommonth) > 12){
            data.put("From",from);
            data.put("To", to);
            data.put("Messages", "月份错误");
            return data;
        } else {
            if (tomonth.length() == 1) {
                tomonth = "0" + tomonth;
            }
            if (frommonth.length() == 1) {
                frommonth = "0" + frommonth;
            }
            
            from = fromyear + "-" + frommonth + "-01";
            
            switch (Integer.parseInt(tomonth)) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    to = toyear + "-" + tomonth + "-31";
                    data.put("From",from);
                    data.put("To", to);
                    data.put("Messages", "");
                    break;
                case 2:
                    if (Integer.parseInt(toyear) % 4 == 0) {
                        to = toyear + "-" + tomonth + "-29";
                        data.put("From",from);
                        data.put("To", to);
                        data.put("Messages","");
                    } else {
                        to = toyear + "-" + tomonth + "-28";
                        data.put("From",from);
                        data.put("To", to);
                        data.put("Messages","");
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    to = toyear + "-" + tomonth + "-30";
                    data.put("From",from);
                    data.put("To", to);
                    data.put("Messages","");
                    break;
                default:
                    data.put("From",from);
                    data.put("To", to);
                    data.put("Messages","月份错误");
                    break;
            }
            return data;
        }
    }
}
