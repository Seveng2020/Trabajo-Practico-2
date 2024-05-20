import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        double suma = 0, promedio = 0;
        double cantidad = 0;
        double resultado = Math.sqrt(num);
        System.out.print("Ingrese un numero entre 0 y 32: ");
        while (num >= 0) {
            num = sc.nextInt();

            if (num > 32) {
                System.out.println("Numero Invalido");
                System.out.print("Ingrese un numero entre 0 y 32: ");
            } else if (num >0) {
                resultado = resultado + Math.sqrt(num);

                cantidad++;
            } else {
                promedio = resultado / cantidad;
                System.out.println("_________________________________________");
                System.out.println("| Suma de Raices: " + resultado + "     \n| Promedio: " + promedio);
                System.out.println("-----------Programa Finalizado-----------");


            }


        }
    }
}
