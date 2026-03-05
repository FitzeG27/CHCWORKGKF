import java.util.Scanner;
public class palindromeGKF {
    public static void main(String[] arg){

        Scanner sc = new Scanner (System.in);
        System.out.println("What is the word");
        String word = sc.nextLine();
        String reverse = "";
        String newString = "";

        char[] characterArray = word.toCharArray();

        for (int d = 0; d<word.length(); d++){
            if ((characterArray[d]>=65 && characterArray[d]<=90)||(characterArray[d]>=97 && characterArray[d]<=122)){
                newString += word.charAt(d);
            }            
        }

         for (int i = newString.length()-1; i>=0; i--){
            reverse += newString.charAt(i);
        }
        if (newString.equalsIgnoreCase(reverse)){
            System.out.println("The word is a palindrome");
        }
        else {
            System.out.println("The word is not a palindrome");
        }


        sc.close();
    }
}
