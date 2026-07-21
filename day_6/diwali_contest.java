package day_6;
import java.util.Scanner;
public class diwali_contest {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int total_time = 240;
        int n = scan.nextInt();
        int p = scan.nextInt();
        int remaining_time = total_time- p;
        int  sum =0, count =0;
        for(int i = 0; i <n; i++){
            sum += 5 * (i + 1);
            if (sum > remaining_time){
                break;
            }
            count ++;

        }
        System.out.println(count);
        scan.close(); 
    }
}
