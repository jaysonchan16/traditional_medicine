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
import java.io.*;
import java.util.*;

public class Medicine {
    private String name;
    private String component;
    private String effect;
    private String indications;
    private float sellprice;
    private float gram;
    private float cost;

    public Medicine(){}
    
    public Medicine(String name,String effect,float sellprice, float gram, float cost){
        this.name = name;
        this.effect = effect;
        this.sellprice = sellprice;
        this.gram = gram;
        this.cost = cost;
    }
    
    public Medicine(String name, String component, String effect, String indications, float sellprice, float gram, float cost){
        this.name = name;
        this.component = component;
        this.effect = effect;
        this.indications = indications;
        this.gram = gram;
        this.sellprice = sellprice;
        this.cost = cost;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the component
     */
    public String getComponent() {
        return component;
    }

    /**
     * @param component the component to set
     */
    public void setComponent(String component) {
        this.component = component;
    }

    /**
     * @return the effect
     */
    public String getEffect() {
        return effect;
    }

    /**
     * @param effect the effect to set
     */
    public void setEffect(String effect) {
        this.effect = effect;
    }

    /**
     * @return the indications
     */
    public String getIndications() {
        return indications;
    }

    /**
     * @param indications the indications to set
     */
    public void setIndications(String indications) {
        this.indications = indications;
    }

    /**
     * @return the sellprice
     */
    public float getSellprice() {
        return sellprice;
    }

    /**
     * @param sellprice the sellprice to set
     */
    public void setSellprice(float sellprice) {
        this.sellprice = sellprice;
    }

    /**
     * @return the gram
     */
    public float getGram() {
        return gram;
    }

    /**
     * @param gram the gram to set
     */
    public void setGram(float gram) {
        this.gram = gram;
    }

    /**
     * @return the cost
     */
    public float getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(float cost) {
        this.cost = cost;
    }
        
}
