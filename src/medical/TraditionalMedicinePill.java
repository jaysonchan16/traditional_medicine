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
public class TraditionalMedicinePill extends Medicine{
    
    public TraditionalMedicinePill(){}
    
    public TraditionalMedicinePill(String name, String component, float gprice, String remark, float cost)
    {
        super(name, component, gprice,remark, cost);
    }
}
