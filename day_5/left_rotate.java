package day_5;
// using manual_method
// public class left_rotate {
//     public static void main(String [] args){
//         int arr[] = {-2,-4, 3, 5, 7};
//         int n = arr.length;
//         int first = arr[0];
//         for(int i=0; i<n-1 ; i++){
//             arr[i] = arr[i+1];
//         }
//         arr[n-1] = first;
//         for(int num : arr){
//             System.out.print(num + " ");
//         }
//     }
//}

//Using Swaping_Technique
public class left_rotate {
    public static void main(String [] args){
        int arr[] = {-2,-4, 3, 5, 7};
        int n = arr.length;
        int temp;
        for(int i=0; i<n-1 ; i++){
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
