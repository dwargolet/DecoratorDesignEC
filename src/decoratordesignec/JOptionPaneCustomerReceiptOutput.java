package decoratordesignec;

import javax.swing.JOptionPane;

/**This class implements the receipt strategy and allows for the output to be 
 * displayed through a gui
 *
 * @author Daniel
 * @version 1.00
 */
public class JOptionPaneCustomerReceiptOutput implements CustomerReceiptOutputStrategy{
    
    @Override
    public void printReceipt(String outputReceipt){
        JOptionPane.showMessageDialog(null, outputReceipt);
    }
}
