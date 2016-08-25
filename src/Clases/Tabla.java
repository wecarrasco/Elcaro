package Clases;

import java.util.ArrayList;

public class Tabla {

    private String nombre = "";
    ArrayList<Registro> listaCampos = new ArrayList<Registro>();
    int posicion;

    public Tabla(String nombre, ArrayList<Registro> listaCampos, int posicion) {
        this.nombre = nombre;
        this.listaCampos = listaCampos;
        this.posicion = posicion;
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
        return listaCampos;
    }

    public void setListaCampos(ArrayList<Registro> listaCampos) {
        this.listaCampos = listaCampos;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
    

    @Override
    public String toString() {
        String camposDeTabla = "";
        for (Registro r : listaCampos) {
            //camposDeTabla += "\n" + c.getNombre();
        }
        return camposDeTabla;
    }

}
