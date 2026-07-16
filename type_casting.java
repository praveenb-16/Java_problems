//Type Casting
public class type_casting {
    public static void main(String[] args) {
        //Narrow Casting (Manual) 
        double cgpa = 8.2;
        int A = (int) cgpa;
        System.out.println("Double: "+ cgpa);
        System.out.println("manual_casting_Int: " + A);
        //Widening Casting(Automatic)
        int a =10;
        double b = a;
        System.out.println("Int: " + a);
        System.out.println("auto_casting_Double: "+ b);

    }
}
