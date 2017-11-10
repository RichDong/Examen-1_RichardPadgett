package examen.pkg1_richardpadgett;

import java.util.ArrayList;

public class Persona {

    String nombre;
    String pass;
    String edad;
    String ID;
    String sexo;
    String estadoc;
    ArrayList<String> mensajes = new ArrayList();

    public Persona() {
    }

    public Persona(String nombre,String pass, String edad, String ID, String sexo, String estadoc) {
        this.nombre = nombre;
        this.pass = pass;
        this.edad = edad;
        this.ID = ID;
        this.sexo = sexo;
        this.estadoc = estadoc;
    }

    public String getNombre() {
        return nombre;
    }
    

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
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

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", ID=" + ID + ", sexo=" + sexo + ", estadoc=" + estadoc + ", mensajes=" + mensajes + '}';
    }

}
