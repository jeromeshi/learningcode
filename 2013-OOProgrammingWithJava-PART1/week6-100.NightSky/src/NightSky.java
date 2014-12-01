
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jianrong
 */
public class NightSky {
    private double density;
    private int width;
    private int height;
    private int  starsInLastPrintal;
    
    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
        this.starsInLastPrintal = 0;
    }
    
    public NightSky(int width, int height){
        this.density = 0.1;
        this.width = width;
        this.height = height;
        this.starsInLastPrintal = 0;
    }
    
    public NightSky(double density, int width, int height){
        this.density = density;
        this.width = width;
        this.height = height;
        this.starsInLastPrintal = 0;
    }
    
    public void printLine() {
        Random t = new Random();
        
        for (int i =0; i < this.width; i++) {
            double d = t.nextDouble();
            if (d > this.density) {
                System.out.print(" ");
            } else {
                System.out.print("*");
                this.starsInLastPrintal++;
            }
        }
        System.out.println("");
        
    }
    
    public void print(){
       this.starsInLastPrintal = 0;
       for(int i = 0; i < this.height; i++) {
           printLine();
       }
    }
    
    public int starsInLastPrint() {
        return this.starsInLastPrintal;
    } 
    
}
