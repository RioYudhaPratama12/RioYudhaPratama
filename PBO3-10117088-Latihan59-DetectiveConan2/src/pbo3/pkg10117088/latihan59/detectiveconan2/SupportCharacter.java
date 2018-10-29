/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117088.latihan59.detectiveconan2;

/**
 *
 * @author Rio Yudha Pratama
 */
public class SupportCharacter extends Character{
    private String related;

    

    public SupportCharacter(String related, String name, String from, boolean eyeglasses) {
        super(name, from, eyeglasses);
        this.related = related;

    }


    
    public String getRelated() {
        return related;
    }

    public void displayCharacter() {

        System.out.println("--------------------------------");
        System.out.println("Nama \t\t: " + name);
        System.out.println("--------------------------------");
        System.out.println("Dari \t\t: " + from);
        if(eyeglasses) {
            System.out.println("Kacamata \t: Iya");
        } else {
            System.out.println("Kacamata \t: Tidak");
        }

        System.out.println("Hubungan dengan tokoh utama \t: " + related);
        System.out.println();
    }
    
}
