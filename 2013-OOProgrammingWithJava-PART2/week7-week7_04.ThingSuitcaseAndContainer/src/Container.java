
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
public class Container {
    private ArrayList<Suitcase> suitcase ;
    private int total;
    
    public Container(int total) {
        this.total = total;
        this.suitcase = new ArrayList<Suitcase>();
    }
    
    
    
    public void addSuitcase(Suitcase suitcase) {
        if((this.totalWeight() + suitcase.totalWeight()) > this.total){
            return;
        }else {
            this.getSuitcase().add(suitcase);
        }
    }
    
    public int totalWeight() {
        int tt = 0;
        for(Suitcase t : this.getSuitcase()) {
            tt+=t.totalWeight();
        }
        return tt;
    }
    
    
    public void printThings(){
        for (Suitcase t : this.getSuitcase()) {
            t.printThings();
        }
    }
    
    public String toString() {
       return this.getSuitcase().size() + " suitcases (" + this.totalWeight() + " kg)";
    }

    /**
     * @return the suitcase
     */
    public ArrayList<Suitcase> getSuitcase() {
        return suitcase;
    }
    
}
