/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117088.latihan62.livingthing;

/**
 * NAMA      : Rio Yudha Pratama
 * KELAS     : PBO3
 * NIM       : 10117088
 * DEKLARASI : Program ini berfungsi menampilkan data walk, breath, eat
 */
public class PBO310117088Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Human hmn = new Human();
        hmn.setNama("Rio Yudha Pratama");
        hmn.walk(hmn.getNama());
        hmn.breath(hmn.getNama());
        hmn.eat(hmn.getNama());
        
    }
    
}
