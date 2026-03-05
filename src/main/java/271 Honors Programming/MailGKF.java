import java.util.Scanner;


public class MailGKF {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("What is the first dimension (Inches): ");
        double dim1 = sc.nextInt();
        System.out.println("What is the second dimension (Inches): ");
        double dim2 = sc.nextInt();
        System.out.println("What is the third dimension (Inches): ");
        double dim3 = sc.nextInt();
        System.out.println("What is the Weight of the Box (Pounds): ");
        double Weight = sc.nextInt();

        double length = Math.max(dim1, Math.max(dim2, dim3));
        double width;
        double height;
        if (length == dim1){
        width = dim2;
        height = dim3;
        }
        else if (length == dim2){
        width = dim1;
        height = dim3;
        }
        else{
        width = dim1;
        height = dim2;
        length = dim3;
        }

        double Girth = (width + height)*2;

        if ((length + Girth>100) && (Weight>70)) {
            System.out.println("Package is too large and too heavy.");
        }
        else if ((length + Girth>100) && (Weight<70)){
            System.out.println("Package is too large.");
        }
        else if ((length + Girth<100) && (Weight>70)){
            System.out.println("Package is too heavy.");
        }
        else{
            System.out.println("Package is acceptable.");
        }
    }
}
