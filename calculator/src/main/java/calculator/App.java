package calculator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {

    private String selected = "";

    public static void main(String args[]) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane layout = new Pane();
        Scene scene = new Scene(layout, 275, 340);

        convertor convert = new convertor(); // Convertor instance
        Text displayText = new Text(0, 50, selected); // Display text
        displayText.setFont(new Font(35));

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

        // Update selected when buttons are pressed
        zero.setOnAction(e -> updateSelected("0", displayText));
        one.setOnAction(e -> updateSelected("1", displayText));
        two.setOnAction(e -> updateSelected("2", displayText));
        three.setOnAction(e -> updateSelected("3", displayText));
        four.setOnAction(e -> updateSelected("4", displayText));
        five.setOnAction(e -> updateSelected("5", displayText));
        six.setOnAction(e -> updateSelected("6", displayText));
        seven.setOnAction(e -> updateSelected("7", displayText));
        eight.setOnAction(e -> updateSelected("8", displayText));
        nine.setOnAction(e -> updateSelected("9", displayText));
        multiply.setOnAction(e -> updateSelected("x", displayText));
        divide.setOnAction(e -> updateSelected("/", displayText));
        plus.setOnAction(e -> updateSelected("+", displayText));
        minus.setOnAction(e -> updateSelected("-", displayText));
        bracketL.setOnAction(e -> updateSelected("(", displayText));
        bracketR.setOnAction(e -> updateSelected(")", displayText));
        delete.setOnAction(e -> deleteLast(displayText));

        equal.setOnAction(e -> {
            try {
                var inputsForConvertor = convert.convert(selected);
                int result = convert.math(inputsForConvertor);
                displayText.setText(String.valueOf(result));
                selected = ""; // Reset after calculation
            } catch (Exception ex) {
                displayText.setText("Error");
            }
        });

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
        /* 
        equal.setStyle();
        delete.setStyle();
        bracketL.setStyle();
        bracketR.setStyle();
        */


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

        layout.getChildren().addAll(zero, one, two, three, four, five, six, seven, eight, nine, multiply, divide, plus, minus, bracketL, bracketR, equal, delete, displayText);

        // Layout positions, styles, and initialization (skipped here for brevity)

        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void updateSelected(String value, Text displayText) {
        selected += value; // Append value to selected
        displayText.setText(selected); // Update display text
    }

    private void deleteLast(Text displayText) {
        if (!selected.isEmpty()) {
            selected = selected.substring(0, selected.length() - 1); // Remove last character
            displayText.setText(selected); // Update display text
        }
    }
}
