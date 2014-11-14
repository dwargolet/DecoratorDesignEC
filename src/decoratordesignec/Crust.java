package decoratordesignec;

/**
 *
 * @author Daniel
 */
public abstract class Crust {
    
    public String description = "Unknown";

    public String getDescription() {
        return description;
    }

    public abstract double cost ();
    
    
}
