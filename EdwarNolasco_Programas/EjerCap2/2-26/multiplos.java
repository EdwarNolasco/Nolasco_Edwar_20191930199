//(Múltiplos) Escriba una aplicación que lea dos enteros, determine si el primero es un múltiplo del segundo
//e imprima el resultado. [Sugerencia: use el operador residuo].

import java.util.Scanner;

public class multiplos{
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);

        int num1, num2, mayor, menor;
        System.out.println("Programa que recibe dos enteros y verifica si uno es múltiplo de otro.");
        System.out.printf("Introduzca el primer número: ");
        num1=entrada.nextInt();

        System.out.printf("Introduzca el segundo número: ");
        num2=entrada.nextInt();

        mayor=num1;
        menor=num2;

        if (num2>num1){
            mayor=num2;
            menor=num1;
        }

        if (0==mayor%menor)
        System.out.printf("El número %d es múltiplo del número %d", mayor, menor);

        if (0!=mayor%menor)
        System.out.printf("Los números no son múltiplos.");
        entrada.close();
    }
}