package sample;

import java.util.ArrayList;

/**
 * Create a Pizza with Deluxe as its type
 * @author Nisarg Patel and Yash Patel
 */
public class Deluxe extends Pizza {

    /**
     * Creates an instance of Deluxe Pizza with size as its parameter
     * @param size size of pizza
     * @author Nisarg Patel
     */
    public Deluxe(String size){
        super("Deluxe",size);
        ArrayList<String> toppings = new ArrayList<String>();
        toppings.add("Sausage");
        toppings.add("Pepperoni");
        toppings.add("Green Pepper");
        toppings.add("Onion ");
        toppings.add("Mushroom");
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
            return topping_index.SMALL_DELUXE_PRICE;
        }
        else if(super.size.equals("Medium")){
            return topping_index.MEDIUM_DELUXE_PRICE;
        }
        else if(super.size.equals("Large")){
            return topping_index.LARGE_DELUXE_PRICE;
        }
        return topping_index.NOT_FOUND;
    }

    /**
     * Textually represents an instance of Deluxe Pizza
     * @return the String representation of an object
     * @author Nisarg Patel
     */
    @Override
    public String toString() {
        return super.toString() + "    Price :" + pizzaPrice();
    }
}
