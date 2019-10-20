/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118904.latihan44.hukumohm;

/**
 *
 * @author Firman Alfinas
 */
public class Baterai {
    private float hambatan,kuatArus;
    
    public Baterai(){
        this.hambatan =12;
        this.kuatArus =3;
    }
    
    public Baterai(float kuatArus, float hambatan){
        System.out.println("Kuat Arus\t: " + kuatArus + " ampere");
        System.out.println("Hambatan\t: " + hambatan + " ohm");
        System.out.println("Hasil Tegangan\t: " + hitungTegangan() + " volt");
    }
    
    public float getHambatan() {
        return hambatan;
    }

    public float getKuatArus() {
        return kuatArus;
    }
    
    public float hitungTegangan(){
        return getKuatArus() * getHambatan();
    }
    
}
