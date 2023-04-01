/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol_b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Administrador
 */
public class arbolB {

    public static void main(String[] args) {
        try {
            InputStreamReader grd = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(grd);
            System.out.println("Ingrese grado de árbol B: \n");
            String grado = br.readLine();
            int c = Integer.parseInt(grado); //Grado/Hijos
            int k = c - 1;    //claves
            String acumuladoClaves = "";
            String valorClave = "";
            b_tree bTree = new b_tree(c);

            /* for (int i = 0; i < k; i++) {
                System.out.println("Ingrese un valor de clave a insertar: \n");
                valorClave = br.readLine();
                bTree.inserta(Integer.parseInt(valorClave));
                acumuladoClaves += valorClave + " ";
            }*/
            do {
                System.out.println("Ingrese un valor de clave a insertar o ingrese S para salir: \n");
                valorClave = br.readLine();
                if (!valorClave.equals("S")) {
                    bTree.inserta(Integer.parseInt(valorClave));
                    acumuladoClaves += valorClave + " ";
                }
            } while (!valorClave.equals("S"));

            if (acumuladoClaves.length() > 0) {

                System.out.println("Se ingresaron los siguientes valores en el árbol B: " + acumuladoClaves + " \n");

                System.out.println("Ingrese la clave numérica a buscar: \n");
                String claveBusca = br.readLine();

                if (bTree.buscar(Integer.parseInt(claveBusca))) {
                    System.out.println("La clave ingresada SI se encuentra en el árbol B \n");
                } else {
                    System.out.println("La la clave ingresada NO se encuentra en el árbol B \n");
                }
                System.out.println("Ingrese la clave numérica a eliminar: \n");
                String claveElimina = br.readLine();

                if (bTree.buscar(Integer.parseInt(claveElimina))) {
                    System.out.println("Se procede a eliminar la clave: "+claveElimina);
                    bTree.eliminar(Integer.parseInt(claveElimina));
                } else {
                    System.out.println("La la clave ingresada NO se encuentra en el árbol B \n");
                }

            } else {
                System.out.println("NO se ingresaron  valores en el árbol B \n");
            }

        } catch (IOException e) {
            System.out.println("Excepción: " + e);
        }

    }
}
