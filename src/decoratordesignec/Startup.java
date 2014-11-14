package decoratordesignec;

import java.text.NumberFormat;

/**
 *
 * @author Daniel
 */
public class Startup {


    public static void main(String[] args) {

        
        
        PizzaCashRegister pcr = new PizzaCashRegister();
        
        Crust pizza = new ThinCrust();
//        Crust pizza = new ThickCrust();
        
        
        pcr.startOrder(new NoToppings(pizza), new ConsoleCustomerReceipt());
//        pcr.addToppings(new Sausage(new ThinCrust()));
        
//        pcr.addToppings(new Sausage(pizza));
        
        pcr.endOrder();
              
        
        
        
        //Below works
        
        
//        NumberFormat nf = NumberFormat.getCurrencyInstance();
//        Crust pizza1 = new ThinCrust();
//        
//        
//        System.out.println(pizza1.getDescription()
//                + " " + nf.format(pizza1.cost()));

//        Crust pizza2 = new ThickCrust();
           
//        pizza2 = new Sausage(pizza2);
//        pizza2 = new Pepperoni(pizza2);
        
//        pizza2 = new NoToppings(pizza2);
//        
//        System.out.println(pizza2.getDescription()
//                + " " + nf.format(pizza2.cost()));
//        
        
    }
    
}
