/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_LAB9;

import static OOP_LAB9.CustomStringTokenizer.countTokens;
import java.util.StringTokenizer;

/**
 *
 * @author Khurshid Awan
 */
public class L9HA2_RUNNER {
    public static void main(String[] args) {
            
        StringTokenizer s1 = new StringTokenizer("There are 2 students in this class");
        StringTokenizer s2 = new StringTokenizer("There are two students in this class");
               
        int count = countTokens(s1);
        System.out.println("Total number of Tokens in string 1: "+ count);
        
        count = countTokens(s2);
        System.out.println("Total number of Tokens in string 2: "+ count);
        }
    }

