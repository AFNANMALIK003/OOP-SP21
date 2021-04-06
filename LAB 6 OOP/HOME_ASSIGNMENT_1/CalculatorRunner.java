/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB7;

/**
 *
 * @author Khurshid Awan
 */
import java.util.Scanner; 
public class CalculatorRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number1, number2, angle;
        System.out.println("----------------- CALCULATOR ------------------");
        System.out.print("Enter Two Values Space Sperated: ");
        number1 =input.nextDouble();
        number2 =input.nextDouble();
        System.out.println(" Addition is: ");
        System.out.println(number1+" + "+number2+" =: " + Calculator.sum(number1,number2));
        System.out.println(" Subtraction is: ");
        System.out.println(number1+" x "+number2+" =: " + Calculator.multiply(number1,number2));
        System.out.println(" Multiplication is: ");
        System.out.println(number1+" / "+number2+" =: " + Calculator.divide(number1,number2));
        System.out.println(" Division is: ");
        System.out.println(number1+" % "+number2+" =: " + Calculator.modulus(number1,number2));
        System.out.print("Enter Angle to check sin,cos and tan: ");
        angle =input.nextDouble();
        System.out.println("sin = "+Calculator.sin(angle));
        System.out.println("cos = "+Calculator.cos(angle));
        System.out.println("tan = " +Calculator.tan(angle));
        input.close();
    }
    
}
