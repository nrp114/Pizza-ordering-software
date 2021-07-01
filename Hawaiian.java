package sample;

import java.util.ArrayList;

/**
 * Create a Pizza with Hawaiian as its type
 * @author Nisarg Patel and Yash Patel
 */
public class Hawaiian extends Pizza {

    /**
     * Creates an instance of Hawaiian Pizza with size as parameter
     * @param size size of pizza
     * @author Nisarg Patel
     */
    public Hawaiian(String size){
        super("Hawaiian",size);
        ArrayList<String> toppings = new ArrayList<String>();
        toppings.add("Ham");
        toppings.add("Pineapple");

        super.toppings = toppings;
    }

    /**
     * Find the price of Pizza based on its size and type
     * @return the pizza of pizza
     * @author Nisarg Patel
     */
    @Override
    public int pizzaPrice() {
        if(super.size.equals("Small")){
            return topping_index.SMALL_HAWAIIAN_PRICE;
        }
        else if(super.size.equals("Medium")){
            return topping_index.MEDIUM_HAWAIIAN_PRICE;
        }
        else if(super.size.equals("Large")){
            return topping_index.LARGE_HAWAIIAN_PRICE;
        }
        return topping_index.NOT_FOUND;
    }

    /**
     * Textually represents an instance of Hawaiian Pizza
     * @return the String representation of an object
     * @author Nisarg Patel
     */
    @Override
    public String toString() {
        return super.toString() + "    Price :" + pizzaPrice();
    }

}
