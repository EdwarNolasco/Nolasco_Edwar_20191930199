//(Lados de un triángulo) Escriba una aplicación que lea tres valores distintos de cero introducidos por el
//usuario, y que determine e imprima si podrían representar los lados de un triángulo.

import java.util.Scanner;
public class triangulo{
    public static void main(String[] args) {
        int lado1;
        int lado2;
        int lado3;

        System.out.printf("Ingrese el primer lado: ");
        Scanner entrada1 = new Scanner(System.in);
        lado1=entrada1.nextInt();

        System.out.printf("Ingrese el segundo lado: ");
        Scanner entrada2 = new Scanner(System.in);
        lado2=entrada2.nextInt();   
        
        System.out.printf("Ingrese el tercer lado: ");
        Scanner entrada3 = new Scanner(System.in);
        lado3=entrada3.nextInt();

        if((lado1+lado2>lado3)&(lado1+lado3>lado2)&(lado3+lado2>lado1)){
            System.out.print("Los lados ingresados corresponden a los de un triangulo");
        }
        else{
            System.out.print("Los lados ingresados no corresponden a los de un triangulo");
        }
        entrada1.close();
        entrada2.close();
        entrada3.close();
    }
}