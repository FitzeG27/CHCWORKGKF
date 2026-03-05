import java.util.Scanner;

public class CodingQuiz {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many characters would you like to enter? ");
        int index = sc.nextInt();
        char[] characters = new char[index];
        char[] caps = new char[index];
        char[] low = new char[index];
        char[] digits = new char[index];
        char[] none = new char[index];
        int capsCount = 0;
        int lowCount = 0;
        int digitCount =0;
        int noneCount = 0;
        

        for (int i = 0;i<index;i++){
            System.out.println("What is the character? ");
            characters[i] = sc.next().charAt(0);
            }

        for(int p = 0;p<index; p++){
            if (characters[p]>=65 && characters[p]<=90){
                caps[capsCount] = characters[p];
                capsCount++;
            }
            else if (characters[p]>=97 && characters[p]<=122){
                low[lowCount] = characters[p];
                lowCount++;
            }
            else if (characters[p]>=48 && characters[p]<=57){
                digits[digitCount] = characters[p];
                digitCount++;
            }
            else {
                none[noneCount] = characters[p];
                noneCount++;
            }
        }

        if (capsCount>0){
            System.out.println("The Capitalized characters are: ");
            for (int c = 0;c<capsCount; c++){
                System.out.println(caps[c]);
            }
            System.out.println("");
        }
        else if (capsCount<=0){
            System.out.println("No capitalized characters");
        }
        
        if (lowCount>0){
            System.out.println("The lowercase characters are: ");
            for (int l = 0; l<lowCount; l++){
                System.out.println(low[l]);
            }
            System.out.println("");
        }
        else if (lowCount<=0){
            System.out.println("No lowercase characters");
        }
        
        if (digitCount>0){
            System.out.println("The digits are: ");
            for (int d = 0;d<digitCount; d++){
                System.out.println(digits[d]);
            }
            System.out.println("");
        }
        else if (digitCount<=0){
            System.out.println("No digits");
        }

        if (noneCount>0){
            System.out.println("The miscellaneous characters are: ");
            for (int n = 0; n<noneCount; n++){
                System.out.println(none[n]);
            }
            System.out.println("");
        }
        else if (noneCount<=0){
            System.out.println("No miscellaneous characters");
        }
        }
        }
        
    

