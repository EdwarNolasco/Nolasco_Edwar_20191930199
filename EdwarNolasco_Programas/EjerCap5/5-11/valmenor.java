//(Buscar el valor menor) Escriba una aplicación que encuentre el menor de varios enteros. Suponga que el
//primer valor leído especifica el número de valores que el usuario introducirá.
import java.util.Scanner;

public class valmenor{
    public static void main(String[] args) {
        int x;
      int y;
      int menor;

      Scanner entrada = new Scanner(System.in);
      System.out.println("Introduzca cuántos números desea comparar");
      x = entrada.nextInt();

      System.out.println("\nPor favor introduzca el entero numero 1: ");
      menor = entrada.nextInt();

      for(int i = 2; i <= x; i++)
      {     // Abre for

      System.out.printf("\nPor favor introduzca el entero numero: %d\n", i);
          y = entrada.nextInt();
            
      if ( y < menor )
          menor = y;

      }       // Cierra for
      System.out.printf("\nEl menor de los %d numeros es: %d\n", x, menor);
    entrada.close();
    }
}
