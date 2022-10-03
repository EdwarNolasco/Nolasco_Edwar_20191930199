//Aritmetica: Menor y mayor: Escriba una apliacion que reciba tres enteros del usuario y muestre la suma,
//promedio, producto, menor y mayor de esos números. Utilice las técnicas que se muestran en la figura 2.15
//nota: el calculo del promedio en este ejercicio debe dar como resultado una representación entera del 
//promedio. Por lo tanto, si la suma de los valores es 7, el promedio debe ser 2, no 2.333...

import java.util.Scanner;

public class menorymayor{
    public static void main(String[] args)
    {
        int num1, num2, num3, suma, promedio, producto, menor, mayor;
        Scanner entrada = new Scanner(System.in);

        System.out.printf("Escriba el primer entero: ");
        num1=entrada.nextInt();
        System.out.printf("Escriba el segundo entero: ");
        num2=entrada.nextInt();
        System.out.printf("Escriba el tercer entero: ");
        num3=entrada.nextInt();

        suma=num1+num2+num3;
        promedio=suma/3;
        producto=num1*num2*num3;

        if (num1>num2 && num1>num3){
            if (num2>num3){
                mayor=num1;
                menor=num3;
                System.out.printf("El número menor es %d y el mayor es %d\n", menor, mayor);
            }
        else
        {
           mayor=num1;
           menor=num2;
           System.out.printf("El número menor es %d y el mayor es %d\n", menor, mayor);
        }
        }
        else{
            //------------------
            if (num2>num3 && num2>num1){
                if (num3>num1){
                    mayor=num2;
                    menor=num1;
                    System.out.printf("El numero menor es %d y el mayor es %d\n", menor, mayor);
                }
                else{
                    mayor=num2;
                    menor=num3;
                    System.out.printf("El numero menor es %d y el mayor es %d\n", menor, mayor);
                }
            }
        }
        //------------------
        if (num3>num1 && num3>num2){
            if(num2>num1){
                mayor=num3;
                menor=num1;
                System.out.printf("El numero menor es %d y el mayor es %d\n", menor, mayor);
            }
            else{
                mayor=num3;
                menor=num1;
                System.out.printf("El numero menor es %d y el mayor es %d\n", menor, mayor);
            }
        }
        System.out.printf("La suma es %d\nEl promedio es %d\nEl producto es %d\n", suma, promedio, producto);
    entrada.close();
    }
}