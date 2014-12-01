/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package farmsimulator;

/**
 *
 * @author jianrong
 */
public class BulkTank {
    private double capacity;
    private double volume;

    public BulkTank() {
        this.capacity = 2000;
        this.volume = 0;
    }

    public BulkTank(double capacity) {
        this.capacity = capacity;
        this.volume = 0;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getVolume() {
        return volume;
    }
    
    public double howMuchFreeSpace(){
        return this.capacity - this.volume;
    }
    
    public void addToTank(double amount) {
        if (amount < 0) {
            return;
        }else if (amount > this.howMuchFreeSpace()){
            this.volume = this.capacity;
            return;
        }
        this.volume += amount;
    }
    
    public double getFromTank(double amount) {
        if( amount > this.volume ) {
            double t = this.volume;
            this.volume = 0;
            return t;
        }
        this.volume -= amount;
        return amount;
    }

    @Override
    public String toString() {
        return Math.ceil(volume) + "/" + Math.ceil(capacity)   ;
    }
    
    
    
    
    
    
}
