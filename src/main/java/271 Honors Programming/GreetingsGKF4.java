import java.util.Scanner;


public class GreetingsGKF4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in); //this line is the instantiation //Console is an instance of the EasyReader class
        System.out.print("Enter your length: ");    //the string in double quotes is an argument
        double length = sc.nextInt(); //the console object calls the readLine method which is in the EasyReader class input from the keyboard is stored in a variable location called firstName
        System.out.print("Enter your width: ");
        double width = sc.nextInt();
        double perimeter = 2*length+2*width;
        System.out.println("The perimeter of a rectangle with length " + length + " and width " + width + " is " + perimeter);
    }
}
