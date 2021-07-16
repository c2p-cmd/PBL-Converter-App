package Converter.App;

public class Bitwise {

    public static String bitwiseCalculate(String stringBit1, String stringBit2, String inputNumberBase, Character bitwiseOperatorChosen) {
        String result = null;
        long op1;
        long op2;

        switch (inputNumberBase) {
            case Controller.BINARY: {
                op1 = Long.parseLong(stringBit1, 2);//Parsing value to binary form
                op2 = Long.parseLong(stringBit2, 2);//Parsing value to binary form
                result = toBin( bitwiseOperate(op1, op2, bitwiseOperatorChosen) );
                break;
            }
            case Controller.HEX: {
                op1 = Long.parseLong(stringBit1, 16);//Parsing value to Hexadecimal form
                op2 = Long.parseLong(stringBit2, 16);//Parsing value to Hexadecimal form
                result = toHex( bitwiseOperate(op1, op2, bitwiseOperatorChosen) );
                break;
            }
            case Controller.OCT: {
                op1 = Long.parseLong(stringBit1, 8);//Parsing value to Octal form
                op2 = Long.parseLong(stringBit2, 8);//Parsing value to Octal form
                result = toOct( bitwiseOperate(op1, op2, bitwiseOperatorChosen) );
                break;
            }
            case Controller.DEC: {
                op1 = Long.parseLong(stringBit1);
                op2 = Long.parseLong(stringBit2);
                result = String.valueOf( bitwiseOperate(op1, op2, bitwiseOperatorChosen) );
                break;
            }

        }

        return result;
    }

    //Calculating various bitwise operations
    public static Long bitwiseOperate (Long operand1, Long operand2, Character bitwiseOperatorChosen) {
        switch (bitwiseOperatorChosen) {
            case '&':
                return ( (operand1 & operand2) );
            case '|':
                return ( (operand1 | operand2) );
            case '^':
                return ( (operand1 ^ operand2) );
            case '+':
                return ( (operand1 + operand2) );
        }
        return null;
    }
    //For Negation
    public static String bitwiseNOT(String stringBit1, String inputNumberBase) {
        String result = "";
        long op1;
        switch (inputNumberBase) {
            case Controller.BINARY: {
                op1 = Long.parseLong(stringBit1, 2);
                result = Long.toBinaryString( ~op1 );
                break;
            }
            case Controller.HEX: {

                op1 = Long.parseLong(stringBit1, 16);
                result = Long.toHexString( ~op1 );
                break;
            }
            case Controller.OCT: {
                op1 = Long.parseLong(stringBit1, 8);
                result = Long.toOctalString( ~op1 );
                break;
            }
            case Controller.DEC: {
                op1 = Long.parseLong(stringBit1, 10);
                result = String.valueOf( ~op1 );
                break;
            }
        }
        // cleaning of string
        int oldLength = stringBit1.length();
        int newLength = result.length();
        StringBuilder newRes = new StringBuilder();
        for (int i = newLength-oldLength; i < newLength; i++) {
            newRes.append(result.charAt(i));
        }
        // assigning value back to result
        result = String.valueOf(newRes);
        return result;
    }

    //Validating for invalid inputs
    public static String toBin(Long number) {
        return Long.toBinaryString(number);
    }

    public static String toHex(Long number) {
        return Long.toHexString(number);
    }

    public static String toOct(Long Number) {
        return Long.toOctalString(Number);
    }

    public static boolean binaryValidator(String bit1 , String bit2 ,Boolean flag) {

        for(int i =0 ; i<bit1.length();i++) {
            if ( (   (bit1.charAt(i) !='0') && (bit1.charAt(i) !='1')  ) || (Character.isLetter(bit1.charAt(i))) ){
                return true;
            }
        }
        if(!flag){
            for(int i =0 ; i<bit2.length();i++){
                if (  ((bit2.charAt(i) !='0') && (bit2.charAt(i) !='1') ) || (Character.isLetter(bit2.charAt(i))) ) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean decimalValidator(String bit1, String bit2 ,Boolean flag ) {

        for(int i = 0 ; i< bit1.length() ;i++){
            if(Character.isLetter(bit1.charAt(i) ) ) {
                return true;
            }
        }

        if(!flag){
            for(int i = 0 ; i< bit2.length() ;i++){
                if(Character.isLetter(bit2.charAt(i) ) ) {
                    return true;
                }
            }

        }


        return false;
    }

    public static boolean hexdecimalValidator(String bit1, String bit2,Boolean flag) {

        for(int i = 0 ; i< bit1.length() ;i++){

            if ( !((bit1.charAt(i)>='0' && bit1.charAt(i)<='9' ) || ( bit1.charAt(i)>='A' &&  bit1.charAt(i)<='F' ) || ( bit1.charAt(i)>='a' && bit1.charAt(i)<='f' ) ) ) {

                return true;
            }
        }

        if(!flag) {
            for (int i = 0; i < bit2.length(); i++) {

                if (!((bit2.charAt(i) >= '0' && bit2.charAt(i) <= '9') || (bit2.charAt(i) >= 'A' && bit2.charAt(i) <= 'F') || (bit2.charAt(i) >= 'a' && bit2.charAt(i) <= 'f'))) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean octalValidator(String bit1, String bit2,Boolean flag )  {

        for(int i = 0 ; i< bit1.length() ;i++){

            if(Character.isLetter(bit1.charAt(i)) || bit1.charAt(i) > '7' ) {
                return true;
            }
        }

        if(!flag) {
            for (int i = 0; i < bit2.length(); i++) {

                if (Character.isLetter(bit2.charAt(i)) || (bit2.charAt(i) > '7')) {
                    return true;
                }
            }
        }
        return false;
    }
}
