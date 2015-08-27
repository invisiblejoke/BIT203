/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javareview;
import java.util.Scanner;
/**
 *
 * @author ngsm
 */
public class JavaReview {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello From BIT203");
        System.out.println("Now I know how to git");
        
        // one and a half the normal rate for 
        // any extra hour worked greater than 40.
        final int NORMALHOURS = 50;
        final double OVERTIMERATE = 0.5;
        
        Scanner kbd = new Scanner(System.in);
        System.out.print("Enter hourly rate :");
        
        double hourlyRate = kbd.nextDouble();
        System.out.print("Enter hours worked :");
        int hoursWorked = kbd.nextInt();
        double weeklyWage;
        if (hoursWorked > NORMALHOURS)
        {
            double normalPay = NORMALHOURS * hourlyRate;
            double overtimePay = (hoursWorked - NORMALHOURS) * (OVERTIMERATE * hourlyRate);
            weeklyWage = normalPay + overtimePay;
        }
        else
             weeklyWage = hourlyRate * hoursWorked;
        System.out.println("The weekly wage is " + weeklyWage);
        
    }
    
}
