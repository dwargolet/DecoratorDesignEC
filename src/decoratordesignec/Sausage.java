package decoratordesignec;

/**
 *
 * @author Daniel
 */
public class Sausage extends ToppingDecorator{
    
    private Pizza crust;
    private double sausageCost = 0.10;
    private String description = ", sausage";
    
    public Sausage(Pizza crust) {
        this.crust = crust;
    }

    public double getSausageCost() {
        return sausageCost;
    }

    public void setSausageCost(double sausageCost) {
        this.sausageCost = sausageCost;
    }
    
    
    @Override
    public String getDescription() {

        return crust.getDescription() + description;
    }

    @Override
    public double cost () {

        return sausageCost + crust.cost();
    }  
    
}
