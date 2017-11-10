
package examen.pkg1_richardpadgett;

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

    public Personal(String ocupacion, int horario, int s_trabajando, int sueldo) {
        this.ocupacion = ocupacion;
        this.horario = horario;
        this.s_trabajando = s_trabajando;
        this.sueldo = sueldo;
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
