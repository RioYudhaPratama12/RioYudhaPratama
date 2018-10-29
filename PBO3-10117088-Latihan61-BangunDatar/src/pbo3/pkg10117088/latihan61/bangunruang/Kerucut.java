/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117088.latihan61.bangunruang;

/**
 *
 * @author Rio Yudha Pratama
 */
public class Kerucut extends BangunRuang{
    private double jarijari;
    private double tinggi;

    public double getJarijari() {
        return jarijari;
    }

    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
       

    @Override
    public double hitungVolume() {
        this.volume = (((3.14*jarijari*jarijari)*tinggi)/3);
        return this.volume;        
    
    }
    
    
    
}
