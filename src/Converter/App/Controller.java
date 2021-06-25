package Converter.App;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    // constants
    static final Character ADD = '+';
    static final Character SUBTRACT = '-';
    static final Character PRODUCT = '*';
    static final Character DIV = '/';
    static final Character MODULO = '%';
    static final Character POWER = '^';
    static Character operatorChosen;

    @FXML
    public GridPane rootGridPane;

    @FXML
    public Tab calculatePane;

    @FXML
    public Tab convertPane;

    @FXML
    public TextField TextFieldOne;

    @FXML
    public TextField TextFieldTwo;

    @FXML
    public Button CalculateBtn;

    @FXML
    public Button ClearBtn;

    @FXML
    public ChoiceBox<Character> operatorBox;

    @FXML
    public TextField TextFieldRes;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        operatorBox.getItems().addAll(ADD, SUBTRACT, PRODUCT, DIV, MODULO, POWER);

        operatorBox.setValue(ADD);
        operatorChosen = ADD;

        operatorBox.getSelectionModel().selectedItemProperty().addListener(((observableValue, oldValue, newValue) -> {
            //System.out.println("Old Value = " + oldValue + " New Value = " + newValue);
            operatorChosen = newValue;
        }));

        CalculateBtn.setOnAction(actionEvent -> calculate());
        ClearBtn.setOnAction(actionEvent -> clearFields());
    }

    public void clearFields() {
        TextFieldOne.setText(null);
        TextFieldTwo.setText(null);
        TextFieldRes.setText(null);
    }

    public void calculate() {
        Double operand1 = Double.parseDouble( TextFieldOne.getText() );
        Double operand2 = Double.parseDouble( TextFieldTwo.getText() );
        double result = 0.0;
        switch (operatorChosen) {
            case '+':
                result = operand1+operand2;
                break;
            case '-':
                result = operand1-operand2;
                break;
            case '*':
                result = operand1*operand2;
                break;
            case '/':
                if (operand2 == 0) {
                    warnUser();
                    result = 0.0;
                } else {
                    result = operand1/operand2;
                }
                break;
            case '%':
                result = operand1 % operand2;
                break;
            case '^':
                result = Math.pow(operand1, operand2);
                break;
        }
        TextFieldRes.setEditable(true);
        TextFieldRes.setText( "Result = " + result );
        TextFieldRes.setEditable(false);
    }

    private void warnUser() {
        Alert warning = new Alert(Alert.AlertType.ERROR);
        warning.setTitle("Error Occurred.");
        warning.setHeaderText("Invalid Input");
        warning.setContentText("Please Provide a valid input.");
        warning.show();
    }
}
