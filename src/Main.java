import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el primer número entero:");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número entero:");
        int num2 = leer.nextInt();
        System.out.println("Ingrese el tercer número entero:");
        int num3 = leer.nextInt();

        int smallestSum = num1 + num2 + num3 - Math.max(num1, Math.max(num2, num3));
        int largestDifference = Math.max(num1, Math.max(num2, num3)) - Math.min(num1, Math.min(num2, num3));
        int largestNumber = Math.max(num1, Math.max(num2, num3));

        System.out.println("La suma de los dos números más pequeños es: " + smallestSum);
        System.out.println("La diferencia entre los dos números más grandes es: " + largestDifference);
        System.out.println("El mayor de los tres números es: " + largestNumber);
    }
}
