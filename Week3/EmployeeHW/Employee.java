
/**
 * Week 3 Employee HW, CSCI 114 - online class
 * 
 * @author Paula Caixeta 
 * @version 01/28/15
 */
public class Employee {
    private String employeeName;
    private double currentSalary;

    /**
     * Constructor for objects of class Employee
     */
    public Employee(String employeeName, double currentSalary) {
        // initialise instance variables
         this.employeeName = employeeName;
         this.currentSalary = currentSalary;
    }

    // returns the name of the Employee object
    public String getName() {
        return this.employeeName;
    }
    
    // returns the salary of the Employee object
    public double getSalary() {
        return this.currentSalary;
    }
    
    // mutator method that raises the salary variable by a given percentage
    public void raiseSalary(double byPercent) {
        this.currentSalary += this.currentSalary * byPercent;
    }
}
