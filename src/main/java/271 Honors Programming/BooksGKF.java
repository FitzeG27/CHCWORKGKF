import java.util.Scanner;

public class BooksGKF {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Be Prepared books did you get? ");
        int bp = sc.nextInt();
        System.out.println("How many Next Best books did you get? ");
        int nb = sc.nextInt();

        int tb = bp+nb;

        if (tb >= 12){
            System.out.println("Your total is $" + (12.75 * tb));
        }
        else if (tb >= 3){
            System.out.println("Your total is $" + (13.95 * tb));
        }
        else if (bp == 1 && nb == 1){
            System.out.println("Your total is $35.95");
        }
        else if (bp >= 1 && nb == 0){
            System.out.println("Your total is $" + (15.95 * bp));
        }
        else if (bp == 0 && nb>=1){
            System.out.println("Your total is $" + (21.95 * nb));
        }
        else if (bp == 0 && nb == 1){
            System.out.println("Your total is $21.95");
        }
        
        
        
        sc.close();

    }
}
