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
    
    private String property;
    private String utilize;
    
    public TraditionalMedicinePill(){}
    
    public TraditionalMedicinePill(String name, String effect, float sellprice, float gram, float cost, String property, String utilize)
    {
        super(name,effect,sellprice,gram,cost);
    }

    /**
     * @return the property
     */
    public String getProperty() {
        return property;
    }

    /**
     * @param property the property to set
     */
    public void setProperty(String property) {
        this.property = property;
    }

    /**
     * @return the utilize
     */
    public String getUtilize() {
        return utilize;
    }

    /**
     * @param utilize the utilize to set
     */
    public void setUtilize(String utilize) {
        this.utilize = utilize;
    }
}
