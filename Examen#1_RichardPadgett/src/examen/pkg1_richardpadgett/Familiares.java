
package examen.pkg1_richardpadgett;

import java.util.ArrayList;


public class Familiares extends Persona{
    String rol;
    String trabajo;
    int altura;
    int peso;
    ArrayList<objetos> ob = new ArrayList();

    public Familiares() {
    }

    public Familiares(String rol, String trabajo, int altura, int peso) {
        this.rol = rol;
        this.trabajo = trabajo;
        this.altura = altura;
        this.peso = peso;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public ArrayList<objetos> getOb() {
        return ob;
    }

    public void setOb(ArrayList<objetos> ob) {
        this.ob = ob;
    }

    @Override
    public String toString() {
        return "Familiares{" + "rol=" + rol + ", trabajo=" + trabajo + ", altura=" + altura + ", peso=" + peso + ", ob=" + ob + '}';
    }
    
}
