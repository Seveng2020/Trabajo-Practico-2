import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 1;
        while (numero != 0) {
            System.out.print("Ingrese un numero: ");
            numero = sc.nextInt();
            String cantidadsuma = "+";
            int suma = 0;
            for (int i = 1; i <= numero; i++) {
                suma = suma + i;
                if (i == numero) {
                    cantidadsuma = "";
                }
                System.out.print(i + cantidadsuma);


            }
            if (numero != 0) {
                System.out.println("=" + suma);
            }
        }
    }
}