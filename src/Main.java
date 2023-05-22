import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String ladoStr = JOptionPane.showInputDialog("Ingrese el valor del lado del triángulo equilátero:");
        double lado = Double.parseDouble(ladoStr);

        double perimetro = TrianguloEquilatero.calcularPerimetro(lado);
        double altura = TrianguloEquilatero.calcularAltura(lado);
        double area = TrianguloEquilatero.calcularArea(lado);

        String resultado = "Perímetro: " + perimetro + "\n" +
                "Altura: " + altura + "\n" +
                "Área: " + area;

        JOptionPane.showMessageDialog(null, resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);
    }
}
