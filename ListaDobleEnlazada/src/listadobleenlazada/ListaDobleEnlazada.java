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
public class ListaDobleEnlazada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaDoble lista = new ListaDoble();

        lista.agregarAlFinal(10);
        lista.agregarAlFinal(15);
        lista.agregarAlFinal(20);
        lista.agregarAlFinal(25);       
        lista.agregarAlFinal(30);         
        lista.agregarAlInicio(5);

        lista.mostrarLista();        
    }
    
}
