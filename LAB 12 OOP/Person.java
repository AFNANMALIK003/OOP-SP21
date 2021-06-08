/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPLAB12;

/**
 *
 * @author Khurshid Awan
 */
public class Person {
    protected String Name; 
    protected String ID; 
    public Person(String N, String ID)
    {
        this.Name=N;
        this.ID=ID; 
    }
    @Override
    public String toString()
    {
     return " NAME: "+ Name + " ID: " + ID;    
    }
    
    
}
