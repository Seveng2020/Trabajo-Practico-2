import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion=0;
        //long decimetros=0,micrometros=100000,resu;
        System.out.println("- - - - -   Conversor milimetros - - - - - -");
        while (opcion!=4){
        int metros = 0, milimetros = 1000, resultado,decimetros=0,micrometros=100000;
        double centimetros = 0, kilometros = 100000;
        System.out.println("- - - - - - - - - - MENU  - - - - - - - - -");

        System.out.println("1 - metros a milimetros");
        System.out.println("2 - centimetros a kilómetros");
        System.out.println("3 - decímetros a micrometros");
        System.out.println("4 - salir");
        System.out.print("\n Ingrese la opcion deseada -> ");
        opcion = sc.nextInt();
        if (opcion == 1) {
            while (metros <= 0) {
                System.out.print("\n Ingrese la medida en metros a convertir -> ");
                metros = sc.nextInt();
                if (metros > 0) {
                    resultado = metros * milimetros;
                    System.out.println("La cantidad de " + metros + " metro en milímetros: " + resultado);
                } else {
                    System.out.println("Ingrese un numero mayor a 0");
                }
            }
        } else if (opcion == 2) {
            while (centimetros <= 0) {
                System.out.print("\n Ingrese la medida en centimetros a convertir -> ");
                centimetros = sc.nextInt();
                if (centimetros > 0) {
                    kilometros = centimetros / kilometros;
                    System.out.println("La cantidad de " + centimetros + " centimetros en kilometros: " + kilometros);
                } else {
                    System.out.println("Ingrese un numero mayor a 0");
                }
            }

        } else if (opcion == 3) {
            while (decimetros <=0) {
                System.out.print("\n Ingrese la medida en decimetros a convertir -> ");
                decimetros = sc.nextInt();
                if (decimetros > 0) {
                    resultado = decimetros * micrometros;
                    System.out.println("La cantidad de " + decimetros + " decimetros en micrometros: " + resultado);
                } else {
                    System.out.println("Ingrese un numero mayor a 0");
                }
            }
        }else if (opcion !=4){
            System.out.println("      Opcion invalida");
        }else {
            System.out.println("- - - - - - - - - FIN DEL PROGRAMA - - - - - - - - -");

        }
      }
    }
}