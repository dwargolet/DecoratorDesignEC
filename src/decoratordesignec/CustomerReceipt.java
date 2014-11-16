package decoratordesignec;

import java.text.NumberFormat;
import java.util.Date;

/**
 *
 * @author Daniel
 */
public class CustomerReceipt {
    
    private Pizza crust;
    private ToppingDecorator topping;
    private CustomerReceiptOutputStrategy output; //instance of the receipt strategy
//    private static final String THNK_YOU_MSG = "Thank you for stopping by!"; //personal message
    private static final String OUTPUT_ERR =
            "You must enter an output strategy";
    
    
    
    public CustomerReceipt(Pizza crust, ToppingDecorator topping, CustomerReceiptOutputStrategy output){
        
        this.crust = crust;
        this.output = output;
        this.topping = topping;
        
    }
    
    
    public void addToppings(ToppingDecorator topping) {

        topping = this.topping(crust);
        
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
        
              StringBuilder receiptData = new StringBuilder("*********************************** \n" +
                      
                      "  " + topping.getDescription() + " \n    Total: " + nf.format(topping.cost()));
                       
          
       
          output.printReceipt(receiptData.toString()); 
         
          }

     }     
    
    
    

