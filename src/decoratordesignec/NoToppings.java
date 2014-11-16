package decoratordesignec;

/**
 *
 * @author Daniel
 */
public class NoToppings extends ToppingDecorator{
    private Pizza crust;
    private String pizzaDescription = " no toppings";
    
    
    public NoToppings(Pizza crust) {
        this.crust = crust;
    }
         
    @Override
    public String getDescription() {
        return crust.getDescription() + pizzaDescription;
    }

    @Override
    public double cost () {
        return crust.cost();
    }  
}
