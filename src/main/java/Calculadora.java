import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer número a sumar: ");
        int a = scanner.nextInt();
        System.out.println("Introduce el segundo número a sumar: ");
        int b = scanner.nextInt();

        System.out.println("El resultado es: " + Suma(a,b));
        System.out.println("Gracias por utilizar la calculadora");
    }

    public static int Suma(int a, int b){
        return a + b;
    }
}