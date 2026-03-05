import java.util.Scanner;

public class LoanTableGKF {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.println("How much is the loan? ");
        double p = sc.nextDouble();
        System.out.println("How long is the loan in years? ");
        double y = sc.nextDouble();
        System.out.println("What is the low interest rate? (%) ");
        double lowRate = sc.nextDouble();
        System.out.println("What is the high interest rate? (%) ");
        double highRate = sc.nextDouble();

        double n = y * 12;
        

        for (double rate = lowRate; rate<= highRate; rate+=0.25){
            double k = (rate/100)/12;
            double c = Math.pow((1+k), n);
            double a = (p * k * c)/(c-1);
            System.out.println(a);
        }
    }
}