import java.util.*;
public class ArrayListNewGKF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How long should list1 be? ");
        int length;
        int num;

        ArrayList list1 = new ArrayList();
        ArrayList list2 = new ArrayList();

        int x;

        if (sc.hasNextInt()){
            length = sc.nextInt();
            for (int i = 0; i<length; i++){
                x = (int)((Math.random()*100)+1);
                Integer obj = new Integer(x);
                list1.add(obj);
            }
        }
        else{
            System.out.println("Invalid value");
            System.exit(1);
        }


        for (int i = 0; i<=1000000; i++){
            System.out.println("What number would you like to add to the list? (Type -1 to stop adding numbers)");
            num = sc.nextInt();
            if (num == -1){
                break;
            }
            else {
                list2.add(num);
            }



    }
}
}

