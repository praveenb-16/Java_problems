public class choc{
    public static void main(String[] args) {
        int jars[] ={10,20,30};
        int A =0, B =0, C =0;
        for (int jar : jars){ //Enhanced for loop
            for (int i=0; i < jar; i++){
                if (i%3 == 0){
                    A+=1;
                }
                if (i%3 == 1){
                    B+=1;
                }
                if (i%3 == 2

                ){
                    C += 1;
                }
            }
        }
        System.out.println("A got:" + A + "chocolate");
        System.out.println("B got:" + B + "chocolate");
        System.out.println("C got:" + C + "chocolate");
    }
}