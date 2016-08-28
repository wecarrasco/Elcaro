package Clases;

import java.io.Serializable;
import java.util.ArrayList;

public class Registro implements Serializable {
    private int posicion;
    private static final long serialVersionUID = 666L;
    ArrayList <Campo> campos = new ArrayList<Campo>();
    

    public Registro() {
    }

    public Registro(int posicion,ArrayList <Campo> campos) {
        this.posicion = posicion;
        this.campos= campos;
    }
    
    public ArrayList<Campo> getCampos() {
        return campos;
    }

    public void setCampos(ArrayList<Campo> campos) {
        this.campos = campos;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
    
    
}
