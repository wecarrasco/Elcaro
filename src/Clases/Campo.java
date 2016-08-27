package Clases;

import java.io.Serializable;

public class Campo implements Serializable {
    private static final long serialVersionUID = 666L;
    String nombre;
    int tamano;
    String tipo;

    public Campo(String nombre, int tamano, String tipo) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
