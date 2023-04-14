/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abb;

/**
 *
 * @author Administrador
 */
public class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
