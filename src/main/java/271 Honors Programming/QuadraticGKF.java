import java.util.Scanner;

public class QuadraticGKF {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        Double a = sc.nextDouble();
        System.out.print("Enter the value of b: ");
        Double b = sc.nextDouble();
        System.out.print("Enter the value of c: ");
        Double c = sc.nextDouble();


        Double d = (b*b)-(4*a*c); //d = discriminant

        if(d > 0) {

            double root1 = (-b+Math.sqrt(d))/2*a;
            double root2 = (-b-Math.sqrt(d))/2*a;
        
        System.out.println("{" + root1 + "," + root2 + "}");
        }
        else if(d==0){

            Double root = -b/2*a;
            System.out.println(root);

        }

        else{

            double r4 = -b/(2.0*a);
            double r5 = Math.pow(-d, 0.5)/(2*a);
            System.out.println("Your answer is " + r4 + " + or - " + r5 +"i.");
        }
    }

}
