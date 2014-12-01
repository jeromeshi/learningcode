
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
public class Plane {
    private String id;
    private int capacity;
    
    public Plane(String id, int capacity ) {
        this.id = id;
        this.capacity = capacity;
        
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }
    
    public String toString(){
        return this.id + " (" + this.capacity + " ppl)";
    }

    /**
     * @return the capacity
     */
    public int getCapacity() {
        return capacity;
    }
    
    
}
