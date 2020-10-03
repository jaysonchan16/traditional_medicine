/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import menu.MenuItem;

/**
 *
 * @author Sheng
 */
public class MenuCoding {
    
    private javax.swing.JPanel menus;
    
    public MenuCoding(javax.swing.JPanel menus){
        this.menus = menus;
    }
            
    public void menuIcon()
    {
        ImageIcon icon = new ImageIcon(getClass().getResource("/menu/stock1.png"));
        //create submenu
        MenuItem patientData = new MenuItem(icon,"病人资料");
        MenuItem modifyPatientData = new MenuItem(icon,"更改病人资料");
        MenuItem reportPatient = new MenuItem(icon,"病人报告");
        MenuItem findPatient = new MenuItem(icon,"寻找病人资料");
        
        MenuItem addDisease = new MenuItem(icon,"新增病症");
        MenuItem modifyDisease = new MenuItem(icon,"更改病症");
        MenuItem reportDisease = new MenuItem(icon,"病症报告");
        MenuItem modifyChufang = new MenuItem(icon,"更改处方");
        MenuItem findDisease = new MenuItem(icon,"寻找病症");
        
        MenuItem addMedicine = new MenuItem(icon,"新增");
        MenuItem modifyMedicine = new MenuItem(icon,"更改");
        MenuItem findMedicine = new MenuItem(icon,"寻找资料");
        
        //main menu
        MenuItem menuPatient = new MenuItem(icon,"病人",patientData,modifyPatientData,reportPatient,findPatient);
        MenuItem menuDisease = new MenuItem(icon,"病症",addDisease,modifyDisease,reportDisease,modifyChufang,findDisease);
        MenuItem menuMedicine = new MenuItem(icon,"病症",addMedicine,modifyMedicine,findMedicine);
       
        addMenu(menuPatient,menuDisease,menuMedicine);
    }
    
    public void addMenu(MenuItem...menu)
    {
        for (int i = 0; i < menu.length; i++) {
            menus.add(menu[i]);
            ArrayList<MenuItem> subMenu = menu[i].getSubMenu();
            for (MenuItem m : subMenu) {
                addMenu(m);
            }
        }
        menus.revalidate();
    }
}
