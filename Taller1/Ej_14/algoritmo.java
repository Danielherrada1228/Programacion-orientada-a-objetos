package com.mycompany.ejercicio14;
import java.util.Scanner;

public class algoritmo {
    public static void main(String[] args){
       double x;
       Scanner scanner = new Scanner(System.in);
       System.out.print("Ingrese un numero ");
       x = scanner.nextDouble(); 
       
       
       double cuadrado = Calcular.cuadrado(x);
       double cubo = Calcular.cubo(x); 
       
       System.out.println("El cuadrado de " + x + " es: " + cuadrado);
       System.out.println("El cubo de " + x + " es: " + cubo);

    }
    
}
