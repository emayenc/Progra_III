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

    public static double evaluar(String expresion) {
        Stack<Double> pila = new Stack<>();
        String[] items = expresion.split(" ");
        String operadores = "[\\-*/=()^√\b]+";
        for (String item : items) {
            if (item.matches(operadores)) {
                Double operador2 = pila.pop();
                Double operador1 = pila.pop();
                Double resultado = aplicaOperacion(item, operador1, operador2);
                pila.push(resultado);
            } else {
                Double operando = Double.parseDouble(item);
                pila.push(operando);
            }
        }

        return pila.pop();
    }

    private static Double aplicaOperacion(String operador, Double operando1, Double operando2) {
        switch (operador) {
            case "+":
                return operando1 + operando2;
            case "-":
                return operando1 - operando2;
            case "*":
                return operando1 * operando2;
            case "/":
                return operando1 / operando2;
            case "^":
                return Math.pow(operando1, operando2);
            case "√":
                return Math.sqrt(operando1);
            default:
                throw new IllegalArgumentException("Operador inválido: " + operador);
        }
    }
}
