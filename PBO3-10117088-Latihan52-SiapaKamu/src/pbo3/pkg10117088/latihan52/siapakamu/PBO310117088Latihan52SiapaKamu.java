/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117088.latihan52.siapakamu;

import java.io.PrintStream;

/**
 * NAMA      : Rio Yudha Pratama
 * KELAS     : PBO3
 * NIM       : 10117088
 * DEKLARASI : Program ini berisi pengisian mahasiswa dan dosen 
 */

public class PBO310117088Latihan52SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //    Manusia manusia = new Manusia();
        Dosen dosen = new Dosen();

        
        dosen.setNip("41227829930");
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");
        
        System.out.println("NIP DOSEN : "+dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();
        
        Mahasiswa mahasiswa = new Mahasiswa();    
        mahasiswa.setNim("10110269");
        mahasiswa.setNama("Nindi");
        mahasiswa.setUmur(17);
        mahasiswa.setKelas("PBO3");
        
        System.out.println("\nNIM MAHASISWA : "+ mahasiswa.getNim());
        mahasiswa.siapaKamu();
        mahasiswa.kelasApa();
        
        
        
    }
    
}
