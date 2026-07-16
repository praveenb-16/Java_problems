public class palindrome {
    public static void main(String[] args) {
        int a = 121,r;
        int temp = a;
        int rev=0;
        while (a>0){
            r = a % 10;
            rev = rev * 10 + r;
            a /= 10;
        }
        if (temp == rev){
           System.out.println(rev + " is Palindrome"); 
        }
        else{
            System.out.println(rev + " is Not Palindrome");
        }
    }
    
}
