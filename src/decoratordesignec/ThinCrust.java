/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratordesignec;

/**
 *
 * @author Daniel
 */
public class ThinCrust extends Pizza{

    private double thinCrustCost = 4.99;
    private String description = "Thin Crust with";
    
    public String getDescription() {
        return description;
    }
    
    public ThinCrust() {
        description = description;
    }

    public double getThinCrustCost() {
        return thinCrustCost;
    }

    public void setThinCrustCost(double thinCrustCost) {
        this.thinCrustCost = thinCrustCost;
    }
    
    @Override
    public double cost () {
        return thinCrustCost;
    }
    
}
