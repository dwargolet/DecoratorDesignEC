package decoratordesignec;

/**This class implements a strategy for displaying the customer receipt
 *this one is particular is for the java console.
 * @author Daniel Wargolet
 * @version 1.00
 */
public class ConsoleCustomerReceipt implements CustomerReceiptOutputStrategy {
    
    
    /**
     * This method prints a string out that contains the desire information
     * @param outputReceipt a string that holds all of the specified information
     */
    @Override
    public void printReceipt(String outputReceipt){
        System.out.print(outputReceipt);
        
    }
    
    
}
