
import java.util.Scanner;

public class char_pattern {
    public static void main(String[] args) {
        int letter = 65, i, j , rows;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        rows = scan.nextInt();
        for(i =0; i< rows; i++){
            for(j =0; j<= i; j++){
                System.out.print((char)(letter)+ " ");
                letter += 3;
            }
            System.out.println();
        }
        scan.close();
        }
}
    

