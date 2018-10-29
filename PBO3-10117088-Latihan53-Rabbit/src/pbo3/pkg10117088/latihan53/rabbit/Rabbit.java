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
public class Rabbit extends Animal{
    private String color;
    private String name;
    

    public Rabbit(boolean vegetarian, String food, int legs) {
        super(vegetarian, food, legs);
        
    }

    public Rabbit(String name, boolean vegetarian, String food, int legs, String color) {
        super(vegetarian, food, legs);
        this.name = name;
        this.vegetarian = vegetarian;
        this.eats = food;
        this.noOfLeegs = legs;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
    
    
    
}
