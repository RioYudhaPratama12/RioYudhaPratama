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
public class Bola extends BangunRuang {
    private double jarijari;
//
    

    public double getJarijari() {
        return jarijari;
    }

    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }
    
    @Override
    public double hitungVolume() {
        this.volume = (((3.14*jarijari*jarijari*jarijari)* 4) / 3);
        return this.volume;
        
    }    
    
}
