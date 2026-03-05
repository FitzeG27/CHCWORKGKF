import java.util.Scanner;


public class IRSGKF {
    public static void main(String[] args){

        while(0==0){

        Scanner sc = new Scanner(System.in);
        System.out.println("Are you single (1) or married (2)?");
        int status = sc.nextInt();
        System.out.println("What is your income?");
        double income = sc.nextDouble();
        double tax;

        if(income>0){

        if (status == 1){
            if (income > 0 && income <= 27050){
                 tax = (.15*income);
                 System.out.println("Your income tax is $" + tax);
            }
            else if (income>27050 && income <= 65550){
                 tax = (4057.50 + (.275* (income-27050)));
                 System.out.println("Your income tax is $" + tax);
            }
            else if (income>65550 && income<=136750){
                 tax = (14645.0 + (.305*(income-65550)));
                 System.out.println("Your income tax is $" + tax);
            }
            else if (income>136750 && income<=297350){
                 tax = (36361.0 + (.355*(income-136750)));
                 System.out.println("Your income tax is $" + tax);
            }
            else{
                 tax = (93374.0+(.391*(income-297350)));
                 System.out.println("Your income tax is $" + tax);
            }
        }
        else if (status == 2){
            if (income>0 && income<=45200){
                 tax = .15*income;
                 System.out.println("Your income tax is $" + tax);
            }
            else if (income>45200 && income<=109250){
                 tax = (6780.0+(.275*(income-45200)));
                 System.out.println("Your income tax is $" + tax);
            }
            else if (income>109250 && income<=166500){
                 tax = (24393.75+(.305*(income-109250)));
                 System.out.println("Your income tax is $" + tax);
            }
            else if (income>166500 && income<=297350){
                 tax = (41855.0+(.355*(income-166500)));
                 System.out.println("Your income tax is $" + tax);
            }
            else{
                 tax = (88306.75+(.391*(income-297350)));
                 System.out.println("Your income tax is $" + tax);
            }
        }
        else{
            System.out.println("That is not an appropriate status, please re-enter");
        }
    
    

    }
    else {
         System.out.println("That is not an appropriate income, please re-enter");

    }
    }
}
}

//Answer Key:
//a: $8100
//b: $3750
//c: $89342.90
//d: $48164.75
//e: $4500
//f: $172610.15000000002
//g: $43097.50
//h: $8993.75
//i: $30722.50
//j: $31252.25