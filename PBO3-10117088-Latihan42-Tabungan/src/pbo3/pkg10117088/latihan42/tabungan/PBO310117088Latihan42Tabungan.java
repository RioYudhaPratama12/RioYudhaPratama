/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117088.latihan42.tabungan;

import java.util.Scanner;

/**
 * NAMA      : Rio Yudha Pratama
 * KELAS     : PBO3
 * NIM       : 10117088
 * DEKLARASI : Program ini berisi informasi tabungan ( Saldo awal, jumlah uang yang diambil dan saldo sekarang
 * 
 */
public class PBO310117088Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn1 = new Scanner(System.in);
        Tabungan tabungan = new Tabungan();
        System.out.println("====Program Penarikan Uang====");
        System.out.println("Masukkan Saldo Awal : ");
        int x = tabungan.Tabungan(scn1.nextInt());
        System.out.println("Jumlah Uang yang diambil : ");
        int y = tabungan.Tabungan(scn1.nextInt());
        System.out.println("Saldo anda sekarang : "+(tabungan.Tabungan(x)-tabungan.Tabungan(y)));
        
    }
    
}
