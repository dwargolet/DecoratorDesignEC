package decoratordesignec;

/**
 *
 * @author Daniel
 */
public class PizzaCashRegister {
    
    private CustomerReceipt receipt;
    private Crust crust;
    private Crust pizza;
    private ToppingDecorator topping;
    private static final String ORDER_ERR_MSG =
            "There was an issue with the Crust, topping. and/or the Output strategy.";

    
    
    public final void startOrder(ToppingDecorator topping, CustomerReceiptOutputStrategy output){
        if(output == null || topping == null) {
            throw new IllegalArgumentException(ORDER_ERR_MSG);
        }           
        receipt = new CustomerReceipt(crust, topping, output);      
    }
    
//    public final void addToppings(ToppingDecorator topping){     
//      receipt.addToppings(new Sausage(crust));
//    }
    
     
    
    
    
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
