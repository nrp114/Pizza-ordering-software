package sample;

import java.util.ArrayList;
import java.util.BitSet;

import static org.junit.Assert.*;

/**
 * JUNIT testing of pizzaPrice method in Build Your own pizza class which test the prices of pizza based on different toppings and size.
 * @author Nisarg Patel and Yash Patel
 */
public class BuildYourOwnTest {

    /**
     * Black box testing of the pizzaPrice method of BuildYourOwn class
     */
    @org.junit.Test
    public void pizzaPrice() {
        ArrayList<String> toppings1 = new ArrayList<>();
        ArrayList<String> toppings2 = new ArrayList<>();
        ArrayList<String> toppings3 = new ArrayList<>();
        ArrayList<String> toppings4 = new ArrayList<>();
        ArrayList<String> toppings5 = new ArrayList<>();

        toppings1.add("Ham"); toppings1.add("Cheese"); toppings1.add("Chicken"); toppings1.add("Pineapple"); toppings1.add("Beef"); toppings1.add("Sausage");
        toppings2.add("Onion"); toppings2.add("Mushroom"); toppings2.add("Pepperoni"); toppings2.add("Beef"); toppings2.add("Ham");
        toppings3.add("Pineapple"); toppings3.add("Green Pepper"); toppings3.add("Onion"); toppings3.add("Beef");
        toppings4.add("Cheese"); toppings4.add("Ham"); toppings4.add("Onion");
        toppings5.add("Cheese");

        String SMALL = "Small";
        String MEDIUM = "Medium";
        String LARGE = "Large";

        Pizza p1 = new BuildYourOwn(SMALL,toppings1);
        Pizza p2= new BuildYourOwn(MEDIUM, toppings1);
        Pizza p11 = new BuildYourOwn(LARGE, toppings1);

        Pizza p4 = new BuildYourOwn(SMALL, toppings2);
        Pizza p7 = new BuildYourOwn(MEDIUM, toppings2);
        Pizza p9 = new BuildYourOwn(LARGE, toppings2);

        Pizza p10 = new BuildYourOwn(SMALL, toppings3);
        Pizza p12 = new BuildYourOwn(MEDIUM, toppings3);
        Pizza p3 = new BuildYourOwn(LARGE, toppings3);

        Pizza p13 = new BuildYourOwn(SMALL, toppings4);
        Pizza p5 = new BuildYourOwn(MEDIUM,toppings4);
        Pizza p8 = new BuildYourOwn(LARGE, toppings4);

        Pizza p14 = new BuildYourOwn(SMALL,toppings5);
        Pizza p15 = new BuildYourOwn(MEDIUM,toppings5);
        Pizza p6 = new BuildYourOwn(LARGE,toppings5);


        assertEquals(p1.pizzaPrice() , 17);
        assertEquals(p2.pizzaPrice() ,19 );
        assertEquals(p3.pizzaPrice() , 17);
        assertEquals(p4.pizzaPrice() , 15);
        assertEquals(p5.pizzaPrice() ,13 );
        assertEquals(p6.pizzaPrice() , 11);
        assertEquals(p7.pizzaPrice() , 17);
        assertEquals(p8.pizzaPrice() , 15);
        assertEquals(p9.pizzaPrice() , 19);
        assertEquals(p10.pizzaPrice() , 13);
        assertEquals(p11.pizzaPrice(), 21);
        assertEquals(p12.pizzaPrice(), 15);
        assertEquals(p13.pizzaPrice(),11);
        assertEquals(p14.pizzaPrice(),7);
        assertEquals(p15.pizzaPrice(),9);

    }
}