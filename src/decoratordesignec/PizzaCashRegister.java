package decoratordesignec;

/**
 *
 * @author Daniel
 */
public class PizzaCashRegister {
    private Pizza crust;
    private CustomerReceipt receipt;
    private ToppingDecorator topping;
    private static final String ORDER_ERR_MSG =
            "There was an issue with the Crust, topping. and/or the Output strategy.";

    
    
    public final void startOrder(Pizza crust, CustomerReceiptOutputStrategy output){
        if(output == null || crust == null) {
            throw new IllegalArgumentException(ORDER_ERR_MSG);
        }     
        this.crust = crust;
        receipt = new CustomerReceipt(crust, output);      
    }
    
    public final void addTopping(Pizza topping){     

        receipt.addToppings(topping);
    }
    
     
    
    
    
    /**
     * allows the user to set what kind of receipt they want
     * @param receipt the instance of receipt
     */
    public void setCustomerReceipt(CustomerReceipt receipt){
        this.receipt = receipt;
    }
    
    
    /**
     * This method prints out the receipt with all of the information and ends
     * the transaction
     */
    public void endOrder(){
        receipt.printReceipt();
    }
    
}
