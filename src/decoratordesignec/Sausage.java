package decoratordesignec;

/**
 *
 * @author Daniel
 */
public class Sausage extends ToppingDecorator{
    
    private Crust crust;
    private double sausageCost = 0.10;
    private String pizzaDescription = ", sausage";
    
    public Sausage(Crust crust) {
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

        return crust.getDescription() + pizzaDescription;
    }

    @Override
    public double cost () {

        return sausageCost + crust.cost();
    }  
    
}
