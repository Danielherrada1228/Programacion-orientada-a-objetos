package Figuras;

public class Cilindro extends FiguraGeométrica {
    private double radio;
    private double altura;

    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
        // Llama a los métodos de la clase padre
        this.setVolumen(calcularVolumen());
        this.setSuperficie(calcularSuperficie());
    }

    public double calcularVolumen() {
        return Math.PI * Math.pow(this.radio, 2.0) * this.altura;
    }

    public double calcularSuperficie() {
        double areaLadoA = 2.0 * Math.PI * this.radio * this.altura;
        double areaLadoB = 2.0 * Math.PI * Math.pow(this.radio, 2.0);
        return areaLadoA + areaLadoB;
    }
}
