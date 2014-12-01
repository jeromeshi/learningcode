import java.util.ArrayList;

public class TheGreatest {
    public static int greatest(ArrayList<Integer> list) {
        int max = 0;                ;
        for (int t : list) {
            if(list.indexOf(t) == 0) {
                max = t;
            }
            if (t > max) {
                max =t;
            }
        }



// write code here
        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);
        
        System.out.println("The greatest number is: " + greatest(lista));
    }
}