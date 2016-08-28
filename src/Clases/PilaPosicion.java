/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author jordi
 */
public class PilaPosicion {
    
    NodoPosicion head;
    int tama�o;

    public PilaPosicion() {
    }
    

    public PilaPosicion(NodoPosicion head, int tama�o) {
        this.head = head;
        this.tama�o = tama�o;
    }
    
    public boolean estaVacio() {
        return head == null;
    }

    public void push(Posicion p) {
        if (this.head == null) {
            NodoPosicion n = new NodoPosicion(p);
            head = n;
        } else {
            NodoPosicion n = new NodoPosicion(p);
            n.setSiguiente(head);
            this.head = n;
        }
        tama�o++;
    }
    public NodoPosicion pop() {
        NodoPosicion eliminar = null;
        if (estaVacio()) {
            JOptionPane.showMessageDialog(null, "La lista se encuentra vacia");
        }
        if (tama�o == 1) {
            eliminar = head;
            head = null;
            this.tama�o--;
            return eliminar;
        } else {
            NodoPosicion actual = head;
            this.head = head.getSiguiente();
            this.tama�o--;
            return actual;
        }
    }

    public void imprimir() {
        NodoPosicion temp = head;
        while (temp.siguiente != null) {
            System.out.println(temp.getPosicion().toString());
            temp = temp.siguiente;
        }
    }
    
    public NodoPosicion peek(int pos){
        int tempNum = 0;
        NodoPosicion temp = head;
        while(temp.getSiguiente() != null){
            tempNum++;
            if (pos == tempNum) {
                break;
            }else{
                temp = temp.getSiguiente();
            }
        }
        return temp;
    }
    
    public int getTama(){
        return tama�o;
    }
    
}
