/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaenlazada;

/**
 *
 * @author Administrador
 */
class List {

    Node head;
    int size;

    public List() {
        this.head = head;
        this.size = 0;
    }

    public void agregar(int value) {
        Node newNode = new Node(value);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node currentNode = this.head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        this.size++;
    }

    public void borrar(int value) {
        if (this.head == null) {
            return;
        }
        if (this.head.value == value) {
            this.head = this.head.next;
            this.size--;
            return;
        }
        Node currentNode = this.head;
        while (currentNode.next != null) {
            if (currentNode.next.value == value) {
                currentNode.next = currentNode.next.next;
                this.size--;
                return;
            }
            currentNode = currentNode.next;
        }
    }

    public void imprimir() {
        if (this.head == null) {
            System.out.println("La lista está vacía");
            return;
        }
        Node currentNode = this.head;
        while (currentNode != null) {
            System.out.print(currentNode.value + " ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }
}
