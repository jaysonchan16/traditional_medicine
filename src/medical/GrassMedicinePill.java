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
public class GrassMedicinePill extends Medicine{
    
    public GrassMedicinePill(){}
    
    public GrassMedicinePill(String name, String component, String effect, String indications, float sellprice, float gram, float cost){
        super(name,component,effect,indications,sellprice,gram,cost);
    }

}
