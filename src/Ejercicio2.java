import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        int num1,num2,num3,mayor,medio,menor;
        int orden = 0;
        System.out.print("Numero 1: ");
        num1 = sc.nextInt();
        System.out.print("Numero 2: ");
        num2 = sc.nextInt();
        System.out.print("Numero 3: ");
        num3 = sc.nextInt();
        while (orden != 1 && orden != 2){
        System.out.print("Como desea ordenarlos?\n 1 : ASC \n 2 : DES \n Ingrese -> ");
        orden = sc.nextInt();

            if (num1 > num2 && num1 > num3 ){
                mayor = num1;
                if (num2 > num3){
                    medio = num2;
                    menor = num3;
                }else {
                    medio = num3;
                    menor = num2;
                }
            }else if (num2 > num1 && num2 > num3){
                mayor = num2;
                if (num1 > num3){
                    medio = num1;
                    menor = num3;
                }else {
                    medio = num3;
                    menor = num1;
                }
            }else {
                mayor = num3;
                if (num1 > num2){
                    medio = num1;
                    menor = num2;
                }else {
                    medio = num2;
                    menor = num1;
                }
            }
            if (orden == 2){
                System.out.println("Números ordenados: \n"+ mayor + " , " + medio + " , " + menor);
        }else if (orden == 1){
            System.out.println("Números ordenados: \n"+ menor + " , " + medio + " , " + mayor);
        }else {
            System.out.println("Opcion ingresada no valida");}
        }

    }
}
