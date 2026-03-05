import java.util.ArrayList;

public class StudentGKF {
    
    private String name;
    private int gradeLevel;
    private ArrayList<String> classes;
    private ArrayList<Integer> grades;

    public StudentGKF(){
        name = "";
        gradeLevel = 0;
        classes = new ArrayList<String>();
        grades = new ArrayList<Integer>();
    }

    public StudentGKF(String n, int gl, ArrayList<String> c, ArrayList<Integer> g){
        name = n;
        gradeLevel = gl;
        classes = c;
        grades = g;
    }

    public StudentGKF(StudentGKF s){
        this(s.name, s.gradeLevel, s.classes, s.grades);
    }


    //Getters
    public String getName(){
        return name;
    }

    public int getGradeLevel(){
        return gradeLevel;
    }
    public ArrayList<String> getClasses(){
        return classes;
    }
    public ArrayList<Integer> getGrades(){
        return grades;
    }


    //Setters
    public void setName(String n){
        name = n;
    }
    public void setGradeLevel(int gl){
        gradeLevel = gl;
    }
    public void setClasses(ArrayList<String> c){
        classes = c;
    }
    public void setGrades(ArrayList<Integer> g){
        grades = g;
    }


    //Methods
    public String toString(){
        return "Student: " + name + "\nGrade Level: " + gradeLevel + "\nClasses: " + classes + "\nGrades: " + grades;
    }
}