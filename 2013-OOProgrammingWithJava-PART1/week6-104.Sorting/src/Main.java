
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
    int[] values = {8, 3, 7, 9, 1, 2, 4};
sort(values);
  
    }
    
    public static int smallest(int[] array) {
        int t = array[0];
        for(int i : array) {
            if(i<t) {
                t = i;
            }
        }
        return t;
    }
    
    public static int indexOfTheSmallest(int[] array) {
        int t = smallest(array);
        int tt = 0;
        for(int i = 0; i < array.length; i++){
            if (array[i] == t) {
                tt = i;
            }
        }
        return tt;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int [] t = new int[array.length - index];
        for(int i = index; i < array.length; i++) {
            t[i-index] = array[i];
        }
        return indexOfTheSmallest(t) + index;
        
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int t = array[index1];
        array[index1] = array[index2];
        array[index2] = t;
    }
    
    public static void sort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int index = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, index);
            System.out.println( Arrays.toString(array) );
        }
    }

}
