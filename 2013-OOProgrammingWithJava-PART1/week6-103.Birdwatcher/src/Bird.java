/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jianrong
 */
public class Bird {
    private String name;
    private String lname;
    private int count;
    
    public Bird(String name, String lname){
        this.name = name;
        this.lname = lname;
        this.count = 0;
    }
    
    public void Observation(){
        this.count++;
    }
    
       
    public String toString(){
        return this.getName() + "(" + this.getLname() + "): "  + this.getCount() + " observations";
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the lname
     */
    public String getLname() {
        return lname;
    }

    /**
     * @return the count
     */
    public int getCount() {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(int count) {
        this.count = count;
    }
    
}
