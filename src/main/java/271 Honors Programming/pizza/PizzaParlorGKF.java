package pizza;
import java.util.Scanner;
class PizzaParlor{
    // instance variables ************************************************************************************************************
    private int myNumCheesePizzas; //# of cheese pizzas
    private int myNumPeppPizzas; // # of pepperoni pizzas
    private int myNumVegPizzas; //# of veggie pizzas
    private int myNumChickenAndSausagePizzas; // # of Chicken and Sausage Pizzas
    private int myCheeseSupply; // ounces of cheese
    private int myPepperoniSupply;// ounces of pepperoni
    private int myVeggieSupply; // ounces of veggies
    private int myDoughSupply; //ounces of dough
    private int mySauceSupply; 
    private int myChickenSupply; // ounces of chicken
    private int mySausageSupply; // ounces of sausage
    private int cheese;
    private int pepperoni;
    private int veggie;
    private int chickenSausage;
    private double myRevenue; // dollars collected
    private double myOrigAcctBal;//original bank account balance
    private String parlorName2; 
    private String name;
    Scanner sc = new Scanner(System.in);
  
    // constructors ************************************************************************************************************
    PizzaParlor(){
      myDoughSupply = 400;
      myNumCheesePizzas = 0;
      myNumPeppPizzas = 0;
      myNumVegPizzas = 0;
      myNumChickenAndSausagePizzas = 0;
      myCheeseSupply = 400;  
      myPepperoniSupply = 200;
      myVeggieSupply = 200;
      myChickenSupply = 400;
      mySausageSupply = 200;
      myRevenue = 0; 
      myOrigAcctBal = 1000;
    }
    PizzaParlor(String parlorName){
      System.out.println("What would you like the dough supply to be? ");
      myDoughSupply = sc.nextInt();
      System.out.println("What would you like the cheese supply to be? ");
      myCheeseSupply = sc.nextInt();  
      System.out.println("What would you like the sauce supply to be? ");
      mySauceSupply = sc.nextInt();
      System.out.println("What would you like the pepperoni supply to be? ");
      myPepperoniSupply = sc.nextInt();
      System.out.println("What would you like the veggie supply to be? ");
      myVeggieSupply = sc.nextInt();
      System.out.println("What would you like the chicken supply to be? ");
      myChickenSupply = sc.nextInt();
      System.out.println("What would you like the sausage supply to be? ");
      mySausageSupply = sc.nextInt();
      System.out.println("What would you like the bank account balance to be? ");
      myOrigAcctBal = sc.nextInt();
      System.out.println("What is your name? ");
      name = sc.next();
      myNumCheesePizzas = 0;
      myNumPeppPizzas = 0;
      myNumVegPizzas = 0;
      myNumChickenAndSausagePizzas = 0;  
      myRevenue = 0; 
      parlorName2 = parlorName;
    }
  
