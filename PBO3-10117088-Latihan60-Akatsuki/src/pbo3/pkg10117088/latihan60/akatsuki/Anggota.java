/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117088.latihan60.akatsuki;

/**
 *
 * @author Rio Yudha Pratama
 */
public class Anggota extends Akatsuki{
    
    private String name;
    private String fromCountry;
    private String weapon;
    private String character_type;
    private String speciality;
    private String death;
    private boolean havePartner;

    public Anggota(String name, String fromCountry, String weapon, String character_type, String speciality, String death, boolean havePartner, String clothes, String goals) {
        super(clothes, goals);
        this.name = name;
        this.fromCountry = fromCountry;
        this.weapon = weapon;
        this.character_type = character_type;
        this.speciality = speciality;
        this.death = death;
        this.havePartner = havePartner;
    }
    
    public String getName() {
        return name;
    }
    
    public String getWeapon() {
        return weapon;
    }

    public String getCharacter_type() {
        return character_type;
    }

    public String getSpeciality() {
        return speciality;
    }

    public String getDeath() {
        return death;
    }

    public boolean isHavePartner() {
        return havePartner;
    }
    
    public void displayMember() {
        System.out.println("--------------------------------------------");
        System.out.println("Nama \t: " + name);
        System.out.println("--------------------------------------------");
        System.out.println("Desa Asal \t: " + fromCountry);
        System.out.println("Elemen  \t: " + weapon);
        System.out.println("Karakter \t: " + character_type);
        System.out.println("Keistimewaan \t: " + speciality);
        System.out.println("Kematian \t: " + death);
        if(isHavePartner()) {
            System.out.println("Tipe Misi \t: Tim");
        } else {
            System.out.println("Tipe Misi \t: Solo");
        }
        System.out.println();
    }
}