import java.util.Scanner;

public class EasterGKF {
    public static void main(String[] args) {

        while(0==0){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Year: ");
        int y = sc.nextInt();

        int a = y % 19;
        int b = y/100;
        int c = y % 100;
        int d = b/4;
        int e = b % 4;
        int f = (b+8)/25;
        int g = (b-f+1)/3;
        int h = (19*a+b-d-g+15) % 30;
        int i = c/4;
        int k = c % 4;
        int r = (32 + 2 * e + 2 * i - h - k) % 7;
        int m = (a + 11 * h + 22 * r)/451;
        int n = (h + r - 7 * m + 114)/31;
        int p = (h + r - 7 * m + 114) % 31;
        int day = p+1;


        if(n==3){

            System.out.println("The date of Easter in " + y + " is March " + day);
        }
        else if (n==4){
            System.out.println("The date of Easter in " + y + " is April " + day);
        }
      }
    }

}