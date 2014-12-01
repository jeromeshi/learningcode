/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jianrong
 */
public class Flight {
    private Plane plane;
    private String departure;
    private String destination;
    
    public Flight(Plane plane, String departure, String destination) {
        this.plane = plane;
        this.departure = departure;
        this.destination = destination;
    }
    
    public String toString(){
        
        return ( this.getPlane().toString() + " (" + this.departure + "-" + this.destination +")");
    }

    /**
     * @return the plane
     */
    public Plane getPlane() {
        return plane;
    }
}
