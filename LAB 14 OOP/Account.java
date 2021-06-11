/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPLAB14;

import java.io.Serializable;

/**
 *
 * @author Khurshid Awan
 */
import java.io.*;
import java.util.*;

class Account implements Serializable{
     private int act_no;
     private double balance;
     private String name;
    
     public Account(double bal){
          balance = bal;
          act_no = 123;
     }
     public double getBalance(){
         return balance;
     }
     public int getAccountNo(){
         return act_no;
     }
     public String getName(){
         return name;
     }
     public void setName(String a ){
         name = a;
     }
     public void setBalance(double a){
         balance = a;;
     }
     public void setAccountNo(int a){
         act_no = a;
     }
     public void withdraw(double a){
        if (a <= balance)
           balance = balance - a;
        else
           System.out.println("Insufficient balance");
     }
     public void deposit(double a){
         balance = balance + a;
     }

}

