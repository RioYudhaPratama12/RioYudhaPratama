/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117088.latihan53.rabbit;

/**
 * NAMA      : Rio Yudha Pratama
 * KELAS     : PBO3
 * NIM       : 10117088
 * DEKLARASI : 
 */
public class PBO310117088Latihan53Rabbit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rabbit rabbit = new Rabbit("Peter", false, "grass", 4, "grey");
        System.out.println("Hello, His name is "+ rabbit.getName());
        System.out.println(rabbit.getName()+" is vegetarian? "+rabbit.isVegetarian());
        System.out.println(rabbit.getName()+" eats " +rabbit.getEats());
        System.out.println(rabbit.getName()+" has " +rabbit.getNoOfLeegs()+" legs.");
        System.out.println(rabbit.getName()+" color is " +rabbit.getColor());
        
        
    }
    
}
