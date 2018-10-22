/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117088.latihan49.biayaemaskawin;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 * NAMA      : Rio Yudha Pratama
 * KELAS     : PBO3
 * NIM       : 10117088
 * DEKLARASI : Program ini berisi perhitungan harga emas
 */
public class PBO310117088Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat mataUangIndonesia = (DecimalFormat) 
        DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRP = new DecimalFormatSymbols();
        
        formatRP.setCurrencySymbol("Rp.");
        formatRP.setMonetaryDecimalSeparator(',');
        formatRP.setGroupingSeparator('.');
        
        mataUangIndonesia.setDecimalFormatSymbols(formatRP);
        
       
        Emas objEmas = new Emas();
        objEmas.setHargaGram(570000);         
        objEmas.setBeratEmas(15.7);    
        
        System.out.println("====Aplikasi Hitung Harga Emas====");
        System.out.println("Harga Emas per Gram : Rp. "+ objEmas.getHargaGram());      
        System.out.println("Berat Emas : "+ objEmas.getBeratEmas());      
        System.out.printf("Total Yang Harus Dibayar : %s %n ", 
                           mataUangIndonesia.format(
                           objEmas.perhitungan(objEmas.getHargaGram(), 
                           objEmas.getBeratEmas())));
    
        
    }
    
}