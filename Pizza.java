// Hunter Peasley
// 2390162
// hpeasley@chapman.edu
// CPSC 231 - 05
// //PART 1: Pizza.java

/**
* The Pizza class represents the pizzas and what is on them
* @author Hunter Peasley
* @version 1.0
* @see Pizza, PizzaOrder, PizzaDriver
*/

public class Pizza{

  /** a String representation of the pizza's size as 'small', 'medium', or 'large'*/
  private String pizzaSize;
  /** an int representation of the number of cheese toppings*/
  private int numOfCheeseToppings;
  /** an int representation of the number of pepperoni toppings*/
  private int numOfPepperoniToppings;
  /** an int representation of the number of veggie toppings*/
  private int numOfVeggieToppings;

  /** Create a Pizza instance*/
  public Pizza(){
    pizzaSize = "";
    numOfCheeseToppings = 0;
    numOfPepperoniToppings = 0;
    numOfVeggieToppings = 0;
  }

  //overloaded CONSTRUCTOR
  /**
  * Create a Pizza instance with all attributes specified
  * @param size The size of the pizza
  * @param CheeseTop The number of cheese toppings
  * @param PepperoniTop The number of pepperoni toppings
  * @param VeggieTop The number of veggie toppings
  */
  public Pizza(String size, int CheeseTop, int PepperoniTop, int VeggieTop){
    pizzaSize = size;
    numOfCheeseToppings = CheeseTop;
    numOfPepperoniToppings = PepperoniTop;
    numOfVeggieToppings = VeggieTop;
  }

  // copy constructor
  /**
  * Create the Pizza copy constructor
  * @param p The Pizza to copy
  */
  public Pizza(Pizza p){
    this.pizzaSize = p.pizzaSize;
    this.numOfCheeseToppings = p.numOfCheeseToppings;
    this.numOfPepperoniToppings = p.numOfPepperoniToppings;
    this.numOfVeggieToppings = p.numOfVeggieToppings;
  }


  // MUTATORS (setter)
  /**
  * Mutator for the size member variable
  * @param size The Pizza size
  */
  public void setSize(String size){
    pizzaSize = size;
  }

  /**
  * Mutator for the CheeseTop member variable
  * @param CheeseTop The cheese toppings
  */
  public void setNumberofCheeseToppings(int CheeseTop){
    numOfCheeseToppings = CheeseTop;
  }

  /**
  * Mutator for the PepperoniTop member variable
  * @param PepperoniTop The pepperoni toppings
  */
  public void setNumberofPepperoniToppings(int PepperoniTop){
    numOfPepperoniToppings = PepperoniTop;
  }

  /**
  * Mutator for the VeggieTop member variable
  * @param VeggieTop The veggie toppings
  */
  public void setNumberofVeggieToppings(int VeggieTop){
    numOfVeggieToppings = VeggieTop;
  }


  //accessors (getter)
  /**
  * Accessor for the pizzaSize member variable
  * @return pizzaSize The size of the Pizza
  */
  public String getSize(){
    return pizzaSize;
  }

  /**
  * Accessor for the numOfCheeseToppings member variable
  * @return numOfCheeseToppings The cheese toppings on the Pizza
  */
  public int getNumberOfCheeseToppings(){
    return numOfCheeseToppings;
  }

  /**
  * Accessor for the numOfPepperoniToppings member variable
  * @return numOfPepperoniToppings The pepperoni toppings on the Pizza
  */
  public int getNumberOfPepperoniToppings(){
    return numOfPepperoniToppings;
  }

  /**
  * Accessor for the numOfVeggieToppings member variable
  * @return numOfVeggieToppings The veggie on the Pizza
  */
  public int getNumberOfVeggieToppings(){
    return numOfVeggieToppings;
  }

  // calcCost calculates the costTotal of the pizza ordered
  /**
  * Create a calcCost method.
  */
  public double calcCost(){
    double costTotal = 0.0;
    String s = pizzaSize.toLowerCase();
    if (s.equals("small")){
      costTotal += 10.0;
    }
    else if (s.equals("medium")){
      costTotal += 12.0;
    }
    else if (s.equals("large")){
      costTotal += 14.0;
    }
    else{
      costTotal += 0.0;
    }
    costTotal += 2*numOfCheeseToppings + 2*numOfPepperoniToppings + 2*numOfVeggieToppings; // adds $2 per topping to the costTotal
    return costTotal;
  }

  /**
  * toString method to pretty print member variables
  * @return A string. Pretty printed representation of the object
  */
  public String toString(){
    String s = "";
    s += "\nSize: " + pizzaSize;
    s += "\nCheese Toppings: " + numOfCheeseToppings;
    s += "\nPepporoni Toppings: " + numOfPepperoniToppings;
    s += "\nVeggie Toppings: " + numOfVeggieToppings;
    double costTotal = calcCost();
    s += "\nTotal: $" + costTotal;
    return s;
  }

  //   /**
  //   * Determine whether or not two Pizzas are equal
  //   * @param o Object to be compared for equality.
  //   * @return True if the objects are equal, false otherwise.
  //   */
  public boolean equals(Object o){
    if (this == o){
      return true;
    }
    if (!(o instanceof Pizza)){
      return false;   // FIXMEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE outputs false
    }
    Pizza p = (Pizza) o;
    return (this.pizzaSize.equals(p.pizzaSize) && this.numOfCheeseToppings == p.numOfCheeseToppings && this.numOfPepperoniToppings == p.numOfPepperoniToppings && this.numOfVeggieToppings == p.numOfVeggieToppings);
  }
}
