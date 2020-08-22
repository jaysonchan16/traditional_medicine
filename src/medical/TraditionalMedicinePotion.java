/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medical;

/**
 *
 * @author Sheng
 */
public class TraditionalMedicinePotion extends Medicine{

    private float cost;
    
    public TraditionalMedicinePotion() {}
    
    public TraditionalMedicinePotion(String name, String component, float gram, float sellprice, float cost ){
        super(name,component,gram,sellprice, cost);
        
    }
}
