/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB9.HOMEASSIGNMENT;

/**
 *
 * @author Khurshid Awan
 */
public class Clock {
    protected int Hour; 
    protected int Min; 
    protected int Second;
    public Clock(int Hour, int Min, int Second)
    {
        this.Hour=Hour;
        this.Min=Min;
        this.Second=Second;
    }
    public void display()
    {
        System.out.println(" 24 Hour Format Timing ");
        System.out.println(" Hour: "+Hour+" Min: "+Min+" Seconds: "+Second);
    }
    
}
