package com.mycompany.ejercicio17;
import java.util.Scanner;

public class Circulo {
    public static void main(String[] args){
       double r;
       Scanner scanner = new Scanner(System.in);
       System.out.print("Inserte el radio de su circulo ");
       r = scanner.nextDouble(); 
       
       
       double A = Calcular.A(r);
       double L = Calcular.L(r); 
       
       System.out.println("El area del circulo es: " + A);
       System.out.println("La longitud del circulo es: " + L);

    }
    
}
