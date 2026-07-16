//Insurance Company
//Eligible for the insurance or not
//Problem
//married --> Eligible for insurance
//unmarried male and age greater than 30 --> Eligible for insurance
//unmarried female and age greater than 25 --> Eligible for insurance
// else Not Eligible for Insurance
import java.util.Scanner;
public class insurance_company {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Marital Status(Married / Unmarried): ");
        char Marital = scan.next().charAt(0);
        System.out.println("Enter the Gender(Male / Female): ");
        char Gender = scan.next().charAt(0);
        System.out.println("Enter your Age: ");
        int Age = scan.nextInt();

        if ((Marital == 'M') || (Marital == 'm')){
            System.out.println("Eligible for the Insurance");
        }
        else {
            if (((Gender == 'M') ||(Gender == 'm')) && (Age >= 30)){
                System.out.println("Eligible for Insurance");
            }
            else if (((Gender == 'F') || (Gender == 'f')) && (Age >= 25)){
                System.out.println("Eligible for Insurance");
            }
            else{
                System.out.println("Not Eligible for Insurance");
            } 
        }
        scan.close();
    }
    
}
