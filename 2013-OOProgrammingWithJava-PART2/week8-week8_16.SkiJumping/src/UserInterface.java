/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jianrong
 */
public class UserInterface {
    private Reader reader;
    private int round = 0;
    
    public void start() {
        SkierGroup group = new SkierGroup();
        System.out.println("Kumpula ski jumping week");
        System.out.println("");
        System.out.println("Write the names of the participants one at a time; an empty string brings you to the jumping phase.");
        reader = new Reader();
        while(true){
            System.out.println("  Participant name: ");            
            String name = reader.readString();
            if(name.equals("")) {
                break;
            }else {
                group.add(new Skier(name));
            }            
        }
        System.out.println("");
        System.out.println("The tournament begins!");
        System.out.println("");
        
        while(true) {
            System.out.println("Write \"jump\" to jump; otherwise you quit: ");
            String command = reader.readString();
            if(!command.equals("jump")) {
                System.out.println("");
                break;
            }else {
                round++;
                System.out.println("");
                System.out.println("Round " + round);
                System.out.println("");
                System.out.println("Jumping order:");
                group.jumpOrder();
                System.out.println("");
                System.out.println("Results of round " + round);
                group.jumpResult();
                System.out.println("");
                System.out.println("");
            }
        }
        System.out.println("Thanks!");
        System.out.println("");
        
        System.out.println("Tournament results:");
        System.out.println("Position    Name");
        group.tournament();
    }
    
    
    
}
