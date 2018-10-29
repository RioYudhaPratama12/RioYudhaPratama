/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117088.latihan51.gajikaryawan;

import java.util.Scanner;

/**
 * NAMA      : Rio Yudha Pratama
 * KELAS     : PBO3
 * NIM       : 10117088
 * DEKLARASI : Program ini berisi perhitungan gaji karyawan
 */
public class PBO310117088Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn1 = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        Scanner scn3 = new Scanner(System.in);
        Scanner scn4 = new Scanner(System.in);
        Scanner scn5 = new Scanner(System.in);
        
        Karyawan kar = new Karyawan();
        Manager Mng = new Manager();
        
        System.out.println("====Program Perhitungan Gaji Karyawan====");
        System.out.print("Masukkan NIK : " );
        Mng.setNik(scn1.next());
        System.out.print("Masukkan Nama : ");
        Mng.setNama(scn2.nextLine());
        System.out.print("Masukkan Golongan (1/2/3) :");
        Mng.setGolongan(scn3.nextInt());
        System.out.print("Masukkan Jabatan (Kabag/Manager) : ");
        Mng.setJabatan(scn4.next());
        System.out.print("Masukkan Jumlah Kehadiran : ");
        Mng.setKehadiran(scn5.nextInt());
        
 
        System.out.println("\n====Hasil Perhitungan====");
        System.out.println("NIK \t\t: " + Mng.getNik());
        System.out.println("Nama \t\t: "+ Mng.getNama());
        System.out.println("Golongan \t: "+ Mng.getGolongan() );
        System.out.println("Jabatan \t: "+ Mng.getJabatan());
        
        System.out.println("\nTUNJANGAN GOLONGAN \t: "+ Mng.tunjanganGolongan(Mng.getGolongan()));
        System.out.println("TUNJANGAN JABATAN \t: " + Mng.tunjanganJabatan(Mng.getJabatan()));
        System.out.println("TUNJANGAN KEHADIRAN \t: " + Mng.tunjanganKehadiran(Mng.getKehadiran()));
        
        System.out.println("\nGAJI TOTAL \t\t:" +Mng.gajiTotal());
                
        
    }
    
}
