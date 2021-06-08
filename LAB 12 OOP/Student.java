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
public class Student extends Person implements Association {
    private int rollNo;
    private int semester; 
    public Student(String N, String ID)
    {
        super(N,ID); 
    }
    @Override
    public void Association() 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Roll Number: ");
        this.rollNo = input.nextInt();
        System.out.println("Enter Semester: ");
        this.semester = input.nextInt();
    }
    @Override
    public String toString()
    {
        return " STUDENT\n " + super.toString() + "\nRoll Number:\t" + rollNo + "\nSemester:\t" + semester;
    }

    
}
