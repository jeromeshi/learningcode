package farmsimulator;


import farmsimulator.BulkTank;
import farmsimulator.Milkable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jianrong
 */
public class MilkingRobot {
    private BulkTank tank;

    public MilkingRobot() {
    }

    public BulkTank getBulkTank() {
        return tank;
    }

    public void setBulkTank(BulkTank tank) {
        
        this.tank = tank;
    }
    
    public void milk(Milkable milkable) {
        if(this.tank == null){
            throw new IllegalStateException() ;
        }
        this.tank.addToTank(milkable.milk());
    }
        
    
    
    
}
