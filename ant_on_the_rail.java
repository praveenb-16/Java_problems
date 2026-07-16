public class ant_on_the_rail {
    public static void main(String[] args) {
        int arr[] = {1,1,-1,1,-1};
        int count = 0;
        for (int num : arr){
            if (num == -1){
                count += 1;
            }
        }
        System.out.println(count);
    }
}
