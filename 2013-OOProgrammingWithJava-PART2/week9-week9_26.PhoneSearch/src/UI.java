
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jianrong
 */
public class UI {
    
    
    public void start() {
        Information info = new Information();
        Reader reader = new Reader();
        System.out.println( "phone search\n" +
                            "available operations:\n" +
                            " 1 add a number\n" +
                            " 2 search for a number\n" +
                            " 3 search for a person by phone number\n" +
                            " 4 add an address\n" +
                            " 5 search for personal information\n" +
                            " 6 delete personal information\n" +
                            " 7 filtered listing\n" +
                            " x quit");
        while(true){
            System.out.println("command: ");
            String command = reader.readString();
            if ( command.equals("x")){
               break; 
            }else if (command.equals("1")) {
                System.out.println("whose number: ");
                String name = reader.readString();
                System.out.println("number: ");
                String phone = reader.readString();
                info.addphone(name, new Phone(phone));
            }else if (command.equals("2")) {
                System.out.println("whose number: ");
                String name = reader.readString();
                if (info.searchphone( name)!= null){
                    List<Phone> t = info.searchphone(name);
                    for ( Phone p : t){
                        System.out.println(p);
                    }
                }else {
                    System.out.println(" not found");
                }
                
            }else if (command.equals("3")) {
                System.out.println("number: ");
                String phone = reader.readString();
                if ( info.searchByphone(new Phone(phone)) != null) {
                    String name = info.searchByphone(new Phone(phone));
                    System.out.println(" " + name);
                }else {
                    System.out.println(" not found");
                }
            }else if (command.equals("4")) {
                System.out.println("whose address: ");
                String name = reader.readString();
                System.out.println("street: ");
                String street = reader.readString();
                System.out.println("city: ");
                String city = reader.readString();
                info.addaddress(name, new Address(street, city));
                
            }else if (command.equals("5")) {
                System.out.println("whose information: ");
                String name = reader.readString();
                List<Address> address = info.searchaddress(name);
                List<Phone> phone = info.searchphone(name);
                if (address == null && phone == null) {
                    System.out.println("  not found");
                }else if (phone == null) {
                    System.out.print(" address:");
                    for(Address t : address) {
                        System.out.println(t);
                    }
                    System.out.println(" phone number not found");
                }else if (address == null) {
                    System.out.println(" address unknown");
                    System.out.println(" phone numbers: ");
                    for(Phone t : phone) {
                        System.out.println(t);
                    }
                }else {
                    System.out.print(" address:");
                    for(Address t : address) {
                        System.out.println(t);
                    }
                    
                    System.out.println(" phone numbers: ");
                    for(Phone t : phone) {
                        System.out.println(t);
                    }
                }
                
                
            }else if (command.equals("6")) {
                System.out.println("whose information: ");
                String name = reader.readString();
                info.remove(name);
                
            }else if (command.equals("7")) {
                System.out.println("keyword (if empty, all listed): ");
                String name = reader.readString();
                List<String> keys = info.keysearch(name);
                System.out.println("keyword (if empty, all listed): ");
                if(keys.isEmpty()) {
                    System.out.println(" keyword not found");
                    
                }
                Collections.sort(keys);
                for (String key :keys){
                    System.out.println(key);
                    List<Address> address = info.searchaddress(key);
                    List<Phone> phone = info.searchphone(key);
                    if (address == null && phone == null) {
                        System.out.println("  not found");
                    }else if (phone == null) {
                        System.out.print(" address:");
                        for(Address t : address) {
                            System.out.println(t);
                        }
                        System.out.println(" phone number not found");
                    }else if (address == null) {
                        System.out.println(" address unknown");
                        System.out.println(" phone numbers: ");
                        for(Phone t : phone) {
                            System.out.println(t);
                        }
                    }else {
                        System.out.print(" address:");
                        for(Address t : address) {
                            System.out.println(t);
                        }
                    
                        System.out.println(" phone numbers: ");
                        for(Phone t : phone) {
                            System.out.println(t);
                        }
                    }
                    
                    
                }
                
               
            }
        }
        
    }
    
}
