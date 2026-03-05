import java.util.Scanner;


public class GreetingsGKF3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in); //this line is the instantiation //Console is an instance of the EasyReader class
        System.out.print("Enter your first name: ");    //the string in double quotes is an argument
        String firstName = sc.nextLine(); //the console object calls the readLine method which is in the EasyReader class input from the keyboard is stored in a variable location called firstName
        System.out.print("Enter your last name: ");
        String lastName = sc.nextLine();
        System.out.println("Hello" + " " + firstName + " " + lastName + " !");
    }
}

