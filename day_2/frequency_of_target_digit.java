public class frequency_of_target_digit {
    public static void main(String[] args) {
        int N = 122324, target =2, count =0,r;
        while(N>0){
            r = N%10;
            if(r == target){
                count += 1;
            }
            N/=10;
        }
        System.out.println(count);
    }
    
}
