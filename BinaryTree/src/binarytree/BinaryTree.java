/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

/**
 *
 * @author Administrador
 */
public class BinaryTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Estructura del árbol binario y distribución de nodos fija
        int[] padre = {-1, 0, 0, 1, 1, 2, 2};
        // Distribución de nodos para el árbol          
        //                 0
        //              /     \
        //            1         2
        //          /   \     /   \
        //         3     4   5     6     

        System.out.println("                 0");
        System.out.println("              /     \\");
        System.out.println("            1         2");
        System.out.println("          /   \\     /   \\");
        System.out.println("         3     4   5     6");
        //Creación del árbol binario a partir de la estructura padre
        Node raiz = ArbolBinario.creaArbol(padre);
        System.out.print("Recorrido inOrder\n");
        ArbolBinario.inorder(raiz);
        System.out.print("\n");        
        System.out.print("Recorrido preOrder\n");        
        ArbolBinario.preorder(raiz);
        System.out.print("\n");        
        System.out.print("Recorrido postOrder\n");        
        ArbolBinario.postorder(raiz);        
        System.out.print("\n");
    }

}
