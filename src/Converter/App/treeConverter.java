package Converter.App;

import java.util.*;

public class treeConverter {

    //Check For is it an operand
    static boolean isOperand(char x) {
        return (x >= 'a' && x <= 'z') ||
                (x >= 'A' && x <= 'Z');
    }

    //Check if it is an operator
    static boolean isOperator(char x) {
        switch (x) {
            case '+':
            case '-':
            case '/':
            case '*':
                return true;
        }
        return false;
    }
    //Find the Precedence of the value
    static int precedenceOf(char ch)
    {
        switch (ch)
        {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }
    //Prefix to Infix
    public static String PrefixToInfix(String str)
    {
        Stack<String> stack = new Stack<>();


        int l = str.length();


        for(int i = l - 1; i >= 0; i--)
        {
            char c = str.charAt(i);
            if (isOperator(c))
            {
                String op1 = stack.pop();
                String op2 = stack.pop();


                String temp = "(" + op1 + c + op2 + ")";
                stack.push(temp);
            }
            else
            {


                stack.push(c + "");
            }
        }
        return stack.pop();
    }

    //Prefix to Postfix
    static String PrefixToPostfix(String pre_exp)
    {

        Stack<String> s = new Stack<>();


        int length = pre_exp.length();


        for (int i = length - 1; i >= 0; i--)
        {

            if (isOperator(pre_exp.charAt(i)))
            {

                String op1 = s.peek();
                s.pop();
                String op2 = s.peek();
                s.pop();


                String temp = op1 + op2 + pre_exp.charAt(i);


                s.push(temp);
            }


            else {

                s.push(pre_exp.charAt(i) + "");
            }
        }
        return s.peek();
    }

    //Infix to Prefix
    static String InfixToPrefix(String infix)
    {
        Stack<Character> operators = new Stack<>();
        Stack<String> operands = new Stack<>();

        for (int i = 0; i < infix.length(); i++)
        {
            if (infix.charAt(i) == '(')
            {
                operators.push(infix.charAt(i));
            }
            else if (infix.charAt(i) == ')')
            {
                while (!operators.empty() &&
                        operators.peek() != '(')
                {
                    String op1 = operands.peek();
                    operands.pop();
                    String op2 = operands.peek();
                    operands.pop();
                    char op = operators.peek();
                    operators.pop();
                    String tmp = op + op2 + op1;
                    operands.push(tmp);
                }
                operators.pop();
            }
            else if (!isOperator(infix.charAt(i)))
            {
                operands.push(infix.charAt(i) + "");
            }
            else
            {
                while (!operators.empty() &&
                        precedenceOf(infix.charAt(i)) <=
                                precedenceOf(operators.peek()))
                {
                    String op1 = operands.peek();
                    operands.pop();
                    String op2 = operands.peek();
                    operands.pop();
                    char op = operators.peek();
                    operators.pop();
                    String tmp = op + op2 + op1;
                    operands.push(tmp);
                }
                operators.push(infix.charAt(i));
            }
        }
        while (!operators.empty())
        {
            String op1 = operands.peek();
            operands.pop();

            String op2 = operands.peek();
            operands.pop();

            char op = operators.peek();
            operators.pop();

            String tmp = op + op2 + op1;
            operands.push(tmp);
        }
        return operands.peek();
    }

    //Infix to Postfix
    static String InfixToPostfix(String exp) {
        String result;
        Stack<Character> stack = new Stack<>();
        StringBuilder resultBuilder = new StringBuilder();
        for (int i = 0; i<exp.length(); ++i) {
            char c = exp.charAt(i);
            if (Character.isLetterOrDigit(c))
                resultBuilder.append(c);
            else if (c == '(')
                stack.push(c);
            else if (c == ')')
            {
                while (!stack.isEmpty() &&
                        stack.peek() != '(')
                    resultBuilder.append(stack.pop());
                stack.pop();
            }
            else
            {
                while (!stack.isEmpty() && precedenceOf(c)
                        < precedenceOf(stack.peek())){

                    resultBuilder.append(stack.pop());
                }
                stack.push(c);
            }
        }
        StringBuilder resultBuilder1 = new StringBuilder(resultBuilder.toString());
        while (!stack.isEmpty()) {
            if(stack.peek() == '(')
                return "Invalid Expression";
            resultBuilder1.append(stack.pop());
        }
        result = resultBuilder1.toString();
        return result;
    }

    //Postfix to Infix
    // ref
    static String PostfixToInfix(String exp) {
        Stack<String> s = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            // System.out.println( "Character ch: " + ch );
            if ( isOperator( ch ) ) {
                String op1 = s.peek();
                s.pop();
                String op2 = s.peek();
                s.pop();
                s.push("(" + op2 + exp.charAt(i) + op1 + ")");
            } else {
                s.push(ch + "");
            }
        }
        if (!s.isEmpty())
            return s.peek();
        else
            return "";
    }

    //Postfix to prefix
    static String PostfixToPrefix(String post_exp)
    {
        Stack<String> s = new Stack<>();
        int length = post_exp.length();
        for (int i = 0; i < length; i++) {
            if (isOperator(post_exp.charAt(i))) {
                String op1 = s.peek();
                s.pop();
                String op2 = s.peek();
                s.pop();
                String temp = post_exp.charAt(i) + op2 + op1;
                s.push(temp);
            }
            else {
                s.push(post_exp.charAt(i) + "");
            }
        }
        StringBuilder ans = new StringBuilder();
        for (String i : s)
            ans.append(i);
        return ans.toString();
    }

    public static boolean infixValidator(String infix){
        int length = infix.length();
        char last = infix.charAt(length-1);
        char secondLast = infix.charAt(length-2);
        if( (Character.isLetter(last) || last ==')' ) && isOperator(secondLast)){
            return true;
        }
        return false;
    }

    public static boolean postfixValidator(String postfix){
        int length = postfix.length();
        char last = postfix.charAt(length-1);
        if(isOperator(last) && Character.isLetter(postfix.charAt(0)) ){
            return true;
        }
        return false;
    }

    public static boolean prefixValidator(String prefix){
        int length = prefix.length();
        char last = prefix.charAt(length-1);
        char secondLast=prefix.charAt(length-2);
        if( (Character.isLetter(last) && Character.isLetter(secondLast)) && isOperator(prefix.charAt(0))){
            return true;
        }
        return false;
    }

}
