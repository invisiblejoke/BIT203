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

    
     // one and a half the normal rate for 
      // any extra hour worked greater than 40.
       static final int NORMALHOURS = 50;
       static final double OVERTIMERATE = 0.5;
    
    public static void main(String[] args) {
        
        double total = 0;
        
        for (int i = 0; i < 5; i++)
        {
            // Enter for one worker
            Scanner kbd = new Scanner(System.in);
            
            System.out.print("Enter worker name :");
            String name = kbd.nextLine();
            System.out.print("Enter hourly rate :");

            double hourlyRate = kbd.nextDouble();
            System.out.print("Enter hours worked :");
            int hoursWorked = kbd.nextInt();
            kbd.nextLine();
            double weeklyWage =  wageCalculator(hourlyRate, hoursWorked);
            total += weeklyWage;
            displayWages(name, weeklyWage);
         } // end of for loop
        
        System.out.println("The total wages paid is " + total); 
    }
    
    /* Method to calculate the weekly wage
        */
    public static double wageCalculator(double rate, int hours)
    {
        double weeklyWage;
            if (hours > NORMALHOURS)
            {
                double normalPay = NORMALHOURS * rate;
                double overtimePay = (hours - NORMALHOURS) * (OVERTIMERATE * rate);
                weeklyWage = normalPay + overtimePay;
            }
            else
                 weeklyWage = rate * hours;
    
              return weeklyWage;
    }
    
    public static void displayWages(String name, double pay)
    {
            System.out.printf("The weekly wage for is %s is %.2f\n", name,pay);
       
    }
}
