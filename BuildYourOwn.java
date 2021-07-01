package sample;

import java.util.ArrayList;
/**
 * Create a Pizza with Build Your Own as its type
 * @author Nisarg Patel and Yash Patel
 */
public class BuildYourOwn extends Pizza {

    /**
     * Creates an instance of Build your own Pizza with size and topping as parameter
     * @param size size of pizza
     * @param toppings toppings on pizza
     * @author Nisarg Patel
     */
    public BuildYourOwn(String size, ArrayList<String> toppings){
        super("BuildYourOwn",size,toppings);
    }

    /**
     * Find the price of Pizza based on its size and type
     * @return the pizza of pizza
     * @author Nisarg Patel
     */
    @Override
    public int pizzaPrice() {
        if(super.size.equals("Small")){
            return topping_index.SMALL_BUILD_YOUR_OWN_PRICE + topping_index.PER_TOPPING_PRICE_PRICE*(toppings.size());
        }
        else if(super.size.equals("Medium") ){
            return topping_index.MEDIUM_BUILD_YOUR_OWN_PRICE + topping_index.PER_TOPPING_PRICE_PRICE*(toppings.size());
        }
        else if(super.size.equals("Large")){
            return topping_index.LARGE_BUILD_YOUR_OWN_PRICE + topping_index.PER_TOPPING_PRICE_PRICE*(toppings.size());
        }
        return topping_index.NOT_FOUND;
    }

    /**
     * Textually represents an instance of Build Your Own Pizza
     * @return the String representation of an object
     * @author Nisarg Patel
     */
    @Override
    public String toString() {
        return super.toString() + "   Price :" + pizzaPrice();
    }

}
