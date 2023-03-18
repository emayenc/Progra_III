/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1_progiii;

/**
 *
 * @author Administrador
 */
import java.util.Stack;

public class NotacionPolaca {
    public static double evaluar(String expression) {
        Stack<Double> stack = new Stack<>();

    String[] tokens = expression.split(" ");

        for (String token : tokens) {
            if (token.equals("+")) {

            } else if (token.equals("-")) {

            } else if (token.equals("*")) {

            } else if (token.equals("/")) {

            } else if (token.equals("^")) {

            }else if (token.equals("√")) {

            }  
            else {
                double operand = Double.parseDouble(token);
                stack.push(operand);
            }
        }

        return stack.pop();
    }
}
