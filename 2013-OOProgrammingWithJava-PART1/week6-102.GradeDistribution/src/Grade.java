/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jianrong
 */
public class Grade {
    private int grade0;
    private int grade1;
    private int grade2;
    private int grade3;
    private int grade4;
    private int grade5;
    private int sum;
    private int sum0;
    
    public Grade() {
        this.grade0 = 0;
        this.grade1 = 0;
        this.grade2 = 0;
        this.grade3 = 0;
        this.grade4 = 0;
        this.grade5 = 0;
        this.sum = 0;
        this.sum0 = 0;
    }
    
    public void add(int t) {
        
        if (t < 0 || t >60){
            return;
        }else {
            if (t < 30) {
                this.sum++;
                this.grade0++;
        } else if (t < 35) {
            this.sum++;
            this.sum0++;
            this.grade1++;
        } else if (t < 40) {
            this.sum++;
            this.sum0++;
            this.grade2++;
        } else if (t < 45) {
            this.sum++;
            this.sum0++;
            this.grade3++;
        } else if (t < 50) {
            this.sum++;
            this.sum0++;
            this.grade4++;
        } else  {
            this.sum++;
            this.sum0++;
            this.grade5++;
        }
        }
    }
    
    public double percentage() {
        return this.sum0/(double)this.sum * 100;
    }
    
    public void printStar() {
        System.out.print("5: ");
        for(int i = 0; i < this.grade5; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print("4: ");
        for(int i = 0; i < this.grade4; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print("3: ");
        for(int i = 0; i < this.grade3; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print("2: ");
        for(int i = 0; i < this.grade2; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print("1: ");
        for(int i = 0; i < this.grade1; i++) {
            System.out.print("*");
        }
        System.out.println("");
        
        System.out.print("0: ");
        for(int i = 0; i < this.grade0; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
   
    
}
