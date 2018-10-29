/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117088.latihan59.detectiveconan;

/**
 *
 * @author Rio Yudha Pratama
 */
public class Conan {
    protected String nama;
    protected String asal;
    protected String status;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    
    public void tampil(){
        System.out.println("Nama : "+ nama);
        System.out.println("Asal : "+ asal);
        System.out.println("Status : "+ status);
    }
    
    
    
}
