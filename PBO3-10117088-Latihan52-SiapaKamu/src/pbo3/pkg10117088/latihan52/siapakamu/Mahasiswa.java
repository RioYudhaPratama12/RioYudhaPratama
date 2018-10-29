/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117088.latihan52.siapakamu;

/**
 *
 * @author Rio Yudha Pratama
 */
public class Mahasiswa extends Manusia{
    private String nim;
    private String kelas;

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
    
    public void kelasApa(){
        System.out.println("Saya "+getNama()+" umur "+getUmur()+" tahun sedang belajar di kelas "+getKelas());
        
    }

    @Override
    public void siapaKamu() {
        System.out.println("Saya Mahasiswa");
   
    }
    
    
            
            
    
    
}
