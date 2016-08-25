/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Walther
 */
public class Tabla {

    private String nombre = "";
    ArrayList<Campo> listaCampos = new ArrayList<Campo>();

    public Tabla(String nombre, ArrayList<Campo> listaCampos) {
        this.nombre = nombre;
        this.listaCampos = listaCampos;
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

    public ArrayList<Campo> getListaCampos() {
        return listaCampos;
    }

    public void setListaCampos(ArrayList<Campo> listaCampos) {
        this.listaCampos = listaCampos;
    }

    @Override
    public String toString() {
        String camposDeTabla = "";
        for (Campo c : listaCampos) {
            camposDeTabla += "\n" + c.getNombre();
        }
        return camposDeTabla;
    }

}
