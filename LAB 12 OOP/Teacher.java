/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPLAB12;

import java.util.Scanner;

/**
 *
 * @author Khurshid Awan
 */
public class Teacher extends Person implements Association {
    private String designation; 
    private String department; 
    public Teacher(String N, String ID)
    {
        super(N,ID); 
    }

    @Override
    public void Association() 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Desingnation: ");
        this.designation = input.nextLine();
        System.out.println("Enter Department: ");
        this.department = input.nextLine();
    }
    @Override
    public String toString()
    {
        return " TEACHER\n" + super.toString() +  "\nDesignation:\t" + designation + "\nDepartment:\t" + department;
    }
    
    
}
