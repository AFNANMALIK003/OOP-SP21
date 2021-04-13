/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_LAB7;

/**
 *
 * @author Khurshid Awan
 */
public class Pizza {
    public String s;
    public int Ctopping;
    public int Ptopping;
    public int Htopping;
    public Pizza(String s , int c , int p,int h)
    {
        this.s = s;
        Ctopping = c;
        Ptopping = p;
        Htopping = h;
    }
    public String getS()
    {
        return s;
    }
    public int getC()
    {
        return Ctopping;
    }
    public int getP()
    {
        return Ptopping;
    }
    public int geH()
    {
        return Htopping;
    }

    public void setS(String s)
    {
        this.s = s;
    }
    public void setC(int c)
    {
        Ctopping = c;
    }
    public void setP(int p)
    {
        Ptopping = p;
    }
    public void setH(int h)
    {
        Htopping = h;
    }
    public String Description()
    {
        System.out.println("Pizza: "+ this.s);
        System.out.println("Cheese toppings:" + this.Ctopping);
        System.out.println("Pepperoni toppings:" + this.Ptopping);
        System.out.println("Ham toppings:" + this.Htopping);
        return this.s;
    }
    public double calcCost()
    {
        int Pizza = 0 ;
        int t = Ctopping + Ptopping + Htopping;
        int p = 2 * t;
        if(s.equals("small")) {
            Pizza = 10;
        }
        else if(s.equals("medium")) {
            Pizza = 12;
        }
        else
            Pizza = 14;
            int totalofpizza = Pizza + Ptopping;
            return totalofpizza ; 
    }
}
