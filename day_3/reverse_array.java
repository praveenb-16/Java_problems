package day_3;

import java.util.Scanner;

public class reverse_array {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    int [] arr = new int[num];
    for(int i=0; i<num ; i++){
        arr[i] = scan.nextInt();
        }   
    for(int i=0; i<num ; i++){
        System.out.print(arr[i]);
        }       
    System.out.println();  
    System.out.print("[");  
    for(int j=num-1; j>=0; j--){
        System.out.print(arr[j]);
        if (j > 0){
            System.out.print(", ");
        }
    }    
    System.out.print("]");
    scan.close();
    }
    
}
