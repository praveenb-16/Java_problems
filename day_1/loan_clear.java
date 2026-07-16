
public class loan_clear {
    public static void main(String[] args) {
        for (int i =1; i <= 40; i++){
            if (i == 19)
                continue;
            if (i > 35)
                break;
            if (i >= 21 && i <= 30)
                continue;
            System.out.println(i);
            
        }

    }
}
