package decoratordesignec;

/**An example of the decorator design. May at some point come back
 *and add some stuff to make it a more complete program, for now
 * it serves to stand as a working example.
 * @author Daniel
 * @version 1.00
 */
public class Startup {


    public static void main(String[] args) {

        
        
        PizzaCashRegister pcr = new PizzaCashRegister();
        
        Pizza pizza = new ThinCrust();
//        Crust pizza = new ThickCrust();
        
        
        pcr.startOrder(pizza, new ConsoleCustomerReceipt());
        pizza = new Sausage(pizza);
        pcr.addTopping(pizza);
        pizza = new BlackOlives(pizza);
        pcr.addTopping(pizza);
//        pizza = new Sausage(pizza);
//        pcr.addToppings(new Sausage(pizza));
        
        pcr.endOrder();
                 
        
    }
    
}
