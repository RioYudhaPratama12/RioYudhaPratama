/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117088.latihan26.waktusaatini;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author
 * NAMA         : Rio Yudha Pratama
 * KELAS        : IF-3
 * NIM          : 10117088
 * Deklarasi    : Program ini berisi program untuk menampilkan waktu pada 
 * saat ini
 * 
 */
public class PBO310117088Latihan26Waktusaatini {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date date = new Date();
        Calendar cal = Calendar.getInstance();
        int daysOfWeek = cal.get(Calendar.DAY_OF_WEEK);// hari dalam format angka
        
//     format tanggal dan waktu
        SimpleDateFormat formatIndo = new SimpleDateFormat
        ("dd MMM yyyy HH:mm:ss");
        
//     data array -> nama hari Indonesia
     String[] strDays = new String[]{"Sabtu","Minggu","Senin","Selasa","Rabu"
             ,"Kamis","Jumat"};
        
//     menampilkannya sesuai format
     System.out.println("Hari ini adalah hari : "+(strDays[daysOfWeek])+" ,"
             +formatIndo.format(date));        
    }
    
}
