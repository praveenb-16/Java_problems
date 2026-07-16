public class prime_number {
    public static void main(String[] args) {
        int num = 50;
        int count = 0;
        for(int i=2; i<=num ; i++){
            for(int j=2; j <= i ; j++){
                if (i%j == 0){
                    count += 1;
                }
            }
        if (count <2){    
        System.out.println(i);    
        }    
    count = 0;    //refresh the count value for the "for loop"
    } 
    }
}
