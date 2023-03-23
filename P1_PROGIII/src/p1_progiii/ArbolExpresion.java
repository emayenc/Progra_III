/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1_progiii;

import java.util.EmptyStackException;
import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class ArbolExpresion {

    Nodo raiz;
    public static String varIn="",varPre="",varPost="";

    public ArbolExpresion() {
        raiz = null;
    }

    public void construir(String expresion) {
        try {
            Stack<Nodo> pila = new Stack<Nodo>();
            for (int i = 0; i < expresion.length(); i++) {
                char caracter = expresion.charAt(i);

                if (caracter == '+' || caracter == '-' || caracter == '*' || caracter == '/' || caracter == '^' || caracter == '√') {
                    Nodo nuevoNodo = new Nodo(caracter);

                    if (pila.isEmpty() == false) {
                        nuevoNodo.nDerecho = pila.pop();
                    } else {
                        nuevoNodo.nDerecho = null;
                    }
                    if (pila.isEmpty() == false) {
                        nuevoNodo.nIzquierdo = pila.pop();
                    } else {
                        nuevoNodo.nIzquierdo = null;
                    }
                    pila.push(nuevoNodo);
                } else if (caracter == ')' || caracter == '(') {
                    //Excluir paréntesis
                } else {
                    Nodo nuevoNodo = new Nodo(caracter);
                    if (pila.isEmpty() == false) {
                        nuevoNodo.nDerecho = pila.pop();
                    } else {
                        nuevoNodo.nDerecho = null;
                    }
                    if (pila.isEmpty() == false) {
                        nuevoNodo.nIzquierdo = pila.pop();
                    } else {
                        nuevoNodo.nIzquierdo = null;
                    }
                    pila.push(nuevoNodo);
                }
            }
            raiz = pila.peek();
        } catch (EmptyStackException e) {
            JOptionPane.showMessageDialog(null, "Error en procesamiento de pila, revise la sintaxis de la expresión");

        }

    }

    public void imprimir(String modo) {
        switch (modo) {
            case "in":
                 imprimirInorder(raiz);
                 break;
            case"pre":
                 imprimirPreorder(raiz);
                 break;                 
            case"post":
                 imprimirPostorder(raiz);
                 break;                 
            default:
        }
    }

    private void imprimirInorder(Nodo nodo) {
        //String dato = "";
        if (nodo != null) {
            imprimirInorder(nodo.nIzquierdo);
            varIn+=nodo.valor + " ";
            imprimirInorder(nodo.nDerecho);
        }
        //return dato;
    }

    private void imprimirPreorder(Nodo nodo) {
        //String dato = "";
        if (nodo == null) {
            return;
        }
        varPre+=nodo.valor + " ";
        imprimirPreorder(nodo.nIzquierdo);
        imprimirPreorder(nodo.nDerecho);
        //return dato;
    }

    private void imprimirPostorder(Nodo nodo) {
        //String dato = "";
        if (nodo == null) {
            return ;
        }
        imprimirPostorder(nodo.nIzquierdo);
        imprimirPostorder(nodo.nDerecho);
        varPost+=nodo.valor + " ";
        //return dato;
    }
}
