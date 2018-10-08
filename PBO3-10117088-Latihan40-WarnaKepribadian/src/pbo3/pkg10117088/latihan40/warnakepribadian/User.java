/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117088.latihan40.warnakepribadian;

import java.util.Scanner;

/**
 *
 * @author Rio Yudha Pratama
 */
public class User {
    
    public String namaUser;
    Scanner scn = new Scanner(System.in);

    public void memasukkanNama() {
        System.out.print("NAMA KAMU : ");
        namaUser = scn.next();
    }
    
}