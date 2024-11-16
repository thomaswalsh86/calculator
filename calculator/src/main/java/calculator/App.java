package calculator;

import javafx.application.Application;
import java.util.LinkedList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.*;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private String selected="";

    public static void main(String args[]){          
         launch(args);     
    } 
         
    @Override    
    public void start(Stage primaryStage) throws Exception { 
        Pane layout = new Pane();
         
        Scene scene = new Scene(layout, 275, 340);
        Core core = new Core();
        LinkedList<String> nums = new LinkedList<String>();
        String t1="";

        Text t = new Text(0, 50, selected);
        t.setFont(new Font(35));

        Button zero = new Button("0");
        Button one = new Button("1");
        Button two = new Button("2");
        Button three = new Button("3");
        Button four = new Button("4");
        Button five = new Button("5");
        Button six = new Button("6");
        Button seven = new Button("7");
        Button eight = new Button("8");
        Button nine = new Button("9");
        Button multiply = new Button("x");
        Button divide = new Button("/");
        Button plus = new Button("+");
        Button minus = new Button("-");
        Button bracketL = new Button("(");
        Button equal = new Button("=");
        Button bracketR = new Button(")");
        Button delete = new Button("DEL");

        zero.setOnAction(e -> updateSelected("0", t));
        one.setOnAction(e -> updateSelected("1", t));
        two.setOnAction(e -> updateSelected("2", t));
        three.setOnAction(e -> updateSelected("3", t));
        four.setOnAction(e -> updateSelected("4", t));
        five.setOnAction(e -> updateSelected("5", t));
        six.setOnAction(e -> updateSelected("6", t));
        seven.setOnAction(e -> updateSelected("7", t));
        eight.setOnAction(e -> updateSelected("8", t));
        nine.setOnAction(e -> updateSelected("9", t));
        multiply.setOnAction(e -> updateSelected("x", t));
        divide.setOnAction(e -> updateSelected("/", t));
        plus.setOnAction(e -> updateSelected("+", t));
        minus.setOnAction(e -> updateSelected("-", t));
        bracketL.setOnAction(e -> updateSelected("(", t));
        bracketR.setOnAction(e -> updateSelected(")", t));
        delete.setOnAction(e -> updateSelected("", t));//removes last selected
        //equal.setOnAction(e -> core());//clears current display
        
        nums.add(t1);

        seven.setStyle("-fx-text-fill: black; -fx-border-width: 3px; -fx-font-size: 30px;");
        eight.setStyle("-fx-text-fill: black; -fx-border-width: 3px; -fx-font-size: 30px;");
        nine.setStyle("-fx-text-fill: black; -fx-border-width: 3px; -fx-font-size: 30px;");
        four.setStyle("-fx-text-fill: black; -fx-border-width: 3px; -fx-font-size: 30px;");
        five.setStyle("-fx-text-fill: black; -fx-border-width: 3px; -fx-font-size: 30px;");
        six.setStyle("-fx-text-fill: black; -fx-border-width: 3px; -fx-font-size: 30px;");
        one.setStyle("-fx-text-fill: black; -fx-border-width: 3px; -fx-font-size: 30px;");
        two.setStyle("-fx-text-fill: black; -fx-border-width: 3px; -fx-font-size: 30px;");
        three.setStyle("-fx-text-fill: black; -fx-border-width: 3px; -fx-font-size: 30px;");
        zero.setStyle("-fx-text-fill: black; -fx-border-width: 3px; -fx-font-size: 30px;");
        multiply.setStyle("-fx-text-fill: black; -fx-border-width: 3px; -fx-font-size: 30px;");
        divide.setStyle("-fx-text-fill: black; -fx-border-width: 3px; -fx-font-size: 30px;");
        plus.setStyle("-fx-padding: 17 17 5 17; -fx-text-fill: black; -fx-border-width: 3px; -fx-font-size: 30px;");
        minus.setStyle("-fx-text-fill: black; -fx-border-width: 3px; -fx-font-size: 30px;");
        


        seven.setLayoutX(0); // X-coordinate
        seven.setLayoutY(80);
        eight.setLayoutX(56);
        eight.setLayoutY(80);
        nine.setLayoutX(112);
        nine.setLayoutY(80);
        multiply.setLayoutX(168);
        multiply.setLayoutY(80);
        divide.setLayoutX(222);
        divide.setLayoutY(80);

        four.setLayoutX(0); // X-coordinate
        four.setLayoutY(145);
        five.setLayoutX(56);
        five.setLayoutY(145);
        six.setLayoutX(112);
        six.setLayoutY(145);
        plus.setLayoutX(168);
        plus.setLayoutY(145);
        minus.setLayoutX(222);
        minus.setLayoutY(145);

        one.setLayoutX(0); // X-coordinate
        one.setLayoutY(210);
        two.setLayoutX(56);
        two.setLayoutY(210);
        three.setLayoutX(112);
        three.setLayoutY(210);

        zero.setLayoutX(0);
        zero.setLayoutY(275);

        layout.getChildren().addAll(zero,one,two,three,four,five,six,seven,eight,nine,multiply,minus,plus,divide,t);
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);   
        primaryStage.show();
        System.out.println(selected);
    }
    private void updateSelected(String value, Text displayText) {
        selected += value; // Append value to selected
        displayText.setText(selected); // Update displayed text
    }
}