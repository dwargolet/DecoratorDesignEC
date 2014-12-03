package decoratordesignec;

/**
 *
 * @author Daniel
 */
public class Pepperoni extends ToppingDecorator{
    
    private Pizza crust;
    private double pepperoniCost = 0.12;
    private String description = ", pepperoni";
    
    public Pepperoni(Pizza crust) {
        this.crust = crust;
    }

    public double getPepperoniCost() {
        return pepperoniCost;
    }

    public void setPepperoniCost(double pepperoniCost) {
        this.pepperoniCost = pepperoniCost;
    }

      
    
    @Override
    public String getDescription() {

        return crust.getDescription() + description;
    }

    @Override
    public double cost () {

        return pepperoniCost + crust.cost();
    }  
}
