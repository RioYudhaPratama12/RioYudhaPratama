/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117088.latihan41.massajenis;

/**
 *
 * @author Rio Yudha Pratama
 */
public class Kubus {
    private int sisi;
    private int massa;

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }
    
    public int hitungVolume(int parSIsi){
        return sisi*sisi*sisi;
    }
    
    public int hitungMassaJenis(int parMassa, int volume){
        return massa / (sisi*sisi*sisi);
    }
    
}
