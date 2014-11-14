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
public class ThickCrust extends Crust{
    private double thickCrustCost = 6.99;
    private String crustDescription = "Thick Crust with";
    
    public ThickCrust() {
        description = crustDescription;
    }

    public double getThickCrustCost() {
        return thickCrustCost;
    }

    public void setThickCrustCost(double thickCrustCost) {
        this.thickCrustCost = thickCrustCost;
    }
    
    @Override
    public double cost () {
        return thickCrustCost;
    }
    
}
