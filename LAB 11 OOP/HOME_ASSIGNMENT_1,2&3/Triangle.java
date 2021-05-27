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
public class Triangle implements Shape{
    public double base; 
    public double height; 
    public static final double constant = 0.5; 
    
    public Triangle(double B, double H)
    {
        this.base=B; 
        this.height=H; 
    }
    @Override
    public double area()
    {
        double area = constant*(base*height); 
        return area; 
    }
}
