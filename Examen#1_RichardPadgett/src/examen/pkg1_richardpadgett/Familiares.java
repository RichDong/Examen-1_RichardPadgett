
package examen.pkg1_richardpadgett;

import java.util.ArrayList;


public class Familiares extends Persona{
    String rol;
    String trabajo;
    String altura;
    String peso;
    ArrayList<objetos> ob = new ArrayList();

    public Familiares() {
    }

    public Familiares(String rol, String trabajo,String altura,String peso, String nombre, String pass, String edad, String ID, String sexo, String estadoc) {
        super(nombre, pass, edad, ID, sexo, estadoc);
        this.rol = rol;
        this.trabajo = trabajo;
        this.altura = altura;
        this.peso = peso;
    }
    
    

    public Familiares(String rol, String trabajo, String altura, String peso) {
        this.rol = rol;
        this.trabajo = trabajo;
        this.altura = altura;
        this.peso = peso;
       
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoc() {
        return estadoc;
    }

    public void setEstadoc(String estadoc) {
        this.estadoc = estadoc;
    }

    public ArrayList<String> getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList<String> mensajes) {
        this.mensajes = mensajes;
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

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
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
