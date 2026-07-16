import java.util.Scanner;

public class Library_management {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int day = scan.nextInt();

        if (day == 1) {
            System.out.println("No Fine");
        } else if (day> 1 && day <= 5) {
            System.out.println("Rs.50 Fine");
        } else if (day > 5 && day <= 10) {
            
            System.out.println("Rs.100 Fine");
        } else if (day > 10 && day <= 20){
            System.out.println("Rs.150 Fine");
        }
        else{
            System.out.println("Rs. 200 Fine");
        }
        scan.close();
    }
}