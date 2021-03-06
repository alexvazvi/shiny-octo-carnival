package practica1;
import java.util.Scanner;

public class E05 {

    public static void main(String[] args){
        Scanner escaner = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int entero = escaner.nextInt();
        int primordial=1;
        boolean negativo= false;
        if (entero < 0) {
            negativo=true;
            entero = entero * -1;                              //Math.abs(entero)
        }
        for (int n = 2; n <= entero; n++) {
            boolean primo = true;
            for (int i = n - 1; i > 1; i--) {
                if (n % i == 0) primo = false;
            }
            if (primo && entero > 1) {
                if(negativo)    primordial = primordial*n*(-1);
                else    primordial = primordial*n;
            }
        }
        if(negativo) entero=entero*(-1);

        System.out.print("#"+entero+" = "+primordial);
        escaner.close();
    }
}