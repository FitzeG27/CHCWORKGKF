import java.util.Scanner;
public class TelephoneNumberWithMethodsGKF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        
        System.out.println("Enter the phone number");
        String phonenumber = sc.nextLine();
        String newtn = filter(phonenumber);

        System.out.println("");

        System.out.println("Original input: " + phonenumber);   
        System.out.println("Corrected input: " + newtn); 
        System.out.println("");

        check(newtn);
        checkCharacters(newtn);
        print(newtn);

        

        
        
    }
    public static String filter(String phonenumber){
        String newtn = "";
        for (int i = 0; i<phonenumber.length(); i++){
            if ((phonenumber.charAt(i)>='0' && phonenumber.charAt(i)<='9') || (phonenumber.charAt(i) == '(' || phonenumber.charAt(i) == ')' || phonenumber.charAt(i) == '-')){
                 newtn += phonenumber.charAt(i);
            }
        }
        return newtn;
    }
    public static void check(String newtn){
        if (newtn.length() == 13){

        }
        else{
            System.out.println("Incorrect length");
            System.exit(0);
        }
    }
    public static void checkCharacters(String newtn){
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
    }
    public static void print(String newtn){
        
        
        System.out.println("Area code:" + "\t" + newtn.substring(1, 4));
        System.out.println("Exchange:" + "\t" + newtn.substring(5, 8));
        System.out.println("Line Number:" + "\t" + newtn.substring(9)); 

    }
}
