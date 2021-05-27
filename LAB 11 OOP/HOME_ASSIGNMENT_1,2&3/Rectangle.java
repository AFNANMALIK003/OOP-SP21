/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPLAB11;

/**
 *
 * @author Khurshid Awan
 */
public class Rectangle implements Shape {
    public double length; 
    public double width; 
    Rectangle(double L, double W)
    {
        this.length=L; 
        this.width=W; 
    }
    @Override
    public double area()
    {
        double area = length * width; 
        return area; 
    }
    
}
