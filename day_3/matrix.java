package day_3;
import java.util.Scanner;
public class matrix { 
    public static void main(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int row = scan.nextInt();
        System.out.println("Enter no of colunms: ");
        int col = scan.nextInt();
        int a[][] = new int[row][col]; 
        int b[][] = new int[row][col];
        System.out.println("Enter Matrix A:");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.println("Enter the " + i + " and " + j +":");
                a[i][j] = scan.nextInt();
            }
        }
        System.out.println("Enter Matrix B:");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.println("Enter the " + i + " and " + j +":");
                b[i][j] = scan.nextInt();
            }
        }
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(a[i][j] + b[i][j] + " ");
                
            }
            System.out.println();
        }
        scan.close();
    }
    
}
