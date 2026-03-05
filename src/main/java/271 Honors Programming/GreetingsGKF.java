public class GreetingsGKF   //filename.java must match the this class name
//Name: Griffin Fitze
//This is my first program to output my name by hardcoding the name
{
    


    public static void main(String[] args)  // Every Java program needs this line
    {
        String firstName = "Griffin";   //firstName is a string storage location
        /* Griffin is a literal string. Print out exactly what you say. The text inside the quotation marks is stored as a string for variable firstName
        = is called an assignment statement - store what is on the right to the storage location on the left
        the = sign stores the text inside the quotations to variable firstName as a string
        The above code is two examples of hardcoding so it prints out the same thing every time. 
        */


        String lastName = "Fitze";
        /*The text "Fitze" is stored in variable lastName
         */

        System.out.println("Hello" + " " + firstName + " " + lastName); //concatenation - the addition of strings
        System.out.println("Congratulations on your first program!");


    }

}
