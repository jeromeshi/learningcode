
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jianrong
 */
public class Team {
    private String name;
    private ArrayList<Player> player;
    private int maxSize ;
    
    public void addPlayer(Player t) {
        if (this.player.size() >= this.maxSize){
            return;
        }
        this.player.add(t);
    }
    
    public int goals(){
        int total = 0;
       for(Player t : this.player) {
           //System.out.println(t);
           total+= t.goals();
           
       }
       return total;
    }
    
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
        
    }
    
    public int size() {
        return this.player.size();
    }
    
    public void printPlayers() {
        for (Player t : this.player) {
            System.out.println(t);
        }
    }
    
    public Team(String name) {
       this.name = name; 
       this.maxSize = 16;
       this.player = new ArrayList<Player>();
    }
    

    /**
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
}
