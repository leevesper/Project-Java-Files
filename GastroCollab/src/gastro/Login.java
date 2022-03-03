package gastro;

/**
 *  ------------------WHEN LOGGED--------------
 *  * void viewUserAccount() it'll be able to view user's account
 *  * void userStatus() - check if user is logged or not, this will change the status of userStatus attribute
 *  *                      this will determine which page is being showing at the menu -
 *  *                      user status is false for default, and true after logged
 *  *
 */

public interface Login {
    boolean login();
    void userStatus(); // I used userStatus instead of changeToViewAccount 'cause the verbosity
}
