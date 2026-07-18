package day_4;

public class Sliding_window {
    public static void main(String[] args) {

        int arr[] = {11,80,70,60,33};
        int k = 2;

        int sum = 0;

        // First window
        for(int i=0;i<k;i++){
            sum += arr[i];
        }
        int max = sum;

        // Slide the window
        for(int i=k;i<arr.length;i++) {

            sum = sum - arr[i-k] + arr[i];

            if(sum > max)
                max = sum;
        }

        System.out.println(max);
    }
}
