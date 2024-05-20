import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 123;
        String digitos = "";
        while (digitos.length() != 8) {
            System.out.println("Ingrese 8 Digitos");
            num = sc.nextInt();
            digitos = String.format("%d", num);

            if (digitos.length() == 8) {

                switch (num % 23) {
                    case 0 -> System.out.println("A");
                    case 1 -> System.out.println("Q");
                    case 2 -> System.out.println("Z");
                    case 3 -> System.out.println("S");
                    case 4 -> System.out.println("X");
                    case 5 -> System.out.println("W");
                    case 6 -> System.out.println("D");
                    case 7 -> System.out.println("C");
                    case 8 -> System.out.println("E");
                    case 9 -> System.out.println("F");
                    case 10 -> System.out.println("V");
                    case 11 -> System.out.println("R");
                    case 12 -> System.out.println("G");
                    case 13 -> System.out.println("T");
                    case 14 -> System.out.println("B");
                    case 15 -> System.out.println("H");
                    case 16 -> System.out.println("Y");
                    case 17 -> System.out.println("N");
                    case 18 -> System.out.println("U");
                    case 19 -> System.out.println("M");
                    case 20 -> System.out.println("I");
                    case 21 -> System.out.println("L");
                    case 22 -> System.out.println("O");
                }
            } else {
                System.out.println("Cantidad de digitos invalida");
            }
        }
    }
}