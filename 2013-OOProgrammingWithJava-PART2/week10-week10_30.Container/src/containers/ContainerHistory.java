/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package containers;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jianrong
 */
public class ContainerHistory {

    
    private List<Double> history;
    
    public ContainerHistory() {
        this.history = new ArrayList<Double>();
    }

    public List<Double> getHistory() {
        return history;
    }
    
    
    
    public void add(double situation) {
        this.history.add(situation);
    }
    
    public void reset() {
        this.history.clear();
    }
    
    @Override
    public String toString() {
        return this.history.toString();
    }
    
    public double maxValue() {
        double val = 0;
        if(!this.history.isEmpty()) {
            for (Double t : this.history) {
                if (t > val) {
                    val = t;
                }
            }
        }
        return val;
    }
    
    public double minValue() {
        double val = 0;
        if(!this.history.isEmpty()) {
            val = this.history.get(0);
            for (Double t : this.history) {
                if (t < val) {
                    val = t;
                }
            }
        }
        return val;
    }
    
    public double average() {
        double total = 0;
        if(!this.history.isEmpty()) {
            for (Double t : this.history) {
                total += t;
            }
            total = total/this.history.size();
        }
        
        return total;
    }
    
    public double greatestFluctuation() {
        if(this.history.isEmpty()) {
            return 0;
        }else if (this.history.size() == 1) {
            return 0;
        }else {
            double val = 0;
            for (int i = 0 ; i < this.history.size(); i++) {
                if(i > 0) {
                    if (Math.abs(this.history.get(i) - this.history.get(i-1)) > val) {
                        val = Math.abs(this.history.get(i) - this.history.get(i-1));
                    }
                }
            }
            return val;
        }
            
    }
    
    public double variance() {
        double variance = 0;
        if(this.history.isEmpty()) {
            return 0;
        }else if (this.history.size() == 1) {
            return 0;
        }else {
            
            for (Double t : this.history) {
                variance += Math.pow((t- this.average()), 2);
            }
            variance = variance/(this.history.size() - 1);
        }
        return variance;
    }
    
}
