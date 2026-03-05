import java.util.Scanner;

public class CalculatorGKF {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the expression");
        String expression = sc.nextLine();
        String newExpression = "";
        for (int i = 0; i<expression.length();i++){
            if (expression.charAt(i)>='0' && expression.charAt(i)<='9' || expression.charAt(i) == 'x' || expression.charAt(i) == '/' || expression.charAt(i) == '+' || expression.charAt(i) == '-' || expression.charAt(i) == '.' || expression.charAt(i) == '(' || expression.charAt(i) == ')'){
                newExpression += expression.charAt(i);
            }
        }
        String[] ParenthesisMultiply = new String[newExpression.length()];
        double[] ParenthesisMultiply2 = new double[newExpression.length()];
        String[] ParenthesisDivide = new String[newExpression.length()];
        double[] ParenthesisDivide2 = new double[newExpression.length()];
        String[] ParenthesisAdd = new String[newExpression.length()];
        double[] ParenthesisAdd2 = new double[newExpression.length()];
        String[] ParenthesisSubtract = new String[newExpression.length()];
        double[] ParenthesisSubtract2 = new double[newExpression.length()];
        String ParenthesisEquation = "";
        double[] MultiplyAnswer = new double[newExpression.length()];
        double[] DivideAnswer = new double[newExpression.length()];
        double[] AddAnswer = new double [newExpression.length()];
        double[] SubtractAnswer = new double[newExpression.length()];

        for (int m = 0; m<newExpression.length();m++){
            if (newExpression.indexOf('(')>=0){
                ParenthesisEquation += newExpression.substring(newExpression.indexOf('(')+1, newExpression.indexOf(')'));
                if (ParenthesisEquation.indexOf('x')>=0 || ParenthesisEquation.indexOf('/')>=0){
                    ParenthesisMultiply = ParenthesisEquation.split("x");
                    for (int m2 = 0; m2<ParenthesisMultiply.length; m2++){
                        ParenthesisMultiply2[m2] = Double.parseDouble(ParenthesisMultiply[m2]);
                    }
                    MultiplyAnswer[m] = multiply(ParenthesisMultiply2);
                    for (int m3 = 0; m3<newExpression.length(); m3++){
                        ParenthesisEquation = ParenthesisEquation.replaceAll(ParenthesisMultiply[m3], Double.toString(MultiplyAnswer[m3]));
                    }
                    ParenthesisMultiply = null;
                    ParenthesisMultiply2 = null;

                    ParenthesisDivide = ParenthesisEquation.split("/");
                    for (int m2 = 0; m2<ParenthesisDivide.length; m2++){
                        ParenthesisDivide2[m2] = Double.parseDouble(ParenthesisDivide[m2]);
                    }
                    DivideAnswer[m] = divide(ParenthesisDivide2);
                    for (int m3 = 0; m3<newExpression.length(); m3++){
                        ParenthesisEquation = ParenthesisEquation.replaceAll(ParenthesisDivide[m3], Double.toString(DivideAnswer[m3]));
                    }
                    ParenthesisDivide = null;
                    ParenthesisDivide2 = null;
                }
                else if (ParenthesisEquation.indexOf('-')>=0 || ParenthesisEquation.indexOf('+')>=0){
                    ParenthesisSubtract = ParenthesisEquation.split("-");
                    for (int m2 = 0; m2<ParenthesisSubtract.length; m2++){
                        ParenthesisSubtract2[m2] = Double.parseDouble(ParenthesisSubtract[m2]);
                    }
                    SubtractAnswer[m] = subtract(ParenthesisSubtract2);
                    for (int m3 = 0; m3<newExpression.length(); m3++){
                        ParenthesisEquation = ParenthesisEquation.replaceAll(ParenthesisSubtract[m3], Double.toString(SubtractAnswer[m3]));
                    }
                    ParenthesisSubtract = null;
                    ParenthesisSubtract2 = null;

                    ParenthesisAdd = ParenthesisEquation.split("/");
                    for (int m2 = 0; m2<ParenthesisAdd.length; m2++){
                        ParenthesisAdd2[m2] = Double.parseDouble(ParenthesisAdd[m2]);
                    }
                    AddAnswer[m] = add(ParenthesisAdd2);
                    for (int m3 = 0; m3<newExpression.length(); m3++){
                        ParenthesisEquation = ParenthesisEquation.replaceAll(ParenthesisAdd[m3], Double.toString(AddAnswer[m3]));
                    }
                    ParenthesisAdd = null;
                    ParenthesisAdd2 = null;
                }
                
            }
        }
        System.out.println(ParenthesisEquation);


        



    }
    public static double add(double[] a){
        double answer = 0;

        for (int i = 0; i<a.length; i++){
            answer += a[i];
        }
        return answer;
    }
    public static double subtract(double[] a){
        double answer = a[0];

        for (int i = 1; i<a.length; i++){
            answer -= a[i];
        }
        return answer;
    }
    public static double multiply(double[] a){
        double answer = a[0];

        for (int i = 1; i<a.length; i++){
            answer *= a[i];
        }
        return answer;
    }
    public static double divide(double[] a){
        double answer = a[0];

        for (int i = 1; i<a.length; i++){
            answer /= a[i];
        }
        return answer;
    }
    public static String quadraticFormula(double a, double b, double c){

        Double d = (b*b)-(4*a*c); //d = discriminant

        if(d > 0) {

            double root1 = (-b+Math.sqrt(d))/2*a;
            double root2 = (-b-Math.sqrt(d))/2*a;
        
        return("{" + root1 + "," + root2 + "}");
        }
        else if(d==0){

            Double root = -b/2*a;
            return("Your answer is " + root);
        }

        else{

            double r4 = -b/(2.0*a);
            double r5 = Math.pow(-d, 0.5)/(2*a);
            return ("Your answer is " + r4 + " + or - " + r5 +"i.");
        }
    }
}



    

