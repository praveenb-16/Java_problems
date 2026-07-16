import java.util.Scanner;
public class switch_case {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1.Addition");
        System.out.println("2.Subraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("Enter your Choice");
        int choice = input.nextInt();
        int A = input.nextInt();
        int B = input.nextInt();
        switch(choice){
            case 1:
                System.out.println("Sum = " + (A + B));
                break;
            case 2:
                System.out.println("Sub = " + (A - B));
                break;    
            case 3:
                System.out.println("Multiplication = " + (A * B));
                break;
            case 4:
                System.out.println("Divison :" + (A/B));    
                break;    
        }
    input.close();    
    }
}
