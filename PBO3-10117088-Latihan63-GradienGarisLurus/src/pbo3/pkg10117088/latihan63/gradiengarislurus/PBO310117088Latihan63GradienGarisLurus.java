/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117088.latihan63.gradiengarislurus;

/**
 * NAMA      : Rio Yudha Pratama
 * KELAS     : PBO3
 * NIM       : 10117088
 * DEKLARASI : Program ini berfungsi menampilkan data walk, breath, eat
 */
public class PBO310117088Latihan63GradienGarisLurus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Koordinat koordinat1 = new Koordinat(2, 10, 5, 7);
        Koordinat koordinat2 = new Koordinat(5, 1, 3, 12);
        
        System.out.println("Garis yang melalui titik ("+ koordinat1.getX1()+","
                +koordinat1.getY1()+") dan ("+koordinat1.getX2()+","+koordinat1.getY2()+")");
        System.out.println("memiliki gradien sebesar "+koordinat1.hitungGradien());

        System.out.println("\nGaris yang melalui titik ("+ koordinat2.getX1()+","
                +koordinat2.getY1()+") dan ("+koordinat2.getX2()+","+koordinat2.getY2()+")");
        System.out.println("memiliki gradien sebesar "+koordinat2.hitungGradien());
        
    }
    
}
