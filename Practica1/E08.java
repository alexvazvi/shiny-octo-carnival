package Practica1;

import java.util.Scanner;

public class E08 {
    static boolean esPrimo(int entero){
        boolean primo=true;
        for(int i=entero-1;i>1;i--) {
            if (entero % i == 0) primo=false;
        }
        if(primo && entero>1) return true; //Si es primo.
        return false; //Si no es primo.
    }

    public static void main(String[] args){
        Scanner escaner = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int entero = escaner.nextInt();
        boolean negativo = false;
        if (entero < 0) {
            negativo = true;
            entero = entero * -1;                              //Math.abs(entero)
        }
        System.out.print("Los números primos menores que " + entero + " son: ");
        for (int n = 2; n < entero; n++) {
            if(esPrimo(n)) {
                if (negativo) n = n * (-1);
                System.out.print(n + " ");
            }
            escaner.close();
        }
    }
}
