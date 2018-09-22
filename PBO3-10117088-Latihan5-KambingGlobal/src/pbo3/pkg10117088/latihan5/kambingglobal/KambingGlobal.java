/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117088.latihan5.kambingglobal;

/**
 *
 * @author
 * NAMA         : Rio Yudha Pratama
 * KELAS        : IF-3
 * NIM          : 10117088
 * Deklarasi    : Program ini berisi kombinasi atau hubungan nilai yang 
 *                tertulis sebelmnya pada public class dan bisa ditambahkan
 *                
 */


public class KambingGlobal {
    //variabel jumlahkambing menjadi variabel instance
    int jumlahKambing = 88;   

    /**
     * @param args the command line arguments
     */
        //methode untuk menampilkan jumlah kambing
        public void getJumlahKambing() {
            System.out.println("Jumlah Kambing: " + jumlahKambing);
        }
        
        public void tambahKambing() {
            jumlahKambing = jumlahKambing + 5;
            System.out.println("Jumlah kambing setelah ditambah: " + 
                                jumlahKambing);
        }
        
    public static void main(String[] args) {
        // TODO code application logic here
        KambingGlobal kambingSusu = new KambingGlobal();
        
        //menampilkan jumlah kambing yang ada saat program pertama x berjalan
        kambingSusu.getJumlahKambing();
        
        //Menambah satu kambing
        kambingSusu.tambahKambing();
        
        // Menampilkan jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
        
    }
    
}
