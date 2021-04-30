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
public class L9HA1_Runner {
    public static void main(String[] args){
        Clock C = new Clock(13,31,44);
        ChildClock C1 = new ChildClock(2,33,44); 
        C1.display();
    }
}
