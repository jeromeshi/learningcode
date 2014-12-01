public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
   
    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        this.hours = new BoundedCounter(23);
        this.hours.setValue(hoursAtBeginning);
        this.minutes = new BoundedCounter(59);
        this.minutes.setValue(minutesAtBeginning);
        this.seconds = new BoundedCounter(59);
        this.seconds.setValue(secondsAtBeginning);
        // the counters that represent hours, minutes and seconds are created and set to have the correct initial values
    }
    
    public void tick() {
        seconds.next();
        if (seconds.getValue() == 0) {
                minutes.next();// if minutes become zero, advance hours
        }
        if (minutes.getValue() == 0 && seconds.getValue() == 0 ) {
                hours.next();// if minutes become zero, advance hours
        }
        // Clock advances by one second
    }
    
    public String toString() {
        String h;
        String m;
        String s;
        if(this.hours.getValue() < 10){
             h = "0" + this.hours.getValue();
        }else {
             h ="" + this.hours.getValue();
        }
        
        if(this.minutes.getValue() < 10){
             m = "0" + this.minutes.getValue();
        }else {
             m ="" + this.minutes.getValue();
        }
        
        if(this.seconds.getValue() < 10){
             s = "0" + this.seconds.getValue();
        }else {
             s ="" + this.seconds.getValue();
        }
        // returns the string representation
        return h + ":" + m + ":" + s;
    }
}
