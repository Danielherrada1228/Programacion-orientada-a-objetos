package Figuras;

public class Piramide extends FiguraGeométrica {
    private double base;
    private double altura;
    private double apotema;

    public Piramide(double base, double altura, double apotema) {
        this.base = base;
        this.altura = altura;
        this.apotema = apotema;
        this.setVolumen(calcularVolumen());
        this.setSuperficie(calcularSuperficie());
    }

    public double calcularVolumen() {
        return (Math.pow(this.base, 2.0) * this.altura) / 3.0;
    }

    public double calcularSuperficie() {
        double areaBase = Math.pow(this.base, 2.0);
        double areaLateral = 2.0 * this.base * this.apotema;
        return areaBase + areaLateral;
    }
}
