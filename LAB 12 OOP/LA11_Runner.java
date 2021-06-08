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
public class LA11_Runner {
    public static void main(String[] args)
    {
        HumanResource HR = new HumanResource(); 
        HR.add( new Teacher("Talha", "090022")); 
        HR.add( new Teacher("Mukhtar", "76545"));
        HR.add( new Teacher("Noman", "31346"));
        HR.add( new Student("Waheed", "987"));
        HR.add( new Student("Muzamil", "98648"));
        HR.display();
        System.out.println("-----------TEACHER------------- ");
        Association AT = new Teacher("Teacher", "03121"); 
        AT.Association();
        System.out.println("------------STUDENT--------------");
        Association AS = new Student("Student", "32112"); 
        AS.Association();
        
        System.out.println(AT); 
        System.out.println(AS);
    }
 
}
