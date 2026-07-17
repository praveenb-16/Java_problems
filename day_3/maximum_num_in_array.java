package day_3;

import java.util.Scanner;

public class maximum_num_in_array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int num = scan.nextInt();
        int [] arr = new int[num];
        for(int i=0; i<num ; i++){
            arr[i] = scan.nextInt();
        }
        int max=0;
        for (int i : arr){
            if (i>max){
                max = i;
            }
        }
        System.out.println("Largest Element in the Array: ");
        System.out.println(max);
        scan.close();
    }
    
}
