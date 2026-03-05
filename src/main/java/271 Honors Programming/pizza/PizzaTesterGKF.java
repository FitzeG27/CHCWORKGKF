package pizza;

public class PizzaTesterGKF{
    public static void main(String[] args){
      
      
      PizzaParlor diner2 = new PizzaParlor("Griffin's Pizza Parlor");
      diner2.getOrder();
      diner2.orderCheese(diner2.getNumCheesePizzas());
      diner2.orderPepperoni(diner2.getNumPepperoniPizzas());
      diner2.orderVeggie(diner2.getNumVeggiePizzas());
      diner2.orderChickenSausage(diner2.getNumChickenSausagePizzas());

  
  
      System.out.println(diner2);
  
      System.out.println("\nRevenue is $" + diner2.getRevenueTotal());
      System.out.println("Bank balance is now $" 
  + diner2.getBankAccountBalance());
    }
  }
  