/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol_b;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class b_tree {

    private static int t;
    private Nodo raiz;

    public b_tree() {
        this(2);
    }

    public b_tree(int t) {
        if (t < 2) {
            throw new IllegalArgumentException("El grado mínimo del árbol B debe ser 2");
        }
        this.t = t;
        this.raiz = new Nodo(true);
    }

    public void inserta(int llave) {
        if (raiz.nodoLleno(this.t)) {
            Nodo newRoot = new Nodo(false);
            newRoot.gethijo().add(raiz);
            separaNodo(newRoot, 0, raiz);
            raiz = newRoot;
        }
        insertaNormal(raiz, llave);
    }

    public boolean buscar(int llave) {
        return buscar(raiz, llave);
    }

    private boolean buscar(Nodo nodo, int llave) {
        int i = 0;
        while (i < nodo.getllaves().size() && llave > nodo.getllaves().get(i)) {
            i++;
        }
        if (i < nodo.getllaves().size() && llave == nodo.getllaves().get(i)) {
            return true;
        }
        if (nodo.esHoja()) {
            return false;
        }
        return buscar(nodo.gethijo().get(i), llave);
    }

    private void insertaNormal(Nodo nodo, int llave) {
        int i = nodo.getllaves().size() - 1;
        if (nodo.esHoja()) {
            while (i >= 0 && llave < nodo.getllaves().get(i)) {
                i--;
            }
            nodo.getllaves().add(i + 1, llave);
        } else {
            while (i >= 0 && llave < nodo.getllaves().get(i)) {
                i--;
            }
            i++;
            Nodo hijo = nodo.gethijo().get(i);
            if (hijo.nodoLleno(this.t)) {
                separaNodo(nodo, i, hijo);
                if (llave > nodo.getllaves().get(i)) {
                    i++;
                }
            }
            insertaNormal(nodo.gethijo().get(i), llave);
        }
    }

    private void separaNodo(Nodo padre, int indice, Nodo hijo) {
        Nodo hijoNuevo = new Nodo(hijo.esHoja());
        for (int i = 0; i < t - 1; i++) {
            hijoNuevo.getllaves().add(hijo.getllaves().remove(t));
        }
        if (!hijo.esHoja()) {
            for (int i = 0; i < t; i++) {
                hijoNuevo.gethijo().add(hijo.gethijo().remove(t));
            }
        }
        padre.getllaves().add(indice, hijo.getllaves().remove(t - 1));
        padre.gethijo().add(indice + 1, hijoNuevo);
    }

    public void eliminar(int llave) {
        eliminar(raiz, llave);
    }

    private void eliminar(Nodo nodo, int llave) {
        int indice = encontrarIndiceLlave(nodo, llave);

        if (indice < nodo.getllaves().size() && nodo.getllaves().get(indice) == llave) {
            if (nodo.esHoja()) {
                nodo.getllaves().remove(indice);
                return;
            }

            if (!nodo.gethijo().get(indice).esHoja()) {
                Nodo predecessor = obtienePredecesor(nodo, indice);
                int predecessorKey = predecessor.getllaves().get(predecessor.getllaves().size() - 1);
                nodo.getllaves().set(indice, predecessorKey);
                eliminar(predecessor, predecessorKey);
                return;
            }

            if (!nodo.gethijo().get(indice + 1).esHoja()) {
                Nodo successor = obtieneSucesor(nodo, indice);
                int successorKey = successor.getllaves().get(0);
                nodo.getllaves().set(indice, successorKey);
                eliminar(successor, successorKey);
                return;
            }

            Nodo hijoIzquierdo = nodo.gethijo().get(indice);
            Nodo hijoDerecho = nodo.gethijo().get(indice + 1);
            hijoIzquierdo.getllaves().add(llave);
            hijoIzquierdo.getllaves().addAll(hijoDerecho.getllaves());
            hijoIzquierdo.gethijo().addAll(hijoDerecho.gethijo());
            nodo.gethijo().remove(indice + 1);
            eliminar(hijoIzquierdo, llave);
        } else {
            Nodo hijo = nodo.gethijo().get(indice);
            if (hijo.esHoja()) {
                return;
            }
            if (hijo.getllaves().size() < t) {
                int leftIndex = indice - 1;
                int rightIndex = indice + 1;
                if (leftIndex >= 0 && nodo.gethijo().get(leftIndex).getllaves().size() >= t) {
                    giraDerecha(nodo, indice, hijo, nodo.gethijo().get(leftIndex));
                } else if (rightIndex < nodo.gethijo().size() && nodo.gethijo().get(rightIndex).getllaves().size() >= t) {
                    giraIzquierda(nodo, indice, hijo, nodo.gethijo().get(rightIndex));
                } else if (leftIndex >= 0) {
                    unificar(nodo, leftIndex, hijo, nodo.gethijo().get(leftIndex));
                    eliminar(nodo.gethijo().get(leftIndex), llave);
                } else if (rightIndex < nodo.gethijo().size()) {
                    unificar(nodo, indice, nodo.gethijo().get(rightIndex), hijo);
                    eliminar(hijo, llave);
                }
            }
            eliminar(hijo, llave);
        }
    }

    private void giraDerecha(Nodo padre, int padreIndex, Nodo hijoIzquierdo, Nodo hijoDerecho) {
        hijoIzquierdo.getllaves().add(padre.getllaves().get(padreIndex));
        padre.getllaves().set(padreIndex, hijoDerecho.getllaves().get(0));
        hijoIzquierdo.gethijo().add(hijoDerecho.gethijo().get(0));
        hijoDerecho.getllaves().remove(0);
        hijoDerecho.gethijo().remove(0);
    }

    private void giraIzquierda(Nodo padre, int padreIndex, Nodo hijoIzquierdo, Nodo hijoDerecho) {
        hijoDerecho.getllaves().add(0, padre.getllaves().get(padreIndex));
        padre.getllaves().set(padreIndex, hijoIzquierdo.getllaves().get(hijoIzquierdo.getllaves().size() - 1));
        hijoDerecho.gethijo().add(0, hijoIzquierdo.gethijo().get(hijoIzquierdo.gethijo().size() - 1));
        hijoIzquierdo.getllaves().remove(hijoIzquierdo.getllaves().size() - 1);
        hijoIzquierdo.gethijo().remove(hijoIzquierdo.gethijo().size() - 1);
    }

    private void unificar(Nodo padre, int padreIndex, Nodo hijoIzquierdo, Nodo hijoDerecho) {
        hijoIzquierdo.getllaves().add(padre.getllaves().get(padreIndex));
        hijoIzquierdo.getllaves().addAll(hijoDerecho.getllaves());
        hijoIzquierdo.gethijo().addAll(hijoDerecho.gethijo());
        padre.getllaves().remove(padreIndex);
        padre.gethijo().remove(padreIndex + 1);
        if (padre == raiz && padre.getllaves().isEmpty()) {
            raiz = hijoIzquierdo;
        }
    }

    private int encontrarIndiceLlave(Nodo nodo, int llave) {
        int indice = 0;
        while (indice < nodo.getllaves().size() && llave > nodo.getllaves().get(indice)) {
            indice++;
        }
        return indice;
    }

    private Nodo obtienePredecesor(Nodo nodo, int indice) {
        Nodo actual = nodo.gethijo().get(indice);
        while (!actual.esHoja()) {
            actual = actual.gethijo().get(actual.getllaves().size());
        }
        return actual;
    }

    private Nodo obtieneSucesor(Nodo nodo, int indice) {
        Nodo actual = nodo.gethijo().get(indice + 1);
        while (!actual.esHoja()) {
            actual = actual.gethijo().get(actual.getllaves().size());
        }
        return actual;
    }

}
