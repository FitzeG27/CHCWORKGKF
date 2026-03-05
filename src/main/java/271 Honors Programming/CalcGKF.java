import java.util.Scanner;
public class CalcGKF {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter equation");
        String equation = sc.next();
        String answer = solve(equation);
        System.out.print(answer);
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
    public static String filter(String expression){
        String newExpression = "";
        for (int i = 0; i<expression.length();i++){
            if ((expression.charAt(i)>='0' && expression.charAt(i)<='9') || expression.charAt(i) == 'x' || expression.charAt(i) == 'X' || expression.charAt(i) == '/' || expression.charAt(i) == '+' || expression.charAt(i) == '-' || expression.charAt(i) == '.' || expression.charAt(i) == '(' || expression.charAt(i) == ')'){
                newExpression += expression.charAt(i);
            }
        }
        return newExpression;
    }
    public static String filter2(String expression){
        String newExpression = "";
        for (int i = 0; i<expression.length();i++){
            if ((expression.charAt(i)>='0' && expression.charAt(i)<='9') || expression.charAt(i) == 'x' || expression.charAt(i) == 'X' || expression.charAt(i) == '/' || expression.charAt(i) == '+' || expression.charAt(i) == '-' || expression.charAt(i) == '.'){
                newExpression += expression.charAt(i);
            }
        }
        return newExpression;
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

    public static String solve(String equation){
        equation = filter(equation);
        String ParenthesisEq = "";
        double[] MultiplyAnswer = new double[equation.length()];
        double[] DivideAnswer = new double[equation.length()];

        for (int i = 0; i<equation.length(); i++){
        if (equation.lastIndexOf('(')>=0){
            if (equation.indexOf(')') == equation.length()-1){
                ParenthesisEq += equation.substring(equation.indexOf('('));
            }
            else{
                ParenthesisEq += equation.substring(equation.indexOf('('), (equation.indexOf(')')+1));}

            ParenthesisEq = ParenthesisEq.replace('X', 'x');
            ParenthesisEq = ParenthesisEq.replaceAll("\\(", "");
            ParenthesisEq = ParenthesisEq.replaceAll("\\)", "");
            if (ParenthesisEq.indexOf('x')>=0 || ParenthesisEq.indexOf('/')>=0){
                if (ParenthesisEq.indexOf('x') >= 0 && ParenthesisEq.indexOf('/') == -1 ){
                    String[] MultiplyEq = ParenthesisEq.split("x");
                    double[] MultiplyEqD = new double[MultiplyEq.length];
                    for (int c = 0; c<MultiplyEq.length; c++){
                        MultiplyEqD[c] = Double.parseDouble(MultiplyEq[c]);
                    }
                    MultiplyAnswer[i] = multiply(MultiplyEqD);
                
                    equation = equation.replaceAll(ParenthesisEq, Double.toString(MultiplyAnswer[i]));
                    equation = filter2(equation);

                    ParenthesisEq = "";
                    for (int n = 0; n<MultiplyEq.length; n++){
                    MultiplyEq[n] = null;
                    MultiplyEqD[n] = 0;
                }
                }
                else if (ParenthesisEq.indexOf('x') < ParenthesisEq.indexOf('/') && ParenthesisEq.indexOf('x') != -1){
                    String[] MultiplyEq = ParenthesisEq.split("x");
                    double[] MultiplyEqD = new double[MultiplyEq.length];
                    for (int c = 0; c<MultiplyEq.length; c++){
                        MultiplyEqD[c] = Double.parseDouble(MultiplyEq[c]);
                    }
                    MultiplyAnswer[i] = multiply(MultiplyEqD);

                    equation = equation.replaceAll(ParenthesisEq, Double.toString(MultiplyAnswer[i]));
                    equation = filter2(equation);
                }
                else if (ParenthesisEq.indexOf('/') >= 0 && ParenthesisEq.indexOf('x') == -1 || ParenthesisEq.indexOf('/') < ParenthesisEq.indexOf('x')){
                        String[] DivideEq = ParenthesisEq.split("/");
                        double[] DivideEqD = new double[DivideEq.length];
                        for (int c = 0; c<DivideEq.length; c++){
                            DivideEqD[c] = Double.parseDouble(DivideEq[c]);
                        }
                        DivideAnswer[i] = divide(DivideEqD);
                    
                        equation = equation.replaceAll(ParenthesisEq, Double.toString(DivideAnswer[i]));
                        equation = filter2(equation);
    
                        ParenthesisEq = "";
                        for (int n = 0; n<DivideEq.length; n++){
                        DivideEq[n] = null;
                        DivideEqD[n] = 0;
                    }
            }
        }
        } 
    }
    return equation;
    }
    
    }
