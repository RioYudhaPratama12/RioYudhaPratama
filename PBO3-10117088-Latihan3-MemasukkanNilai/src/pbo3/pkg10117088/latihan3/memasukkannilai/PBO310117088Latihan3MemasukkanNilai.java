/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117088.latihan3.memasukkannilai;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA         : Rio Yudha Pratama
 * KELAS        : IF-3
 * NIM          : 10117088
 * Deklarasi    : Memasukkan Nilai Dari Keyboard
 */
public class PBO310117088Latihan3MemasukkanNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.print("Masukkan Nama Anda : ");
        Scanner scanner = new Scanner (System.in);
                
        String nama = scanner.next();
        System.out.println("Nama Anda Adalah " +nama);
        
    }
    
}
