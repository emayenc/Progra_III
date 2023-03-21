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
import java.util.EmptyStackException;
import java.util.Stack;
import javax.swing.JOptionPane;

public class NotacionPolaca {

    public static double evaluar(String expresion) {
        Stack<String> pilaoperador = new Stack<>();
        Stack<Double> pilaoperando = new Stack<>();
        String operadores = "[\\-+*/^\\√\b]+", expresion2 = "";

        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);
            if (String.valueOf(c).matches(operadores)) {
                expresion2 = expresion2 + " " + String.valueOf(c) + " ";
            } else {
                expresion2 = expresion2 + String.valueOf(c);
            }
        }
        String[] items = expresion2.split(" ");
        try {
            for (String item : items) {
                if (!String.valueOf(item).matches("")) {
                    if (String.valueOf(item).matches(operadores)) {
                        pilaoperador.push(String.valueOf(item));
                    } else {
                        if (pilaoperando.size() > 1 && pilaoperador.size() == 1) {
                            Double operador2 = pilaoperando.pop();
                            Double operador1 = pilaoperando.pop();
                            Double resultado = aplicaOperacion(pilaoperador.pop(), operador1, operador2);
                            pilaoperando.push(resultado);
                        } else {
                            pilaoperando.push(Double.parseDouble(String.valueOf(item)));
                            if (pilaoperando.size() > 1 && pilaoperador.size() == 1) {
                                Double operador2 = pilaoperando.pop();
                                Double operador1 = pilaoperando.pop();
                                Double resultado = aplicaOperacion(pilaoperador.pop(), operador1, operador2);
                                pilaoperando.push(resultado);
                            } else {
                                if (pilaoperador.pop().matches("√")) {
                                    Double operador1 = pilaoperando.pop();
                                    Double resultado = aplicaOperacion("√", operador1, 0.00);
                                    pilaoperando.push(resultado);
                                }

                            }

                        }

                    }
                }

            }

            while (pilaoperando.size() > 1) {
                Double operador2 = pilaoperando.pop();
                Double operador1 = pilaoperando.pop();
                Double resultado = aplicaOperacion(pilaoperador.pop(), operador1, operador2);
                pilaoperando.push(resultado);
            }

            return pilaoperando.pop();

        } catch (EmptyStackException e) {

            JOptionPane.showMessageDialog(null, "Error en procesamiento de pila, revise la sintaxis de la expresión");
            return 0;
        }

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
