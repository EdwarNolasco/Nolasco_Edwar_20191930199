//(Calcular el producto de enteros impares) Escriba una aplicación que calcule el producto de los enteros
//impares del 1 al 15.

public class producto{
    public static void main(String[] args) {
        int a=1;
        for(int i=1; i<=15;i++){
            if(i%2==1){
                a=a*i;
            }
        }
        System.out.printf("La multipliación de los primeros números enteros impares del 1 al 15 es \n"+a);
    }
}