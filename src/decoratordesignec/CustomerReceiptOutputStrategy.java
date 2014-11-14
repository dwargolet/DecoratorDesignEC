package decoratordesignec;

/**This is an interface used for different receipt outputs, every strategy
 *prints the receipt, which is what the common method is
 *
 * @author Daniel
 * @version 1.00
 */
public interface CustomerReceiptOutputStrategy {
     public abstract void printReceipt(String outputReceipt);
}

