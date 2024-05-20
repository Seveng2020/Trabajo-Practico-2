import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0, resto;
        while (num >= 0) {
            boolean primo = true;
            System.out.print("Ingrese un Numero (ingrese num<0 para terminar): ");
            num = sc.nextInt();
            if(num ==0 || num ==1 ) {
                System.out.println("El numero ingresado es invalido");
            }else if (num > 1) {
                for (int i = 2; i < num; i++) {
                    resto = num % i;
                    if (resto == 0) {
                        i = num;
                        System.out.println("No es primo");
                        primo = false;
                    }
                }
                if (primo) {
                    System.out.println("Es Primo");
                }
            }else {
                System.out.println("------------------FIN DEL PROGRAMA------------------");
            }
        }
    }
}