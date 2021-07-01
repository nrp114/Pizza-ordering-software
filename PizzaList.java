package sample;

import java.util.ArrayList;

/**
 * Create a PizzaList object to store Pizza.
 * @author Nisarg Patel and Yash Patel
 */
public class PizzaList {

    protected ArrayList<Pizza> pizzaList;

    /**
     * Construct a ArrayList of Pizza
     * @author Nisarg Patel
     */
    public PizzaList(){
        pizzaList = new ArrayList<Pizza>();
    }

    /**
     * Adds a Hawaiian Pizza to the PizzaList
     * @param size size of hawaiian pizza
     * @author Nisarg Patel
     */
    public void add_Hawaiian(String size){
        pizzaList.add(new Hawaiian(size));
    }
    /**
     * Adds a Deluxe Pizza to the PizzaList
     * @param size size of Deluxe pizza
     * @author Nisarg Patel
     */
    public void add_Deluxe(String size){
        pizzaList.add(new Deluxe(size));
    }
    /**
     * Adds a Customized Pizza to the PizzaList
     * @param size size of customized pizza
     * @param toppings customized toppings to be added
     * @author Nisarg Patel
     */
    public void add_BuildYourOwn(String size,ArrayList<String> toppings){
        pizzaList.add(new BuildYourOwn(size,toppings));
    }

    /**
     * Calculates the total prize of the all the pizza present inside the pizzaList
     * @return total price
     * @author Nisarg Patel
     */
    public String get_total_price(){
    int total_amount =0;
        for (int i=0; i<pizzaList.size(); i++){
            total_amount += pizzaList.get(i).pizzaPrice();
        }
        return Integer.toString(total_amount);
    }

    /**
     * Removes all the pizza inside the PizzaList
     * @author Nisarg Patel
     */
    public void Remove(){
        pizzaList.clear();
    }
}
