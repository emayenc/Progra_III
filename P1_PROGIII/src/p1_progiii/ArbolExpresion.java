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

    public ArbolExpresion() {
        raiz = null;
    }

    public void construir(String expresion) {
        Stack<Nodo> pila = new Stack<Nodo>();
       
        try{
        for (int i = 0; i < expresion.length(); i++) {
            char caracter = expresion.charAt(i);

            if (caracter == '+' || caracter == '-' || caracter == '*' || caracter == '/' || caracter == '^' || caracter == '√') {
                Nodo nuevoNodo = new Nodo(caracter);
                nuevoNodo.nDerecho = pila.pop();
                nuevoNodo.nIzquierdo = pila.pop();
                pila.push(nuevoNodo);
            } else {
                Nodo nuevoNodo = new Nodo(caracter);
                pila.push(nuevoNodo);
            }
        }
        raiz = pila.peek();            
        }catch(EmptyStackException e){
            JOptionPane.showMessageDialog(null, "Error en procesamiento de pila, revise la sintaxis de la expresión");
         
        }

    }

    public void imprimir() {
        imprimirInorder(raiz);
        imprimirPreorder(raiz);
        imprimirPostorder(raiz);        
        
    }

    private void imprimirInorder(Nodo nodo) {
        if (nodo != null) {
            imprimirInorder(nodo.nIzquierdo);
            System.out.println(nodo.valor + " ");
            imprimirInorder(nodo.nDerecho);
        }
    }

     private void imprimirPreorder(Nodo nodo) {

        if (nodo == null) {
            return;
        }
        System.out.println(nodo.valor + " ");
        imprimirPreorder(nodo.nIzquierdo);
        imprimirPreorder(nodo.nDerecho);
    }

     private void imprimirPostorder(Nodo nodo) {

        if (nodo == null) {
            return;
        }
        imprimirPostorder(nodo.nIzquierdo);
        imprimirPostorder(nodo.nDerecho);
        System.out.println(nodo.valor + " ");
    }
}
