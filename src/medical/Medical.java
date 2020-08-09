/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sheng
 */
public class Medical {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new NewPatient().setVisible(true);
//            }
//        });
       /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUI().setVisible(true);
            }
        });*/
//       java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                try {
//                    new ViewPatientDetail().setVisible(true);
//                } catch (SQLException ex) {
//                    Logger.getLogger(Medical.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            }
//        });
//        new TestImportToJtable();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImportJtable().setVisible(true);
            }
        });
    }
    
}
