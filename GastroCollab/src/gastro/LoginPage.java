package gastro;

import java.util.HashMap;

/**
 * Initially, this is the first class that will be called in order to access the user account
 *
 */

public class LoginPage implements Login {
   private boolean isUserLogin = false;
   private String hintData;
   private String lastFour;

   // I noticed that you put name and password as parameters in log in function, then I created this variables
   private String name;
   private String password;

   //is this HashMap used for passwords?
   HashMap<String, String> passwordStore = new HashMap<String, String>();


    /**
     * this will be the getter and setter for isUserLogin
     * @return
     */
   public boolean getIsUserLogin() {
    return isUserLogin;
   }
   public void setIsUserLogin(boolean userLogin) {
   isUserLogin = userLogin;
   }


    /**
     * these two functions will be de interface methods developed
     * @return
     */
   @Override
   public boolean login() {
    return false;
   }


   @Override
    public void userStatus() {

    }
}


/**
 *
 *
 * Just use hashmap.containsKey(key) && hashmap.get(key).equals(value) to check the relationship.
 *
 * It gets the value for key if it exists and compares it to the given value.
 *
 * Here is the full method:
 *
 * public static boolean checkRelationship(String key, String value) {
 *     return hashmap.containsKey(key) && hashmap.get(key).equals(value);
 * }
 * You should also initialize the HashMap only once (e.g. in the static {} block) and not every time the method is called.
 */