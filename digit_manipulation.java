public class digit_manipulation {
    public static void main(String[] args) {
        int n = 2006,result = 0, r,place = 1;
        while(n>0){
            r =n%10;
            if(r == 0){
                r = 1;
            }
            result += r * place;
            place *= 10;
            n/= 10;

        }
        System.out.println(result);
    }
}
