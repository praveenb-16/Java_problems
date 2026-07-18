package day_4;

public class subarray {
    public static void main(){
        int arr[] = {10,20,30,40,50};
        int k = 2,max =0;
        for(int i=0; i< arr.length-k; i++){
            int sum =0;
            for(int j=i+1; j<=i+k;j++){
                sum += arr[j];
            }
            if(sum > max){
                max = sum;
            }

        }
        System.out.print(max);
    }
}
