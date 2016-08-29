package Clases;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;
import javax.swing.RowFilter.Entry;

public class Registro implements Serializable {

    private int posicion;
    private static final long serialVersionUID = 666L;
    Hashtable<String, Object> campos = new Hashtable<String, Object>();
    Tabla tabla;

    public Registro() {
    }

    public void addElementoRegistro(String campo, Object valor) {
        campos.put(campo, valor);
    }
    
    

    public Registro(int posicion, String campo, String dato, Tabla tabla) {
        this.posicion = posicion;
        campos.put(campo, tabla);
        this.tabla = tabla;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public Registro(int posicion, Tabla tabla) {
        this.posicion = posicion;
        this.tabla = tabla;
    }

    public Tabla getTabla() {
        return tabla;
    }

    public void setTabla(Tabla tabla) {
        this.tabla = tabla;
    }

    public Hashtable<String, Object> getCampos() {
        return campos;
    }

    public void setCampos(Hashtable<String, Object> campos) {
        this.campos = campos;
    }
    
    

    @Override
    public String toString() {
        String string = "";
        for (Map.Entry<String, Object> entry : campos.entrySet()) {
            string+=entry.getKey() + " tiene " + entry.getValue() + "\n";
        }
        return string;
    }

}
