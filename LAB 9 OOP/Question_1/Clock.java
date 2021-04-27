/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_LAB9;

/**
 *
 * @author Khurshid Awan
 */

public class Clock{
    
    String hours, minutes, seconds;
    
    public Clock(String hours, String minutes, String seconds){
        this.hours=hours;
        this.minutes=minutes;
        this.seconds=seconds;
    }
    
    public void display(){
        System.out.println(this.hours+":"+this.minutes+":"+this.seconds);
    }
}

