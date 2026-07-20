package day_5;

public class right_rotate {
    public static void main(String [] args){
        int arr[] = {-2,-4, 3, 5, 7};
        int n = arr.length;
        int last = arr[n-1];
        for(int i=n-1; i>=1 ; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = last;
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}