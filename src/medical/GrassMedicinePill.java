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
    
    private String taste;
    private String guijing;
    private int portion;
    
    public GrassMedicinePill(){}
    
    public GrassMedicinePill(String name, String taste, String guijing, String effect, float cost, int portion, String remark, float gprice){
        super(name,effect,remark,gprice,cost);
        this.taste =taste;
        this.guijing = guijing;
        this.portion = portion;
    }

    /**
     * @return the taste
     */
    public String getTaste() {
        return taste;
    }

    /**
     * @param taste the taste to set
     */
    public void setTaste(String taste) {
        this.taste = taste;
    }

    /**
     * @return the guijing
     */
    public String getGuijing() {
        return guijing;
    }

    /**
     * @param guijing the guijing to set
     */
    public void setGuijing(String guijing) {
        this.guijing = guijing;
    }

    /**
     * @return the portion
     */
    public int getPortion() {
        return portion;
    }

    /**
     * @param portion the portion to set
     */
    public void setPortion(int portion) {
        this.portion = portion;
    }
    
    
}
