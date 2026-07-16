import java.util.Scanner;
public class student_marks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your mark: ");
        int marks = scan.nextInt();
        if (0 <= marks && marks <= 100){
            if (marks >= 90){
            System.out.println("A");
        }
            else
                 if (75 <= marks && marks <90){
            System.out.println("B");
        }
            else if (60 <= marks && marks <75){
            System.out.println("C");
        }
            else if (40 <= marks && marks <60){
            System.out.println("D");
        }
            else if (0 <= marks  && marks < 40){
            System.out.println("F");
        }
        }
        
        else{
            System.out.println("Invalid Marks");
        }
        scan.close();
    }
    }

