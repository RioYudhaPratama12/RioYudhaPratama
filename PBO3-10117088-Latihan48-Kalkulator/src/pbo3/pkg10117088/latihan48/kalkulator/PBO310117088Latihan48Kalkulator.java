/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117088.latihan48.kalkulator;

/**
 * NAMA      : Rio Yudha Pratama
 * KELAS     : PBO3
 * NIM       : 10117088
 * DEKLARASI : Program ini berisi perhitungan seperti kalkulator
 */
public class PBO310117088Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator objK = new Kalkulator();
        objK.setValue1(7.0);
        objK.setValue2(5.0);
        System.out.println("VALUE 1 = "+objK.getValue1());
        System.out.println("VALUE 2 = "+objK.getValue2());
        objK.setNameProject();
        objK.setNoteProject("");
        System.out.println("Result Add is = "+objK.add());
        System.out.println("Result Minus is = "+objK.minus());
        System.out.println("Result Multiple is = "+objK.multiplication());
        System.out.println("Result Division is = "+objK.division());
        
    }
}

