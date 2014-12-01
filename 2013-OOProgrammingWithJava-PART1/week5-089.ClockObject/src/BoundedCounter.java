
public class BoundedCounter {
     private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.value = 0;
        this.upperLimit = upperLimit;
        // write code here
    }

    public void next() {
        if(this.value == this.upperLimit){
            this.value = 0;
        } else {
            this.value++;
        }
        // write code here
    }
    
    public int getValue() {
        return this.value;
        // write here code that returns the value
    }
    
    public void setValue(int t) {
        if( t > 0 && t <= this.upperLimit) {
            this.value = t;
        }
    }

    public String toString() {
        if(this.value < 10){
            return "0" + this.value;
        }
        return "" + this.value;
        // write code here
    }
    
// copy here the class BoundedCounter from last weeks assignment 78 
}
