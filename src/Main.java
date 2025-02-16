import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de anios que quieres pasar a segundos: ");
        int anios = sc.nextInt();
        System.out.println("Ahora introduzca el numero de meses que quiere pasar a segundos: ");
        int meses = sc.nextInt();
        System.out.println("Perfecto a continuacion introduzca el numero de dias que quieres pasar a segundos: ");
        int dias = sc.nextInt();
        System.out.println("Y cuantas horas quiere pasar a segundos: ");
        int horas = sc.nextInt();
        System.out.println("Finalmente cuantos minutos quiere pasar a segundos: ");
        int minutos = sc.nextInt();
        int segundos = (anios*365*24*60*60)+(meses*30*24*60*60)+(dias*24*60*60)+(horas*60*60)+(minutos*60);
        System.out.println(segundos);
        System.out.println("La suma de todos tus tiempos es de: " +segundos +"(segundos)");
    }
}
