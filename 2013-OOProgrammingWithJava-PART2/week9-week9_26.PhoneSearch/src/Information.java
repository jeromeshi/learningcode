
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jianrong
 */
public class Information {
    private Map<String,List<Phone>> phone;
    private Map<String,List<Address>> address;

    public Map<String, List<Phone>> getPhone() {
        return phone;
    }

    public Map<String, List<Address>> getAddress() {
        return address;
    }
    

    public Information() {
        this.phone = new HashMap<String,List<Phone>>();
        this.address = new HashMap<String,List<Address>>();
    }

    public Information( List<Phone> phone,  List<Address> address) {
        if (this.phone.keySet().contains("temp")) {
            this.phone.replace("temp", phone);
            this.address.replace("temp", address);
        } else {
            this.phone.put("temp", phone);
            this.address.put("temp", address);
        }
        
    }
    
    
    
    public void addphone(String name, Phone phone) {
        if (!this.phone.containsKey(name)) {
            this.phone.put(name, new ArrayList<Phone>());
        }
        this.phone.get(name).add(phone);
    }
    
    public void addaddress(String name, Address address) {
        if (!this.address.containsKey(name)) {
            this.address.put(name, new ArrayList<Address>());
        }
        this.address.get(name).add(address);
    }
    
    public List<Phone> searchphone(String name) {
        if (!this.phone.containsKey(name)) {
            return null;
        }
        return this.phone.get(name);
    }
    
    public String searchByphone(Phone phone) {
        for (String t : this.phone.keySet()) {
            for(Phone p :this.phone.get(t)) {
                if (p.getPhone().equals(phone.getPhone())) {
                    return t;
                }
                
            }
        }
        return null;    
    }
    
    public List<Address> searchaddress(String name) {
        if (!this.address.containsKey(name)) {
            return null;
        }
        return this.address.get(name);
    }
    
    
    
    public void remove(String name) {
        if(this.phone.containsKey(name)) {
            this.phone.remove(name);
        }
        if(this.address.containsKey(name)) {
            this.address.remove(name);
        }
    }
    
    public List<String> keysearch(String key) {
        List<String> t = new ArrayList<String>();
        for (String name : this.phone.keySet()) {
            if ( name.indexOf(key) >= 0) {
                t.add(name);
            }
        }
        
        for (String name : this.address.keySet()){
            for( Address address :this.address.get(name)) {
                if(address.getCity().indexOf(key) >= 0 ||
                   address.getStreet().indexOf(key) >= 0  ) {
                    t.add(name);
                }
            }
        }
        return t;
    }
    
}
