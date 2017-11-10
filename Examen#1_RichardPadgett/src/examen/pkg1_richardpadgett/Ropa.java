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
public class Ropa extends objetos {
    int talla_r;
    String material;
    String pais_e;

    public Ropa() {
    }

    public Ropa(int talla_r, String material, String pais_e) {
        this.talla_r = talla_r;
        this.material = material;
        this.pais_e = pais_e;
    }

    public int getTalla_r() {
        return talla_r;
    }

    public void setTalla_r(int talla_r) {
        this.talla_r = talla_r;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getPais_e() {
        return pais_e;
    }

    public void setPais_e(String pais_e) {
        this.pais_e = pais_e;
    }

    @Override
    public String toString() {
        return "Ropa{" + "talla_r=" + talla_r + ", material=" + material + ", pais_e=" + pais_e + '}';
    }
    
    
    
}
