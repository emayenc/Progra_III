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
public class ListaDoble {
    private Node primero;
    private Node ultimo;

    public ListaDoble() {
        this.primero = null;
        this.ultimo = null;
    }

    public boolean estaVacia() {
        return primero == null;
    }

    public void agregarAlInicio(int valor) {
        Node nuevo = new Node(valor);
        if (estaVacia()) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            nuevo.setSiguiente(primero);
            primero.setAnterior(nuevo);
            primero = nuevo;
        }
    }

    public void agregarAlFinal(int valor) {
        Node nuevo = new Node(valor);
        if (estaVacia()) {
            primero = nuevo;
            ultimo = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
            nuevo.setAnterior(ultimo);
            ultimo = nuevo;
        }
    }

    public void mostrarLista() {
        if (!estaVacia()) {
            Node actual = primero;
            while (actual != null) {
                System.out.print(actual.getValor() + " <-> ");
                actual = actual.getSiguiente();
            }
            System.out.println("NULL");
        } else {
            System.out.println("La lista está vacía.");
        }
    }
}
