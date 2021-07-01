package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

/**
 * It manages the GUI of pizza order.
 * @author Yash Patel and Nisarg Patel
 */
public class Controller implements Initializable {

    @FXML ComboBox<String> cb_style = new ComboBox<>();
    @FXML ComboBox<String> cb_size = new ComboBox<>();
    @FXML ListView<String> lv_all = new ListView<>();
    @FXML ListView<String> lv_selected = new ListView<>();
    @FXML Button btn_addTopping;
    @FXML Button btn_removeTopping;
    @FXML ImageView pizza_image;
    @FXML Button btn_clear;
    @FXML Button btn_addOrder;
    @FXML Button btn_showOrder;
    @FXML TextArea tv_area;
    Image image_build_your_own;
    Image image_deluxe;
    Image image_hawaiian;
    ObservableList<String> selected_topping = FXCollections.observableArrayList();
    ObservableList<String> all_toppings;
    PizzaList list= new PizzaList();


    /**
     *  Initialize this controller after the root element has been completely processed
     * @param location The location used to resolve relative paths for the root object, or null if the location is not known.
     * @param resources The resources used to localize the root object, or null if the root object was not localized.
     * @author Yash Patel
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        ObservableList<String> style_list = FXCollections.observableArrayList("Build Your Own","Hawaiian","Deluxe");
        cb_style.setItems(style_list);
        cb_style.setValue("Build Your Own");

        ObservableList<String> size_list = FXCollections.observableArrayList(topping_index.SMALL,topping_index.MEDIUM,topping_index.LARGE);
        cb_size.setItems(size_list);
        cb_size.setValue("Medium");

        all_toppings = FXCollections.observableArrayList(
                "Beef","Cheese","Chicken","Green Pepper","Onion","Ham","Mushroom","Pepperoni","Pineapple","Sausage");
        lv_all.setItems(all_toppings);
        lv_all.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        image_build_your_own = new Image("sample\\build_your_own.png");
        pizza_image.setImage(image_build_your_own);
        image_deluxe = new Image("sample\\deluxe.png");
        image_hawaiian = new Image ("sample\\hawaiian.jpg");
    }

    /**
     * Adds the selected topping to the selected list View.
     * @author Yash Patel
     */
    public void on_adding_topping(){
       ObservableList<String> selected =  lv_all.getSelectionModel().getSelectedItems();
       for(int i=0 ; i<selected.size() ; i++){
           add_toppings_to_selected(selected.get(i));
       }
    }

    /**
     * Set all the fields to default
     * @author Yash Patel
     */
    public void on_clear(){
        cb_style.setValue("Build Your Own");
        set_default();
    }

    /**
     * Removes the selected topping from the selected toppings list
     * @author Yash Patel
     */
    public void on_remove_topping(){
        ObservableList<String> to_remove =  lv_selected.getSelectionModel().getSelectedItems();
        for(int i=0 ; i<to_remove.size() ; i++){
            remove_topping_from_selected(to_remove.get(i));
        }
    }

    /**
     * Removes a selected topping from the Observable list
     * @param to_remove topping that has to be removed
     * @author Yash Patel
     */
    private void remove_topping_from_selected(String to_remove){
        selected_topping.remove(to_remove);
        lv_selected.setItems(selected_topping);
    }

    /**
     * Lists all the pizza style
     * @author Yash Patel
     */
    public void on_cb_style(){
        if(cb_style.getSelectionModel().getSelectedItem().equals("Hawaiian")){
            set_default();
            // clear everything off
            pizza_image.setImage(image_hawaiian);
            add_toppings_to_selected(all_toppings.get(topping_index.HAM_INDEX));
            add_toppings_to_selected(all_toppings.get(topping_index.PINEAPPLE_INDEX));

            disable_all();
            // disable all other functions
        }
        else if (cb_style.getSelectionModel().getSelectedItem().equals("Deluxe")){
            set_default();
            pizza_image.setImage(image_deluxe);
            add_toppings_to_selected(all_toppings.get(topping_index.SAUSAGE_INDEX));
            add_toppings_to_selected(all_toppings.get(topping_index.PEPPERONI_INDEX));
            add_toppings_to_selected(all_toppings.get(topping_index.GREEN_PEPPER_INDEX));
            add_toppings_to_selected(all_toppings.get(topping_index.ONION_INDEX));
            add_toppings_to_selected(all_toppings.get(topping_index.MUSHROOM_INDEX));

            disable_all();
        }
        else {
            set_default();
            pizza_image.setImage(image_build_your_own);
        }
    }

    /**
     * Set all the fields to default
     * @author Yash Patel
     */
    private void set_default() {
        lv_selected.setDisable(false);
        lv_all.setDisable(false);
        btn_addTopping.setDisable(false);
        btn_clear.setDisable(false);
        btn_removeTopping.setDisable(false);
        lv_selected.getItems().clear();
        selected_topping.clear();
        cb_size.setValue("Medium");
    }

    /**
     * Disables some fields
     * @author Yash Patel
     */
    private void disable_all() {
       lv_all.setDisable(true);
       btn_addTopping.setDisable(true);
       btn_removeTopping.setDisable(true);
    }

    /**
     * Adds the topping to selected list
     * @param topping topping to be added
     * @author Yash Patel
     */
    private void add_toppings_to_selected( String topping){
        if(lv_selected.getItems().contains(topping)){
            displayText("Topping : " + topping + " is already present.");   // String to display
            return;
        }
        if(selected_topping.size() >=6 ){
            displayText("Sorry .... cannot have more than 6 toppings");
            return;
        }
        selected_topping.add(topping);
        lv_selected.setItems(selected_topping);
    }

    /**
     * Add the current order to the Pizza orders
     * @author Yash Patel
     */
    public void on_add_to_order(){
        String to_display;
        String style = cb_style.getSelectionModel().getSelectedItem();
        String size = cb_size.getSelectionModel().getSelectedItem();
        if(selected_topping.size() == 0){
            displayText(" You must select at least one topping for your pizza.");
            return;
        }
        if(style.equals("Hawaiian")){
            list.add_Hawaiian(size);
            to_display =  size + " Hawaiian pizza is added to your cart.";
        }
        else if(style.equals("Deluxe")){
            list.add_Deluxe(size);
            to_display = size + " Deluxe pizza is added to your cart.";
        }
        else {
            ArrayList<String> selected = new ArrayList<>(selected_topping);
            list.add_BuildYourOwn(size,selected);
            to_display = "Your customized " + size +  " pizza is added to your cart.";
        }
        set_default();
        cb_style.setValue("Build Your Own");
        displayText(to_display);
    }

    /**
     * Display text in the text area
     * @param to_display String to display
     * @author Yash Patel
     */
    private void displayText(String to_display){

        tv_area.appendText(to_display + "\n");
    }

    /**
     * Open a new window to show the total order
     * @author Yash Patel
     */
    public void on_showOrder(){

        set_default();
        cb_style.setValue("Build Your Own");
       try{
           FXMLLoader loader = new FXMLLoader(getClass().getResource("page2.fxml"));
           Parent root = loader.load();
           Controller2 cont2 = loader.getController();
           cont2.print_tv(list);
           cont2.get_controller(this);
           Stage stage = new Stage();
           stage.setScene(new Scene(root));
           stage.setTitle("My pizza cart");
           stage.initModality(Modality.APPLICATION_MODAL);
           stage.show();

       }catch (IOException e){
            e.printStackTrace();
       }
    }


}
