package practica1;

import java.util.Scanner;

public class E01 {

    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int entero=escaner.nextInt();
        long factorial=entero;
        for(long i=entero-1;i>0;i--) factorial=factorial*i;
        System.out.println(entero+"!= "+factorial);
        escaner.close();
    }

}