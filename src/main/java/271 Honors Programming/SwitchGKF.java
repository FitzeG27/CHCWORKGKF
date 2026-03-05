import java.util.Scanner;


public class SwitchGKF {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int input = sc.nextInt();

        switch (input){

            case 1: case 2:
                System.out.println("Buckle my shoe.");
                break;
            case 3: case 4:
                System.out.println("Shut the door.");
                break;
            case 5: case 6:
                System.out.println("Pick up sticks.");
                break;
            case 7: case 8:
                System.out.println("Lay them straight.");
                break;
            case 9: case 10:
                System.out.println("Big fat hen.");
                break;
            default :
            System.out.println("Invalid Input");
            break;
            



        }








    }
}
