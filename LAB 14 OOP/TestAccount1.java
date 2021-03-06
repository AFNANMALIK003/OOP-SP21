/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPLAB14;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner; 

/**
 *
 * @author Khurshid Awan
 */
public class TestAccount1{

    
    public static void withdraw(Account[] act){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the account number:");
       int acct_no = sc.nextInt();
       System.out.println("Enter the amount to withdraw:");
       double amt = sc.nextDouble();
       for (int i = 0; i<10; i++){
          if (act[i].getAccountNo() == acct_no){
             act[i].withdraw(amt);
             return;
          }
       }
       System.out.println("Account not found\n");
    }

    public static void deposit(Account[] act){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the account number:");
       int acct_no = sc.nextInt();
       System.out.println("Enter the amount to deposit:");
       double amt = sc.nextDouble();
       for (int i = 0; i<10; i++){
          if (act[i].getAccountNo() == acct_no){
             act[i].deposit(amt);
             return;
          }
       }
       System.out.println("Account not found\n");
    }
    public static void transfer(Account[] act){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the account number to transfer from :");
       int acct_no = sc.nextInt();
       System.out.println("Enter the account number to transfer to :");
       int acct_no1 = sc.nextInt();
       System.out.println("Enter the amount to transfer:");
       double amt = sc.nextDouble();
       int toindex = -1;
       int fromindex = -1;
       for (int i = 0; i<10; i++){
          if (act[i].getAccountNo() == acct_no){
             fromindex = i;
          }
       }
       for (int j = 0; j<10; j++){
           if (act[j].getAccountNo() == acct_no1){
               toindex = j;
           }
        }
        if (fromindex == -1 && toindex != -1)
            System.out.println("From Account not found\n");
        if (toindex == -1 && fromindex != -1)
            System.out.println("To Account not found\n");
        if (toindex == -1 && fromindex == -1)
            System.out.println("Both Accounts are not found\n");
        if (toindex != -1 && fromindex != -1){
            if (act[fromindex].getBalance() >= amt){
               act[fromindex].withdraw(amt);
               act[toindex].deposit(amt);
            }
        }
    }
    public static void balanceInquiry(Account[] act){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the account number:");
       int acct_no = sc.nextInt();

       for (int i = 0; i<10; i++){
          if (act[i].getAccountNo() == acct_no){
             System.out.println(act[i].getBalance());
             return;
          }
       }
       System.out.println("Account not found\n");
    }

 public static void main(String[] args){

        Account[] act = new Account[10];
        for (int i = 0; i<10; i++){
            act[i] = new Account(i*100);
            act[i].setAccountNo(i);
            act[i].setName("name" + String.valueOf(i));
           
        }
       
        FileOutputStream fout = null;
ObjectOutputStream oos = null;
        FileInputStream fin = null;
ObjectInputStream oin = null;

try {
  fout = new FileOutputStream("temp.bin");
  oos = new ObjectOutputStream(fout);
                for (int i = 0; i<10; i++){
          oos.writeObject(act[i]);
                }
  
                fout.close();
  fin = new FileInputStream("temp.bin");
  oin = new ObjectInputStream(fin);
                for (int i = 0; i<10; i++) {
             act[i] = (Account)oin.readObject();
                }
                while (true){
                   System.out.println("----------Welcome to ATM System---------------");
                   System.out.println("1.Withdraw");
                   System.out.println("2.Deposit");
                   System.out.println("3.Transfer");
                   System.out.println("4.Balance Inquiry");
                   System.out.println("5.Quit");
                   System.out.println("Enter your choice:");
                   Scanner sc = new Scanner(System.in);
                   int ch = sc.nextInt();
                   if (ch <1 || ch > 5)
                       System.out.println("Invalid choice");
                   if (ch == 5){
                      break;
                   }
                   if (ch == 1){
                      withdraw(act);
                   }
                   if (ch == 2){
                      deposit(act);
                   }
                   if (ch == 3){
                      transfer(act);
                   }
                   if (ch == 4){
                      balanceInquiry(act);
                   }
                }
  fout = new FileOutputStream("temp.bin");
  oos = new ObjectOutputStream(fout);
                for (int i = 0; i<10; i++){
          oos.writeObject(act[i]);
                }
  
               
} catch (Exception ex) {

   ex.printStackTrace();

  }
       }
} 




