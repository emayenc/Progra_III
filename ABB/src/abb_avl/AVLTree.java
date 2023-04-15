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
public class AVLTree {

    public static Node_avl root;

    public static Node_avl getRoot() {
        return root;
    }

    public static int height(Node_avl N) {
        if (N == null) {
            return 0;
        }
        return N.height;
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static Node_avl rightRotate(Node_avl y) {
        Node_avl x = y.left;
        Node_avl T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = max(height(y.left), height(y.right)) + 1;
        x.height = max(height(x.left), height(x.right)) + 1;

        return x;
    }

    public static Node_avl leftRotate(Node_avl x) {
        Node_avl y = x.right;
        Node_avl T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;

        return y;
    }

    public static int getBalance(Node_avl N) {
        if (N == null) {
            return 0;
        }
        return height(N.left) - height(N.right);
    }

    // método para insertar un nodo
    public static int insert(int key) {
        root = insertNode(root, key);
        return key;
    }

    public static Node_avl insertNode(Node_avl node, int key) {
        if (node == null) {
            return (new Node_avl(key));
        }

        if (key < node.key) {
            node.left = insertNode(node.left, key);
        } else if (key > node.key) {
            node.right = insertNode(node.right, key);
        } else {
            return node;
        }

        node.height = 1 + max(height(node.left), height(node.right));

        int balance = getBalance(node);

        if (balance > 1 && key < node.left.key) {
            return rightRotate(node);
        }

        if (balance < -1 && key > node.right.key) {
            return leftRotate(node);
        }

        if (balance > 1 && key > node.left.key) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (balance < -1 && key < node.right.key) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    public static Node_avl minValueNode(Node_avl node) {
        Node_avl current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    // método para borrar nodo
    public static int delete(int key) {
        root = deleteNode(root, key);
        return key;
    }    
    
    public static Node_avl deleteNode(Node_avl root, int key) {
        if (root == null) {
            return root;
        }

        if (key < root.key) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.key) {
            root.right = deleteNode(root.right, key);
        } else {
            if ((root.left == null) || (root.right == null)) {
                Node_avl temp;
                if (root.left != null) {
                    temp = root.left;
                } else {
                    temp = root.right;
                }

                if (temp == null) {
                    root = null;
                } else {
                    root = temp;
                }
            } else {
                Node_avl temp = minValueNode(root.right);
                root.key = temp.key;
                root.right = deleteNode(root.right, temp.key);
            }
        }

        if (root == null) {
            return root;
        }

        root.height = 1 + Math.max(height(root.left), height(root.right));

        int balance = getBalance(root);

        if (balance > 1 && getBalance(root.left) >= 0) {
            return rightRotate(root);
        }

        if (balance < -1 && getBalance(root.right) <= 0) {
            return leftRotate(root);
        }

        if (balance > 1 && getBalance(root.left) < 0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        if (balance < -1 && getBalance(root.right) > 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

   public static Node_avl search(int key) {
        return searchNode(root, key);
    }    
    
    public static Node_avl searchNode(Node_avl root, int key) {
        if (root == null || root.key == key) {
            return root;
        }

        if (key < root.key) {
            return searchNode(root.left, key);
        }

        return searchNode(root.right, key);
    }

    // Función para recorrer de modo inOrder el árbol binario
    public static void inorder(Node_avl nodoR) {

        //Se verifica si el nodo recibido raíz está vacio
        if (nodoR == null) {
            return;
        }

        inorder(nodoR.left);
        System.out.print(nodoR.key + " ");
        inorder(nodoR.right);
    }

    // Función para recorrer de modo preOrder el árbol binario
    public static void preorder(Node_avl nodoR) {

        //Se verifica si el nodo recibido raíz está vacio
        if (nodoR == null) {
            return;
        }
        System.out.print(nodoR.key + " ");
        preorder(nodoR.left);
        preorder(nodoR.right);
    }

    // Función para recorrer de modo postOrder el árbol binario
    public static void postorder(Node_avl nodoR) {

        //Se verifica si el nodo recibido raíz está vacio
        if (nodoR == null) {
            return;
        }
        postorder(nodoR.left);
        postorder(nodoR.right);
        System.out.print(nodoR.key + " ");
    }

}
