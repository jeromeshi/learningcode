
import java.util.ArrayList;
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jianrong
 */
public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owner ;
    

    public VehicleRegister(HashMap<RegistrationPlate, String> owner) {
        
        this.owner = owner;
    }

    public VehicleRegister() {
        this.owner = new HashMap<RegistrationPlate, String>();
    }
    
    
    public boolean add(RegistrationPlate plate, String owner) {
        if(this.get(plate) != null) {
            return false;
        }else {
            this.owner.put(plate, owner);
        }
        return true;
    }
    
    public String get(RegistrationPlate plate) {
        if(this.owner.containsKey(plate)) {
            return this.owner.get(plate);
        }
        return null;
    }
    
    public boolean delete(RegistrationPlate plate) {
        if(this.owner.containsKey(plate)) {
            this.owner.remove(plate);
            return true;
            
        }
        return false;
    }
    
    public void printRegistrationPlates() {
        for(RegistrationPlate t : this.owner.keySet()) {
            System.out.println(t);
        }
    }
    
    public void printOwners() {
        ArrayList<String> name = new ArrayList<String>();
        for(RegistrationPlate t : this.owner.keySet()) {
            if(name.contains(this.owner.get(t))){
                continue;
            }
            name.add(this.owner.get(t));
        }
        for(String t : name) {
            System.out.println(t);
        }
    }
    
}
