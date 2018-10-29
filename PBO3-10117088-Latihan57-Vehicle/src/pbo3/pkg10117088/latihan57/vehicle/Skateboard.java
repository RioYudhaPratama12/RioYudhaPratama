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
public class Skateboard extends Vehicle{
    private double myBoardLenght;

    public Skateboard() {
        this.myBoardLenght=0;
        setMyBrand("Ally Skate");
        setMyModel("Rocket");
        setMyBoardLenght(54.5);
        
        System.out.println("\nSkateBoard");
        System.out.println("Brand : "+getMyBrand());
        System.out.println("Model : "+getMyModel());
        System.out.println("Panjangnya Board : "+getMyBoardLenght());
        
    }

    public double getMyBoardLenght() {
        return myBoardLenght;
    }

    public void setMyBoardLenght(double myBoardLenght) {
        this.myBoardLenght = myBoardLenght;
    }
    
    
    
}
