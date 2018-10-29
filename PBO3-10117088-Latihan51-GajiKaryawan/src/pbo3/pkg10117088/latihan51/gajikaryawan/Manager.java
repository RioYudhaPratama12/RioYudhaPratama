/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117088.latihan51.gajikaryawan;

/**
 *
 * @author Rio Yudha Pratama
 */
public class Manager extends Karyawan{
    private int kehadiran;
    private float tunjanganGolongan;
    private float tunjanganJabatan;
    private float tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }
    
    public float tunjanganKehadiran(int kehadiran){
        return kehadiran*10000;    
        
    }

    public float tunjanganJabatan(String jabatan){
        
        if(jabatan.equals("Manager")) {
            tunjanganJabatan = 2000000;
        }else if (jabatan.equals("Kabag")) {
            tunjanganJabatan = 1000000;
            
        }else {
            tunjanganJabatan = 0;
        }
        return tunjanganJabatan;
           
                     
    }    

    public float tunjanganGolongan(int golongan){
        switch (golongan){
            case 1: 
                tunjanganGolongan=500000;
                break;
            case 2:
                tunjanganGolongan=1000000;
                break;
            case 3:
                tunjanganGolongan=1500000;
                break;            
        }
        return tunjanganGolongan;
             
    }
    
    public float gajiTotal(){
        return tunjanganGolongan+tunjanganJabatan+tunjanganKehadiran(kehadiran);
    }

    
    
}
