
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
public class Hand implements Comparable<Hand>{
    private ArrayList<Card> t;

    public Hand() {
        t = new ArrayList<Card>();
    }
    
    public void add(Card card) {
        this.t.add(card);
    }
    
    public void print() {
        for(Card t : this.t) {
            System.out.println(t);
        }
    }
    
    public void sort() {
        Collections.sort(this.t);
        
    }
    
     public void sortAgainstSuit() {
         Collections.sort(t, new SortAgainstSuitAndValue());
     }
    
    @Override
    public int compareTo(Hand hand){
        int c1 = 0;
        int c2 = 0;
        
        for(Card c : this.t) {
            c1 += c.getValue();
        }
        
        for(Card c : hand.t) {
            c2 += c.getValue();
        }
        
        return c1 - c2;
    }
    
}
