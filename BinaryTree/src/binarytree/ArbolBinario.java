/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Administrador
 */
public class ArbolBinario {
    // Función para construir un árbol binario apartir de un Array

    public static Node creaArbol(int[] parent) {
        // Se crea un mapa vacío para el árbol
        Map<Integer, Node> arbol = new HashMap<>();

        // Se van creando los nodos nuevos a partir de 0 y se van 
        // agregando al mapa
        for (int i = 0; i < parent.length; i++) {
            arbol.put(i, new Node(i));
        }

        // Se inicializa el nodo raíz
        Node root = null;

        // se recorre el array para construir el árbol
        for (int i = 0; i < parent.length; i++) {
            // Si el nodo padre actual es -1, se asigna el nodo
            // correspondiente al índice del recorrido como raíz
            if (parent[i] == -1) {
                root = arbol.get(i);
            } // De lo contrario, asigna al nodo correspondiente
            else {
                // Se obtiene el Padre del nodo actual
                Node ptr = arbol.get(parent[i]);

                // Si el nodo hijo del lado izquierdo está
                // ocupado, asigna al hijo derecho
                if (ptr.left != null) {
                    ptr.right = arbol.get(i);
                } // de lo contrario si el nodo hijo izquierdo 
                // está vacio le asigna el valor
                else {
                    ptr.left = arbol.get(i);
                }
            }
        }

        // Se retorna la raíz del árbol construido
        return root;
    }
    
    // Función para recorrer de modo inOrder el árbol binario
    public static void inorder(Node nodoR) {

        //Se verifica si el nodo recibido raíz está vacio
        if (nodoR == null) {
            return;
        }

        inorder(nodoR.left);
        System.out.print(nodoR.value + " ");
        inorder(nodoR.right);
    }
    // Función para recorrer de modo preOrder el árbol binario
    public static void preorder(Node nodoR) {

        //Se verifica si el nodo recibido raíz está vacio
        if (nodoR == null) {
            return;
        }
        System.out.print(nodoR.value + " ");
        preorder(nodoR.left);
        preorder(nodoR.right);
    }  
    // Función para recorrer de modo postOrder el árbol binario
    public static void postorder(Node nodoR) {

        //Se verifica si el nodo recibido raíz está vacio
        if (nodoR == null) {
            return;
        }
        postorder(nodoR.left);
        postorder(nodoR.right);
        System.out.print(nodoR.value + " ");        
    }      
}
