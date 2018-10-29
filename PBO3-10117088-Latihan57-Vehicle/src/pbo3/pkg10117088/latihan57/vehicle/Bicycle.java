/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117088.latihan57.vehicle;

/**
 *
 * @author Rio Yudha Pratama
 */
public class Bicycle extends Vehicle{
    private int myGearCount;

    public Bicycle() {
        this.myGearCount=0;
        setMyBrand("trek Bike");
        setMyModel("7.4FX");
        setMyGearCount(23);
        
        System.out.println("Bicycle");
        System.out.println("Brand : "+getMyBrand());
        System.out.println("Model : "+getMyModel());
        System.out.println("Jumlah Gear : "+getMyGearCount());
        
    }

    public int getMyGearCount() {
        return myGearCount;
    }

    public void setMyGearCount(int myGearCount) {
        this.myGearCount = myGearCount;
    }
    
    
    
}
