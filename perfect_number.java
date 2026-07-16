
import java.util.Scanner;


public class perfect_number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check it a perfect number: ");
        int num = scan.nextInt();
        int total = 0;
        for(int i =1; i<num; i++){
            if (num % i == 0){
                total += i;
            }
        }
        if (total == num){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not a Perfect Number");
        }
        scan.close();
    }   
}
