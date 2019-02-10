package practica1;
import java.util.Scanner;

public class E06 {

    public static void main(String[] args){
        Scanner escaner = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int entero = escaner.nextInt();
        int mayorDivisor= 0;
        int mayorDivisores=0;

        boolean negativo= false;
        if (entero < 0) {
            negativo=true;
            entero = entero * -1;                              //Math.abs(entero)
        }

        for (int n = 1; n <= entero; n++) {
            int divisores=0;
            for (int i = n; i > 0; i--) {
                if (n % i == 0){
                    divisores++;
                }
            }
            if(divisores>=mayorDivisores){
                mayorDivisores=divisores;
                mayorDivisor=n;
            }
        }
        if(negativo) mayorDivisor=mayorDivisor*(-1);
        System.out.print("El número con más divisores es "+mayorDivisor+" ("+mayorDivisores+" divisores)");
        escaner.close();
    }
}