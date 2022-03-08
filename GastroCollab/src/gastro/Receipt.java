package gastro;


/**
 * Receipts
 *
 * arraylist - will store objects - the objects are ingredients with three data points
 * 		ingredients name, quantity of the ingredient, and the unity of measurement
 *
 * category - when de receipt is created, the user will specify the category
 *
 * instructions - the instructions will be what the user need to do to realize the receipt
 * this will be a field in android studio
 *
 * HashMap -
 *
 * lastModified (get the current data with java code);
 *
 *
 * isUser: boolean - true // we'll modify this piece later, because we need to implement a functionality to know if the user that is on page is the user that is logged in, in order to edit the receipt.
 *
 * date - updates the data that the last receipt was modified
 *
 * blockNonUsers(isUser) - check if is the user -  if not, the user won't be able to edit the receipt.
 *
 * options() - event click on to display three options - this will be made in android studio.
 */

public class Receipt {
    private String category;
    private String instructions;
    // lastModified(Date)
    private boolean isUser;



}
