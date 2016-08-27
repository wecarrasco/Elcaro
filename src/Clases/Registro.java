package Clases;

import java.io.Serializable;
import java.util.ArrayList;

public class Registro implements Serializable {
    private static final long serialVersionUID = 666L;
    ArrayList <Campo> campos = new ArrayList<Campo>();
    

    public Registro() {
    }

    public ArrayList<Campo> getCampos() {
        return campos;
    }

    public void setCampos(ArrayList<Campo> campos) {
        this.campos = campos;
    }
    
    
    
}
