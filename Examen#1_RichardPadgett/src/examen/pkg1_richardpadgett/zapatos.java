/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg1_richardpadgett;

/**
 *
 * @author richa
 */
public class zapatos extends objetos {
    int talla;
    String tiposuela;
    int confort;

    public zapatos() {
    }

    public zapatos(int talla, String tiposuela, int confort) {
        this.talla = talla;
        this.tiposuela = tiposuela;
        this.confort = confort;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getTiposuela() {
        return tiposuela;
    }

    public void setTiposuela(String tiposuela) {
        this.tiposuela = tiposuela;
    }

    public int getConfort() {
        return confort;
    }

    public void setConfort(int confort) {
        this.confort = confort;
    }

    @Override
    public String toString() {
        return "zapatos{" + "talla=" + talla + ", tiposuela=" + tiposuela + ", confort=" + confort + '}';
    }
    
    
}
