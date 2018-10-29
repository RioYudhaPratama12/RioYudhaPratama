/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117088.latihan59.detectiveconan2;

/**
 * NAMA      : Rio Yudha Pratama
 * KELAS     : PBO3
 * NIM       : 10117088
 * DEKLARASI : Program ini menampilkan karakter conan
 */
public class PBO310117088Latihan59DetectiveConan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MainCharacter conan = new MainCharacter("Detective", "Menyelesaikan Kasus","Conan Edogawa","Tokyo",true);
        MainCharacter ran = new MainCharacter("Karate", "Pelajar SMU","Ran Mouri","Tokyo",false);
        MainCharacter kogoro = new MainCharacter("Detektif Terkenal", "Menyelesaikan Kasus", "Mouri Kogoro", "Tokyo", false);
        SupportCharacter eisuke = new SupportCharacter("Teman Sekelas Ran Mouri","Eisuke Hondo","Osaka",false);
        SupportCharacter heiji = new SupportCharacter("Detective", "Heiji Hattori", "Osaka", false);
        SupportCharacter eri = new SupportCharacter("Ibu Ran", "Kisaki Eri", "Tokyo", true);
        System.out.println("KARAKTER UTAMA");
        conan.displayCharacter();
        ran.displayCharacter();
        kogoro.displayCharacter();
        
        System.out.println("\nKARAKTER PEMBANTU");
        heiji.displayCharacter();
        eisuke.displayCharacter();
        eri.displayCharacter();
    }
    
}
