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
        try {
            InputStreamReader grd = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(grd);
            String opcion = "";
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

            while (!opcion.equals("S")) {
                System.out.println("Ingrese un número de opción y presione ENTER o presione S y luego ENTER para salir: \n");
                opcion = br.readLine();
            }

        } catch (IOException e) {
            System.out.println("Excepción: " + e);
        }
        System.out.println("Usted ha salido del programa... \n");
    }

}
