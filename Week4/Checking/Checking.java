
/**
 * Checking account that manages balance.
 * 
 * @author Paula Caixeta
 * @version 02/03/15
 */
public class Checking {
    private double balance;
    
    /**
     * Constructor for objects of class Checking
     */
    public Checking() {
        // set balance to 0.0 when a new Checking object is created
        balance = 0.0;
    }
    
    /**
     * Withdraws money from the account
     * 
     * @param amount amount of the withdrawal
     */
    public void withdraw(double amount) {
        balance = balance - amount;
    }
   
}
