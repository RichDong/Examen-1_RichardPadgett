package examen.pkg1_richardpadgett;

public class objetos {

    String color;
    String desc;
    int tamano;
    int calidad;

    public objetos() {
    }

    public objetos(String color, String desc, int tamano, int calidad) {
        this.color = color;
        this.desc = desc;
        this.tamano = tamano;
        this.calidad = calidad;

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

    @Override

   
    public String toString() {
        return "objetos{" + "color=" + color + ", desc=" + desc + ", tamano=" + tamano + ", calidad=" + calidad + '}';
    }

}
