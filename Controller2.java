package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

/**
 * It manages the GUI version of second window of Pizza Order
 * @author Yash Patel and Nisarg Patel
 */
public class Controller2 {

    @FXML Button btn_clear;
    @FXML Button btn_back;
    @FXML TextArea tv_show;
    @FXML TextArea total_price;
    PizzaList list;

    /**
     * Displays the pizza along with the price in text area
     * @param list list of pizza
     * @author Yash Patel
     */
    public void print_tv(PizzaList list){
        tv_show.appendText("---------------------------------------------------------------------------------------------------------------------------------\n");
        for(int i=0 ; i<list.pizzaList.size() ; i++){
            tv_show.appendText(list.pizzaList.get(i).toString() + "\n");
            tv_show.appendText("---------------------------------------------------------------------------------------------------------------------------------\n");
        }
        tv_show.appendText("<<<<<<<<<<<<<<<<<<<    TOTAL PRICE: $"+ list.get_total_price() + "   >>>>>>>>>>>>>>>>>>>>\n");
        total_price.setText(" $" + list.get_total_price());
    }

    /**
     * Removes all the pizza from the list and clears the text area
     * @throws IOException if there is any error
     * @author Yash Patel
     */
    public void on_clear() throws IOException {
       list.Remove();
       tv_show.clear();
       total_price.setText(" $0");
    }

    /**
     * Gets the instance of the previous controller
     * @param sample_controller first controller from where this controller was called
     * @author Yash Patel
     */
    public void get_controller(Controller sample_controller){
    list = sample_controller.list;
    }

    /**
     * Close the stage and go back to the previous stage
     * @author Yash Patel
     */
    public void on_back(){
           Stage stage = (Stage) btn_back.getScene().getWindow();
           stage.close();
    }
}
