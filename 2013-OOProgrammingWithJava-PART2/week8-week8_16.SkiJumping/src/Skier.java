
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
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
public class Skier implements Comparable<Skier> {
    private String name;
    private int length;
    private ArrayList<Integer> len;
    private int points;
    private Random random;
    private int[] judge;

    public Skier(String name) {
        this.name = name;
        this.length = 0;
        this.len = new ArrayList<Integer>();
        this.points = 0;
        this.random = new Random();
        this.judge = new int[5];
    }
    
    public int jump() {
        int l = this.random.nextInt(60) + 60;
        this.len.add(l);
        this.length = l;
        return l;
    }
    
    public void judge() {
        for(int i = 0; i < 5; i++) {
            this.judge[i] = this.random.nextInt(10) + 10;
        }
    }
    
    public void addpoints() {
        
        this.judge();
        Arrays.sort(this.judge);
        this.points = this.points + judge[1] + judge[2] + judge[3] + this.getLength(); 
        
        
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public int[] getJudge() {
        return judge;
    }
    

    public int getPoints() {
        return points;
    }

    @Override
    public String toString() {
        return  name + " (" + points + " points)";
    }

    public ArrayList<Integer> getLen() {
        return len;
    }
    
    public int compareTo(Skier skier) {
        return  this.points - skier.getPoints() ;
    }
    
    
        
    
    
    
    
}
