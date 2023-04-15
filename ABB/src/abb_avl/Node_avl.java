/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abb_avl;

/**
 *
 * @author Administrador
 */
public class Node_avl {

    int key, height;
    Node_avl left;
    Node_avl right;

    Node_avl(int d) {
        key = d;
        height = 1;
    }

    public Node_avl() {
    }
    
}
