import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
   public static int sum(ArrayList<Integer> list) {
        int result = 0;
        for(Integer t : list) {
            result += t;
        }

// Write your code here
        return result;
    }
    

    public static double average(ArrayList<Integer> list) {
        double ave = sum(list)/(double)(list.size());
// write code here
        return ave;
    }

    public static double variance(ArrayList<Integer> list) {
        double var = 0.0;
        double ave = average(list);
        if(list.size() < 2) {
            return 0.0;
        }else {
            for (int t : list) {
                var += (t - ave) * (t - ave);
            }
        }
        
        var = var/(list.size() - 1);
        
        
        // write code here
        return var;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
