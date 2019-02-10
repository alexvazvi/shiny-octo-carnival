package Practica1;

import java.util.Scanner;

public class E07 {
    static boolean esPrimo(int entero){
        boolean primo=true;
        for(int i=entero-1;i>1;i--) {
            if (entero % i == 0) primo=false;
        }

        if(primo && entero>1) return true; //Si es primo.
        return false; //Si no es primo.
    }
    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int n=escaner.nextInt();
        if(esPrimo(n)) System.out.print(n+" es primo");
        else System.out.print(n+" no es primo");
        escaner.close();
    }
}
