/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117088.latihan37.rataratanilai;

import java.util.Scanner;

/**
 * NAMA      : Rio Yudha Pratama
 * KELAS     : PBO3
 * NIM       : 10117088
 * DEKLARASI : Program ini menampilkan Program Rata-rata nilai
 */
public class PBO310117088Latihan37Rataratanilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mah = new Mahasiswa();
         Scanner scn = new Scanner(System.in);

         int n;
         System.out.print("Masukkan Banyaknya Mahasiswa : ");
         n = scn.nextInt();

         mah.HitungTotal(mah.nilaiMhs, n);
         mah.HitungRataRataNilaiMhs(mah.totalNilaiMhs, n);

        System.out.println("\nMaka, Rata-rata Nilainya adalah : "+
                mah.HitungRataRataNilaiMhs(mah.totalNilaiMhs,n));
        System.out.println("Developed by : Rio Yudha Pratama");
    }
    
}
