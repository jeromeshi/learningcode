public class NumberStatistics {
    
    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        this.amountOfNumbers = 0;
        this.sum = 0;
        // initialize here the object variable amountOfNumbers
    }

    public void addNumber(int number) {
        this.sum = this.sum + number;
        this.amountOfNumbers++;
        // code here
    }

    public int amountOfNumbers() {
        return this.amountOfNumbers;
        // code here
    }
    
    public int sum() {
        return this.sum;
        // code here
    }

    public double average() {
        if (this.amountOfNumbers == 0) {
            return 0.0;
        }
        return this.sum/(double)this.amountOfNumbers;// code here
    }
}
