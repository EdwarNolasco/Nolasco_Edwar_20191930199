//Escriba una aplicación que pida al usuario que escriba dos enteros,
//que obtenga los números del usuario y muestre el número más grande,
//seguido de las palabras "es más grande". Si los números son iguales
//imprima el mensaje "Estos números son iguales". Utilice las técnicas
//que se muestran en la figura 2.15

import java.util.Scanner; //elprograma utiliza la clase Scanner

public class comparaenteros{
    //el método main empieza la ejecución de la apliación en Java
    public static void main(String[] args)
    {
        //Crea objeto Scanner para obtener la entradad de la ventana de comandos
        Scanner entrada = new Scanner(System.in);

        int numero1; //primer número a comparar
        int numero2; //segundo número a comparar

        System.out.print("Escriba el primer número: "); //indicador
        numero1=entrada.nextInt();//lee el primer número del usuario

        System.out.print("Escriba el segundo número: "); //indicador
        numero2=entrada.nextInt();//lee el segundo número del usuario

        if (numero1==numero2)
            System.out.printf("Estos números son iguales");
        if (numero1>numero2)
            System.out.printf("el número %s es mas grande que el %s\n", numero1, numero2);
        if (numero1<numero2)
            System.out.printf("el número %s es mas grande que el %s\n", numero2, numero1);

        entrada.close();
    }
}