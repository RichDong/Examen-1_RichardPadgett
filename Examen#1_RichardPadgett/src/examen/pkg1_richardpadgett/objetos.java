
package examen.pkg1_richardpadgett;


public class objetos {
    String color;
    String desc;
    int tamano;
    int calidad;
    int s_trabajando;
    int sueldo;

    public objetos() {
    }

    public objetos(String color, String desc, int tamano, int calidad, int s_trabajando, int sueldo) {
        this.color = color;
        this.desc = desc;
        this.tamano = tamano;
        this.calidad = calidad;
        this.s_trabajando = s_trabajando;
        this.sueldo = sueldo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getCalidad() {
        return calidad;
    }

    public void setCalidad(int calidad) {
        this.calidad = calidad;
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
        return "objetos{" + "color=" + color + ", desc=" + desc + ", tamano=" + tamano + ", calidad=" + calidad + ", s_trabajando=" + s_trabajando + ", sueldo=" + sueldo + '}';
    }
    
}
