package decoratordesignec;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Daniel
 */
public class CustomerReceipt {
    private List<Pizza> pizzaOptions;
    private ToppingDecorator topping;
    private CustomerReceiptOutputStrategy output; //instance of the receipt strategy
//    private static final String THNK_YOU_MSG = "Thank you for stopping by!"; //personal message
    private static final String OUTPUT_ERR =
            "You must enter an output strategy";
    
    
    
    public CustomerReceipt(Pizza crust, CustomerReceiptOutputStrategy output){
        pizzaOptions = new ArrayList<>();
        pizzaOptions.add(crust);
        this.output = output;
    }
    
    
    public void addToppings(Pizza topping) {
          
       pizzaOptions.add(topping);
        
    }
    
    
    
    
    /**
     * method for setting the property referencing the output strategy
     * @param output the property used for the output strategy
     */
    public void setOutput(CustomerReceiptOutputStrategy output) {       
        if(output == null) {
            throw new IllegalArgumentException(OUTPUT_ERR);
        }       
        this.output = output;
    }
    
    
    
    public final void printReceipt(){    
        NumberFormat nf = NumberFormat.getCurrencyInstance();
            double cost = 0;
              StringBuilder receiptData = new StringBuilder("** INGREDIENTS*** \n");
              receiptData.append("\n\nINGREDIENTS: ").append(pizzaOptions.get(pizzaOptions.size()-1).getDescription());

              receiptData.append("\n\nTOTAL COST: ").append(pizzaOptions.get(pizzaOptions.size()-1).cost());
                      
//                      "  " + topping.getDescription() + " \n    Total: " + nf.format(topping.cost()));
                       
          
       
          output.printReceipt(receiptData.toString()); 
         
          }

     }     
    
    
    

