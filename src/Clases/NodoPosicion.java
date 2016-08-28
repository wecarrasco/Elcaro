/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author jordi
 */
public class NodoPosicion {

    Posicion posicion;
    NodoPosicion siguiente;

    public NodoPosicion(Posicion posicion) {
        this.posicion = posicion;
        this.siguiente = null;
    }
    

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public NodoPosicion getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPosicion siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
