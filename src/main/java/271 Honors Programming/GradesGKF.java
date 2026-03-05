import java.util.Scanner;

public class GradesGKF {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("How many grades do you want to enter?");
        int index = sc.nextInt();
        if (index<0){
            System.out.println("Invalid input");
        }
        else{
        int[] grade = new int[index];
        String[] course = new String[index];
        char[] letterGrade = new char[index];
        double[] QP = new double[index];
        double sum = 0;
        double sum2 = 0;

        for (int i = 0; i<index; i++){
            System.out.println("What is the course");
            course[i] = sc.next();
            System.out.println("What is the grade");
            grade[i] = sc.nextInt();
            if(grade[i]<0){
                System.out.println("Invalid Input");
                System.exit(1); //Terminates program and code stops running after this point
            }
            else{

            }
        }
        for (int l = 0; l<index; l++){
            if (grade[l]>=89){
                letterGrade[l] = 'A';
            }
            else if (grade[l]>=81){
                letterGrade[l] = 'B';
            }
            else if (grade[l]>=73){
                letterGrade[l] = 'C';
            }
            else if (grade[l]>=70){
                letterGrade[l] = 'D';
            }
            else if (grade[l]<=69){
                letterGrade[l] = 'F';
            
            }
        }
        for (int q = 0; q<index;q++){
            if (letterGrade[q] == 'A'){
                QP[q] = 4.0;
            }
            else if (letterGrade[q] == 'B'){
                QP[q] = 3.0;
            }
            else if (letterGrade[q] == 'C'){
                QP[q] = 2.0;
            }
            else if (letterGrade[q] == 'D'){
                QP[q] = 1.0;
            }
            else if (letterGrade[q] == 'F'){
                QP[q] = 0.0;
            }
        }
    

        

        for (int c = 0; c<index; c++){
            System.out.println("Course: " + course[c]);
            System.out.println("Grade: " + grade[c]);
            System.out.println("Letter Grade: " + letterGrade[c]);
            System.out.println("Quality Points: " + QP[c]);
            System.out.println(" ");
        }

        for (int a = 0; a<index; a++){
            sum = sum+grade[a];
        }
        for (int g = 0; g<index; g++){
            sum2 = sum2+QP[g];
        }
        double gradeAverage = sum/index;
        double GPA = sum2/index;
        System.out.println("Grade Average: " + gradeAverage);
        System.out.println("GPA: " + GPA);

    }
    

    }
}
