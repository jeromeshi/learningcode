
public class Main {

    public static void main(String[] args) {
        Container container = new Container(1000);
        addSuitcasesFullOfBricks(container);
        System.out.println(container);
    }
    
    public static void addSuitcasesFullOfBricks(Container container) {
        for (int i = 0; i < 100;i++) {
            Suitcase t = new Suitcase(100);
           
            t.addThing(new Thing("brick", i + 1));
           
            container.addSuitcase(t);
            
        }
        
        // adding 100 suitcases with one brick in each
    }

}
