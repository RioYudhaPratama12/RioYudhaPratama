/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117088.latihan44.hukumohm;

/**
 *
 * @author Rio Yudha Pratama
 */
public class Baterai {
    private float kuatArus;
    private float hambatan;
    
  
    public Baterai(){
        
    }
    public double getKuatArus() {
        kuatArus=3;
        System.out.println("kuat Arus : "+kuatArus+" Ampere ");
        return kuatArus;
    }

    public double getHambatan() {
        hambatan=12;
        System.out.println("Hambatan : "+hambatan+" ohm ");
        return hambatan;
    }
    
    public double hitungTegangan(){
        return kuatArus*hambatan;
    }
    
}