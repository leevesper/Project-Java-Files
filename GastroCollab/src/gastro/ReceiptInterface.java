package gastro;

public interface ReceiptInterface {

    //options()
    int calculatePortions();
    void blockNonUsers();
    
    //as Date is a keyword and date() can be easily confounded
    //I will use lastUpdate() as the name of function
    void lastUpdate();
}
