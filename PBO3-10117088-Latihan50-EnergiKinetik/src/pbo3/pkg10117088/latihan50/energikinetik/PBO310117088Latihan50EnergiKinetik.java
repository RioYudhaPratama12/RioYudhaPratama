/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117088.latihan50.energikinetik;


/**
 * NAMA      : Rio Yudha Pratama
 * KELAS     : PBO3
 * NIM       : 10117088
 * DEKLARASI : Program ini berisi perhitungan energi
 */
public class PBO310117088Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
       
        Energi objEnergi = new Energi();

        objEnergi.setMassa(0.145);
        objEnergi.setKecepatan(25);
        System.out.println("Sebuah bola baseball dengan massa 145 gram dilempar"
                + " dengan kecepatan 25 m/s");
        System.out.println("a. Berapakah Energi Kinetiknya ?");
        System.out.println("b. Berapakah usaha yang dilakukan pada bola untuk "
                + "mencapai kecepatan ini jika dimulai dari keadaan diam ?");
        System.out.println("");
        System.out.println("=====JAWABAN=====");
        System.out.println("a. Energi Kinetiknya Adalah "
                + objEnergi.hitungEnergiKinetik() + " Joule");
        System.out.println("b. Usahanya adalah " + objEnergi.hitungUsaha()
                + " Joule");
        System.out.println("");
        System.out.println("Jadi energi kinetik dan usahanya bernilai sama yaitu "
                + "sebesar " + objEnergi.hitungUsaha()+" Joule");

    }

}