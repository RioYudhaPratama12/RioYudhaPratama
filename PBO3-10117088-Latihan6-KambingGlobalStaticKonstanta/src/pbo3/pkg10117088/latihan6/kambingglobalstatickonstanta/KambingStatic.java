/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117088.latihan6.kambingglobalstatickonstanta;

/**
 *
 * @author
 * NAMA         : Rio Yudha Pratama
 * KELAS        : IF-3
 * NIM          : 10117088
 * Deklarasi    : Dalam program ini berisi cotoh penggunaan dua public class 
 */
public class KambingStatic {

    /**
     * @param args the command line arguments
     */
 //NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";
    
    public static void main(String[] args) {
        // TODO code application logic here
        Mamalia.jumlahkambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak "
        + Mamalia.jumlahkambing);
    }
    
}
