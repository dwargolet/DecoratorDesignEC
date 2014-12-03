package decoratordesignec;

/**
 *
 * @author Daniel
 */
public class BlackOlives extends ToppingDecorator{
    
    private Pizza crust;
    private double blackOlivesCost = 0.6;
    private String description = ", black olives";
    
    
    public BlackOlives(Pizza crust) {
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

        return crust.getDescription() + description;
    }

    @Override
    public double cost () {
        return blackOlivesCost + crust.cost();
    }  
}