    // methods ************************************************************************************************************
    void orderCheese(){
      myNumCheesePizzas++;
      myRevenue += 8;// cheese pizza price:$8
      myCheeseSupply -= 12;//cheese needed per cheese pizza
      myDoughSupply -= 11; //dough needed per pizza
      mySauceSupply -= 12;
    }
    void orderCheese(int x){
      for (int i = 0; i<x; i++){
      myNumCheesePizzas++;
      myRevenue += 8;// cheese pizza price:$8
      myCheeseSupply -= 12;//cheese needed per cheese pizza
      myDoughSupply -= 11; //dough needed per pizza
      mySauceSupply -= 12;
      }
    }
    void orderPepperoni(){
      myNumPeppPizzas++;
      myRevenue += 10;//pepperoni pizza price:$10
      myCheeseSupply -= 8;//cheese needed per pepp pizza
      myPepperoniSupply -= 6;//pepperoni needed per pepp pizza
      myDoughSupply -= 11; //dough needed per pizza
      mySauceSupply -= 12;
    }
    void orderPepperoni(int x){
      for (int i = 0; i<x; i++){
      myNumPeppPizzas++;
      myRevenue += 10;//pepperoni pizza price:$10
      myCheeseSupply -= 8;//cheese needed per pepp pizza
      myPepperoniSupply -= 6;//pepperoni needed per pepp pizza
      myDoughSupply -= 11; //dough needed per pizza
      mySauceSupply -= 12;
      }
    }
    void orderVeggie(){
      myNumVegPizzas++;
      myRevenue += 11;//veggie pizza price:$11
      myCheeseSupply -= 8;//cheese needed per veggie pizza
      myVeggieSupply -= 12;//veggies needed per veggie pizza
      myDoughSupply -= 11; //dough needed per pizza
      mySauceSupply -= 12;
    }
    void orderVeggie(int x){
      for (int i = 0; i<x; i++){
      myNumVegPizzas++;
      myRevenue += 11;//veggie pizza price:$11
      myCheeseSupply -= 8;//cheese needed per veggie pizza
      myVeggieSupply -= 12;//veggies needed per veggie pizza
      myDoughSupply -= 11; //dough needed per pizza
      mySauceSupply -= 12;
      }
    }
    void orderChickenSausage(){
      myNumChickenAndSausagePizzas++;
      myRevenue += 15;
      myCheeseSupply -= 8;
      myChickenSupply -= 15;
      mySausageSupply -= 12;
      myDoughSupply -= 11;
      mySauceSupply -= 12;
    }
    void orderChickenSausage(int x){
      for (int i = 0; i<x; i++){
      myNumChickenAndSausagePizzas++;
      myRevenue += 15;
      myCheeseSupply -= 8;
      myChickenSupply -= 15;
      mySausageSupply -= 12;
      myDoughSupply -= 11;
      mySauceSupply -= 12;
      }
    }
    void getOrder(){
      System.out.println("How many cheese pizzas would you like? ");
      cheese = sc.nextInt();
      System.out.println("How many pepperoni pizzas would you like? ");
      pepperoni = sc.nextInt();
      System.out.println("How many veggie pizzas would you like? ");
      veggie = sc.nextInt();
      System.out.println("How many chicken and sausage pizzas would you like? ");
      chickenSausage = sc.nextInt();
    }
    void orderSupplies(){
      myDoughSupply += 500;
      mySauceSupply += 500;
      myCheeseSupply += 500;
      myPepperoniSupply += 500;
      myVeggieSupply += 500;
      myChickenSupply += 500;
      mySausageSupply += 500;
    }

  //getters ************************************************************************************************************
    int getNumCheesePizzas(){
      return cheese;
    }
  
    int getNumPepperoniPizzas(){
      return pepperoni;
    }
  
    int getNumVeggiePizzas(){
      return veggie;
    }
    int getNumChickenSausagePizzas(){
      return chickenSausage;
    }
  
    int getCheeseSupply(){
      return myCheeseSupply;
    }
  
    int getPepperoniSupply(){
      return myPepperoniSupply;
    }
  
    int getVeggieSupply(){
      return myVeggieSupply;
    }
    int getDoughSupply(){
      return myDoughSupply;
    }
    int getSauceSupply(){
      return mySauceSupply;
    }
    int getChickenSupply(){
      return myChickenSupply;
    }
    int getSausageSupply(){
      return mySausageSupply;
    }
    double getRevenueTotal(){
      return myRevenue;
    }
  
    double getBankAccountBalance(){
      return myOrigAcctBal + myRevenue;
    }

    //mutator methods ************************************************************************************************************
    void setDoughSupply(int a){
      myDoughSupply = a;
    }
    void setSauceSupply(int a){
      mySauceSupply = a;
    }
    void setCheeseSupply(int a){
      myCheeseSupply = a;
    }
    void setPepperoniSupply(int a){
      myPepperoniSupply = a;
    }
    void setVeggieSupply(int a){
      myVeggieSupply = a;
    }
    void setChickenSupply(int a){
      myChickenSupply = a;
    }
    void setSausageSupply(int a){
      mySausageSupply = a;
    }
    void setOriginalBankBalance(int a){
      myOrigAcctBal = a;
    }
    void nameParlor(String name){
      String parlorName = name;
    }

    //toString Method ************************************************************************************************************
    public String toString(){
      return parlorName2 + ":\n\nName for order: " + name
      + "\n\nMy Cheese Pizzas: " + myNumCheesePizzas
       + "\nMy Pepperoni Pizzas: " + myNumPeppPizzas
       + "\nMy Veggie Pizzas: " + myNumVegPizzas
       + "\nMy Chicken and Sausage Pizzas: " + myNumChickenAndSausagePizzas
       + "\n\nRemaining Cheese Supply: " + myCheeseSupply
       + "\nRemaining Pepperoni Supply: " + myPepperoniSupply
       + "\nRemaing Veggie Supply: " + myVeggieSupply
       + "\nRemaining Chicken Supply: " + myChickenSupply
       + "\nRemaining Sausage Supply: " + mySausageSupply
       + "\nRemaining Dough supply: " + myDoughSupply
       + "\nRemaining Sauce Supply: " + mySauceSupply
       + "\n\nRevenue: $" + myRevenue
       + "\nNew Bank Balance: $" + (myOrigAcctBal + myRevenue); 
    }
  }
  