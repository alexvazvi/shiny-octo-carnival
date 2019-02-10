package Practica1;

import java.util.Scanner;

public class E09 {

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
        int primordial=1;
        boolean negativo= false;
        if (entero < 0) {
            negativo=true;
            entero = entero * -1;                              //Math.abs(entero)
        }
        for (int n = 2; n <= entero; n++) {
            if(esPrimo(n)) {
                if(negativo)    primordial = primordial*n*(-1);
                else    primordial = primordial*n;
            }
        }
        if(negativo) entero=entero*(-1);

        System.out.print("#"+entero+" = "+primordial);
        escaner.close();
    }
}
