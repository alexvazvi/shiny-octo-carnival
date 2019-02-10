package practica1;
import java.util.Scanner;

public class E02 {

    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int entero=escaner.nextInt();
        long factorial=entero;
        if(factorial==0)    factorial=1;
        for(long i=entero-2;i>0;i=i-2)  factorial=factorial*i;
        System.out.println(entero+"!!= "+factorial);

        escaner.close();
    }

}