
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
    }

    public String toString() {
        return this.getDay() + "." + this.getMonth() + "." + this.getYear();
    }
    
    

    public boolean earlier(MyDate compared) {
        if (this.getYear() < compared.getYear()) {
            return true;
        }

        if (this.getYear() == compared.getYear() && this.getMonth() < compared.getMonth()) {
            return true;
        }

        if (this.getYear() == compared.getYear() && this.getMonth() == compared.getMonth()
                && this.getDay() < compared.getDay()) {
            return true;
        }

        return false;
    }

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
     public int differenceInYears(MyDate comparedDate) {
        int y = this.getYear() - comparedDate.getYear();
        int m = this.getMonth() - comparedDate.getMonth();
        int d = this.getDay() - comparedDate.getDay();
        int t = y * 365 + m * 30 + d;
        return Math.abs(t/365);
    }

    /**
     * @return the day
     */
    public int getDay() {
        return this.day;
    }

    /**
     * @return the month
     */
    public int getMonth() {
        return this.month;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return this.year;
    }
    
    

  
}