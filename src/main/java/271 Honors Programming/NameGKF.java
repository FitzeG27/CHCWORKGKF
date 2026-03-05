import java.util.Scanner;
public class NameGKF {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Write your name in this format: lastName, firstName middleName");
        String name = sc.nextLine();
        int comma = name.indexOf(',');
        String lastName = name.substring(0, comma);
        int space = name.indexOf(' ', (comma+2));
        String firstName = name.substring((comma+2), space);
        String middleInitial = name.substring((space+1), (space+2));

        System.out.println(firstName + " " + middleInitial +". " + lastName);
    }
}
