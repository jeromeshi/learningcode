import java.util.Calendar;

public class Person {
    private String name;
    private MyDate birthday;
    
    public Person(String name, int pp, int kk, int vv) {
        this.name = name;
        this.birthday = new MyDate(pp, kk, vv);
    }
    
    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }
    
    public Person(String name) {
        this.name = name;
        this.birthday = new MyDate(Calendar.getInstance().get(Calendar.DATE),Calendar.getInstance().get(Calendar.MONTH) + 1, Calendar.getInstance().get(Calendar.YEAR) );
        
    }
    
    
    public int age() {
        int d =  Calendar.getInstance().get(Calendar.DATE);
        int m =  Calendar.getInstance().get(Calendar.MONTH) + 1;
        int y =  Calendar.getInstance().get(Calendar.YEAR);
        MyDate t = new MyDate(d, m, y);
        return this.birthday.differenceInYears(t);
// calculate the age based on the birthday and the current day
        // you get the current day as follows: 
        // Calendar.getInstance().get(Calendar.DATE);
        // Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        // Calendar.getInstance().get(Calendar.YEAR);
        
    }
    
    public boolean olderThan(Person compared) {
        if (this.age() - compared.age() < 0) {
            return false;
        }else if (this.age() - compared.age() == 0) {
            if(this.birthday.getYear() - compared.birthday.getYear() > 0) {
                return false;
            }else if(this.birthday.getYear() - compared.birthday.getYear() == 0) {
                if(this.birthday.getMonth() - compared.birthday.getMonth() > 0) {
                    return false;
                }else if (this.birthday.getMonth() - compared.birthday.getMonth() == 0){
                    if (this.birthday.getDay() - compared.birthday.getDay() > 0){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
