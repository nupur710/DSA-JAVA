package random;

import java.util.Stack;

public class ShuntingYardAlgorithm {
    //precedence of operators
     static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;
        }
    }

    //2 operators for operators and output
    //read each token from l to r
    //if no, add to output stack
    //if operator, we need to check precedence
    /**
     * 2 stacks for operators and output. Read each token from l to r. If no,
     * add to output stack; if operator, we need to check precedence:
     * while there is an operator on the operator stack which has greater or
     * equal precedence, pop it & add to output stack. Push the current operator
     * onto the operator stack. If left parenthesis, add to operator stack.
     * If right paranthesis, pop operators from operator stack & add to output
     * stack until left parenthesis if found. Discard left parenthesis.
     * All tokens read- pop remaining operators from operator stack & add to output
     * stack
     */
    static String infixToPostfix(String infix) {
        int j= 0;
        StringBuilder output= new StringBuilder();
        Stack<Character> operatorStack= new Stack<>();
        for(int i= 0; i<infix.length(); i++) {
            char ch= infix.charAt(i);
            if(Character.isDigit(ch)) {
                StringBuilder number= new StringBuilder();
                number.append(ch);
                while(i+1 < infix.length() && Character.isDigit(infix.charAt(i+1))) {
                    i++;
                    number.append(infix.charAt(i));
                }
                output.append(number + " ");
            } else if(ch== '+' || ch== '-' || ch== '*' || ch== '/') {
                while(!operatorStack.isEmpty() && operatorStack.peek() != '('
                && precedence(operatorStack.peek()) >= precedence(ch)) {
                    output.append(operatorStack.pop() +" ");
                } operatorStack.push(ch);
            } else if(ch== '(') {
                operatorStack.push(ch);
            } else if(ch== ')') {
                while(operatorStack.peek()!= '(') {
                    output.append(operatorStack.pop()+" ");
                } operatorStack.pop();
            }
        } while(!operatorStack.isEmpty()) {
            output.append(operatorStack.pop()+" ");
        } return output.toString();
    }

    public static void main(String[] args) {
        String infix= "4+18/(9-3)";
        String postfix= infixToPostfix(infix);
        System.out.println("Result: " + postfix);
    }

}
