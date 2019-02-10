package practica1;
import java.util.Scanner;

public class E03 {

    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int entero=escaner.nextInt();
        if(entero<0) {
            entero = entero * -1;                              //Math.abs(entero)
        }

        boolean primo=true;
        for(int i=entero-1;i>1;i--) {
            if (entero % i == 0) primo=false;
        }

        if(primo && entero>1){
            System.out.print("Es primo");                       //Si es primo
        }

        else System.out.print("No es primo");                   //Si no es primo
        escaner.close();
    }
}