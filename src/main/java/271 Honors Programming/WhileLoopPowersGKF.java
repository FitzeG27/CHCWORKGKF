import java.util.Scanner;
public class WhileLoopPowersGKF {
    public static void main(String[] args){
        while (0 == 0){
        int answer = 2;
        Scanner sc = new Scanner(System.in);
        System.out.println("What power do you want 2 to be raised to?");
        int power = sc.nextInt();

        if (power == 1){
            answer = 2;
        }
        else if (power == 0){
            answer = 1;
        }
        else if (power == -1){
            System.exit(0);
        }
        else if(power>1){
            while (power-1>0){
            answer *= 2;
            power --;
        }
        }
        else {
            System.out.println("Program not advanced enough sry");
            System.exit(0);
        }
        System.out.println(answer);
        }
        }
    }

