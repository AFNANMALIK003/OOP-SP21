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
public class ChildClock extends Clock {
    public ChildClock(int Hour, int Min, int Second)
    {
        super(Hour,Min,Second); 
    }
    @Override
    public void display()
    {
        super.display();
        //System.out.println(" 24 hour Format ");
        //System.out.println(" Hour: "+Hour+" Min: "+Min+" Seconds: "+Second);
        System.out.println(" 12 Hour Clock Format ");
        System.out.println(" Hour: "+Hour+" Min: "+Min+" Seconds: "+Second);
    }
}
