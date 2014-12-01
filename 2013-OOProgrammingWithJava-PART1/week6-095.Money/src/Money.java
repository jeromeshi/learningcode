
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }
    
    public Money plus(Money added) {
        int euro = this.euros() + added.euros();
        int cent = this.cents() + added.cents();
         if (cent > 99) {
            euro += cent / 100;
            cent %= 100;
        }
        
        Money t = new Money(euro, cent);
        return t;
    }
    
    public boolean less(Money compared) {
        if (this.euros < compared.euros){
            return true;
        }else if (this.euros == compared.euros){
            if (this.cents < compared.cents){
                return true;
            }
        }
        return false;
    }
    
    public Money minus(Money decremented) {
        int euro;
        int cent;
        if(this.euros > decremented.euros){
            euro = this.euros - decremented.euros;
        }else {
            euro = 0;
        }
        if(this.cents >= decremented.cents  && this.euros >= decremented.euros) {
            cent = this.cents -decremented.cents;
        }else {
            if(euro > 0){
                euro-=1;
                cent = 100 + this.cents - decremented.cents;
            }else {
                cent = 0;
            }
        }
        
        Money t = new Money(euro, cent);
        return t;  
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
