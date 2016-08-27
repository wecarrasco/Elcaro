package Clases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class bits {
    private String ruta = "";
    
    public void escribir(String ruta, Archivo a) throws FileNotFoundException, IOException{
        this.ruta = ruta;
        ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream(this.ruta));
        file.writeObject(a);
        file.close();
    }
    
    public Archivo leer(String ruta) throws FileNotFoundException, IOException, ClassNotFoundException{
        this.ruta = ruta;
        ObjectInputStream file = new ObjectInputStream(new FileInputStream(this.ruta));
        Archivo a = (Archivo)file.readObject();
        file.close();
        return a;
    }

    public void escribir2(String text, Archivo archivo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
