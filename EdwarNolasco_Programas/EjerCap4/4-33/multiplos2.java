//Múltiplos de 2 con un ciclo infinito) Escriba una aplicación que muestre en la ventana de comandos las
//potencias del entero 2 (es decir, 2, 4, 8, 16, 32, 64, etcétera). Su ciclo no debe terminar
//(es decir, debe crear un ciclo infinito). ¿Qué ocurre cuando ejecuta este programa?

public class multiplos2 {
    public static void main(String[] args) {
        int cont=1;
        
        while(cont>0){
            
            //cont++;
            System.out.printf("\nLos múltiplos de 2 son: %d", 2*++cont);
        }
    }
}
