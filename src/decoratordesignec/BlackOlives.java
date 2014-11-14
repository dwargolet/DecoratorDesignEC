package decoratordesignec;

/**
 *
 * @author Daniel
 */
public class BlackOlives extends ToppingDecorator{
    
    private Crust crust;
    private double blackOlivesCost = 0.6;
    private String pizzaDescription = ", black olives";
    
    
    public BlackOlives(Crust crust) {
        this.crust = crust;
    }

    public double getBlackOlivesCost() {
        return blackOlivesCost;
    }

    public void setBlackOlivesCost(double blackOlivesCost) {
        this.blackOlivesCost = blackOlivesCost;
    }
       
    
    @Override
    public String getDescription() {

        return crust.getDescription() + pizzaDescription;
    }

    @Override
    public double cost () {
        return blackOlivesCost + crust.cost();
    }  
}
