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
    static final Character AND = '&';
    static final Character OR = '|';
    static final Character XOR = '^';
    static final Character NOT = '~';
    static final String BINARY = "Binary";
    static final String HEX = "Hexadecimal";
    static final String OCT = "Octal";
    static final String DEC = "Decimal";

    // variables
    static Character operatorChosen;
    static String inputNumberBase;
    static Character bitwiseOperatorChosen;

    // exception
    private Object Exception;

    @FXML
    public GridPane rootGridPane;
    public Tab calculatePane;
    public Tab convertPane;
    public TextField TextFieldOne;
    public TextField TextFieldTwo;
    public Button CalculateBtn;
    public Button ClearBtn;
    public ChoiceBox<Character> operatorBox;
    public TextField TextFieldRes;
    public ComboBox<String> inputNumberBaseBox;
    public ComboBox<Character> bitwiseOperatorBox;
    public TextField TextFieldBit1;
    public TextField TextFieldBit2;
    public TextField bitwiseResult;
    public Button bitwiseCalculateBtn;
    public Button bitwiseClearBtn;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Calculate Pane
        operatorBox.getItems().addAll(ADD, SUBTRACT, PRODUCT, DIV, MODULO, POWER);

        operatorBox.setValue(ADD);
        operatorChosen = ADD;

        operatorBox.getSelectionModel().selectedItemProperty().addListener(((observableValue, oldValue, newValue) -> {
            //System.out.println("Old Value = " + oldValue + " New Value = " + newValue);
            operatorChosen = newValue;
        }));

        CalculateBtn.setOnAction(actionEvent -> {
            try {
                calculate();
            } catch (Exception e) {
                String errorMessage = e.getMessage();
                //System.out.println("Exception occurred: " + errorMessage);
                warnUser( errorMessage );
                clearFields();
            }
        });

        ClearBtn.setOnAction(actionEvent -> clearFields());

        // bitwise Pane
        // adding items
        inputNumberBaseBox.getItems().addAll( BINARY, HEX, OCT, DEC );
        bitwiseOperatorBox.getItems().addAll( AND, OR, XOR, NOT );

        try {
            inputNumberBaseBox.getSelectionModel().selectedItemProperty().addListener((observableValue, oldValue, newValue) -> {
                //System.out.println("Old: " + oldValue + " New: " + newValue);
                inputNumberBase = newValue;
            });

            bitwiseOperatorBox.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
                //System.out.println("Old: " + oldValue + " New: " + newValue);
                bitwiseOperatorChosen = newValue;
                TextFieldBit1.setEditable(true);
                TextFieldBit2.setEditable(true);
                bitwiseCalculateBtn.setDisable(false);
            });

            bitwiseCalculateBtn.setOnAction(actionEvent -> {
                String stringBit1 = TextFieldBit1.getText();
                String stringBit2 = TextFieldBit2.getText();
                //System.out.println("Operator Chosen: " + bitwiseOperatorChosen);

                if ( bitwiseOperatorChosen.equals(NOT) ) {
                    if (stringBit1.isEmpty())
                        warnUser("Input is Empty.");
                    else {
                        TextFieldBit2.setEditable(false);
                        bitwiseResult.setText("Result: \n" + Bitwise.bitwiseNOT(stringBit1, inputNumberBase));
                    }
                } else {
                    if (stringBit1.isBlank() || stringBit2.isBlank()) {
                        warnUser("Input is Empty.");
                        clearFields();
                    } else {
                        String result = Bitwise.bitwiseCalculate(stringBit1, stringBit2, inputNumberBase, bitwiseOperatorChosen);
                        bitwiseResult.setText("Result: \n" + result);
                    }
                }
            });
        } catch( Exception e ) {
            warnUser( e.getMessage() );
        }
        bitwiseClearBtn.setOnAction( actionEvent -> clearProFields());
    }

    public void clearProFields() {
        TextFieldBit1.setText(null);
        TextFieldBit2.setText(null);
        bitwiseResult.setText(null);
    }

    public void clearFields() {
        TextFieldOne.setText(null);
        TextFieldTwo.setText(null);
        TextFieldRes.setText(null);
    }

    public void calculate() {
        String one = TextFieldOne.getText();
        String two = TextFieldTwo.getText();

        double operand1;
        double operand2;
        double result;

        if (one.isEmpty() || one.isBlank())
            operand1 = 0.0;
        else
            operand1 = Double.parseDouble(one);

        if (two.isBlank() || two.isEmpty())
            operand2 = 0.0;
        else
            operand2 = Double.parseDouble(two);

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
                    warnUser("Math Error. \nDivision by zero prohibited.");
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
            default:
                result = 0.0;
        }
        TextFieldRes.setEditable(true);
        TextFieldRes.setText( "Result = " + result );
        TextFieldRes.setEditable(false);
    }

    private void warnUser(String errorMessage) {
        Alert warning = new Alert(Alert.AlertType.ERROR);
        warning.setTitle("Error Occurred.");
        warning.setHeaderText("Invalid Input");
        warning.setContentText(errorMessage);
        warning.show();
    }
}
