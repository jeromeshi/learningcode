
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jianrong
 */
public class OperatorInterface {
    private Reader reader;
    private ArrayList<Plane> plane;
    private ArrayList<Flight> flight;
            
    public OperatorInterface(Reader reader) {
        this.reader = reader;
        this.plane = new ArrayList<Plane>();
        this.flight = new ArrayList<Flight>();
    }
    
    public Plane getplane(String id) {
        for(Plane t:this.getPlane()) {
            if(t.getId().equals(id)){
                return t;
            }
        }
        return null;
    }
    
    public void start(){
        System.out.println("Airport panel\n" +
                           "--------------------");
        while(true) {
            System.out.println("Choose operation:\n" +
                               "[1] Add airplane\n" +
                               "[2] Add flight\n" +
                               "[x] Exit");
            String command = reader.readString();
            if (command.equals("x")){
                break;
            }else if(command.equals("1")){
                System.out.println("Give plane ID: ");
                String id = reader.readString();
                System.out.println("Give plane capacity: ");
                int capacity = reader.readInteger();
                this.getPlane().add(new Plane(id,capacity));
            }else if(command.equals("2")) {
                System.out.println("Give plane ID: ");
                String id = reader.readString();
                System.out.println("Give departure airport code: ");
                String dep = reader.readString();
                System.out.println("Give destination airport code: ");
                String dst = reader.readString();
                this.getFlight().add(new Flight(this.getplane(id), dep, dst));
                
            }
        }
    }
    
    public void usrstart() {
        System.out.println("Flight service\n" +
                           "------------");
        
        while(true) {
            System.out.println("Choose operation:\n" +
                               "[1] Print planes\n" +
                               "[2] Print flights\n" +
                               "[3] Print flight info\n" +
                               "[x] Quit");
            String command = reader.readString();
            if (command.equals("x")){
                break;
            }else if(command.equals("1")){
                for(Plane t: this.plane){
                    System.out.println(t);
                }
            }else if(command.equals("2")) {
                for(Flight t: this.flight){
                    System.out.println(t);
                }
            }else if(command.equals("3")){
                System.out.println("Give plane ID: ");
                String id = reader.readString();
                boolean test = true;
                
                
               
                for(Flight t: this.flight){
                    if(t.getPlane().getId().equals(id)) {
                        System.out.println(t);
                        test = false;
                    }
                }
                if(test){
                        for(Plane p : this.plane){
                            if(p.getId().equals(id)){
                                System.out.println(p);
                                
                            }
                        }
                }
                
            }
        }
    }

    /**
     * @return the plane
     */
    public ArrayList<Plane> getPlane() {
        return plane;
    }

    /**
     * @return the flight
     */
    public ArrayList<Flight> getFlight() {
        return flight;
    }
    
}
