public class array_manipulation{
    public static void main(String[] args){
        int arr[] = {2,0,0,6,0};
        for (int num : arr){
            if (num == 0){
                num = 1;
            }
            System.out.print(num);
        }
    }
}