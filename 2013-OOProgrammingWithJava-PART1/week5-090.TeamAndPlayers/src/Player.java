/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jianrong
 */
public class Player {
    private int goal;
    private String name;
    
    
    public Player(String name) {
        this.name = name;
    }
    
    public Player(String name, int goal) {
        this.name = name;
        this.goal = goal;
    }

    /**
     * @return the goal
     */
    public int goals() {
        return this.goal;
    }

    /**
     * @param goal the goal to set
     */
    public void setGoal(int goal) {
        this.goal = goal;
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
    
    @Override
    public String toString(){
        return this.name + ", goals " + this.goal;
        
    }
    
    
}
