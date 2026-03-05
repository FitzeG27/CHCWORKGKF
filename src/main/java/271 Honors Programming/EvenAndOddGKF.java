import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddGKF {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");
        int index = sc.nextInt();
        int[] list = new int[index];
        for (int n = 0; n<index; n++){
            if (n == 0){
                System.out.println("Enter the first number");
            }
            else {
                System.out.println("Enter the next number");
            }
            list[n] = sc.nextInt();
        }
        
        System.out.println(" ");
        Arrays.sort(list);
        int g = 0;
        int h = 0;
        int evenIndex = 0;
        int oddIndex = 0;

        int[] even = new int[list.length];
        int[] odd = new int[list.length];

        for (int i = 0; i<list.length; i++){
            if (list[i]%2 == 0){
                even[g] = list[i];
                g++;
                evenIndex = evenIndex + 1;
            }
            else {
                odd[h] = list[i];
                h++;
                oddIndex = oddIndex + 1;
            }
        }
        if (evenIndex>0){
        System.out.println("The even numbers are: ");
        for (int e = 0; e<evenIndex; e++){
            System.out.println(even[e]);
        }
        System.out.println(" ");}
        else{
            System.out.println("No even numbers");
            System.out.println(" ");
        }
        

        if (oddIndex>0){
        System.out.println("The odd numbers are: ");
        for (int o = 0; o<oddIndex; o++){
            System.out.println(odd[o]);
        }
        System.out.println(" ");}
        else {
            System.out.println("No odd numbers");
            System.out.println(" ");
        }
    }
}
