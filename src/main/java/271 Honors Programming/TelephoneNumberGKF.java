import java.util.Scanner;

public class TelephoneNumberGKF
{
/* This program is a telephone number validator.  It scans an input
     telephone number String and validates it as a String in a standard 
     format with parentheses, dashes and numbers (for example,
     (987)654-3210, where 987 is the area code, 654 is the exchange, 
     and 3210 is the line number.  
   
   The program performs the following operations on the input String:
   
   1.  Remove all characters from the String which are not numeric or 
   parenthesis or dash.
   
   2.  Check to see that the new String is the correct length (13).  If it 
   is not, print an error message stating the wrong length.
   
   3.  Check that the ( is in position 0, the ) is in position 4 and the 
   dash is in position 8.  If it is not, print an appropriate error message. 
   
   4.  Takes the valid format telephone number and divides it into 
   its three components (area code, exchange, and line number) and 
   prints each seperately.
   
   */
public static void main(String[] args)
{
	Scanner console = new Scanner(System.in);
	System.out.print("Please enter the original telephone number: "); 
	String phonenumber = console.nextLine();
	String newtn = "";
   
   System.out.println();

// #1 ********************************************************	
/* Write the code here to remove all characters from the String that 
     are not numeric or parenthesis or dash.*/
      for (int i = 0; i<phonenumber.length(); i++){
          if ((phonenumber.charAt(i)>='0' && phonenumber.charAt(i)<='9') || (phonenumber.charAt(i) == '(' || phonenumber.charAt(i) == ')' || phonenumber.charAt(i) == '-')){
               newtn += phonenumber.charAt(i);
          }
      }





      System.out.println("Original input: " + phonenumber);   
      System.out.println("Corrected input: " + newtn);      
            
		System.out.println();

// #2 ********************************************************
/* Write the code here to check to see that the new String is the 
    correct length (13) and print an error message if necessary.*/	
      if (newtn.length() == 13){

      }
      else{
          System.out.println("Incorrect length");
          System.exit(0);
      }
      
       



// #3 ********************************************************
/* Write the code here to check that the ( is in position 0, the ) is in
     position 4 and the dash is in position 8.  If it is not, print an 
     appropriate error message. */
      
     if (newtn.charAt(0) == '('){

     }
     else{
          System.out.println("'(' is not in the correct position");
          System.exit(0);
     }
     if (newtn.charAt(4) == ')'){

     }
     else{
          System.out.println("')' is not in the correct position");
          System.exit(0);
     }
     if (newtn.charAt(8) == '-'){

     }
     else{
          System.out.println("'-' is not in the correct position");
          System.exit(0);
     }




     

// #4 ********************************************************
/* Write the code here to check that takes a valid format telephone 
     number and divides it into its three components (area code, 
     exchange, and line number) and prints each seperately.*/
    
    
    
    
     System.out.println("Area code:" + "\t" + newtn.substring(1, 4));
      System.out.println("Exchange:" + "\t" + newtn.substring(5, 8));
      System.out.println("Line Number:" + "\t" + newtn.substring(9)); 
		
}
}