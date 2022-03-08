package gastro;

public class IngredientConstructor {

    protected String name;
    protected int quantity;
    protected String unity;

    public IngredientConstructor(String name, int quantity, String unity) {
        setName(name);
        setQuantity(quantity);
        setUnity(unity);


       /**
        * //it is the same of the code below
        *
        this.name = name;
        this.quantity = quantity;
        this.unity = unity;
        */
    }


    //------Getters and Setters methods-------


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUnity() {
        return unity;
    }

    public void setUnity(String unity) {
        this.unity = unity;
    }


    //-------String Displaying-------


    @Override
    public String toString() {
        return "Item -  " + name + ": " + quantity + unity + ".";
    }
}
