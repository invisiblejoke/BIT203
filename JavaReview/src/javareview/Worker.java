/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javareview;

/**
 *
 * @author ngsm
 */
public class Worker {
    
    private String name;
    private double hourlyRate;
    private int hoursWorked;
    
    // Constructor without args
    public Worker()
    {
        name = "unknown";
        hourlyRate = 0.0;
        hoursWorked = 0;
    }
    
    // Constructor with args
    public Worker(String name, double hourlyRate, int hoursWorked)
    {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    
    public String getName()
    {
        return name;
     
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the hourlyRate
     */
    public double getHourlyRate() {
        return hourlyRate;
    }

    /**
     * @param hourlyRate the hourlyRate to set
     */
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    /**
     * @return the hoursWorked
     */
    public int getHoursWorked() {
        return hoursWorked;
    }

    /**
     * @param hoursWorked the hoursWorked to set
     */
    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    
    @Override
    public String toString()
    {
        return name + " Worked " + hoursWorked + " hours at rate of " + hourlyRate ;
   
    }
}
