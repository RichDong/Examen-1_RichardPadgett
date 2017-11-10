
package examen.pkg1_richardpadgett;

import java.util.Date;


public class objetoshogar extends objetos {
    int t_vida;
    String a_casa;
    String instruccion;
    Date f_compra;

    
    public objetoshogar() {
    }

    public objetoshogar(int t_vida, String a_casa, String instruccion, Date f_compra, String color, String desc, int tamano, int calidad) {
        super(color, desc, tamano, calidad);
        this.t_vida = t_vida;
        this.a_casa = a_casa;
        this.instruccion = instruccion;
        this.f_compra = f_compra;
    }

    public objetoshogar(int t_vida, String a_casa, String instruccion, Date f_compra) {
        this.t_vida = t_vida;
        this.a_casa = a_casa;
        this.instruccion = instruccion;
        this.f_compra = f_compra;
    }

    public int getT_vida() {
        return t_vida;
    }

    public void setT_vida(int t_vida) {
        this.t_vida = t_vida;
    }

    public String getA_casa() {
        return a_casa;
    }

    public void setA_casa(String a_casa) {
        this.a_casa = a_casa;
    }

    public String getInstruccion() {
        return instruccion;
    }

    public void setInstruccion(String instruccion) {
        this.instruccion = instruccion;
    }

    public Date getF_compra() {
        return f_compra;
    }

    public void setF_compra(Date f_compra) {
        this.f_compra = f_compra;
    }

    @Override
    public String toString() {
        return "objetoshogar{" + "t_vida=" + t_vida + ", a_casa=" + a_casa + ", instruccion=" + instruccion + ", f_compra=" + f_compra + '}';
    }
    
}
