/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1_progiii;

/**
 *
 * @author Administrador
 */
public class Literal {
    char nombre;
    double valor;

    public Literal(char nombre, double valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public Literal() {
    }


    public void setNombre(char nombre) {
        this.nombre = nombre;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public char getNombre() {
        return nombre;
    }

    public double getValor() {
        return valor;
    }
    
    
}
