package decoratordesignec;

/**
 *
 * @author Daniel
 */
public class NoToppings extends ToppingDecorator{
    private Crust crust;
    private String pizzaDescription = " no toppings";
    
    
    public NoToppings(Crust crust) {
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
