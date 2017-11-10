
package examen.pkg1_richardpadgett;

import java.util.ArrayList;

/**
 *
 * @author richa
 */
public class Personal extends Persona{
    String ocupacion;
    int horario;
    int s_trabajando;
    int sueldo;

    public Personal() {
    }

    public Personal(String ocupacion, int horario, int s_trabajando, int sueldo, String nombre, String pass, String edad, String ID, String sexo, String estadoc) {
        super(nombre, pass, edad, ID, sexo, estadoc);
        this.ocupacion = ocupacion;
        this.horario = horario;
        this.s_trabajando = s_trabajando;
        this.sueldo = sueldo;
    }

    public Personal(String ocupacion, int horario, int s_trabajando, int sueldo) {
        this.ocupacion = ocupacion;
        this.horario = horario;
        this.s_trabajando = s_trabajando;
        this.sueldo = sueldo;
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

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public int getS_trabajando() {
        return s_trabajando;
    }

    public void setS_trabajando(int s_trabajando) {
        this.s_trabajando = s_trabajando;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Personal{" + "ocupacion=" + ocupacion + ", horario=" + horario + ", s_trabajando=" + s_trabajando + ", sueldo=" + sueldo + '}';
    }
    
}
