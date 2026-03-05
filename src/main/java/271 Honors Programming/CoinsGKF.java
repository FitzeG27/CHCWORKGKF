
import java.util.Scanner;

public class CoinsGKF {
    public static void main(String[] args) {

        while(0==0){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of cents: ");
        int c = sc.nextInt();

        int d = c/100;
        int a1 = c % 100;
        int q = a1/25;
        int a2 = a1 % 25;
        int dime = a2/10;
        int a3 = a2 % 10;
        int n = a3/5;
        int p = a3 % 5;

        System.out.println("Dollars: " + d);
        System.out.println("Quarters: " + q);
        System.out.println("Dimes: " + dime);
        System.out.println("Nickels: " + n);
        System.out.println("Pennies: " + p);

        }

    }

}
