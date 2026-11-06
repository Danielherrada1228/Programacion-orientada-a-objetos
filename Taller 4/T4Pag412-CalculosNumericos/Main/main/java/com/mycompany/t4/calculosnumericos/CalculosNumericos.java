package com.mycompany.t4.calculosnumericos;

public class CalculosNumericos {

    public static double calcularLogaritmo(double valor) throws ArithmeticException {
        if (valor <= 0) {
            throw new ArithmeticException("El número debe ser mayor a cero para calcular el logaritmo.");
        }
        return Math.log(valor);
    }

    public static double calcularRaiz(double valor) throws ArithmeticException {
        if (valor < 0) {
            throw new ArithmeticException("No se puede calcular la raíz cuadrada de un número negativo.");
        }
        return Math.sqrt(valor);
    }
}
