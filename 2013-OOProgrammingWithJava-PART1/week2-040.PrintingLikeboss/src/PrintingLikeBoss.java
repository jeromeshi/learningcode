public class PrintingLikeBoss {
    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
       while (amount > 0) {
           System.out.print("*");
           amount--;
        
       }  
        System.out.println("");
    }
    

    public static void printWhitespaces(int amount) {
        while (amount > 0) {
           System.out.print(" ");
           amount--;
        
       }  
    }

    public static void printTriangle(int size) {
        int t = size;
        while (t > 0) {
            t--;
            printWhitespaces(t);
            printStars(size - t);
        }
        
    }

    public static void xmasTree(int height) {
       int t = height;
       while ( t > 0) {
           t--;
           printWhitespaces(t);
           printStars((height - t) + (height - t - 1));
       }
       printWhitespaces(height-2);
       printStars(3);
       printWhitespaces(height-2);
       printStars(3);
       
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        
        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
