public class uranary_operator {
    public static void main(String[] args) {
        int a =10;
        System.out.println(a); //10
        System.out.println(a++);  //10 (post increment) -- same after call it increase
        System.out.println(a); //11
        System.out.println(++a); //12 (pre increment) -- instant increment
        int c = --a + --a; // 11 + 10
        int b = ++a + a++ + ++a; // 11 + 11 + 13
        System.out.println(c);
        System.out.println(b);
    }
}
