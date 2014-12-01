/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jianrong
 */
public class Thing {
    private String name;
    private int weight;
    
    
    public Thing(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the weight
     */
    public int getWeight() {
        return weight;
    }
    
    public String toString(){
        return this.name + " (" + this.weight + " kg)";
    }
    
    
    
}
