/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadobleenlazada;

/**
 *
 * @author Administrador
 */
public class Node {
    private int valor;
    private Node siguiente;
    private Node anterior;

    public Node(int valor) {
        this.valor = valor;
        this.siguiente = null;
        this.anterior = null;
    }

    public int getValor() {
        return valor;
    }

    public Node getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Node siguiente) {
        this.siguiente = siguiente;
    }

    public Node getAnterior() {
        return anterior;
    }

    public void setAnterior(Node anterior) {
        this.anterior = anterior;
    }    
}
