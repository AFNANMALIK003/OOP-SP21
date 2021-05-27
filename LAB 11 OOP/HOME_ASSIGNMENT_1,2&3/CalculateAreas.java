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
public class CalculateAreas {
    public double areas[];
   static double[] func(Shape[] shapes) {
        double[] ans = new double[shapes.length];
        for(int i=0;i<shapes.length;i++) {
            if(shapes[i]!=null)
                ans[i] = shapes[i].area();
        }
        return ans;
    }
    public void display() 
    {
	System.out.print("{");
	for (int i=0; i<=areas.length; i++)
        {
            System.out.print(areas[i]+", ");
	}
	System.out.print("}");
    }
}
