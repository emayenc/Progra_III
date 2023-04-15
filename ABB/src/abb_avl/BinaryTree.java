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
public class BinaryTree {

    public static Node_abb root;

    public static Node_abb getRoot() {
        return root;
    }

    public BinaryTree() {
        root = null;
    }

    // método para insertar un nodo
    public static int insert(int data) {
        root = insertNode(root, data);
        return data;
    }

    // método auxiliar para insertar nodo
    public static Node_abb insertNode(Node_abb node, int data) {
        if (node == null) {
            node = new Node_abb(data);
            return node;
        }

        if (data < node.data) {
            node.left = insertNode(node.left, data);
        } else if (data > node.data) {
            node.right = insertNode(node.right, data);
        }

        return node;
    }

    // método para buscar un nodo
    public static Node_abb search(int data) {
        return searchNode(root, data);
    }

    // método auxiliar para buscar nodo
    public static Node_abb searchNode(Node_abb node, int data) {
        if (node == null || node.data == data) {
            return node;
        }

        if (data < node.data) {
            return searchNode(node.left, data);
        } else {
            return searchNode(node.right, data);
        }
    }

    // método para borrar nodo
    public static int delete(int data) {
        root = deleteNode(root, data);
        return data;
    }

    // método auxiliar para borrar nodo
    public static Node_abb deleteNode(Node_abb node, int data) {
        if (node == null) {
            return node;
        }

        if (data < node.data) {
            node.left = deleteNode(node.left, data);
        } else if (data > node.data) {
            node.right = deleteNode(node.right, data);
        } else {
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }

            node.data = minValue(node.right);

            node.right = deleteNode(node.right, node.data);
        }

        return node;
    }

    // método auxiliar para ubicar el valor mínimo de un sub-árbol
    public static int minValue(Node_abb node) {
        int min = node.data;

        while (node.left != null) {
            min = node.left.data;
            node = node.left;
        }

        return min;
    }

    // Función para recorrer de modo inOrder el árbol binario
    public static void inorder(Node_abb nodoR) {

        //Se verifica si el nodo recibido raíz está vacio
        if (nodoR == null) {
            return;
        }

        inorder(nodoR.left);
        System.out.print(nodoR.data + " ");
        inorder(nodoR.right);
    }

    // Función para recorrer de modo preOrder el árbol binario
    public static void preorder(Node_abb nodoR) {

        //Se verifica si el nodo recibido raíz está vacio
        if (nodoR == null) {
            return;
        }
        System.out.print(nodoR.data + " ");
        preorder(nodoR.left);
        preorder(nodoR.right);
    }

    // Función para recorrer de modo postOrder el árbol binario
    public static void postorder(Node_abb nodoR) {

        //Se verifica si el nodo recibido raíz está vacio
        if (nodoR == null) {
            return;
        }
        postorder(nodoR.left);
        postorder(nodoR.right);
        System.out.print(nodoR.data + " ");
    }
}
