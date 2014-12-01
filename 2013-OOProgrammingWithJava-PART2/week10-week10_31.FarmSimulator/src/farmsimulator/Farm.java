/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package farmsimulator;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jianrong
 */
public class Farm implements Alive{
    private String owner;
    private CowHouse house;
    private List<Cow> cows;
    
    
    public String getOwner() {
        return owner;
    }
    
    public void installMilkingRobot(MilkingRobot t) {
        this.house.installMilkingRobot(t);
    }

    public Farm(String owner, CowHouse house) {
        this.owner = owner;
        this.house = house;
        this.cows = new ArrayList<Cow>();
    }
    
    public void addCow(Cow cow) {
        this.cows.add(cow);
    }
    
    public void manageCows() {
        this.house.takeCareOf(this.cows);
    }

    @Override
    public void liveHour() {
        for(Cow t : this.cows) {
            t.liveHour();
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
