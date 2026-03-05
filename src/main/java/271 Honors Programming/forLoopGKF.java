import java.util.Scanner;

public class forLoopGKF {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the start number:");
        int startNum = sc.nextInt();
        System.out.println("Enter the ending number:");
        int endNum = sc.nextInt();
        System.out.println("Enter how much it should increment by:");
        int change = sc.nextInt();

        if (startNum<endNum){
        for (int i = startNum; i <= endNum; i+= change){
            if (i < endNum){
            System.out.print(i+", ");}
            else if (i == endNum){
                System.out.print(endNum);
            }
        }
    }
        else if (startNum == endNum){
            System.out.print(startNum);
        }
        else if (startNum>endNum){
            for (int i = startNum; i >= endNum; i-= change){
               if (i > endNum){ System.out.print(i + ", ");
            }
               else if (i == endNum){
                System.out.print(endNum);
               }
            }

        }
        
        



    
    }
}
