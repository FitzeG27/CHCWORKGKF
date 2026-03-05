import java.util.Scanner;

public class PiApproximationInputAI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms for the series: ");
        int N = sc.nextInt();

        double sum = 0.0;
        for (int i = 1; i <= N; i++) {
            double term = 1.0 / (2 * i - 1);
            if (i % 2 == 0) term = -term;
            sum += term;
            //System.out.printf("N=%d, Sum=%.2f\n", i, sum);
        }
        System.out.println("Approx pi/4: " + sum);
        System.out.println("Actual pi/4: " + (Math.PI / 4));
    }
}
