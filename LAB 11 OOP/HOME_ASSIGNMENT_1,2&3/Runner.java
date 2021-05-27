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
public class Runner {
    public static void main(String[] args)
    {
        //Rectangle R = new Rectangle(3,4); 
        //System.out.println(R.area());
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle(4,6.4);
        shapes[1] = new Triangle(7.4, 3);
        shapes[2] = new Circle(6);
        double areas[] = CalculateAreas.func(shapes);
        for(double a: areas) 
        {
        System.out.println(a); 
        }
    }
} 
