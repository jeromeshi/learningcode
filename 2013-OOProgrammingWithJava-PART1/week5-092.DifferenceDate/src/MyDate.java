public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }
    
    public int differenceInYears(MyDate comparedDate) {
        int y = this.year - comparedDate.year;
        int m = this.month - comparedDate.month;
        int d = this.day - comparedDate.day;
        int t = y * 365 + m * 30 + d;
        return Math.abs(t/365);
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

}
