//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Ejemplo de uso
        int anios = 2;
        int meses = 3;
        int dias = 15;

        long segundos = tiempos.calcularSegundos(anios, meses, dias);
        System.out.println("El total de segundos es: " + segundos);
    }
}
