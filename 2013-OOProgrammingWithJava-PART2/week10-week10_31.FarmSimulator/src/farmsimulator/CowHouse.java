/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package farmsimulator;

import java.util.Collection;

/**
 *
 * @author jianrong
 */
public class CowHouse {
    private BulkTank tank;
    private MilkingRobot robot;
    public CowHouse(BulkTank tank) {
        this.tank = tank;
    }
    
    public BulkTank getBulkTank() {
        return this.tank;
    }
    
    public void installMilkingRobot(MilkingRobot milkingRobot) {
        this.robot = milkingRobot;
        this.robot.setBulkTank(this.getBulkTank());
    }
    
    
    public void takeCareOf(Cow cow) {
        if(this.robot == null) {
            throw new IllegalStateException();
        }
        this.robot.milk(cow);
    }
    
    public void takeCareOf(Collection<Cow> cows) {
        if(this.robot == null) {
            throw new IllegalStateException();
        }
        for ( Cow t : cows) {
            this.robot.milk(t);
        }
    }
    
    @Override
    public String toString() {
        return this.tank.toString();
    }
        
}
