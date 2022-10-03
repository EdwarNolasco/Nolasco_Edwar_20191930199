//(Par o impar) Escriba una aplicación que lea un entero y que determine e imprima si es impar o par [sugerencia:
//use el operador residuo. Un número par es un múltiplo de 2. Cualquier múltiplo de 2 deja un residuo de 0 cuando
//se divide entre 2].

import java.util.Scanner;

public class paroimpar{
    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Intoduzca un número para saber si es par o impar.");
        numero=entrada.nextInt();

        if (0 == numero%2)
        System.out.println("El número es par.");

        if (0 != numero%2)
        System.out.println("El número es impar.");
        entrada.close();
    }
}