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
public class Nodo {

    String valor;
    Nodo nIzquierdo;
    Nodo nDerecho;

    public Nodo(String valor) {
        this.valor = valor;
        this.nIzquierdo = null;
        this.nDerecho = null;
    }

}