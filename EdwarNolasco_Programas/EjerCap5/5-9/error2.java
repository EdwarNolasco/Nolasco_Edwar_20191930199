//El siguiente código debe imprimirse sin importar si el valor entero es par o impar:
//switch (value % 2)
//{
//case 0:
//System.out.println(“Entero par”);
//case 1:
//System.out.println(“Entero impar”);
//}

public class error2{
    public static void main(String[] args) {
        int value=0;

        switch(value%2){
            case 0:
                System.out.printf("Entero par");
            case 1:
                System.out.printf("Entero impar");
        }
    }
}