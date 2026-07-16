
import java.util.Scanner;


public class strong_number{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check it a Strong number: ");
        int num = scan.nextInt();
        int total =0;
        int temp = num, r;
        while (num>0){
            r = num % 10;
            int fact = 1;
            for (int i = 1; i <= r; i++) {
                fact *= i;
            }
            total += fact;
            num /= 10;
        }
        if (temp == total){
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not a Strong Number");
        }
        scan.close();
    }
}