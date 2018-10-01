/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117088.latihan19.saldo;

/**
 *
 * @author
 * NAMA         : Rio Yudha Pratama
 * KELAS        : IF-3
 * NIM          : 10117088
 * Deklarasi    : Program ini berisi program untuk menghitung saldo 
 * selama 6 bulan
 * 
 */
public class PBO310117088Latihan19Saldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double saldoAwal = 2500000;
        double bunga = 0.15;
        
        int bulan=0;
        
        while (bulan <=5){
          bulan = bulan + 1;
          saldoAwal = saldoAwal * bunga + saldoAwal;
            System.out.println("Saldo di bulan ke-" + bulan + " Rp." + saldoAwal);

            
        }
        
    }
    
}
