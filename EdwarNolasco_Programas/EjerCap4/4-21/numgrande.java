import java.util.Scanner;
public class numgrande {
    public static void main(String[] args) {
        int contador=0;
        int numero=0;
        int mayor=0;
        while(contador<10){
            System.out.println("Ingrese el numero"+" "+(contador+1));
            Scanner m=new Scanner(System.in);
            numero=m.nextInt();
            contador++;
            if(numero>mayor){
                mayor=numero;
            }else
                mayor=+mayor;
        m.close();
            }
        System.out.print("El número mayor es: "+mayor);
    }
}