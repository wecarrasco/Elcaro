package Clases;

import java.io.Serializable;
import java.util.ArrayList;

public class Tabla implements Serializable {
    private static final long serialVersionUID = 666L;
    private String nombre = "";
    ArrayList <Campo> Campos = new ArrayList<Campo>();
    ArrayList<Registro> Registros = new ArrayList<Registro>();


    public Tabla(String nombre, Campo c) {
        this.nombre = nombre;
        Campos.add(c);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Campo> getCampos() {
        return Campos;
    }

    public void setCampos(ArrayList<Campo> Campos) {
        this.Campos = Campos;
    }

    public ArrayList<Registro> getRegistros() {
        return Registros;
    }

    public void setRegistros(ArrayList<Registro> Registros) {
        this.Registros = Registros;
    }   

    @Override
    public String toString() {
        String camposDeTabla = "";
        for (Registro r : Registros) {
            //camposDeTabla += "\n" + c.getNombre();
        }
        return camposDeTabla;
    }

}
