package Converter.App;

import Converter.App.Conversions.Currency.CurrencyFetcher;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import static Converter.App.Conversions.Units.conversionsController.*;

import java.net.URL;
import java.util.Optional;
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
    static String fromC , toC;
    static double value;
    static String conversionProperty;


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
    public ComboBox<String> fromConversionBox;
    public ComboBox<String> toConversionBox;





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
                    warnUser("Invalid ");
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
        conversionsComboBox.getItems().addAll( CurrencyFetcher.CURRENCY, DISTANCE, WEIGHT, ANGLE, AREA, TEMPERATURE, POWERUNIT, TIME, PRESSURE, SPEED, ENERGY, VOLUME, DIGITALSTORAGE);
        conversionsComboBox.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            conversionProperty = newValue;

            switch (newValue) {

                case CurrencyFetcher.CURRENCY:
                    clearConversionsFields();
                    fromConversionBox.getItems().clear();
                    toConversionBox.getItems().clear();

                    fromConversionBox.getItems().addAll("AED","AFN","ALL","AMD","ANG","AOA","ARS","AUD","AWG","AZN","BAM","BBD","BDT","BGN","BHD","BIF","BMD","BND","BOB","BRL","BSD","BTN","BWP","BYN","BZD","CAD","CDF","CHF","CLP","CNY","COP","CRC","CUC","CUP","CVE","CZK","DJF","DKK","DOP","DZD","EGP","ERN","ETB","EUR","FJD","FKP","FOK","GBP","GEL","GGP","GHS","GIP","GMD","GNF","GTQ","GYD","HKD","HNL","HRK","HTG","HUF","IDR","ILS","IMP","INR","IQD","IRR","ISK","JMD","JOD","JPY","KES","KGS","KHR","KID","KMF","KRW","KWD","KYD","KZT","LAK","LBP","LKR","LRD","LSL","LYD","MAD","MDL");
                    fromConversionBox.getItems().addAll("MGA","MKD","MMK","MNT","MOP","MRU","MUR","MVR","MWK","MXN","MYR","MZN","NAD","NGN","NIO","NOK","NPR","NZD","OMR","PAB","PEN","PGK","PHP","PKR","PLN","PYG","QAR","RON","RSD","RUB","RWF","SAR","SBD","SCR","SDG","SEK","SGD","SHP","SLL","SOS","SRD","SSP","STN","SYP","SZL","THB","TJS","TMT","TND","TOP","TRY","TTD","TVD","TWD","TZS","UAH","UGX","USD","UYU","UZS","VES","VND","VUV","WST","XAF","XCD","XDR","XOF","XPF","YER","ZAR","ZMW");
                    fromConversionBox.setValue("USD");

                    toConversionBox.getItems().addAll("AED","AFN","ALL","AMD","ANG","AOA","ARS","AUD","AWG","AZN","BAM","BBD","BDT","BGN","BHD","BIF","BMD","BND","BOB","BRL","BSD","BTN","BWP","BYN","BZD","CAD","CDF","CHF","CLP","CNY","COP","CRC","CUC","CUP","CVE","CZK","DJF","DKK","DOP","DZD","EGP","ERN","ETB","EUR","FJD","FKP","FOK","GBP","GEL","GGP","GHS","GIP","GMD","GNF","GTQ","GYD","HKD","HNL","HRK","HTG","HUF","IDR","ILS","IMP","INR","IQD","IRR","ISK","JMD","JOD","JPY","KES","KGS","KHR","KID","KMF","KRW","KWD","KYD","KZT","LAK","LBP","LKR","LRD","LSL","LYD","MAD","MDL");
                    toConversionBox.getItems().addAll("MGA","MKD","MMK","MNT","MOP","MRU","MUR","MVR","MWK","MXN","MYR","MZN","NAD","NGN","NIO","NOK","NPR","NZD","OMR","PAB","PEN","PGK","PHP","PKR","PLN","PYG","QAR","RON","RSD","RUB","RWF","SAR","SBD","SCR","SDG","SEK","SGD","SHP","SLL","SOS","SRD","SSP","STN","SYP","SZL","THB","TJS","TMT","TND","TOP","TRY","TTD","TVD","TWD","TZS","UAH","UGX","USD","UYU","UZS","VES","VND","VUV","WST","XAF","XCD","XDR","XOF","XPF","YER","ZAR","ZMW");
                    toConversionBox.setValue("INR");

                    break;
                case DISTANCE:
                    clearConversionsFields();
                    fromConversionBox.getItems().clear();
                    toConversionBox.getItems().clear();
                    fromConversionBox.getItems().addAll(ForDistance.Cm, ForDistance.m, ForDistance.KM, ForDistance.Ft, ForDistance.Inch, ForDistance.Miles, ForDistance.NauticalMi, ForDistance.Yards );
                    fromConversionBox.setValue(ForDistance.m);
                    toConversionBox.getItems().addAll(ForDistance.Cm, ForDistance.m, ForDistance.KM, ForDistance.Ft, ForDistance.Inch, ForDistance.Miles, ForDistance.NauticalMi, ForDistance.Yards );
                    toConversionBox.setValue(ForDistance.Cm);
                    break;
                case WEIGHT:
                    clearConversionsFields();
                    fromConversionBox.getItems().clear();
                    toConversionBox.getItems().clear();
                    fromConversionBox.getItems().addAll(ForWeight.Carat, ForWeight.Ounces, ForWeight.CentiGM, ForWeight.gm, ForWeight.DecaGm, ForWeight.DeciGm, ForWeight.HectoGm, ForWeight.kg, ForWeight.metricTn, ForWeight.MilliGm, ForWeight.Pounds, ForWeight.Stone);
                    fromConversionBox.setValue(ForWeight.gm);
                    toConversionBox.getItems().addAll(ForWeight.Carat, ForWeight.Ounces, ForWeight.CentiGM, ForWeight.gm, ForWeight.DecaGm, ForWeight.DeciGm, ForWeight.HectoGm, ForWeight.kg, ForWeight.metricTn, ForWeight.MilliGm, ForWeight.Pounds, ForWeight.Stone);
                    toConversionBox.setValue(ForWeight.kg);
                    break;
                case ANGLE:
                    clearConversionsFields();
                    fromConversionBox.getItems().clear();
                    toConversionBox.getItems().clear();
                    fromConversionBox.getItems().addAll(ForAngle.ArcSec, ForAngle.Deg, ForAngle.Grad, ForAngle.Rad);
                    fromConversionBox.setValue(ForAngle.Deg);
                    toConversionBox.getItems().addAll(ForAngle.ArcSec, ForAngle.Deg, ForAngle.Grad, ForAngle.Rad);
                    toConversionBox.setValue(ForAngle.Rad);
                    break;
                case AREA:
                    clearConversionsFields();
                    fromConversionBox.getItems().clear();
                    toConversionBox.getItems().clear();
                    fromConversionBox.getItems().addAll(ForArea.Acres, ForArea.Hectare, ForArea.SqCm, ForArea.SqInch, ForArea.SqKm, ForArea.Sqm, ForArea.SqFt, ForArea.SqMi, ForArea.SqMm, ForArea.SqYard);
                    fromConversionBox.setValue(ForArea.SqKm);
                    toConversionBox.getItems().addAll(ForArea.Acres, ForArea.Hectare, ForArea.SqCm, ForArea.SqInch, ForArea.SqKm, ForArea.Sqm, ForArea.SqFt, ForArea.SqMi, ForArea.SqMm, ForArea.SqYard);
                    toConversionBox.setValue(ForArea.SqMi);
                    break;
                case PRESSURE:
                    clearConversionsFields();
                    fromConversionBox.getItems().clear();
                    toConversionBox.getItems().clear();
                    fromConversionBox.getItems().addAll(ForPressure.KILOPASC, ForPressure.ATM, ForPressure.BARR, ForPressure.MMOFMERC, ForPressure.PASC, ForPressure.PPSPERINCH);
                    fromConversionBox.setValue(ForPressure.ATM);
                    toConversionBox.getItems().addAll(ForPressure.KILOPASC, ForPressure.ATM, ForPressure.BARR, ForPressure.MMOFMERC, ForPressure.PASC, ForPressure.PPSPERINCH);
                    toConversionBox.setValue(ForPressure.PASC);
                    break;
                case POWERUNIT:
                    clearConversionsFields();
                    fromConversionBox.getItems().clear();
                    toConversionBox.getItems().clear();
                    fromConversionBox.getItems().addAll(ForPower.BTU, ForPower.FTPpm, ForPower.HP, ForPower.KiloWatt, ForPower.watt);
                    fromConversionBox.setValue(ForPower.watt);
                    toConversionBox.getItems().addAll(ForPower.BTU, ForPower.FTPpm, ForPower.HP, ForPower.KiloWatt, ForPower.watt);
                    toConversionBox.setValue(ForPower.HP);
                    break;
                case TIME:
                    clearConversionsFields();
                    fromConversionBox.getItems().clear();
                    toConversionBox.getItems().clear();
                    fromConversionBox.getItems().addAll(ForTime.Sec, ForTime.Day, ForTime.MicroSec, ForTime.MilliSec, ForTime.Min, ForTime.Hrs, ForTime.Week, ForTime.Year);
                    fromConversionBox.setValue(ForTime.Sec);
                    toConversionBox.getItems().addAll(ForTime.Sec, ForTime.Day, ForTime.MicroSec, ForTime.MilliSec, ForTime.Min, ForTime.Hrs, ForTime.Week, ForTime.Year);
                    toConversionBox.setValue(ForTime.Hrs);
                    break;
                case SPEED:
                    clearConversionsFields();
                    fromConversionBox.getItems().clear();
                    toConversionBox.getItems().clear();
                    fromConversionBox.getItems().addAll(ForSpeed.CmPerSec, ForSpeed.FtPerSec, ForSpeed.KmPerHr, ForSpeed.MPerSec, ForSpeed.MiPerHr, ForSpeed.Knot, ForSpeed.Mach);
                    fromConversionBox.setValue(ForSpeed.KmPerHr);
                    toConversionBox.getItems().addAll(ForSpeed.CmPerSec, ForSpeed.FtPerSec, ForSpeed.KmPerHr, ForSpeed.MPerSec, ForSpeed.MiPerHr, ForSpeed.Knot, ForSpeed.Mach);
                    toConversionBox.setValue(ForSpeed.MiPerHr);
                    break;
                case ENERGY:
                    clearConversionsFields();
                    fromConversionBox.getItems().clear();
                    toConversionBox.getItems().clear();
                    fromConversionBox.getItems().addAll(ForEnergy.CAL, ForEnergy.EV, ForEnergy.FCAL, ForEnergy.J, ForEnergy.KJ, ForEnergy.FTPOUNDS);
                    fromConversionBox.setValue(ForEnergy.CAL);
                    toConversionBox.getItems().addAll(ForEnergy.CAL, ForEnergy.EV, ForEnergy.FCAL, ForEnergy.J, ForEnergy.KJ, ForEnergy.FTPOUNDS);
                    toConversionBox.setValue(ForEnergy.J);
                    break;
                case VOLUME:
                    clearConversionsFields();
                    fromConversionBox.getItems().clear();
                    toConversionBox.getItems().clear();
                    fromConversionBox.getItems().addAll(ForVolume.FLDONC, ForVolume.CUBICFT, ForVolume.CUBICINCH, ForVolume.CUBICYARD, ForVolume.CUBICMETRE, ForVolume.CUPS, ForVolume.GALL, ForVolume.LTRS, ForVolume.PINTS, ForVolume.QUARTS, ForVolume.MILLILITRS, ForVolume.TEASPOON);
                    fromConversionBox.setValue(ForVolume.LTRS);
                    toConversionBox.getItems().addAll(ForVolume.FLDONC, ForVolume.CUBICFT, ForVolume.CUBICINCH, ForVolume.CUBICYARD, ForVolume.CUBICMETRE, ForVolume.CUPS, ForVolume.GALL, ForVolume.LTRS, ForVolume.PINTS, ForVolume.QUARTS, ForVolume.MILLILITRS, ForVolume.TEASPOON);
                    toConversionBox.setValue(ForVolume.MILLILITRS);
                    break;
                case TEMPERATURE:
                    clearConversionsFields();
                    fromConversionBox.getItems().clear();
                    toConversionBox.getItems().clear();
                    fromConversionBox.getItems().addAll(ForTemperature.Cel, ForTemperature.Fah, ForTemperature.Kel, ForTemperature.Rankine);
                    fromConversionBox.setValue(ForTemperature.Cel);
                    toConversionBox.getItems().addAll(ForTemperature.Cel, ForTemperature.Fah, ForTemperature.Kel, ForTemperature.Rankine);
                    toConversionBox.setValue(ForTemperature.Fah);
                    break;
                case DIGITALSTORAGE:
                    clearConversionsFields();
                    fromConversionBox.getItems().clear();
                    toConversionBox.getItems().clear();
                    fromConversionBox.getItems().addAll(ForDigitalStorage.Bytes, ForDigitalStorage.Bit, ForDigitalStorage.Ebi, ForDigitalStorage.Eby, ForDigitalStorage.Gbi, ForDigitalStorage.Gby, ForDigitalStorage.Kbi, ForDigitalStorage.Kby, ForDigitalStorage.Mbi, ForDigitalStorage.Mby, ForDigitalStorage.Nibble, ForDigitalStorage.Pbi, ForDigitalStorage.Pby, ForDigitalStorage.Tbi, ForDigitalStorage.Tby, ForDigitalStorage.Ybi, ForDigitalStorage.Yby, ForDigitalStorage.Zbi, ForDigitalStorage.Zby);
                    fromConversionBox.setValue(ForDigitalStorage.Bit);
                    toConversionBox.getItems().addAll(ForDigitalStorage.Bytes, ForDigitalStorage.Bit, ForDigitalStorage.Ebi, ForDigitalStorage.Eby, ForDigitalStorage.Gbi, ForDigitalStorage.Gby, ForDigitalStorage.Kbi, ForDigitalStorage.Kby, ForDigitalStorage.Mbi, ForDigitalStorage.Mby, ForDigitalStorage.Nibble, ForDigitalStorage.Pbi, ForDigitalStorage.Pby, ForDigitalStorage.Tbi, ForDigitalStorage.Tby, ForDigitalStorage.Ybi, ForDigitalStorage.Yby, ForDigitalStorage.Zbi, ForDigitalStorage.Zby);
                    toConversionBox.setValue(ForDigitalStorage.Bytes);
                    break;
            }
        });
        fromConversionBox.getSelectionModel().selectedItemProperty().addListener((observable ,oldValue, newValue  ) ->fromC = newValue);
        toConversionBox.getSelectionModel().selectedItemProperty().addListener((observable ,oldValue, newValue  ) -> toC = newValue);

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

    private static double conversionsInputValidator(String number) throws NumberFormatException {
        try {
            return Double.parseDouble(number);
        }
        catch (NumberFormatException parseException) {
            return Double.NaN;
        }
    }
    // function to handle allConverter convert()
    private void allConverterBtn()  {
        String res=null;
        String Svalue=conversionsInputTextField.getText();
        value = conversionsInputValidator(Svalue);
        switch (conversionProperty){
            case DISTANCE:
                ForDistance D = new ForDistance( fromC, String.valueOf(value));
                switch (toC){
                    case ForDistance.Cm:
                        res="Result: " + D.toCM()+" "+ForDistance.Cm;
                        break;
                    case ForDistance.m:
                        res="Result: " + D.toMeter()+" "+ForDistance.m;
                        break;
                    case ForDistance.KM:
                        res="Result: " + D.toKiloMeter()+" "+ForDistance.KM;
                        break;
                    case ForDistance.Miles:
                        res="Result: " + D.toMiles()+" "+toC;
                        break;
                    case ForDistance.Yards:
                        res="Result: " + D.toYards()+" "+toC;
                        break;
                    case ForDistance.NauticalMi:
                        res="Result: " + D.toNauticalMiles()+" "+toC;
                        break;
                    case ForDistance.Inch:
                        res="Result: " + D.toInches()+" "+toC;
                        break;
                    case ForDistance.Ft:
                        res="Result: " + D.toFeet()+" "+ForDistance.Ft;
                        break;
                }
                break;
            case WEIGHT:
                ForWeight w = new ForWeight(fromC, String.valueOf(value));
                switch (toC){
                    case ForWeight.Carat:
                        res="Result: " + w.toCarat()+" "+toC;
                        break;
                    case ForWeight.gm:
                        res="Result: " + w.toGrams()+" "+toC;
                        break;
                    case ForWeight.CentiGM:
                        res="Result: " + w.toCentiGram()+" "+toC;
                        break;
                    case ForWeight.kg:
                        res="Result: " + w.toKiloGrams()+" "+toC;
                        break;
                    case ForWeight.DecaGm:
                        res="Result: " + w.toDecaGrams()+" "+toC;
                        break;
                    case ForWeight.DeciGm:
                        res="Result: " + w.toDeciGram()+" "+toC;
                        break;
                    case ForWeight.HectoGm:
                        res="Result: " + w.toHectoGrams()+" "+toC;
                        break;
                    case ForWeight.metricTn:
                        res="Result: " + w.toMetricTonnes()+" "+toC;
                        break;
                    case ForWeight.MilliGm:
                        res="Result: " + w.toMilliGram()+" "+toC;
                        break;
                    case ForWeight.Ounces:
                        res="Result: " + w.toOunces()+" "+toC;
                        break;
                    case ForWeight.Pounds:
                        res="Result: " + w.toPounds()+" "+toC;
                        break;
                    case ForWeight.Stone:
                        res="Result: " + w.toStones()+" "+toC;
                        break;
                }
                break;
            case ANGLE:
                ForAngle a = new ForAngle(fromC,Svalue);
                switch(toC){
                    case ForAngle.ArcSec:
                        res="Result: " + a.toArcSeconds()+" "+toC;
                        break;
                    case ForAngle.Deg:
                        res="Result: " + a.toDegrees()+" "+toC;
                        break;
                    case ForAngle.Grad:
                        res="Result: " + a.toGradian()+" "+toC;
                        break;
                    case ForAngle.Rad:
                        res="Result: " + a.toRadians()+" "+toC;
                        break;
                }
                break;

            case AREA:
                ForArea area = new ForArea(fromC , Svalue);
                switch (toC){
                    case ForArea.Acres:
                        res="Result: " + area.toAcres()+" "+toC;
                        break;
                    case ForArea.Hectare:
                        res="Result: " + area.toHectare()+" "+toC;
                        break;
                    case ForArea.SqCm:
                        res="Result: " + area.toSquareCentimeters()+" "+toC;
                        break;
                    case ForArea.SqFt:
                        res="Result: " + area.toSquareFeet()+" "+toC;
                        break;
                    case ForArea.SqKm:
                        res="Result: " + area.toSquareKiloMeters()+" "+toC;
                        break;
                    case ForArea.SqInch:
                        res="Result: " + area.toSquareInches()+" "+toC;
                        break;
                    case ForArea.Sqm:
                        res="Result: " + area.toSquareMeters()+" "+toC;
                        break;
                    case ForArea.SqMi:
                        res="Result: " + area.toSquareMiles()+" "+toC;
                        break;
                    case ForArea.SqMm:
                        res="Result: " + area.toSquareMilimeters()+" "+toC;
                        break;
                    case ForArea.SqYard:
                        res="Result: " + area.toSquareYards()+" "+toC;
                        break;
                }
                break;
            case PRESSURE:
                ForPressure p = new ForPressure(fromC , Svalue);
                switch (toC){
                    case ForPressure.ATM:
                        res = "Result: "+p.toAtm()+" "+toC;
                        break;
                    case ForPressure.BARR:
                        res = "Result: "+p.toBarr()+" "+toC;
                        break;
                    case ForPressure.KILOPASC:
                        res = "Result: "+p.toKiloPascals()+" "+toC;
                        break;
                    case ForPressure.PASC:
                        res = "Result: "+p.toPascals()+" "+toC;
                        break;
                    case ForPressure.MMOFMERC:
                        res = "Result: "+p.toMMofMerc()+" "+toC;
                        break;
                    case ForPressure.PPSPERINCH:
                        res = "Result: "+p.toPpsPerInch()+" "+toC;
                        break;
                }
                break;
            case POWERUNIT:
                ForPower power = new ForPower(fromC , Svalue);
                switch (toC){
                    case ForPower.BTU:
                        res = "Result: "+power.toBTUsPerMinute()+" "+toC;
                        break;
                    case ForPower.HP:
                        res = "Result: "+power.toHorsePower()+" "+toC;
                        break;
                    case ForPower.FTPpm:
                        res = "Result: "+power.toFootPoundsPerMinute()+" "+toC;
                        break;
                    case ForPower.KiloWatt:
                        res = "Result: "+power.toKiloWatts()+" "+toC;
                        break;
                    case ForPower.watt:
                        res = "Result: "+power.toWatts()+" "+toC;
                        break;
                }
                break;
            case TIME:
                ForTime time = new ForTime(fromC , Svalue);
                switch (toC){
                    case ForTime.Day:
                        res = "Result: "+time.toDays()+" "+toC;
                        break;
                    case ForTime.Hrs:
                        res = "Result: "+time.toHours()+" "+toC;
                        break;
                    case ForTime.MicroSec:
                        res = "Result: "+time.toMicroSeconds()+" "+toC;
                        break;
                    case ForTime.MilliSec:
                        res = "Result: "+time.toMilliSeconds()+" "+toC;
                        break;
                    case ForTime.Min:
                        res = "Result: "+time.toMinutes()+" "+toC;
                        break;
                    case ForTime.Sec:
                        res = "Result: "+time.toSeconds()+" "+toC;
                        break;
                    case ForTime.Week:
                        res = "Result: "+time.toWeeks()+" "+toC;
                        break;
                    case ForTime.Year:
                        res = "Result: "+time.toYears()+" "+toC;
                        break;
                }
                break;
            case SPEED:
                ForSpeed speed = new ForSpeed(fromC , Svalue);
                switch (toC){
                    case ForSpeed.CmPerSec:
                        res = "Result: "+speed.toCmPerSec()+" "+toC;
                        break;
                    case ForSpeed.FtPerSec:
                        res = "Result: "+speed.toFtPerSec()+" "+toC;
                        break;
                    case ForSpeed.KmPerHr:
                        res = "Result: "+speed.toKmPerHr()+" "+toC;
                        break;
                    case ForSpeed.Knot:
                        res = "Result: "+speed.toKnot()+" "+toC;
                        break;
                    case ForSpeed.Mach:
                        res = "Result: "+speed.toMach()+" "+toC;
                        break;
                    case ForSpeed.MiPerHr:
                        res = "Result: "+speed.toMiPerHr()+" "+toC;
                        break;
                    case ForSpeed.MPerSec:
                        res = "Result: "+speed.toMPerSec()+" "+toC;
                        break;
                }
                break;
            case ENERGY:
                ForEnergy energy = new ForEnergy(fromC,Svalue);
                switch (toC){
                    case ForEnergy.CAL:
                        res = "Result: "+energy.toCal()+" "+toC;
                        break;
                    case ForEnergy.EV:
                        res = "Result: "+energy.toEv()+" "+toC;
                        break;
                    case ForEnergy.FCAL:
                        res = "Result: "+energy.toFCal()+" "+toC;
                        break;
                    case ForEnergy.J:
                        res = "Result: "+energy.toJ()+" "+toC;
                        break;
                    case ForEnergy.KJ:
                        res = "Result: "+energy.toKj()+" "+toC;
                        break;
                    case ForEnergy.FTPOUNDS:
                        res = "Result: "+energy.toFootPounds()+" "+toC;
                        break;
                }
                break;
            case VOLUME:
                ForVolume volume = new ForVolume(fromC , Svalue);
                switch (toC){
                    case ForVolume.CUBICFT:
                        res = "Result: "+volume.toCubicFt()+" "+toC;
                        break;
                    case ForVolume.CUBICINCH:
                        res = "Result: "+volume.toCubicInch()+" "+toC;
                        break;
                    case ForVolume.CUBICMETRE:
                        res = "Result: "+volume.toCubicMetre()+" "+toC;
                        break;
                    case ForVolume.CUBICYARD:
                        res = "Result: "+volume.toCubicYard()+" "+toC;
                        break;
                    case ForVolume.CUPS:
                        res = "Result: "+volume.toCups()+" "+toC;
                        break;
                    case ForVolume.FLDONC:
                        res = "Result: "+volume.toFluidOunce()+" "+toC;
                        break;
                    case ForVolume.GALL:
                        res = "Result: "+volume.toGall()+" "+toC;
                        break;
                    case ForVolume.LTRS:
                        res = "Result: "+volume.toLitres()+" "+toC;
                        break;
                    case ForVolume.MILLILITRS:
                        res = "Result: "+volume.toMilliLitres()+" "+toC;
                        break;
                    case ForVolume.PINTS:
                        res = "Result: "+volume.toPints()+" "+toC;
                        break;
                    case ForVolume.QUARTS:
                        res = "Result: "+volume.toQuarts()+" "+toC;
                        break;
                    case ForVolume.TEASPOON:
                        res = "Result: "+volume.toTeaSpoon()+" "+toC;
                        break;
                }
                break;
            case DIGITALSTORAGE:
                ForDigitalStorage digiStorage = new ForDigitalStorage(fromC , Svalue);
                switch(toC){
                    case ForDigitalStorage.Bit:
                        res = "Result: "+digiStorage.toBit()+" "+toC;
                        break;
                    case ForDigitalStorage.Bytes:
                        res = "Result: "+digiStorage.toBytes()+" "+toC;
                        break;
                    case ForDigitalStorage.Ebi:
                        res = "Result: "+digiStorage.toExabits()+" "+toC;
                        break;
                    case ForDigitalStorage.Eby:
                        res = "Result: "+digiStorage.toExaBytes()+" "+toC;
                        break;
                    case ForDigitalStorage.Gbi:
                        res = "Result: "+digiStorage.toGigabits()+" "+toC;
                        break;
                    case ForDigitalStorage.Gby:
                        res = "Result: "+digiStorage.toGigabytes()+" "+toC;
                        break;
                    case ForDigitalStorage.Kbi:
                        res = "Result: "+digiStorage.toKilobits()+" "+toC;
                        break;
                    case ForDigitalStorage.Kby:
                        res = "Result: "+digiStorage.toKilobytes()+" "+toC;
                        break;
                    case ForDigitalStorage.Mbi:
                        res = "Result: "+digiStorage.toMegabits()+" "+toC;
                        break;
                    case ForDigitalStorage.Mby:
                        res = "Result: "+digiStorage.toMegabytes()+" "+toC;
                        break;
                    case ForDigitalStorage.Nibble:
                        res = "Result: "+digiStorage.toNibble()+" "+toC;
                        break;
                    case ForDigitalStorage.Pbi:
                        res = "Result: "+digiStorage.toPetabits()+" "+toC;
                        break;
                    case ForDigitalStorage.Pby:
                        res = "Result: "+digiStorage.toPetabytes()+" "+toC;
                        break;
                    case ForDigitalStorage.Tbi:
                        res = "Result: "+digiStorage.toTerabits()+" "+toC;
                        break;
                    case ForDigitalStorage.Tby:
                        res = "Result: "+digiStorage.toTerabytes()+" "+toC;
                        break;
                    case ForDigitalStorage.Ybi:
                        res = "Result: "+digiStorage.toYottaBits()+" "+toC;
                        break;
                    case ForDigitalStorage.Yby:
                        res = "Result: "+digiStorage.toYottaBytes()+" "+toC;
                        break;
                    case ForDigitalStorage.Zbi:
                        res = "Result: "+digiStorage.toZettaBits()+" "+toC;
                        break;
                    case ForDigitalStorage.Zby:
                        res = "Result: "+digiStorage.toZettaBytes()+" "+toC;
                        break;
                }
                break;
            case TEMPERATURE:
                ForTemperature temp = new ForTemperature(fromC,Svalue);
                switch (toC){
                    case ForTemperature.Cel:
                        res = "Result: "+temp.toCelsius()+" "+toC;
                        break;
                    case ForTemperature.Fah:
                        res = "Result: "+temp.toFahrenheit()+" "+toC;
                        break;
                    case ForTemperature.Kel:
                        res = "Result: "+temp.toKelvin()+" "+toC;
                        break;
                    case ForTemperature.Rankine:
                        res = "Result: "+temp.toRankine()+" "+toC;
                        break;
                }
                break;
            case CurrencyFetcher.CURRENCY:
                CurrencyFetcher fetcher = new CurrencyFetcher(fromC , toC , value);
                fetcher.start();
                Alert popUp = new Alert(Alert.AlertType.INFORMATION);
                popUp.setContentText("OK,Calculating");
                ButtonType Ok = new ButtonType("OK");
                Optional<ButtonType> clickedButton = popUp.showAndWait();
                if(clickedButton.isPresent() && clickedButton.get().equals(Ok)){
                    System.out.println("Something");
                }
                res = "Result : "+fetcher.getConversion();
                break;
        }


        conversionsResultTextField.setText(res);
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
