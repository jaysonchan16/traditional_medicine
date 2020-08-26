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
    
    public TraditionalMedicinePotion() {}
    
    public TraditionalMedicinePotion(String name, String component, String effect, String indications, int scoop, float sellprice, float gram, float cost, String createDateTime, String lastUpdateDateTime){
        super(name,component,effect,indications,scoop,sellprice,gram,cost,createDateTime,lastUpdateDateTime);
        
    }
}
