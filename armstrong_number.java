import java.util.Scanner;
public class armstrong_number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int remainder, sum = 0, count =0;
        int temp =a;
        while(a > 0){
            remainder = a%10;
            count += 1;
            a/=10;
        }
        while(a > 0){
            remainder = a%10;
            sum += Math.pow(remainder,count);
            a/=10;
        }

        if (temp == sum){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not a Armstrong Number");
        }

        
    }
}
