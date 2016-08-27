package Clases;

import java.io.Serializable;
import java.util.ArrayList;

public class Tabla implements Serializable {
    private static final long serialVersionUID = 666L;
    private String nombre = "";
    ArrayList <Campo> listaCampos = new ArrayList<Campo>();
    ArrayList<Registro> listaRegistros = new ArrayList<Registro>();


    public Tabla(String nombre, Campo c) {
        this.nombre = nombre;
        listaCampos.add(c);
    }

    public Tabla(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Registro> getListaCampos() {
        return listaRegistros;
    }

    public void setListaCampos(ArrayList<Registro> listaRegistros) {
        this.listaRegistros = listaRegistros;
    }


    
    

    @Override
    public String toString() {
        String camposDeTabla = "";
        for (Registro r : listaRegistros) {
            //camposDeTabla += "\n" + c.getNombre();
        }
        return camposDeTabla;
    }

}
