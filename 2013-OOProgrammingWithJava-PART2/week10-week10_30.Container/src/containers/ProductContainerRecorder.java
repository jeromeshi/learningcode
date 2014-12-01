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
public class ProductContainerRecorder extends ProductContainer {
    private ContainerHistory his;
    
    public ProductContainerRecorder(String productName, double capacity, double initialVolume) {
        super(productName, capacity);
        this.volume = initialVolume;
        this.his = new ContainerHistory();
        this.his.getHistory().add(initialVolume);
    }
    
    public String history() {
        return this.his.getHistory().toString();
    }
    
    @Override
    public void addToTheContainer(double amount) {
        if (amount < 0) {
            return;
        }
        this.his.getHistory().add(this.his.getHistory().get(this.his.getHistory().size() - 1) + amount);
        this.volume += amount;
    }
    
    @Override
    public double takeFromTheContainer(double amount) {
        if (amount < 0) {
            return 0.0;
        }
        if (amount > this.his.getHistory().get(this.his.getHistory().size() - 1)) {
            double everything = this.his.getHistory().get(this.his.getHistory().size() - 1);
            this.his.getHistory().add(0.0);
            this.volume = 0.0;
            return everything;
        }
        
        this.his.getHistory().add(this.his.getHistory().get(this.his.getHistory().size() - 1) - amount);
        this.volume -= amount;
        return amount;
    }
    
    public void printAnalysis() {
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + this.his.getHistory());
        System.out.println("Greatest product amount: " + this.his.maxValue());
        System.out.println("Smallest product amount: " + this.his.minValue());
        System.out.println("Average: " + this.his.average());
        System.out.println("Greatest change: " + this.his.greatestFluctuation());
        System.out.println("Variance: " + this.his.variance());
        
    }
    
}
