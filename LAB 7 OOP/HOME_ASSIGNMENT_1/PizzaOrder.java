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
class PizzaOrder {
    Pizza pizza1;
    Pizza pizza2;
    Pizza pizza3;
    public PizzaOrder(Pizza pizza1,Pizza pizza2)
    {
        this.pizza1 = pizza1;
        this.pizza2 = pizza2;
    }
    public void setPizza1(Pizza p1)
    {
        this.pizza1 = p1;
    }
    public void setPizza2(Pizza p2)
    {
        this.pizza2 = p2;
    }
    public void setPizza3(Pizza p3)
    {
        this.pizza3 = p3;
    }
    public float cost()
    {
        float order1 = (float) pizza1.calcCost();
        float order2 = (float) pizza2.calcCost();
        float total= order1+order2;
        System.out.println("Cost Pizza 1:"+order1);
        System.out.println("Cost Pizza 2:"+order2);
        System.out.println("total: "+total);
        return total;
    }

}                           
