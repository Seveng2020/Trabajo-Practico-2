import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base, exponente;
        String repetir ="S";
        while (repetir.equals("S") || repetir.equals("s")){
        System.out.print("Ingrese Base(N): ");
        base = sc.nextInt();
        System.out.print("Ingrese Exponente(x): ");
        exponente = sc.nextInt();
        int resultado =base;
        for (int i = 1; i < exponente; i++) {
            resultado = resultado * base;

        }
        System.out.println("\n Resultado: "+resultado);
            System.out.println("\nDesea repetir la operacion ? <S/N>");
            sc.nextLine();
            repetir = sc.nextLine();
        }




    }
}
