import java.util.Scanner;
public class StringSearchGKF {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String string = sc.nextLine();
        System.out.println("What do you want to search for");
        String searchPhrase = sc.nextLine();
        char stringArray[] = string.toCharArray();
        char searchStringArray[] = searchPhrase.toCharArray();
        String newString = "";
        String newSearchPhrase = "";

        for (int i = 0; i<string.length(); i++){
            if ((stringArray[i] >= 65 && stringArray[i]<=90) || (stringArray[i] >= 97 && stringArray[i]<=122)){
                newString += string.charAt(i);
            }
        }
        for (int i = 0; i<searchPhrase.length(); i++){
            if ((searchStringArray[i] >= 65 && searchStringArray[i]<=90) || (searchStringArray[i] >= 97 && searchStringArray[i]<=122)){
                newSearchPhrase += searchPhrase.charAt(i);
            }
        }

        int index = 0;
        while ((index = newString.indexOf(newSearchPhrase, index)) != -1) {
            System.out.println("Specified String is at index " + index);
            index++; 
        }       

    }
}
