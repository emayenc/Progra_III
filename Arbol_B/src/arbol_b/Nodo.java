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
public class Nodo {

    private boolean hoja;
    private List<Integer> llaves;
    private List<Nodo> hijo;

    public Nodo(boolean hoja) {
        this.hoja = hoja;
        this.llaves = new ArrayList<>();
        this.hijo = new ArrayList<>();
    }

    public boolean esHoja() {
        return hoja;
    }

    public boolean nodoLleno(int t) {
        return llaves.size() == 2 * t - 1;
    }

    public List<Integer> getllaves() {
        return llaves;
    }

    public List<Nodo> gethijo() {
        return hijo;
    }
}
