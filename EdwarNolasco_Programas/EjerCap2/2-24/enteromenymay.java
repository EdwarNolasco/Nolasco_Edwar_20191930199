//(Enteros menor y mayor) Escriba una aplicación que lea cinco enteros y que determine e imprima los enteros
//mayor y menor en el grupo. Use solamente las técnicas de programación que aprendió en este capítulo.

import java.util.Scanner;

public class enteromenymay{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, num3, num4, num5;

        System.out.println("\nEste programa lee 5 números y devuelve el mayor y el menor.");
        System.out.printf("Introduzca el primer número entero: ");
        num1=entrada.nextInt();

        System.out.printf("Introduzca el segundo número entero: ");
        num2=entrada.nextInt();

        System.out.printf("Introduzca el tercer número entero: ");
        num3=entrada.nextInt();

        System.out.printf("Introduzca el primer número entero: ");
        num4=entrada.nextInt();

        System.out.printf("Introduzca el quinto número entero: ");
        num5=entrada.nextInt();

        //Se calcula el menor de los numeros

        int menor=num1;

        if (num2<menor)
        menor=num2;
        if (num3<menor)
        menor=num3;
        if (num4<menor)
        menor=num4;
        if (num5<menor)
        menor=num5;

        //Se calcula el mayor de los numeros

        int mayor=num1;

        if (num2>mayor)
        mayor=num2;
        if (num3>mayor)
        mayor=num3;
        if (num4>mayor)
        mayor=num4;
        if (num5>mayor)
        mayor=num5;

        //Imprimimos los numeros

        System.out.printf("\nEl menor de los números es: %d\n", menor);
        System.out.printf("\nEl mayor de los números es: %d\n", mayor);
        entrada.close();
    }
}