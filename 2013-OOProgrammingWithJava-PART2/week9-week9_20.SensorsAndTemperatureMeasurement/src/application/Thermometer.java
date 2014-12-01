/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package application;

import java.util.Random;

/**
 *
 * @author jianrong
 */
public class Thermometer implements Sensor{
    private int therm;
    private boolean status;

    public Thermometer() {
        this.therm = 0;
        this.status = false;
    }
    
    

    @Override
    public boolean isOn() {
        return this.status;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void on() {
        this.status = true;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void off() {
        this.status = false;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int measure() {
        Random t = new Random();
        if(this.status) {
            this.therm = t.nextInt(60) - 30;
        }else {
            throw new  IllegalStateException();
        }
        return this.therm;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
