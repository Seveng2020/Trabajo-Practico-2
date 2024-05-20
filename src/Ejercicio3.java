import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horas,minutos,segundos;
        System.out.print("Ingrese Horas    -> ");
        horas = sc.nextInt();
        System.out.print("Ingrese Minutos  -> ");
        minutos = sc.nextInt();
        System.out.print("Ingrese Segundos -> ");
        segundos = sc.nextInt();

        System.out.println("---------------------------------");

        System.out.printf("La hora ingresada fue [%02d:%02d:%02d]",horas,minutos,segundos);

        if(segundos < 59 ){
            segundos++;
        }else {segundos = 0;
            if (minutos == 59){
                minutos = 0;
                if (horas < 24){
                    horas++;
                }
            }else {minutos ++;}

        }

        System.out.printf("\nLa hora un segundo mas tarde es [%02d:%02d:%02d]",horas,minutos,segundos);

    }
}
