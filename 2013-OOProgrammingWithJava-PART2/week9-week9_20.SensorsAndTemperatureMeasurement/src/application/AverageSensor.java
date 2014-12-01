/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jianrong
 */
public class AverageSensor implements Sensor{
    private ArrayList<Sensor> sensor;
   // private boolean status;
   // private int avg;
    private List<Integer> record; 

    public AverageSensor() {
        this.sensor = new ArrayList<Sensor>();
        //this.status = false;
       // this.avg = 0;
        this.record = new ArrayList<Integer>();
    }
    
    public void addSensor(Sensor sensor) {
        this.sensor.add(sensor);
    }

    @Override
    public boolean isOn() {
        for(Sensor t :this.sensor){
            if(!t.isOn()){
                return false;
            }
            
        }
        return true;
        //return this.status;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void on() {
        for(Sensor t :this.sensor){
            t.on();
        }
       // this. = true;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void off() {
        for(Sensor t :this.sensor){
            t.off();
        }
        //this.status = false;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int measure() {
        int avg = 0;
        if(this.isOn()) {
            int count = 0;
            for(Sensor t : this.sensor) {
               avg += t.measure();
                count++;
            }
           avg = avg / count;
        }else {
            throw new IllegalStateException();
        }
        this.record.add(avg);
        return avg;
       // this.record.add(avg);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<Integer> readings() {
       return this.record;
    }
    
    
}
