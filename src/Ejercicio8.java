import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, resultado = 0;

        do {
            System.out.println("Ingrese Operando,Operador,Operando:");
            num1 = sc.nextInt();
            if (num1 > 0) {
                sc.nextLine();
                String operador = sc.nextLine();
                num2 = sc.nextInt();
                switch (operador) {
                    case "+" -> resultado = num1 + num2;
                    case "-" -> resultado = num1 - num2;
                    case "*" -> resultado = num1 * num2;
                    case "/" -> resultado = num1 / num2;

                }
                if (operador.equals("/")) {
                    System.out.println("Resultado: " + resultado);
                }else {System.out.println("Resultado: " + (int)resultado);}
            }
        }while (num1 > 0) ;
            System.out.println("-------------- FIN DEL PROGRAMA --------------");
    }
}