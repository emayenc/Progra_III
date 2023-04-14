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
public class BinaryTree {

    Node root;

    public BinaryTree() {
        root = null;
    }

    // método para insertar un nodo
    public void insert(int data) {
        root = insertNode(root, data);
    }

    // método auxiliar para insertar nodo
    public Node insertNode(Node node, int data) {
        if (node == null) {
            node = new Node(data);
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
    public Node search(int data) {
        return searchNode(root, data);
    }

    // método auxiliar para buscar nodo
    public Node searchNode(Node node, int data) {
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
    public void delete(int data) {
        root = deleteNode(root, data);
    }

    // método auxiliar para borrar nodo
    public Node deleteNode(Node node, int data) {
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
    public int minValue(Node node) {
        int min = node.data;

        while (node.left != null) {
            min = node.left.data;
            node = node.left;
        }

        return min;
    }
}
