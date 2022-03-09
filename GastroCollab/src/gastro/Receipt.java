package gastro;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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

public class Receipt implements ReceiptInterface {
    private String category;
    private String instructions;
    // lastModified(Date)
    private boolean isUser;


    @Override
    public int calculatePortions() {
        return 0;
    }

    @Override
    public void blockNonUsers() {

    }

    //whenever a receipt or ingredient are created, show the current date
    @Override
    public void lastUpdate() {

        //we need to import a LocalDate object in java.time package
        //then create an instance of this class
        //source https://www.w3schools.com/java/java_date.asp
        LocalDate lastModified = LocalDate.now();

        // I have found another beauty way to display date using the code above
        //onl to format the date showed
        DateTimeFormatter date = DateTimeFormatter.ofPattern("dd-MMM-yyyy");

        String formattedDate = lastModified.format(date);
        System.out.println("Last Update -  " + formattedDate);
    }
}
