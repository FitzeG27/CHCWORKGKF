/*Greetings2.java is a non-project file, only syntax errors are reported
 * Greetings Program
 */

public class GreetingsGKF2 {
    
    public static void main(String[] args) {
        
        EasyReaderGKF console = new EasyReaderGKF(); //this line is the instantiation //Console is an instance of the EasyReader class
        System.out.print("Enter your first name: ");    //the string in double quotes is an argument
        String firstName = console.readLine();  //the console object calls the readLine method which is in the EasyReader class input from the keyboard is stored in a variable location called firstName
        System.out.print("Enter your last name: ");
        String lastName = console.readLine();

        System.out.print("Hello" + " " + firstName + " " + lastName + " !");
    }
}
