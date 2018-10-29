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
public class DetectiveSMU extends Conan{
    private String sekolah;

    public DetectiveSMU(String sekolah, String nama, String asal, String status) {
        super(nama, asal, status);
        this.sekolah = sekolah;
    }

    public String getSekolah() {
        return sekolah;
    }

    public void setSekolah(String sekolah) {
        this.sekolah = sekolah;
    }
    
    
    
}
