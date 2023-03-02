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
public class ListaEnlazada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List list = new List();
        list.agregar(1);
        list.agregar(2);
        list.agregar(3);
        list.agregar(4);
        list.agregar(5);
        list.imprimir();
        list.borrar(2);
        list.borrar(4);
        list.imprimir();
    }

}
