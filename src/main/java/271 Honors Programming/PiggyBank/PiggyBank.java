package PiggyBank;
public class PiggyBank {
    //instance variables
    private int pennies;
    private int nickels;
    private int dimes;
    private int quarters;

    //constructors
    PiggyBank(){
        pennies = 0;
        nickels = 0;
        dimes = 0;
        quarters = 0;
    }

    PiggyBank(int numPennies, int numNickels, int numDimes, int numQuarters){
        pennies = numPennies;
        nickels = numNickels;
        dimes = numDimes;
        quarters = numQuarters;
    }

    //getters
    public int getPennies(){
        return pennies;
    }
    public int getNickels(){
        return nickels;
    }
    public int getDimes(){
        return dimes;
    }
    public int getQuarters(){
        return quarters;
    }

    //setters
    public void setPennies(int a){
        pennies = a;
    }
    public void setNickels(int a){
        nickels = a;
    }
    public void setDimes(int a){
        dimes = a;
    }
    public void setQuarters(int a){
        quarters = a;
    }

    //general methods
    public void depositCoins(int p, int n, int d, int q){
        pennies += p;
        nickels += n;
        dimes += d;
        quarters += q;
    }
    public void withdrawCoins(int p, int n, int d, int q){
        if (pennies<p || nickels<n || dimes<d || quarters<q){
            System.out.println("Not enough coins in the Piggy Bank");
        }
        else{
        pennies -= p;
        nickels -= n;
        dimes -= d;
        quarters -= q;
        }
    }
    public double calculateTotal(){
        double total = (pennies * .01) + (nickels * .05) + (dimes * .1) + (quarters * .25);
        return total;
    }
    public String toString(){
        return "\nPennies: " + pennies
      + "\nNickels: " + nickels
       + "\nDimes: " + dimes
       + "\nQuarters: " + quarters
       + "\nTotal: $" + calculateTotal(); 
    }
}
