package Clases;

import java.io.Serializable;
import java.util.ArrayList;


public class Archivo implements Serializable {
    private static final long serialVersionUID = 666L;
    ArrayList<Tabla> tablas = new ArrayList<Tabla>();
    //XML PROPIEDADES
    String usuario, password;

    public Archivo() {
    }
    
    public Archivo(Tabla t){
        tablas.add(t);
    }

    public Archivo(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public ArrayList<Tabla> getTablas() {
        return tablas;
    }

    public void setTablas(ArrayList<Tabla> tablas) {
        this.tablas = tablas;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
