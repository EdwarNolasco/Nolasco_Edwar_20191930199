//Ejercicio 2.15 - Cap2
//Escriba una aplicacion que pida al usuario que escriba dos números
//que obtenga los números del usuario e imprima la suma
//producto, diferencia y cociente (división) de los números. Use las técnicas que se muestran en la figura 2.7
import java.util.Scanner; //el programa usa la clase Scanner

public class aritmetica{
    //el metodo main empieza la ejecución de la aplicación en Java
    public static void main(String[] args)
    {
        //crea objeto Scanner para obtener la entrada de la ventana de comandos
        Scanner entrada = new Scanner(System.in);

        int numero1; //primer número a operar
        int numero2; //segundo número a operar
        int suma; //suma de numero1 y numero2
        int resta; //resta de numero1 y numero2
        int multi; //multiplicacion de numero1 y numero2
        int divi; //division de numero1 y numero2

        System.out.print("Escriba el primer entero: "); //indicador
        numero1=entrada.nextInt(); //lee el primer numero del usuario

        System.out.print("Escriba el segundo entero: "); //indicador
        numero2=entrada.nextInt(); //lee el segundo numero del usuario

        suma = numero1 + numero2; //suma los números, después almacena el total en suma
        resta = numero1 - numero2;//resta los números, después almacena el total en resta
        multi = numero1 * numero2; //multiplica los números, después almacena el total en multi
        divi = numero1 / numero2; //divide los números, después almacena el total en divi

        System.out.printf("La suma es %d%n", suma); //muestra la suma
        System.out.printf("La resta es %d%n", resta); //muestra la resta
        System.out.printf("La multiplicación es %d%n", multi); //muestra la multiplicación
        System.out.printf("La división es %d%n", divi); //muestra la division

        entrada.close();
    }
}
