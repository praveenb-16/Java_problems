public class pattern {
    public static void main(String[] args) {
        for (int row=1; row<=5; row++){
            for(int i =row; i >= 1; i--){
                System.out.print(i);
            }
            for(int j = 2; j<= row; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
