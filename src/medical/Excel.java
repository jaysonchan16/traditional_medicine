/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical;

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
     
    public void exportToExcel(JTable table, String filePath) throws Exception {
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
    
    public HashMap<String, String> checkMonthYearIC(String frommonth, String tomonth, String fromyear, String toyear, String IC){
        String to = "";
        String from = "";
        HashMap<String,String> data = new HashMap<String,String>();
        if (frommonth.equalsIgnoreCase("") && tomonth.equalsIgnoreCase("") && fromyear.equalsIgnoreCase("") && toyear.equalsIgnoreCase("") && IC.equalsIgnoreCase("")) {
            data.put("From",from);
            data.put("To", to);
            data.put("IC",IC);
            data.put("Messages", "请填月份或者IC！");
            return data;
            //JOptionPane.showMessageDialog(rootPane, "请填月份或者IC！");
        } else if (tomonth.length() > 2 || frommonth.length() > 2) {
            data.put("From",from);
            data.put("To", to);
            data.put("IC",IC);
            data.put("Messages", "月份错误！");
            return data;
            //JOptionPane.showMessageDialog(rootPane, "月份错误！");
        } else if (toyear.length() > 4 || (toyear.length() > 0 && toyear.length() < 4) || fromyear.length() > 4 || (fromyear.length() > 0 && fromyear.length() < 4)) {
            data.put("From",from);
            data.put("To", to);
            data.put("IC",IC);
            data.put("Messages", "年份错误！");
            return data;
            //JOptionPane.showMessageDialog(rootPane, "年份错误！");
        } else if (!IC.equalsIgnoreCase("") && (frommonth.equalsIgnoreCase("") && tomonth.equalsIgnoreCase("") && fromyear.equalsIgnoreCase("") && toyear.equalsIgnoreCase(""))) {
            data.put("From",from);
            data.put("To", to);
            data.put("IC",IC);
            data.put("Messages", "");
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
                    data.put("Messages", "");
                    break;
                case 2:
                    if (Integer.parseInt(toyear) % 4 == 0) {
                        to = toyear + "-" + tomonth + "-29";
                        data.put("From",from);
                        data.put("To", to);
                        data.put("IC",IC);
                        data.put("Messages","");
                    } else {
                        to = toyear + "-" + tomonth + "-28";
                        data.put("From",from);
                        data.put("To", to);
                        data.put("IC",IC);
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
                    data.put("Messages","");
                    break;
                default:
                    data.put("From",from);
                    data.put("To", to);
                    data.put("IC",IC);
                    data.put("Messages","月份错误");
                    break;
            }
            return data;
        }
    }
}
