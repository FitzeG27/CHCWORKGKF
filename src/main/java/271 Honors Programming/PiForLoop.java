import java.util.Scanner;

public class PiForLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How close would you like the approximation of pi to be");
        int N = sc.nextInt();
        double piApprox = 0.0;
        for (int k = 0; k < N; k++) {
            double term = Math.pow(-1, k) / (2 * k + 1);
            piApprox += term;
        }

        System.out.println("The approximation for pi/4 is " + piApprox);
        System.out.println("The approximation for pi is " + (piApprox * 4));
    }

}