package moving;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import moving.domain.Item;
import moving.domain.Thing;

public class Main {

    public static void main(String[] args) {
         List<Item> items = new ArrayList<Item>();
    items.add(new Item("passport", 2));
    items.add(new Item("toothbrash", 1));
    items.add(new Item("circular saw", 100));

    Collections.sort(items);
    System.out.println(items);
        // test your program here
    }
}
