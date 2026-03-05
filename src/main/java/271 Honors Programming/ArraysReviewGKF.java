import java.util.Arrays;
import java.util.Scanner;

public class ArraysReviewGKF {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int list1[] = {5, 3, 2, 6, 10, 9, 1, 4, 8, 7};

        System.out.println("How many slots do you want to be in your array");
        while(!sc.hasNextInt()){
                System.out.println("This is not a number");
                System.exit(1);
            }
        int slots = sc.nextInt();

        int list2[] = new int[slots];

        int count = 0;
        for (int i = 0; i<=slots-1; i++){
            System.out.println("What int would you like to insert? (" + (slots-count) + " left)");
            while(!sc.hasNextInt()){
                System.out.println("This is not a number");
                System.exit(1);
            }
            list2[i] = sc.nextInt();
            count++;
        }

        Arrays.sort(list1);
        Arrays.sort(list2);
        //Original Lists
        System.out.print("Sorted List1: "); 
        PrintArray(list1);
        System.out.println("");
        System.out.print("Sorted List2: ");
        PrintArray(list2);
        System.out.println("");
        System.out.println("List1 Average: " + (AverageElements(list1)));
        System.out.println("List2 Average: " + (AverageElements(list2)));

        //List1 with Inserted and Deleted Elements
        InsertElement(list1, 2, 4);
        System.out.print("Sorted List1 with Inserted Element: ");
        PrintArray(list1);
        System.out.println("");
        System.out.print("Sorted List1 with Inserted and Deleted Element: ");
        DeleteElement(list1, 3);
        PrintArray(list1);
        System.out.println("");
        System.out.println("New List1 Average: " + (AverageElements(list1)));
        System.out.println("New List2 Average: " + (AverageElements(list2)));

    }
    public static void PrintArray(int Array[]){
        
        for (int i = 0; i<=Array.length-1; i++){
            if (i != Array.length-1){
            System.out.print(Array[i] + ", ");
            }
            else {
                System.out.print(Array[i]);
            }
        }
    }
    public static void InsertElement(int Array[], int element, int index){
        for (int i = 1; i<=Array.length-(index+1); i++){
            Array[Array.length-i] = Array[(Array.length-i)-1];
        }
        Array[index] = element;
    }
    public static void DeleteElement(int Array[], int index){
        Array[index] = 0;
        for (int i = 0; i<=Array.length-(index+2); i++){
            Array[index+i] = Array[(index+i)+1];
        }
        Array[Array.length-1] = 0;
    }
    public static double AverageElements(int Array[]){
        double elements = 0;

        for (int i = 0; i<=Array.length-1; i++){
            elements += Array[i];
        }
        double avg = elements / Array.length;
        return avg;
    }
}
