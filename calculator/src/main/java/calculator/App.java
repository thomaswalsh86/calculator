package calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

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
         
        Scene scene = new Scene(layout, 300, 340);
        Core core = new Core();

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

        one.setOnAction(e -> selected += "0");
        one.setOnAction(e -> selected += "1");
        two.setOnAction(e -> selected += "2");
        three.setOnAction(e -> selected += "3");
        four.setOnAction(e -> selected += "4");
        five.setOnAction(e -> selected += "5");
        six.setOnAction(e -> selected += "6");
        seven.setOnAction(e -> selected += "7");
        eight.setOnAction(e -> selected += "8");
        nine.setOnAction(e -> selected += "9");
        
        seven.setStyle("-fx-text-fill: black; -fx-border- width: 3px; -fx-font-size: 30px;");
        eight.setStyle("-fx-text-fill: black; -fx-border- width: 3px; -fx-font-size: 30px;");
        nine.setStyle("-fx-text-fill: black; -fx-border- width: 3px; -fx-font-size: 30px;");
        four.setStyle("-fx-text-fill: black; -fx-border- width: 3px; -fx-font-size: 30px;");
        five.setStyle("-fx-text-fill: black; -fx-border- width: 3px; -fx-font-size: 30px;");
        six.setStyle("-fx-text-fill: black; -fx-border- width: 3px; -fx-font-size: 30px;");
        one.setStyle("-fx-text-fill: black; -fx-border- width: 3px; -fx-font-size: 30px;");
        two.setStyle("-fx-text-fill: black; -fx-border- width: 3px; -fx-font-size: 30px;");
        three.setStyle("-fx-text-fill: black; -fx-border- width: 3px; -fx-font-size: 30px;");
        zero.setStyle("-fx-text-fill: black; -fx-border- width: 3px; -fx-font-size: 30px;");


        seven.setLayoutX(0); // X-coordinate
        seven.setLayoutY(80);
        eight.setLayoutX(56);
        eight.setLayoutY(80);
        nine.setLayoutX(112);
        nine.setLayoutY(80);

        four.setLayoutX(0); // X-coordinate
        four.setLayoutY(145);
        five.setLayoutX(56);
        five.setLayoutY(145);
        six.setLayoutX(112);
        six.setLayoutY(145);

        one.setLayoutX(0); // X-coordinate
        one.setLayoutY(210);
        two.setLayoutX(56);
        two.setLayoutY(210);
        three.setLayoutX(112);
        three.setLayoutY(210);

        zero.setLayoutX(0);
        zero.setLayoutY(275);

        layout.getChildren().addAll(zero,one,two,three,four,five,six,seven,eight,nine);
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);   
        primaryStage.show();
    }
    public void onCLick()
    {
        //button.setOnAction(e -> System.out.println("Hello World"));   
    }
}