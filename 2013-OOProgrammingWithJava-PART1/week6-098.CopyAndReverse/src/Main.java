

public class Main {
    
    public static int[] copy(int[] array) {
            int [] t = new int[array.length];
            for ( int i =0; i<array.length; i++) {
                t[i] = array[i];
            }
            return t;
        }
    
    public static int[] reverseCopy(int[] array) {
            int [] t = new int[array.length];
            for ( int i =0; i<array.length; i++) {
                t[i] = array[array.length - i -1];
            }
            return t;
        }

    public static void main(String[] args) {
        
        // write testcode here
    }
    
}
