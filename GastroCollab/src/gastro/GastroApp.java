package gastro;


/**
 *
 * Interfaces are public and abstract for default
 * this is the reason I  didn't write them in the methods
 *
 *  Norman,
 *  void checkIfLogin() -  is in UML, but not here, maybe would be redundant because we can check
 *                         the status with the function above, you're welcome to express your ideas
 *                         in order to keep this function
 */
public interface GastroApp {
    void viewReceipts();
    void viewUserAccount();
}


