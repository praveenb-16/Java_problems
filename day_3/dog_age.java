package day_3;

import java.util.Scanner;

public class dog_age {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dog_age = scan.nextInt();
        System.out.println(dog_age * 7);
        scan.close();
    }
}
