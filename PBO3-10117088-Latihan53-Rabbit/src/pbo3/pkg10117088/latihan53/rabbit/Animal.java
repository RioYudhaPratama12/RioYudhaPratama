/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117088.latihan53.rabbit;

/**
 *
 * @author Rio Yudha Pratama
 */
public class Animal {
    protected boolean vegetarian;
    protected String eats;
    protected int noOfLeegs;
    
public Animal (boolean vegetarian, String food, int legs){
    this.vegetarian = vegetarian;
    this.eats = food;
    this.noOfLeegs = legs;
    
}

public boolean isVegetarian(){
    return vegetarian;
    
}

    public String getEats() {
        return eats;
    }

    public int getNoOfLeegs() {
        return noOfLeegs;
    }


    
}
