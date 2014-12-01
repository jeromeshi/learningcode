public class Reformatory {
    private int count = 0;
    
    public int totalWeightsMeasured() {
        return count;
    }
    
    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

    public int weight(Person person) {
        count++; 
        
        // return the weight of the person
        return person.getWeight();
    }

}
