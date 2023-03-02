import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*ACTIVIDAD 1
        int a=5;
        while (a<=15) {
            System.out.println(a);
            a++;

        }

        for (int i=3;i<8;i++) {
            a=i*2;
            System.out.println(a);
        }
        int b= 5;
        while (b<17) {
            System.out.println(b);
            b=b+2;
        }
        */
        System.out.println("Actividad 1A");
        int a = 5;
        int b = 15;
        while(a<=b){
            System.out.println(a+ ". ");
            a++;
        }
        //*///////////////////
        a= 5;
        System.out.println("Actividad 1B");
        while(a<=b){
            if (a%2==0){
                System.out.println(a+". ");
            }
            a++;
        }
        //*///////////////////////////

    }
}