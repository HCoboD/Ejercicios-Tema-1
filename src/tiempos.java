public class tiempos {
    // Definimos constantes para los valores fijos de manera que ocupen lo minimo en la memoria.
    private static final short DIAS_ANIO = 365;
    private static final byte HORAS_DIA = 24;
    private static final byte MINUTOS_HORA = 60;
    private static final byte SEGUNDOS_MINUTO = 60;

    public static long calcularSegundos(int anios, int meses, int dias) {
        int totalDias = (anios * DIAS_ANIO) + (meses * 30) + dias;
        return (long) totalDias * HORAS_DIA * MINUTOS_HORA * SEGUNDOS_MINUTO;
    }
}
