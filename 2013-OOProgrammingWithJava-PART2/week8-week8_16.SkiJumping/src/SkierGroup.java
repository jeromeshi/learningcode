
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jianrong
 */
public class SkierGroup {
    private ArrayList<Skier> ski;

    public SkierGroup() {
        this.ski = new ArrayList<Skier>();
    }

    public void add(Skier skier) {
        this.ski.add(skier);
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void jumpOrder() {
        int i = 1;
        Collections.sort(this.ski);
        for(Skier t : this.ski) {
            System.out.print("  " + i + ". ");
            System.out.println(t);
            i++;
        }
    }
    
    public void jumpResult() {
        for(Skier t : this.ski){
            System.out.println("  " + t.getName());
            t.jump();
            System.out.println("    length: " + t.getLength());
            t.judge();
            t.addpoints();
            System.out.print("    judge votes: ");
            int[] score = t.getJudge();
            System.out.print("[");
            for (int i = 0; i < score.length;i++){
                if(score.length -i > 1){
                    System.out.print(score[i] + ", ");
                }else {
                    System.out.print(score[i]);
                }
            }
            System.out.println("]");
                
           
        }
    }

    public void tournament() {
        int i = 1;
        Collections.sort(this.ski);
        Collections.reverse(this.ski);
        for(Skier t : this.ski) {
            System.out.print(i + "           ");
            System.out.println(t);
            System.out.print("            jump lengths: " );
            ArrayList<Integer> tour = t.getLen();
            
            for(int j = 0; j < tour.size();j++){
                if(tour.size() - j > 1){
                    System.out.print(tour.get(j) + " m, ");
                }else {
                    System.out.println(tour.get(j) + " m");
                }
            }
           
            i++;
        }
    }
            
    
    
    
    
}
