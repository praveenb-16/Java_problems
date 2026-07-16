
import java.util.Scanner;
public class day_predictor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int DayNumber = scan.nextInt();
        switch(DayNumber){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number");
                break;                        
                    
        }
        scan.close();
    }
}
