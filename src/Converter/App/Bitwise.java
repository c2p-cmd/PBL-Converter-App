package Converter.App;

public class Bitwise {

    public static String bitwiseCalculate(String stringBit1, String stringBit2, String inputNumberBase, Character bitwiseOperatorChosen) {
        String result = null;
        long op1;
        long op2;

        switch (inputNumberBase) {
            case Controller.BINARY: {
                op1 = Long.parseLong(stringBit1, 2);
                op2 = Long.parseLong(stringBit2, 2);
                result = toBin( bitwiseOperate(op1, op2, bitwiseOperatorChosen) );
                break;
            }
            case Controller.HEX: {
                op1 = Long.parseLong(stringBit1, 16);
                op2 = Long.parseLong(stringBit2, 16);
                result = toHex( bitwiseOperate(op1, op2, bitwiseOperatorChosen) );
                break;
            }
            case Controller.OCT: {
                op1 = Long.parseLong(stringBit1, 8);
                op2 = Long.parseLong(stringBit2, 8);
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

    public static Long bitwiseOperate (Long operand1, Long operand2, Character bitwiseOperatorChosen) {
        switch (bitwiseOperatorChosen) {
            case '&':
                return ( (operand1 & operand2) );
            case '|':
                return ( (operand1 | operand2) );
            case '^':
                return ( (operand1 ^ operand2) );
        }
        return null;
    }

    public static String bitwiseNOT(String stringBit1, String inputNumberBase) {
        String result = "";
        byte op1;
        switch (inputNumberBase) {
            case Controller.BINARY: {
                op1 = Byte.parseByte(stringBit1, 2);
                result = Integer.toBinaryString( ~op1 );
                break;
            }
            case Controller.HEX: {
                op1 = Byte.parseByte(stringBit1, 16);
                result = Integer.toHexString( ~op1 );
                break;
            }
            case Controller.OCT: {
                op1 = Byte.parseByte(stringBit1, 8);
                result = Integer.toOctalString( ~op1 );
                break;
            }
            case Controller.DEC: {
                op1 = Byte.parseByte(stringBit1, 10);
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

    public static String toBin(Long number) {
        return Long.toBinaryString(number);
    }

    public static String toHex(Long number) {
        return Long.toHexString(number);
    }

    public static String toOct(Long Number) {
        return Long.toOctalString(Number);
    }
}
