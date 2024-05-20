import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

        System.out.println("Ingrese un numero: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese otro numero: ");
        num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("Números ordenados:\n" + num1 + " , " + num2);
        } else {
            System.out.println("Números ordenados:\n" + num2 + " , " + num1);
        }
    }
}
