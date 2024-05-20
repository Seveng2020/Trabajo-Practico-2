import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int multiplo, cantidad = 0, rango1 = 1, rango2 = 2;

        while (rango1 > 0 && rango2 >= rango1) {
            System.out.print("Ingrese num. inicial: ");
            rango1 = sc.nextInt();
            if (rango1 > 0) {
                System.out.print("Ingrese num. final  : ");
                rango2 = sc.nextInt();
                if (rango2 > 0) {
                    System.out.print("N (múltiplo)  : ");
                    multiplo = sc.nextInt();
                    for (int i = 1; i <= rango2; i++) {
                        if (i >= rango1) {

                            if (i % multiplo == 0) {
                                cantidad++;

                            }
                        }


                    }
                    if (rango2 >= rango1) {

                        System.out.println("Cantidad : " + cantidad);
                    } else System.out.println("Valor invalido");


                }
            }
        }
                System.out.println("---------------FIN DEL PROGRAMA---------------");
    }
}