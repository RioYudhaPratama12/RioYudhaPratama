/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117088.latihan20.targetsaldo;

/**
 *
 * @author
 * NAMA         : Rio Yudha Pratama
 * KELAS        : IF-3
 * NIM          : 10117088
 * Deklarasi    : Program ini berisi program untuk menghitung lama tabungan 
 * sampai mencapai saldo target
 * 
 */
public class PBO310117088Latihan20Targetsaldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double saldoAwal = 3500000;
        double bunga = 0.08;
        double target = 6000000;
        
        int i = 1;
        do{
            saldoAwal = saldoAwal * bunga + saldoAwal;
            System.out.println("Saldo di bulan ke-" + i + " "+ "Rp." + saldoAwal);
            i++;
        }while(saldoAwal <= target);
        
    }
    
}
