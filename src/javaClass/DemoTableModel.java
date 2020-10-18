/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaClass;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Sheng
 */
public class DemoTableModel extends AbstractTableModel {
      private ArrayList wrappedColumnNames = new ArrayList();
      private int numRows;
      public DemoTableModel(List columnNames, int numRows) {
         for (Object name: columnNames)
            wrappedColumnNames.add("" + name + "");
            this.numRows = numRows;
      }
      public int getRowCount() {
         return numRows;
      }
      public int getColumnCount() {
         return wrappedColumnNames.size();
      }
      public Object getValueAt(int rowIndex, int columnIndex) {
         return Integer.valueOf(10000 + (rowIndex + 1)*(columnIndex + 1));
      }
      public String getColumnName(int column) {
         return (String) wrappedColumnNames.get(column);
      }
      public Class getColumnClass(int columnIndex) {
         return Integer.class;
      }
   }