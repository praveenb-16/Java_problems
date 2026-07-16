
import java.util.Scanner;

public class letter_pattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (i==1 || i == 5 || j ==1 || (j == 10 && i <= 5)){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
