package Converter.App;

import Converter.App.Conversions.Currency.CurrencyFetcher;
import Converter.App.Conversions.Units.UnitConversion;
import Converter.App.Conversions.Units.conversionsController;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import static Converter.App.Conversions.Units.conversionsController.*;

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

    static final String SIN = "sin(x)";
    static final String SINH = "sinh(x)";
    static final String COSEC = "cosec(x)";
    static final String COS = "cos(x)";
    static final String COSH = "cosh(x)";
    static final String SEC = "sec(x)";
    static final String TAN = "tan(x)";
    static final String TANH = "tanh(x)";
    static final String COT = "cot(x)";
    static final String ARCSIN = "arcsin(x)";
    static final String ARCCOS = "arccos(x)";
    static final String ARCTAN = "arctan(x)";
    static final String RAD = "Radian";
    static final String DEG = "Degree";
    static final String LOG10 = "log(x)";
    static final String LOGe = "ln(x)";
    static final String EXP = "exp(x)";

    // variables
    static Character operatorChosen;
    static String inputNumberBase;
    static Character bitwiseOperatorChosen;
    static String trigoFunctionChosen;
    static Boolean isRadian = true;

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
    public Button scientificCalculateBtn;
    public Button scientificClearBtn;
    public RadioButton infixRadioButton;
    public RadioButton prefixRadioButton;
    public RadioButton postfixRadioButton;
    public ComboBox<String> scientificOperations;
    public ChoiceBox<String> isRadianChoiceBox;
    public TextField scientificInputField;
    public TextField scientificResultField;
    public TextField conversionsInputTextField;
    public TextField conversionsResultTextField;
    public Button allConversionConvertBtn;
    public Button allConversionClearBtn;
    public ComboBox<String> conversionsComboBox;
    public ChoiceBox<String> fromConversionChoiceBox;
    public ChoiceBox<String> toConversionChoiceBox;




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
        bitwiseOperatorBox.getItems().addAll( AND, OR, XOR, NOT , ADD);

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
                Boolean flag = bitwiseOperatorChosen.equals(NOT);
                //To check for exceptions in inputs
                //Bitwise Binary Validator
                if(inputNumberBase.equals(BINARY) && (Bitwise.binaryValidator(stringBit1,stringBit2, flag))){
                    warnUser("Invalid Binary Number ⚠️");
                    clearProFields();
                }
                //Bitwise Decimal Validator
                else if(inputNumberBase.equals(DEC) && (Bitwise.decimalValidator(stringBit1,stringBit2,flag))){
                    warnUser("Invalid Decimal Number");
                    clearProFields();
                }
                //Bitwise Hexadecimal Validator
                else if(inputNumberBase.equals(HEX) && ( Bitwise.hexdecimalValidator( stringBit1 , stringBit2 ,flag ) ) ){
                    warnUser("Invalid Hexadecimal Number");
                    clearProFields();
                }
                //Bitwise Octal Validator
                else if(inputNumberBase.equals(OCT) && ( Bitwise.octalValidator( stringBit1 , stringBit2 ,flag ) )){
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
            clearTreetxtFields();
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

                    if(treeConverter.infixValidator(infixInputTextField.getText())){
                        prefixInputTextField.setText( treeConverter.InfixToPrefix(infixInputTextField.getText()) );
                        postfixInputTextField.setText( treeConverter.InfixToPostfix(infixInputTextField.getText()) );
                    }
                    else{
                        warnUser("Invalid Infix Expression\n" +infixInputTextField.getText() );
                        clearTreeFields();
                    }
                } else if (prefixRadioButton.isSelected()) {
                    if(treeConverter.prefixValidator(prefixInputTextField.getText())){
                        infixInputTextField.setText( treeConverter.PrefixToInfix(prefixInputTextField.getText()) );
                        postfixInputTextField.setText( treeConverter.PrefixToPostfix(prefixInputTextField.getText()) );
                    }
                    else{
                        warnUser("Invalid Prefix Expression\n" + prefixInputTextField.getText());
                        clearTreeFields();
                    }
                } else if (postfixRadioButton.isSelected()) {
                    if(treeConverter.postfixValidator(postfixInputTextField.getText())){
                        prefixInputTextField.setText( treeConverter.PostfixToPrefix( postfixInputTextField.getText() ) );
                        infixInputTextField.setText( treeConverter.PostfixToInfix( postfixInputTextField.getText() ) );
                    }
                    else{
                        warnUser("Invalid Postfix Expression\n" + postfixInputTextField.getText());
                        clearTreeFields();
                    }

                }
            }


        });
        // treeClearBtn
        treeClearBtn.setOnAction( e -> clearTreeFields() );

        // Scientific
        // putting values in operator boxes
        scientificOperations.getItems().addAll(LOGe,LOG10,EXP,SIN,SINH,COSEC,COS,COSH,SEC,TAN,TANH,COT,ARCSIN,ARCCOS,ARCTAN );
        isRadianChoiceBox.getItems().addAll(RAD,DEG);
        isRadianChoiceBox.setValue(RAD);
        // taking input from Trigo
        // trigo res
        scientificOperations.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            trigoFunctionChosen = newValue;
            scientificInputField.setEditable(true);
            scientificCalculateBtn.setDisable(false);
            isRadianChoiceBox.setVisible(!newValue.equals(LOG10) && !newValue.equals(LOGe) && !newValue.equals(EXP));

        });
        isRadianChoiceBox.getSelectionModel().selectedItemProperty().addListener((observable,oldValue,newValue) -> isRadian = newValue.equals(RAD));

        scientificCalculateBtn.setOnAction(e -> {
            double res;
            String scientificNumber = (scientificInputField.getText() == null) ? "0.0" : scientificInputField.getText();

            switch (trigoFunctionChosen) {
                case SIN:
                    res = Scientific.sineOf(scientificNumber , isRadian);
                    break;
                case SINH:
                    res = Scientific.sinhOf(scientificNumber, isRadian);
                    break;
                case COS:
                    res = Scientific.cosOf(scientificNumber, isRadian);
                    break;
                case COSH:
                    res = Scientific.coshOf(scientificNumber, isRadian);
                    break;
                case TAN:
                    res = Scientific.tanOf(scientificNumber, isRadian);
                    break;
                case TANH:
                    res = Scientific.tanhOf(scientificNumber, isRadian);
                    break;
                case COSEC:
                    res = Scientific.cosecOf(scientificNumber, isRadian);
                    break;
                case SEC:
                    res = Scientific.secOf(scientificNumber, isRadian);
                    break;
                case COT:
                    res = Scientific.cotOf(scientificNumber, isRadian);
                    break;
                case ARCSIN:
                    if (isRadian) res = Math.toRadians( Scientific.arcsinOf(scientificNumber) );
                    else res = Scientific.arcsinOf(scientificNumber);
                    break;
                case ARCCOS:
                    if (isRadian) res = Math.toRadians( Scientific.arcsinOf(scientificNumber) );
                    else res = Scientific.arccosOf(scientificNumber);
                    break;
                case ARCTAN:
                    if (isRadian) res = Math.toRadians( Scientific.arctanOf(scientificNumber) );
                    else res = Scientific.arctanOf(scientificNumber);
                    break;
                case LOG10:
                    res =Scientific.logOf(scientificNumber);
                    break;
                case LOGe:
                    res = Scientific.ln(scientificNumber);
                    break;
                case EXP:
                    res = Scientific.expOf(scientificNumber);
                    break;
                default:
                    res = 0.0;
                    break;
            }
            scientificResultField.setText("Result: " + res);
        });
        scientificClearBtn.setOnAction(e -> clearScientificFields());

        // All Conversions
        CurrencyFetcher fetcher = null;
        conversionsComboBox.getItems().addAll( CurrencyFetcher.CURRENCY, DISTANCE, WEIGHT, ANGLE, AREA, TEMPERATURE, POWERUNIT, TIME, PRESSURE, SPEED, ENERGY, VOLUME, DIGITALSTORAGE);
        conversionsComboBox.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            switch (newValue) {
                case CurrencyFetcher.CURRENCY:
                    fromConversionChoiceBox.getItems().clear();
                    toConversionChoiceBox.getItems().clear();
                    fromConversionChoiceBox.getItems().addAll("AED","AFN","ALL","AMD","ANG","AOA","ARS","AUD","AWG","AZN","BAM","BBD","BDT","BGN","BHD","BIF","BMD","BND","BOB","BRL","BSD","BTN","BWP","BYN","BZD","CAD","CDF","CHF","CLP","CNY","COP","CRC","CUC","CUP","CVE","CZK","DJF","DKK","DOP","DZD","EGP","ERN","ETB","EUR","FJD","FKP","FOK","GBP","GEL","GGP","GHS","GIP","GMD","GNF","GTQ","GYD","HKD","HNL","HRK","HTG","HUF","IDR","ILS","IMP","INR","IQD","IRR","ISK","JMD","JOD","JPY","KES","KGS","KHR","KID","KMF","KRW","KWD","KYD","KZT","LAK","LBP","LKR","LRD","LSL","LYD","MAD","MDL");
                    fromConversionChoiceBox.getItems().addAll("MGA","MKD","MMK","MNT","MOP","MRU","MUR","MVR","MWK","MXN","MYR","MZN","NAD","NGN","NIO","NOK","NPR","NZD","OMR","PAB","PEN","PGK","PHP","PKR","PLN","PYG","QAR","RON","RSD","RUB","RWF","SAR","SBD","SCR","SDG","SEK","SGD","SHP","SLL","SOS","SRD","SSP","STN","SYP","SZL","THB","TJS","TMT","TND","TOP","TRY","TTD","TVD","TWD","TZS","UAH","UGX","UYU","UZS","VES","VND","VUV","WST","XAF","XCD","XDR","XOF","XPF","YER","ZAR","ZMW");
                    fromConversionChoiceBox.setValue("USD");
                    toConversionChoiceBox.setValue("INR");
                    // TODO Currency Fetcher implementation.
                    break;
                case DISTANCE:
                    fromConversionChoiceBox.getItems().clear();
                    toConversionChoiceBox.getItems().clear();
                    fromConversionChoiceBox.getItems().addAll(ForDistance.Cm, ForDistance.m, ForDistance.KM, ForDistance.Inch, ForDistance.Inch, ForDistance.Miles, ForDistance.NauticalMi, ForDistance.Yards );
                    fromConversionChoiceBox.setValue(ForDistance.m);
                    toConversionChoiceBox.getItems().addAll(ForDistance.Cm, ForDistance.m, ForDistance.KM, ForDistance.Inch, ForDistance.Inch, ForDistance.Miles, ForDistance.NauticalMi, ForDistance.Yards );
                    toConversionChoiceBox.setValue(ForDistance.Cm);
                    break;
                case WEIGHT:
                    fromConversionChoiceBox.getItems().clear();
                    toConversionChoiceBox.getItems().clear();
                    fromConversionChoiceBox.getItems().addAll(ForWeight.Carat, ForWeight.Ounces, ForWeight.CentiGM, ForWeight.gm, ForWeight.DecaGm, ForWeight.DeciGm, ForWeight.HectoGm, ForWeight.kg, ForWeight.metricTn, ForWeight.MilliGm, ForWeight.Pounds, ForWeight.Stone);
                    fromConversionChoiceBox.setValue(ForWeight.gm);
                    toConversionChoiceBox.getItems().addAll(ForWeight.Carat, ForWeight.Ounces, ForWeight.CentiGM, ForWeight.gm, ForWeight.DecaGm, ForWeight.DeciGm, ForWeight.HectoGm, ForWeight.kg, ForWeight.metricTn, ForWeight.MilliGm, ForWeight.Pounds, ForWeight.Stone);
                    toConversionChoiceBox.setValue(ForWeight.kg);
                    break;
                case ANGLE:
                    fromConversionChoiceBox.getItems().clear();
                    toConversionChoiceBox.getItems().clear();
                    fromConversionChoiceBox.getItems().addAll(ForAngle.ArcSec, ForAngle.Deg, ForAngle.Grad, ForAngle.Rad);
                    fromConversionChoiceBox.setValue(ForAngle.Deg);
                    toConversionChoiceBox.getItems().addAll(ForAngle.ArcSec, ForAngle.Deg, ForAngle.Grad, ForAngle.Rad);
                    toConversionChoiceBox.setValue(ForAngle.Rad);
                    break;
                case AREA:
                    fromConversionChoiceBox.getItems().clear();
                    toConversionChoiceBox.getItems().clear();
                    fromConversionChoiceBox.getItems().addAll(ForArea.Acres, ForArea.Hectare, ForArea.SqCm, ForArea.SqInch, ForArea.SqKm, ForArea.Sqm, ForArea.SqFt, ForArea.SqMi, ForArea.SqMm, ForArea.SqYard);
                    fromConversionChoiceBox.setValue(ForArea.SqKm);
                    toConversionChoiceBox.getItems().addAll(ForArea.Acres, ForArea.Hectare, ForArea.SqCm, ForArea.SqInch, ForArea.SqKm, ForArea.Sqm, ForArea.SqFt, ForArea.SqMi, ForArea.SqMm, ForArea.SqYard);
                    toConversionChoiceBox.setValue(ForArea.SqMi);
                    break;
                case PRESSURE:
                    fromConversionChoiceBox.getItems().clear();
                    toConversionChoiceBox.getItems().clear();
                    fromConversionChoiceBox.getItems().addAll(ForPressure.KILOPASC, ForPressure.ATM, ForPressure.BARR, ForPressure.MMOFMERC, ForPressure.PASC, ForPressure.PPSPERINCH);
                    fromConversionChoiceBox.setValue(ForPressure.ATM);
                    toConversionChoiceBox.getItems().addAll(ForPressure.KILOPASC, ForPressure.ATM, ForPressure.BARR, ForPressure.MMOFMERC, ForPressure.PASC, ForPressure.PPSPERINCH);
                    toConversionChoiceBox.setValue(ForPressure.PASC);
                    break;
                case POWERUNIT:
                    fromConversionChoiceBox.getItems().clear();
                    toConversionChoiceBox.getItems().clear();
                    fromConversionChoiceBox.getItems().addAll(ForPower.BTU, ForPower.FTPpm, ForPower.HP, ForPower.KiloWatt, ForPower.watt);
                    fromConversionChoiceBox.setValue(ForPower.watt);
                    toConversionChoiceBox.getItems().addAll(ForPower.BTU, ForPower.FTPpm, ForPower.HP, ForPower.KiloWatt, ForPower.watt);
                    toConversionChoiceBox.setValue(ForPower.HP);
                    break;
                case TIME:
                    fromConversionChoiceBox.getItems().clear();
                    toConversionChoiceBox.getItems().clear();
                    fromConversionChoiceBox.getItems().addAll(ForTime.Sec, ForTime.Day, ForTime.MicroSec, ForTime.MilliSec, ForTime.Min, ForTime.Hrs, ForTime.Week, ForTime.Year);
                    fromConversionChoiceBox.setValue(ForTime.Sec);
                    toConversionChoiceBox.getItems().addAll(ForTime.Sec, ForTime.Day, ForTime.MicroSec, ForTime.MilliSec, ForTime.Min, ForTime.Hrs, ForTime.Week, ForTime.Year);
                    toConversionChoiceBox.setValue(ForTime.Hrs);
                    break;
                case SPEED:
                    fromConversionChoiceBox.getItems().clear();
                    toConversionChoiceBox.getItems().clear();
                    fromConversionChoiceBox.getItems().addAll(ForSpeed.CmPerSec, ForSpeed.FtPerSec, ForSpeed.KmPerHr, ForSpeed.MPerSec, ForSpeed.MiPerHr, ForSpeed.Knot, ForSpeed.Mach);
                    fromConversionChoiceBox.setValue(ForSpeed.KmPerHr);
                    toConversionChoiceBox.getItems().addAll(ForSpeed.CmPerSec, ForSpeed.FtPerSec, ForSpeed.KmPerHr, ForSpeed.MPerSec, ForSpeed.MiPerHr, ForSpeed.Knot, ForSpeed.Mach);
                    toConversionChoiceBox.setValue(ForSpeed.MiPerHr);
                    break;
                case ENERGY:
                    fromConversionChoiceBox.getItems().clear();
                    toConversionChoiceBox.getItems().clear();
                    fromConversionChoiceBox.getItems().addAll(ForEnergy.CAL, ForEnergy.EV, ForEnergy.FCAL, ForEnergy.J, ForEnergy.KJ, ForEnergy.FTPOUNDS);
                    fromConversionChoiceBox.setValue(ForEnergy.CAL);
                    toConversionChoiceBox.getItems().addAll(ForEnergy.CAL, ForEnergy.EV, ForEnergy.FCAL, ForEnergy.J, ForEnergy.KJ, ForEnergy.FTPOUNDS);
                    toConversionChoiceBox.setValue(ForEnergy.J);
                    break;
                case VOLUME:
                    fromConversionChoiceBox.getItems().clear();
                    toConversionChoiceBox.getItems().clear();
                    fromConversionChoiceBox.getItems().addAll(ForVolume.FLDONC, ForVolume.CUBICFT, ForVolume.CUBICINCH, ForVolume.CUBICYARD, ForVolume.CUBICMETRE, ForVolume.CUPS, ForVolume.GALL, ForVolume.LTRS, ForVolume.PINTS, ForVolume.QUARTS, ForVolume.MILLILITRS, ForVolume.TEASPOON);
                    fromConversionChoiceBox.setValue(ForVolume.LTRS);
                    toConversionChoiceBox.getItems().addAll(ForVolume.FLDONC, ForVolume.CUBICFT, ForVolume.CUBICINCH, ForVolume.CUBICYARD, ForVolume.CUBICMETRE, ForVolume.CUPS, ForVolume.GALL, ForVolume.LTRS, ForVolume.PINTS, ForVolume.QUARTS, ForVolume.MILLILITRS, ForVolume.TEASPOON);
                    toConversionChoiceBox.setValue(ForVolume.MILLILITRS);
                    break;
                case TEMPERATURE:
                    fromConversionChoiceBox.getItems().clear();
                    toConversionChoiceBox.getItems().clear();
                    fromConversionChoiceBox.getItems().addAll(ForTemperature.Cel, ForTemperature.Fah, ForTemperature.Kel, ForTemperature.Rankine);
                    fromConversionChoiceBox.setValue(ForTemperature.Cel);
                    toConversionChoiceBox.getItems().addAll(ForTemperature.Cel, ForTemperature.Fah, ForTemperature.Kel, ForTemperature.Rankine);
                    toConversionChoiceBox.setValue(ForTemperature.Fah);
                    break;
                case DIGITALSTORAGE:
                    fromConversionChoiceBox.getItems().clear();
                    toConversionChoiceBox.getItems().clear();
                    fromConversionChoiceBox.getItems().addAll(ForDigitalStorage.Bytes, ForDigitalStorage.Bit, ForDigitalStorage.Ebi, ForDigitalStorage.Eby, ForDigitalStorage.Gbi, ForDigitalStorage.Gby, ForDigitalStorage.Kbi, ForDigitalStorage.Kby, ForDigitalStorage.Mbi, ForDigitalStorage.Mby, ForDigitalStorage.Nibble, ForDigitalStorage.Pbi, ForDigitalStorage.Pby, ForDigitalStorage.Tbi, ForDigitalStorage.Tby, ForDigitalStorage.Ybi, ForDigitalStorage.Yby, ForDigitalStorage.Zbi, ForDigitalStorage.Zby);
                    fromConversionChoiceBox.setValue(ForDigitalStorage.Bit);
                    toConversionChoiceBox.getItems().addAll(ForDigitalStorage.Bytes, ForDigitalStorage.Bit, ForDigitalStorage.Ebi, ForDigitalStorage.Eby, ForDigitalStorage.Gbi, ForDigitalStorage.Gby, ForDigitalStorage.Kbi, ForDigitalStorage.Kby, ForDigitalStorage.Mbi, ForDigitalStorage.Mby, ForDigitalStorage.Nibble, ForDigitalStorage.Pbi, ForDigitalStorage.Pby, ForDigitalStorage.Tbi, ForDigitalStorage.Tby, ForDigitalStorage.Ybi, ForDigitalStorage.Yby, ForDigitalStorage.Zbi, ForDigitalStorage.Zby);
                    toConversionChoiceBox.setValue(ForDigitalStorage.Bytes);
                    break;
            }
        });
        allConversionConvertBtn.setOnAction(actionEvent -> allConverterBtn());
        allConversionClearBtn.setOnAction(actionEvent -> clearConversionsFields());
    }

    public void clearConversionsFields() {
        conversionsInputTextField.setText(null);
        conversionsResultTextField.setText(null);
    }

    public void clearScientificFields() {
        scientificResultField.setText(null);
        scientificInputField.setText(null);
        scientificCalculateBtn.setDisable(true);
        isRadianChoiceBox.setVisible(true);
    }

    private void clearTreetxtFields() {
        infixInputTextField.setText(null);
        prefixInputTextField.setText(null);
        postfixInputTextField.setText(null);
    }

    public void clearTreeFields() {
        infixInputTextField.setText(null);
        prefixInputTextField.setText(null);
        postfixInputTextField.setText(null);
        if (infixRadioButton.isSelected()) infixRadioButton.setSelected(false);
        if (prefixRadioButton.isSelected()) prefixRadioButton.setSelected(false);
        if (postfixRadioButton.isSelected()) postfixRadioButton.setSelected(false);
        infixInputTextField.setEditable(false);
        prefixInputTextField.setEditable(false);
        postfixInputTextField.setEditable(false);
        treeConvertBtn.setDisable(true);
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

    // function to handle allConverter convert()
    private void allConverterBtn() {
        // TODO Conversions
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


}
