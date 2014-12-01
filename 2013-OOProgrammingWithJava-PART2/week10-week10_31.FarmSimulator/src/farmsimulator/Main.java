package farmsimulator;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
      CowHouse cowhouse = new CowHouse(new BulkTank());
        System.out.println("CowHouse: " + cowhouse);

        MilkingRobot robot = new MilkingRobot();
        cowhouse.installMilkingRobot(robot);

        Cow ammu = new Cow();
        ammu.liveHour();
        ammu.liveHour();

        cowhouse.takeCareOf(ammu);
        System.out.println("CowHouse: " + cowhouse);

        LinkedList<Cow> cowList = new LinkedList<Cow>();
        cowList.add(ammu);
        cowList.add(new Cow());

        for(Cow cow: cowList) {
            cow.liveHour();
            cow.liveHour();
        }

        cowhouse.takeCareOf(cowList);
        System.out.println("CowHouse: " + cowhouse);

        // T }est your program here
   
    }
}
