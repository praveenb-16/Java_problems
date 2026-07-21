package day_6;

public class max {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int l = arr.length;
        int count;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<l-1; i++){
            count =0;
            double avg = (arr[i] + arr[i+1])/2;
            for(int j=0; j<l ; j++){
                if(arr[j] > avg){
                    count += arr[j];
                }
            }
            if(count < min){
                min = count;
            }
        }
        System.out.println(min);
    }
}
