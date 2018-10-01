/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117088.latihan27.hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA         : Rio Yudha Pratama
 * KELAS        : IF-3
 * NIM          : 10117088
 * Deklarasi    : Program ini menampilkan huruf besar dan kecil 
 * saat ini
 * 
 */
public class PBO310117088Latihan27Hurufbesarkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        deklarasi variabel
        String kalimat;
        String hBesar;
        String hKecil;
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Masukkan Kalimat : ");
        kalimat = scn.nextLine(); // nextLine -> untuk input lebih dari 1 kata
        
        hBesar = kalimat.toUpperCase(); //ke format Kapital
        hKecil = kalimat.toLowerCase(); //ke format kecil
        
//        menampilkan hasil
        System.out.println("\n====Hasil Formatting====");
        System.out.println("Huruf Besar : "+ hBesar);
        System.out.println("Huruf Kecil : "+ hKecil);        
    }
    
}
