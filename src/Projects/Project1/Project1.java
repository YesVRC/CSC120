package Projects.Project1;
// Imports
/* BEFORE class */
import java.util.Scanner;
import Projects.IProjectTemplate;
      
public class Project1 implements IProjectTemplate {
    public void main(String args[]) {
        // Init scanner
        /* BEFORE scans */
        Scanner scan;
        scan = new Scanner( System.in );
        
        // Init First and Last Name (doesn't matter where as long as it's above the scans)
        /* BEFORE scans */
        String firstName;
        String lastName;
        
        // Init pay variables (doesn't matter where as long as it's above the scans)
        /* BEFORE scans */
        int hours;
        double payRate;
        double checkAmount;

        // Scan for Name
        /* ordered based on sample output */
        System.out.print( "Enter the employee's name: " );
        firstName = scan.next();
        lastName = scan.next();
        
        // Scan for Pay Rate
        /* ordered based on sample output */
        System.out.print( "Enter the employee's pay rate: $" );
        payRate = scan.nextDouble();

        // Scan for Hours Worked
        /* ordered based on sample output */
        System.out.print( "Enter the employee's hours worked: " );
        hours = scan.nextInt();
        
        // Pay Calculations
        /* BEFORE the output but AFTER the assignment */
        checkAmount = payRate * hours;

        // Output
        /* ordered based on sample output */
        System.out.println( "Employee: " + lastName + ", " + firstName );
        System.out.println( "$" + payRate + " per hour x " + hours + " hours = $" + checkAmount );

        // Scan close
        /* AFTER scans */
        scan.close();
    }
}
