public class Election_result {
    public static void main(String[] args) {
        int  TN[] = {1,1,1,2,2,2};
        int tvk_count = 0, dmk_count = 0;
        for (int vote : TN){
            if (vote == 1){
                tvk_count += 1;
            }
            else if(vote == 2){
                dmk_count += 1;
            }
        }
        if (tvk_count > dmk_count){
            System.out.println("TVK Wins");
        }
        else if (tvk_count < dmk_count){
            System.out.println("DMK Wins");
        }
        else{
            System.out.println("Election Draw. Re-Election");
        }
    }
    
}
