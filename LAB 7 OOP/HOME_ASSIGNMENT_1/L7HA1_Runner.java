/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP_LAB7;

/**
 *
 * @author AFNAN MALIK
 */
public class L7HA1_Runner {
        public static void main(String[] args){
            Pizza pz1 = new Pizza("small",1,2,3);
            Pizza pz2 = new Pizza("medium",2,3,4);
            PizzaOrder order1 = new PizzaOrder(pz1,pz2);
            System.out.println("Cost of the ordered two pizza's are: $"+order1.cost());
        }
}
