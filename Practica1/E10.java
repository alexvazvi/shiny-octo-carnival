package Practica1;

import java.util.Scanner;

public class E10 {
    static int contarDivisores(int entero){
        int divisores=0;
        for(int i=1; i<=entero;i++){
            if(entero%i==0) divisores++;
        }
        return divisores;
    }
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
            int divisores=contarDivisores(n);
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
