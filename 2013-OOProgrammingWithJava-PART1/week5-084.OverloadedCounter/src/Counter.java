/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jianrong
 */
public class Counter {
    private int val;
    private boolean check;
    public Counter(int startingValue, boolean check){
        this.val = startingValue;
        this.check = check;
    }
    
    public Counter( int startingValue){
        this.val = startingValue;
        this.check = false;
    }
    
    public Counter(boolean check) {
        this.val = 0;
        this.check = check;
    }
    
    public Counter() {
        this.val = 0;
        this.check = false;
    }
    
    public int value() {
        return this.val;
    }
    
    public void increase() {
        this.val++;
    }
    
    public void increase(int increaseAmount) {
        if(increaseAmount < 0) {
            return;
        }
        this.val+= increaseAmount;
    }
    
    public void decrease() {
        if(!this.check) {
           this.val--;
        }else{
            if (this.val > 0) {
                this.val--;
            }
        }
    }
    
    public void decrease(int dereaseAmount) {
        if ( dereaseAmount < 0){
            return;
        }
        if(!this.check) {
           this.val-= dereaseAmount;
        }else{
            if (this.val >= dereaseAmount) {
                this.val-= dereaseAmount;
            }else {
                this.val = 0;
            }
        }
    }
}
