
public class Accounts {

    public static void main(String[] args) {
        Account matt = new Account("Matt's account", 1000 );
        Account me = new Account( "My account", 0);
        matt.withdrawal(100);
        me.deposit(100);
        System.out.println(matt);
        System.out.println(me);
        
        // Code in Account.Java should not be touched!
        // write your code here
    }
    
}
