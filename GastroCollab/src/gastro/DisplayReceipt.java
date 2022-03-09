package gastro;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * THIS WILL BE A TEST CLASS FOR
 */

public class DisplayReceipt {
    public static void main(String[] args) {

        //initial variables and input
        String item, unity;
        int qty;

        //receipt instance
        Receipt r = new Receipt();

        Scanner scan = new Scanner(System.in);

        System.out.println("\nWrite the items separately: item, quantity and unity");

        System.out.println("\nWrite the item: ");
        item = scan.nextLine();

        System.out.println("Write the quantity: ");
        qty = scan.nextInt();

        System.out.println("Write the unity: ");
        unity = scan.next();

        //space
        System.out.println();


        /**
         * I have declared some initial variables  to take as input and pass them as arguments in an object
         * these variables will be resigned to the constructor variables of the class
         * IngredientConstructor
         */

        //line 1 - l1 - first line as the first object
        IngredientConstructor l1 = new IngredientConstructor(item, qty, unity);


        // Create an ArrayList object
        //(Declaring List of IngredientConstructor type)
        ArrayList<IngredientConstructor> ingredients = new ArrayList<IngredientConstructor>();

        //now I can add an object to the Array list
        ingredients.add(l1);
        System.out.println(l1.toString());

        //print date
        r.lastUpdate();
    }
}
