/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117088.latihan61.bangunruang;

/**
 * NAMA      : Rio Yudha Pratama
 * KELAS     : PBO3
 * NIM       : 10117088
 * DEKLARASI : Program ini berisi perhitungan volume bola, kerucut, dan tabung
 */
public class PBO310117088Latihan61BangunRuang{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bola b = new Bola();
        b.setJarijari(7);
        System.out.println("\nHasil Perhitungan Volume Bola");
        System.out.println("Jari-Jari \t: "+ b.getJarijari());
        System.out.println("Volume Bola \t: "+ b.hitungVolume());
        
        Tabung t = new Tabung();
        t.setJarijari(10);
        t.setTinggi(21);
        System.out.println("\nHasil Perhitungan Volume Tabung");
        System.out.println("Jari-Jari \t: "+ t.getJarijari());
        System.out.println("Tinggi \t\t: "+ t.getTinggi());       
        System.out.println("Volume Tabung \t: "+ t.hitungVolume());

        Kerucut k = new Kerucut();
        k.setJarijari(9);
        k.setTinggi(14);
        System.out.println("\nHasil Perhitungan Volume Kerucut");
        System.out.println("Jari-Jari \t: "+ k.getJarijari());
        System.out.println("Tinggi \t\t: "+ k.getTinggi());       
        System.out.println("Volume Kerucut \t: "+ k.hitungVolume());
        
     
    }
    
}
