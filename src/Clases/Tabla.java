package Clases;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Hashtable;

public class Tabla implements Serializable {
    private static final long serialVersionUID = 666L;
    private String nombre = "";
    ArrayList <Campo> Campos = new ArrayList<Campo>();
    ArrayList<Registro> Registros = new ArrayList<Registro>();
    ArrayList <Hashtable<String, Object>> lista = new ArrayList <Hashtable<String, Object>>();
    
    public Tabla() {
    }

    public Tabla(String nombre, String key, Object value) {
        this.nombre = nombre;
        Hashtable <String, Object> l = new Hashtable<String, Object>();
        l.put(key, value);
        this.lista.add(l);
    }

    

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

    public void addElementoRegistro(int index, String campo, Object valor){
        lista.get(index).put(campo, valor);
    }
    
    public void addRegistro (Hashtable <String, Object> mapa){
        lista.add(mapa);
    }

    public ArrayList<Hashtable<String, Object>> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Hashtable<String, Object>> lista) {
        this.lista = lista;
    }
    
    
    
//    @Override
//    public String toString() {
//        String camposDeTabla = "";
//        for (Registro r : Registros) {
//            //camposDeTabla += "\n" + c.getNombre();
//        }
//        return camposDeTabla;
//    }

    @Override
    public String toString() {
        return "Tabla{" + "nombre=" + nombre + '}';
    }
    
}
