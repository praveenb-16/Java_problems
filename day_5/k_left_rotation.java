package day_5;
import java.util.*;
public class k_left_rotation {
    public static void main(String [] args){
         
        int arr[] = {-2,-4, 3, 5, 7};
        int n = arr.length;
        int k =2;
        int temp;
        for(int i=0; i<k ; i++){
           for(int j =0; j<n-1;j++){ 
            temp = arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
           }
        }
        
        System.out.print(Arrays.toString(arr));
    }
}

