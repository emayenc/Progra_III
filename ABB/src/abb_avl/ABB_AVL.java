/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abb_avl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Administrador
 */
public class ABB_AVL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String numeros = "[0-9]+";
        try {
            InputStreamReader grd = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(grd);
            String opcion = "";
            String valor = "";
            Node_abb nodo_abb = new Node_abb();
            Node_avl nodo_avl = new Node_avl();
            while (!opcion.equals("S")) {
                System.out.println("                        ***MENU GENERAL*** \n");
                System.out.println("**Árbol binario de búsqueda**               **Árbol BB AVL** \n");
                System.out.println("1: Insertar Nodo ABB                        7: Insertar Nodo AVL\n");
                System.out.println("2: Eliminar Nodo ABB                        8: Eliminar Nodo AVL\n");
                System.out.println("3: Buscar Nodo ABB                          9: Buscar Nodo AVL \n");
                System.out.println("                        **Recorrido**\n");
                System.out.println("4: Inorden ABB                              10: Inorden AVL\n");
                System.out.println("5: Preorden ABB                             11: Preorden AVL \n");
                System.out.println("6: Postorden ABB                            12: Postorden AVL \n");
                //System.out.println("\n");                
                System.out.println("Ingrese un número de opción y presione ENTER o presione S y luego ENTER para salir: \n");
                opcion = br.readLine();

                if (opcion.matches(numeros)) { //Determinamos si lo ingresado es un número para entrar a las opciones
                    switch (Integer.parseInt(opcion)) {
                        case 1:

                            System.out.println("Ingrese el valor del nodo: \n");
                            valor = br.readLine();
                            BinaryTree.insert(Integer.parseInt(valor));
                            break;
                        case 2:
                            System.out.println("Ingrese el valor del nodo a borrar: \n");
                            valor = br.readLine();
                            BinaryTree.delete(Integer.parseInt(valor));
                            break;
                        case 3:
                            Node_abb nodoResult = new Node_abb();
                            System.out.println("Ingrese el valor del nodo a buscar: \n");
                            valor = br.readLine();
                            nodoResult = BinaryTree.search(Integer.parseInt(valor));
                            if (nodoResult == null) {
                                System.out.println("***Valor no encontrado en árbol ABB*** \n");
                            } else {
                                System.out.println("El valor SI se encuentra en árbol ABB \n");
                            }
                            break;
                        case 4:
                            System.out.println("Ordenamiento Inorden: \n");
                            BinaryTree.inorder(BinaryTree.root);
                            System.out.println("\n");
                            break;
                        case 5:
                            System.out.println("Ordenamiento Preorden: \n");
                            BinaryTree.preorder(BinaryTree.root);
                            System.out.println("\n");
                            break;
                        case 6:
                            System.out.println("Ordenamiento Postorden: \n");
                            BinaryTree.postorder(BinaryTree.root);
                            System.out.println("\n");
                            break;
                        case 7:
                            System.out.println("Ingrese el valor del nodo: \n");
                            valor = br.readLine();
                            AVLTree.insert(Integer.parseInt(valor));
                            break;
                        case 8:
                            System.out.println("Ingrese el valor del nodo a borrar: \n");
                            valor = br.readLine();
                            AVLTree.delete(Integer.parseInt(valor));
                            break;
                        case 9:
                            Node_avl nodoResult2 = new Node_avl();
                            System.out.println("Ingrese el valor del nodo a buscar: \n");
                            valor = br.readLine();
                            nodoResult2 = AVLTree.search(Integer.parseInt(valor));
                            if (nodoResult2 == null) {
                                System.out.println("***Valor no encontrado en árbol AVL*** \n");
                            } else {
                                System.out.println("El valor SI se encuentra en árbol AVL \n");
                            }
                            break;
                        case 10:
                            System.out.println("Ordenamiento Inorden: \n");
                            AVLTree.inorder(AVLTree.root);
                            System.out.println("\n");
                            break;
                        case 11:
                            System.out.println("Ordenamiento Preorden: \n");
                            AVLTree.preorder(AVLTree.root);
                            System.out.println("\n");
                            break;
                        case 12:
                            System.out.println("Ordenamiento Postorden: \n");
                            AVLTree.postorder(AVLTree.root);
                            System.out.println("\n");
                            break;
                        default:
                            System.out.println("***OPCION INVALIDA*** \n");                            
                            break;
                    }
                }

            }

        } catch (IOException e) {
            System.out.println("Excepción: " + e);
        }
        System.out.println("Usted ha salido del programa... \n");
    }

}
