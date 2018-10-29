/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117088.latihan55.handphone;

/**
 * NAMA      : Rio Yudha Pratama
 * KELAS     : PBO3
 * NIM       : 10117088
 * DEKLARASI : Program ini berisi fungsi untuk menampilkan beberapa produk dari keluarga yang sama 
 */
public class PBO310117088Latihan55Handphone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Android android = new Android("Samsung", "Android", "Grand",3000000);
        android.displayProduct();
        android.setKeyStore("234ibfd3840fo");
        System.out.println("ANdroid Key Store : "+ android.getKeyStore());
        
        BlackBerry blackBerry = new BlackBerry("BlackB", "RIM", "Curve", 2000000);
        blackBerry.setPinBB("BHS249");
        blackBerry.displayProduct();
        System.out.println("PIN : "+ blackBerry.getPinBB());
        
        WindowsPhone windowsPhone = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000);
        windowsPhone.setWpKeyStore("UUUQIJWORJ");
        windowsPhone.displayProduct();
        System.out.println("Wp Key Store : "+ windowsPhone.getWpKeyStore());
        
    }
    
}
