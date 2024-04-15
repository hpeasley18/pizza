// Hunter Peasley
// 2390162
// hpeasley@chapman.edu
// CPSC 231 - 05
//PART 3: PizzaDriver.java

/**
* The PizzaDriver class represents a Pizza order's reciept
* @author Hunter Peasley
* @version 1.0
* @see Pizza, PizzaOrder, PizzaDriver
*/
public class PizzaDriver{
  //main
  public static void main(String[] args){
    Pizza pizza1 = new Pizza("Small", 1, 0, 1);// Code to create a small pizza, 1 cheese, 1 veggie
    Pizza pizza2 = new Pizza("Large", 2, 2, 0);// Code to create a large pizza, 2 cheese, 2 pepperoni
    Pizza pizza3 = new Pizza(pizza2);// Same as pizza 2, use copy constructor
    Pizza pizza4 = new Pizza(pizza1);// Same as pizza 1, use copy constructor
    PizzaOrder order = new PizzaOrder(3);// Code to create an order of THREE pizzas
    System.out.println(order.addPizza(pizza1)); // add pizza1 to the order outputs 1
    System.out.println(order.addPizza(pizza2)); // add pizza2 to the order outputs 1
    System.out.println(order.addPizza(pizza3)); // add pizza3 to the order outputs 1
    System.out.println(order.addPizza(pizza4)); // add pizza4 to the order – what happens here?  soutputs -1

    System.out.println(pizza1.equals(pizza3));
    System.out.println(order); // Should call order’s toString method
  }
}
