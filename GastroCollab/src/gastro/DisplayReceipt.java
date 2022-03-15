package gastro;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

/**
 * THIS WILL BE A TEST CLASS FOR
 */

public class DisplayReceipt {
    public static void main(String[] args) {

        //initial variables and input
        //count is the counter for the objects
        String item, unity, answer;
        int qty, count;

        //receipt class instance
        Receipt r = new Receipt();

        //initial inputs
        Scanner scan = new Scanner(System.in);

        //initial variables assignments
        answer = "y";
        count = 0;

        while (Objects.equals(answer, "y")) {
            //for asking the user if he wants to add a new ingredient
            System.out.println("\nWrite the items separately: item, quantity and unity");

            System.out.println("\nWrite the item: ");
            item = scan.next();

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
            //IngredientConstructor l1 = new IngredientConstructor(item, qty, unity);


            // Create an ArrayList object
            //(Declaring List of IngredientConstructor type)
            ArrayList<IngredientConstructor> ingredients = new ArrayList<IngredientConstructor>();

            //before entering a loop, we need to update our count
            count++;

            //only loop one iteration, to generate only one object input
            for (int i = 0; i < count; i++) {
                ingredients.add(i, new IngredientConstructor(item, qty, unity));
            }


            //now I can add an object to the Array list
            //ingredients.add(l1);
            //System.out.println(l1.toString());
            for (Object i : ingredients) {
                System.out.println(i);
            }



            System.out.println("\nDo you want to add another ingredient? y/n");
            answer = scan.next();
        }

        //print date
        r.lastUpdate();
    }
}
