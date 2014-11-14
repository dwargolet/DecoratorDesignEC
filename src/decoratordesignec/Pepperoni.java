package decoratordesignec;

/**
 *
 * @author Daniel
 */
public class Pepperoni extends ToppingDecorator{
    
    private Crust crust;
    private double pepperoniCost = 0.12;
    private String pizzaDescription = ", pepperoni";
    
    public Pepperoni(Crust crust) {
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

        return crust.getDescription() + pizzaDescription;
    }

    @Override
    public double cost () {

        return pepperoniCost + crust.cost();
    }  
}
