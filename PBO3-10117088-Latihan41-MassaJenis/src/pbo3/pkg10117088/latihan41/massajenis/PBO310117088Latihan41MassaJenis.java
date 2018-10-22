/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117088.latihan41.massajenis;

/**
 * NAMA      : Rio Yudha Pratama
 * KELAS     : PBO3
 * NIM       : 10117088
 * DEKLARASI : Program ini melakukan perhitungan massa jenis
 */
public class PBO310117088Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kubus kubus = new Kubus();
        System.out.println("====Massa Jenis Kubus=====");
        kubus.setSisi(5);
        kubus.setMassa(250);
        System.out.println("Sisi : "+kubus.getSisi());
        System.out.println("Massa : "+kubus.getMassa());
        System.out.println("");
        System.out.println("======Hasil Perhitungan=====");
        System.out.println("Volume : "+kubus.hitungVolume(0));
        System.out.println("Massa Jenis : "+kubus.hitungMassaJenis(0, 0));
        
        
        
        
    }
    
}
