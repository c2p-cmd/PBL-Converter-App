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
    static final String INFIX_INPUT = "Infix Input";
    static final String PREFIX_INPUT = "Prefix Input";
    static final String POSTFIX_INPUT = "Postfix Input";

    // variables
    static Character operatorChosen;
    static String inputNumberBase;
    static Character bitwiseOperatorChosen;

    // exception


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
    public TextField infixInputTextField;
    public TextField prefixInputTextField;
    public TextField postfixInputTextField;
    public Button bitwiseCalculateBtn;
    public Button bitwiseClearBtn;
    public Button treeConvertBtn;
    public Button treeClearBtn;
    public RadioButton infixRadioButton;
    public RadioButton prefixRadioButton;
    public RadioButton postfixRadioButton;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        // Calculate Pane
        //Setting values to the operator box and setting up a default value for it
        operatorBox.getItems().addAll(ADD, SUBTRACT, PRODUCT, DIV, MODULO, POWER);
        operatorBox.setValue(ADD);
        operatorChosen = ADD;


        //Resetting the value of the operator box to whatever the user choices for
        operatorBox.getSelectionModel().selectedItemProperty().addListener(((observableValue, oldValue, newValue) -> operatorChosen = newValue));

        //Checking if user hits calculate button without giving any values to it
        CalculateBtn.setOnAction(actionEvent -> {
            try {
                calculate();
            } catch (Exception e) {
                String errorMessage = e.getMessage();
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
            inputNumberBaseBox.getSelectionModel().selectedItemProperty().addListener((observableValue, oldValue, newValue) -> inputNumberBase = newValue);

            bitwiseOperatorBox.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
                bitwiseOperatorChosen = newValue;
                TextFieldBit1.setEditable(true);
                TextFieldBit2.setEditable(true);

                //Disabling the second input for negation operation
                TextFieldBit2.setVisible(!bitwiseOperatorChosen.equals(NOT));

                bitwiseCalculateBtn.setDisable(false);
            });

            bitwiseCalculateBtn.setOnAction(actionEvent -> {
                String stringBit1 = TextFieldBit1.getText();
                String stringBit2 = TextFieldBit2.getText();

                //To check for exceptions in inputs
                //Bitwise Binary Validator
                if(inputNumberBase.equals(BINARY) && (Bitwise.binaryValidator(stringBit1,stringBit2))){
                    warnUser("Invalid Binary Number ⚠️");
                    clearProFields();
                }
                //Bitwise Decimal Validator
                else if(inputNumberBase.equals(DEC) && (Bitwise.decimalValidator(stringBit1,stringBit2))){
                    warnUser("Invalid Decimal Number");
                    clearProFields();
                }
                //Bitwise Hexadecimal Validator
                else if(inputNumberBase.equals(HEX) && ( Bitwise.hexdecimalValidator( stringBit1 , stringBit2  ) ) ){
                    warnUser("Invalid Hexadecimal Number");
                    clearProFields();
                }
                //Bitwise Octal Validator
                else if(inputNumberBase.equals(OCT) && ( Bitwise.octalValidator( stringBit1 , stringBit2  ) )){
                    warnUser("Invalid Octal Number");
                    clearProFields();
                }
                else{
                    if ( bitwiseOperatorChosen.equals(NOT) ) {
                        if (stringBit1.isEmpty())
                            warnUser("Input is Empty.");
                        else {

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

                }


            });
        } catch( Exception e ) {
            warnUser( e.getMessage() );
        }
        bitwiseClearBtn.setOnAction( actionEvent -> clearProFields());

        // tree Conversion Therapy

        // radio Button inversion
        ToggleGroup radioBtnGrp = new ToggleGroup();
        infixRadioButton.setToggleGroup(radioBtnGrp);
        prefixRadioButton.setToggleGroup(radioBtnGrp);
        postfixRadioButton.setToggleGroup(radioBtnGrp);

        // Radio Button Grp listener
        radioBtnGrp.selectedToggleProperty().addListener((observableValue, oldValue, newValue) -> {
            RadioButton clickedBtn = (RadioButton) radioBtnGrp.getSelectedToggle();
            cleartreetxtfields();
            if (clickedBtn != null) {
                switch (clickedBtn.getText()) {
                    case INFIX_INPUT:  // Infix button is selected
                        infixInputTextField.setEditable(true);
                        treeConvertBtn.setDisable(false);
                        treeInvertFields(INFIX_INPUT);
                        break;
                    case PREFIX_INPUT:  // Prefix button is selected
                        prefixInputTextField.setEditable(true);
                        treeConvertBtn.setDisable(false);
                        treeInvertFields(PREFIX_INPUT);
                        break;
                    case POSTFIX_INPUT:  // Postfix button is selected
                        postfixInputTextField.setEditable(true);
                        treeConvertBtn.setDisable(false);
                        treeInvertFields(POSTFIX_INPUT);
                        break;
                }
            }
        });
        // treeConverterBtn

        treeConvertBtn.setOnAction(actionEvent -> {
            if(infixInputTextField.getText()==null && prefixInputTextField.getText()==null && postfixInputTextField.getText()==null)
            {
                warnUser("No Valid Expressions Given");
            }
            else{
                if (infixRadioButton.isSelected()) {
                    boolean validator = treeConverter.infixValidator(infixInputTextField.getText());
                    if(validator){
                        prefixInputTextField.setText( treeConverter.InfixToPrefix(infixInputTextField.getText()) );
                        postfixInputTextField.setText( treeConverter.InfixToPostfix(infixInputTextField.getText()) );
                    }
                    else{
                        warnUser("Invalid Infix Expression");
                    }
                } else if (prefixRadioButton.isSelected()) {
                    boolean validator = treeConverter.prefixValidator(prefixInputTextField.getText());
                    if(validator){
                        infixInputTextField.setText( treeConverter.PrefixToInfix(prefixInputTextField.getText()) );
                        postfixInputTextField.setText( treeConverter.PrefixToPostfix(prefixInputTextField.getText()) );
                    }
                    else{
                        warnUser("Invalid Prefix Expression");
                    }
                } else if (postfixRadioButton.isSelected()) {
                    boolean validator = treeConverter.postfixValidator(postfixInputTextField.getText());
                    if(validator){
                        prefixInputTextField.setText( treeConverter.PostfixToPrefix( postfixInputTextField.getText() ) );
                        infixInputTextField.setText( treeConverter.PostfixToInfix( postfixInputTextField.getText() ) );
                    }
                    else{
                        warnUser("Invalid Postfix Expression");
                        cleartreetxtfields();
                    }

                }
            }


        });
        // treeClearBtn
        treeClearBtn.setOnAction( e -> clearTreeFields() );
    }

    public void clearTreeFields() {
        infixInputTextField.setText(null);
        prefixInputTextField.setText(null);
        postfixInputTextField.setText(null);
        if (infixRadioButton.isSelected()) infixRadioButton.setSelected(false);
        if (prefixRadioButton.isSelected()) prefixRadioButton.setSelected(false);
        if (postfixRadioButton.isSelected()) postfixRadioButton.setSelected(false);
    }

    //function To clean the fields for inputs
    public void clearProFields() {
        TextFieldBit1.setText(null);
        TextFieldBit2.setText(null);
        bitwiseResult.setText(null);
    }
    //function To clean the fields for inputs
    public void clearFields() {
        TextFieldOne.setText(null);
        TextFieldTwo.setText(null);
        TextFieldRes.setText(null);
    }

    private void treeInvertFields(String whichInputTextField) {
        switch (whichInputTextField) {
            case INFIX_INPUT:
                if (prefixInputTextField.isEditable()) {
                    prefixInputTextField.setText(null);
                    prefixInputTextField.setEditable(false);
                }
                if (postfixInputTextField.isEditable()) {
                    postfixInputTextField.setText(null);
                    postfixInputTextField.setEditable(false);
                }
                break;
            case PREFIX_INPUT:
                if (infixInputTextField.isEditable()) {
                    infixInputTextField.setText(null);
                    infixInputTextField.setEditable(false);
                }
                if (postfixInputTextField.isEditable()) {
                    postfixInputTextField.setText(null);
                    postfixInputTextField.setEditable(false);
                }
                break;
            case POSTFIX_INPUT:
                if (prefixInputTextField.isEditable()) {
                    prefixInputTextField.setText(null);
                    prefixInputTextField.setEditable(false);
                }
                if (infixInputTextField.isEditable()) {
                    infixInputTextField.setText(null);
                    infixInputTextField.setEditable(false);
                }
                break;
        }
    }

    //Function to calculate various operations
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

    //Raise a warning if user enters an invalid input
    private void warnUser(String errorMessage) {
        Alert warning = new Alert(Alert.AlertType.ERROR);
        warning.setTitle("Error Occurred.");
        warning.setHeaderText("Invalid Input");
        warning.setContentText(errorMessage);
        warning.show();
    }
    public void cleartreetxtfields(){
        infixInputTextField.setText(null);
        prefixInputTextField.setText(null);
        postfixInputTextField.setText(null);
    }


}
