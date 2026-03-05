import java.util.Scanner;

public class IfElseTriangleGKF {
    public static void main(String[] args){
        boolean result;
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the length of the first side?");
        double side1 = sc.nextDouble();
        System.out.println("What is the length of the second side?");
        double side2 = sc.nextDouble();
        System.out.println("What is the length of the third side?");
        double side3 = sc.nextDouble();


        if (side1>side2 && side1>side3){
            if ((Math.pow(side2, 2) + Math.pow(side3, 2)) == Math.pow(side1, 2)){
                result = true;
            }
            else{
                result = false;
            }
        }
        else if (side2>side1 && side2>side3){
            if ((Math.pow(side1, 2) + Math.pow(side3, 2)) == Math.pow(side2, 2)){
                result = true;
            }
            else{
                result = false;
            }
        }
        else if (side3>side1 && side3>side2){
            if ((Math.pow(side2, 2) + Math.pow(side1, 2)) == Math.pow(side3, 2)){
                result = true;
            }
            else{
                result = false;
            }
        }
        else{
            result = false;
        }

        if (result == true){
            System.out.println("This is a right triangle");
        }
        else{
            System.out.println("This is not a right triangle");
        }

    }
}
