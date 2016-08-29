package Clases;

import java.io.Serializable;
import java.util.ArrayList;

public class Registro implements Serializable {
    private int posicion;
    private static final long serialVersionUID = 666L;
    Campo campo; 
    String dato;
    Tabla tabla;
    
    
    public Registro() {
    }

    public Registro(String dato) {
        this.dato = dato;
    }
    
    public Registro(int posicion, Campo campo, String dato, Tabla tabla) {
        this.posicion = posicion;
        this.campo = campo;
        this.dato = dato;
        this.tabla = tabla;
    }        
    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public Campo getCampo() {
        return campo;
    }

    public void setCampo(Campo campo) {
        this.campo = campo;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public Tabla getTabla() {
        return tabla;
    }

    public void setTabla(Tabla tabla) {
        this.tabla = tabla;
    }

    @Override
    public String toString() {
        return "Registro{" + "dato=" + dato + '}';
    }
    
    
    
}
