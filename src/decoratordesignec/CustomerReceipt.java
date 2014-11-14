package decoratordesignec;

import java.text.NumberFormat;
import java.util.Date;

/**
 *
 * @author Daniel
 */
public class CustomerReceipt {
    
    private Crust crust;
    private ToppingDecorator topping;
    private CustomerReceiptOutputStrategy output; //instance of the receipt strategy
//    private static final String THNK_YOU_MSG = "Thank you for stopping by!"; //personal message
    private static final String OUTPUT_ERR =
            "You must enter an output strategy";
    
    
    
    public CustomerReceipt(Crust crust, ToppingDecorator topping, CustomerReceiptOutputStrategy output){
        
        this.crust = crust;
        this.output = output;
        this.topping = topping;
//         
//        receiptDate = new Date();
        
    }
    
    
    
    
//    public void addToppings(ToppingDecorator topping) {
//        
//        
//        pizza = new topping(crust);
//        
//    }
    
    
    
    
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
                      
                      "**   " + topping.getDescription() + " \n**    Total: " + nf.format(topping.cost()));
                      
                      
//         "*     " + garageName + "      *\n*         " + garageAddress  + 
//         "             *\n*   Receipt for Customer #" + customerNum + "       *\n*    Parked for " 
//         + parkedCars[i].getHoursParked() + " hours.        *\n" + "*       Total fee: " + 
//                    nf.format(gm.getGarageCompany().getBs().getTotalFee(parkedCars[i].getHoursParked())) +"          *\n*    " +
//                      THNK_YOU_MSG + "   *\n*      " + getReceiptDateFormatted() + "        *\n***********************************\n");
//
//         
          
       
          output.printReceipt(receiptData.toString()); 
//        output.printReceipt(crust.getDescription() + topping.getDescription() + " " + nf.format(crust.cost())); 
         
         
          }

     }     
    
    
    

