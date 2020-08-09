package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    //public void btnOneClickAction (ActionEvent actionEvent){
      //  System.out.println("Hello");
    // }

    @FXML
    TextArea mainTextArea;
    @FXML
    Button Send;
    @FXML
    TextField mainTextField;


    public void btnOneClickAction(ActionEvent actionEvent) {

        String message = "";
         //mainTextField.set(mainTextArea);


      mainTextArea.appendText(mainTextField.getText());


    }




}
