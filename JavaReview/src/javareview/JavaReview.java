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
        
        //declare array of 5 workers
        
        Worker[] w = new Worker[5];
        double total = 0;
        
        for (int i = 0; i < w.length; i++)
        {
            // Enter for one worker
            Scanner kbd = new Scanner(System.in);
            
            System.out.print("Enter name for worker  :" + (i+1));
            String name = kbd.nextLine();
            
            System.out.print("Enter hourly rate :");
            double rate = kbd.nextDouble();
            System.out.print("Enter hours worked :");
       
            kbd.nextLine();
            int hours = kbd.nextInt();
            
            w[i] = new Worker(name, rate, hours);
            
            double weeklyWage =  wageCalculator(w[i]);
            total += weeklyWage;
            displayWages(w[i].getName(), weeklyWage);
         } // end of for loop
        
        System.out.println("The total wages paid is " + total); 
    }
    
    /* Method to calculate the weekly wage
        */
    public static double wageCalculator(Worker employee)
    {
        double weeklyWage;
            if (employee.getHoursWorked() > NORMALHOURS)
            {
                double normalPay = NORMALHOURS * employee.getHourlyRate();
                double overtimePay = (employee.getHoursWorked() - NORMALHOURS) * (OVERTIMERATE * employee.getHourlyRate());
                weeklyWage = normalPay + overtimePay;
            }
            else
                 weeklyWage = employee.getHourlyRate() * employee.getHoursWorked();
    
              return weeklyWage;
    }
    
    public static void displayWages(String name, double pay)
    {
            System.out.printf("The weekly wage for is %s is %.2f\n", name,pay);
       
    }
}
