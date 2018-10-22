/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117088.latihan46.tandanyakamu;

import java.util.Scanner;

/**
 * NAMA      : Rio Yudha Pratama
 * KELAS     : PBO3
 * NIM       : 10117088
 * DEKLARASI : Program ini berisi hitung umur 
 */
public class PBO310117088Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        Age objA = new Age(2018);
        System.out.print("Masukan tahun Lahir Anda : ");
        objA.setYearBirth(scan.nextInt());
        System.out.println("");
        
        System.out.println("====Hasil Perhitungan Umur====");
        System.out.println("Tahun Lahir Anda "+objA.getYearBirth());
        System.out.println("Hari ini Tahun : "+objA.getYearNow());
        System.out.println("Umur kamu sampai saat ini adalah "+objA.hitungUmur
        ()+" tahun ");
        System.out.println("Tandanya Kamu "+objA.tandanyaKamu(objA.hitungUmur()));
        
    }
}
