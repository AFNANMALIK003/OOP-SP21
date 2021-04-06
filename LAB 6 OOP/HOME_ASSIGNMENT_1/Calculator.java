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
public class Calculator {
    private Calculator(){

    }
    public static double sum(double x, double y) {
        return x + y;
    }
    public static double multiply(double x, double y){
        return x * y;
    }
    public static double divide(double x, double y){
        return x / y;
    }
    public static double modulus(double x, double y){
        return x % y;
    }
    public static double sin(double x){
        return Math.sin(x);
    }
    public static double cos(double x){
        return Math.cos(x);
    }
    public static double tan(double x){
        return Math.tan(x);
    }
}
