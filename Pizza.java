package sample;

import java.util.ArrayList;

/**
 * Abstract class of Pizza object inherited by various types of Pizza
 * @author Nisarg Patel and Yash Patel
 */
public abstract class Pizza {

    protected String style;
    protected String size;
    protected ArrayList<String> toppings;

    /**
     * Help subclasses to create a Pizza object with extra data types
     * @param style style of pizza
     * @param size size of pizza
     * @param toppings toppings on pizza
     * @author Nisarg Patel
     */
    public Pizza(String style, String size, ArrayList<String> toppings) {
        this.style = style;
        this.size = size;
        this.toppings = toppings;
    }

    /**
     * Help subclasses to create a Pizza object with fewer data types
     * @param style style of pizza
     * @param size size of pizza
     * @author Nisarg Patel
     */
    public Pizza(String style, String size) {
        this.style = style;
        this.size = size;
    }

    /**
     * Subclasses have to implement this pizza price method to get the price of pizza
     * @return the cost pizza
     * @author Nisarg Patel
     */
    public abstract int pizzaPrice();

    /**
     * Textually represent the Pizza object so subclasses can use it
     * @return the String representation of an object
     * @author Nisarg Patel
     */
    public String toString() {
        return "Style :" + style + "    size :"+ size + "    toppings :" + toppings.toString();
    }

}