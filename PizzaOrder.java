// // Hunter Peasley
// // 2390162
// // hpeasley@chapman.edu
// // CPSC 231 - 05
// //PART 2: PizzaOrder.java
//

import java.util.ArrayList;
import java.util.LinkedList;

/**
* The PizzaOrder class represents amount of pizza being ordered
* @author Hunter Peasley
* @version 1.0
* @see Pizza, PizzaOrder, PizzaDriver
*/
public class PizzaOrder{

  /** a int representation of the number of pizzas*/
  private int m_numPizzas;
  /** an array record of Pizza objects*/
  private Pizza[] m_order;

  // default constructor
  /** Create a PizzaOrder instance: a small cheese pizza*/
  public PizzaOrder(){
    m_numPizzas = 1;
    Pizza p = new Pizza("Small", 1, 0, 0);
    m_order[0] = p;
  }


  //overloaded CONSTRUCTOR
  /**
  * Create a PizzaOrder instance with a integer attribute
  * @param count The count of how many pizzas there are
  */
  public PizzaOrder(int count){
    m_numPizzas = count;
    m_order = new Pizza[count];
    Pizza p = new Pizza("Small", 1, 0, 0);
    for (int i = 0; i < count; ++i){
      m_order[i] = p;
    }
  }

  /**
  * Create a addPizza method.
  * @param pizza The pizza instance from the pizza class
  * @return add Adds pizzas to the order
  */
  public int addPizza(Pizza pizza){
    int add = -1;
    Pizza p = new Pizza("Small", 1, 0, 0);
    for (int i = 0; i < m_order.length; ++i){
      if (m_order[i].equals(p)){
        m_order[i] = pizza;
        add += 2;
        if (add > m_order.length){
          break;
        }
        break;
      }
    }
    return add;
  }

  /**
  * Create a calcTotal method.
  * @return cost The total cost
  */
  public double calcTotal(){
    double cost = 0;
    for (int i = 0; i < m_order.length; ++i){
      cost += m_order[i].calcCost();
    }
    return cost;
  }

  /**
  * toString method to pretty print member variables
  * @return A string. Pretty printed representation of the object
  */
  public String toString(){
    double totalCost = calcTotal();
    String s = "";
    s += "Total Cost: $" + totalCost + "\n";
    s += "Your Order: \n";
    for (int i = 0; i < m_order.length; ++i){
      s += "\nSize: " + m_order[i].getSize();
      s += "\nCheese Toppings: " + m_order[i].getNumberOfCheeseToppings();
      s += "\nPepporoni Toppings: " + m_order[i].getNumberOfPepperoniToppings();
      s += "\nVeggie Toppings: " + m_order[i].getNumberOfVeggieToppings() + "\n";
    }
    return s;
  }

}
