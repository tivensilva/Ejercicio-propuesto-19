public class TrianguloEquilatero {
    public static double calcularPerimetro(double lado) {
        return 3 * lado;
    }

    public static double calcularAltura(double lado) {
        return (lado * Math.sqrt(3)) / 2;
    }

    public static double calcularArea(double lado) {
        return (lado * lado * Math.sqrt(3)) / 4;
    }
}
