package day_5;
import java.util.Scanner;
class Rectangle{
    private int length;
    private int width;

    public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }
    public int area(){
        return length * width;
    }

    }


public class rectangle_using_oop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        int length = sc.nextInt();
        System.out.print("Enter the width of the rectangle: ");
        int width = sc.nextInt();

        Rectangle rect = new Rectangle(length , width);
        System.out.print("The Area of the Rectangle: ");
        System.out.println(rect.area());
        sc.close();
    }
}
