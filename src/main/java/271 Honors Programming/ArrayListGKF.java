import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListGKF {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList <String> list = new ArrayList<>();
        System.out.println("What size words would you like to search for? ");
        int num = sc.nextInt();
        String value;

        for (int i = 0; i<=1000000; i++){
            System.out.println("What word would you like to add to the list? (Type -1 to stop adding words)");
            value = sc.next();
            if ((value.equals("-1"))){
                break;
            }
            else {
                list.add(value);
            }
        }
        System.out.println("");
        System.out.println("Original List: ");

        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        ArrayList <String> newlist = new ArrayList<>();
        for (String word: list){
            if (word.length() == num){
                newlist.add(word);
            }
        }

        System.out.println("");
        System.out.println("New List: ");
        while(!newlist.isEmpty()){
            System.out.println(newlist.remove(0));
        }
    }
}
