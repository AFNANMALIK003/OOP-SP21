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
public class Circle implements Shape{
    public double Radius; 
    public final double PI = 3.14;
    
    public Circle(double R) 
    {
        Radius=R;
    }
    @Override
    public double area() 
    {
        double area= 2*PI*Radius;
	return area;
    }
}
