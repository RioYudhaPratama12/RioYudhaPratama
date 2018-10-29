/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117088.latihan55.handphone;

/**
 *
 * @author Rio Yudha Pratama
 */
public class Android extends Handphone{
    private String keyStore;

    public Android( String manufacture, String operatingSystem, String model, int harga) {
        super(manufacture, operatingSystem, model, harga);

    }

     public String getKeyStore() {
        return keyStore;
    }

    public void setKeyStore(String keyStore) {
        this.keyStore = keyStore;
    }
    
    
    
    
            
    
    
}
