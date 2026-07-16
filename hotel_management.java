
import java.util.Scanner;


public class hotel_management {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;
        int total = 0;
        do{
        System.out.println("1.Vegetarian\n 2.Non-Vegetarian\n 3.Bill\n 4.Exit");
        System.out.println("Enter you choice");
        choice = scan.nextInt();
        if (choice == 1){
            System.out.println("VEGETARIAN MENU\n 1.Dosa - Rs.50/- \n 2.Idly - \n 3.Poori\n 4.Pongal");
            System.out.println("Enter your dish no: ");
            int dish_no = scan.nextInt();
            switch (dish_no){
                case 1:
                    System.out.println("Enter the no of Dosa: ");
                    int count = scan.nextInt();
                    total += 50 * count;
                    break;
                case 2:
                    System.out.println("Enter the no of Idly: ");
                    count = scan.nextInt();
                    total += 20 * count;
                    break;
                case 3:
                    System.out.println("Enter the no of Poori: ");
                    count = scan.nextInt();
                    total += 30 * count; 
                    break;
                case 4:
                    System.out.println("Enter the no of Pongal: ");
                    count = scan.nextInt();
                    total += 70 * count;    
                    break;       
            }
        }
        else if(choice == 2) {
            System.out.println("NON-VEGETARIAN MENU\n 1.Chicken Biriyani\n 2.Mutton Biriyani\n 3.ChickenRice\n 4.EggRice\n");
            System.out.println("Enter your dish no: ");
            int dish_no = scan.nextInt();
            switch (dish_no){
                case 1:
                    System.out.println("Enter the no of Chicken Biriyani: ");
                    int count = scan.nextInt();
                    total += 150 * count;
                    break;
                case 2:
                    System.out.println("Enter the no of Mutton Biriyani: ");
                    count = scan.nextInt();
                    total += 250 * count;
                    break;
                case 3:
                    System.out.println("Enter the no of ChickenRice: ");
                    count = scan.nextInt();
                    total += 100 * count; 
                    break;
                case 4:
                    System.out.println("Enter the no of EggRice: ");
                    count = scan.nextInt();
                    total += 80 * count;    
                    break;       
            }
        }
        else if (choice == 3){
            System.out.println(total);
        }
        else if (choice == 4){
            System.out.println("Thank you! Visit Again");
            break;
        }
    
    
    } while(choice != 4);{
        
    }
    scan.close();
    }
}
