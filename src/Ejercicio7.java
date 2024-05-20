import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pares = 0, rango1, rango2;
        int repetir =1;
        do {
            System.out.print("Ingrese num. inicial: ");
            rango1 = sc.nextInt();
            if (rango1 > 0) {
                System.out.print("Ingrese num. final  : ");
                rango2 = sc.nextInt();
                if (rango2 > 0) {
                    for (int i = 1; i <= rango2; i++) {
                        if (i >= rango1) {

                            if (i % 2 == 0) {
                                pares++;

                            }
                        }


                    }
                    System.out.println("Cantidad de Pares       : " + pares);

                } else {repetir =0; System.out.println("------------------- FIN DEL PROGRAMA-----------------");}

            } else {repetir =0; System.out.println("------------------- FIN DEL PROGRAMA-----------------");}

        }while (repetir ==1);
    }
}