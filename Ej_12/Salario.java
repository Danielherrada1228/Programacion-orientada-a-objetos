package com.mycompany.ejercicio12;
import java.util.Scanner;

public class Salario {
    public static void main(String[] args){
       double horas, valor_hora, retefuente;
       Scanner scanner = new Scanner(System.in);
       System.out.print("Cuantas horas trabajas a la semana?");
       horas = scanner.nextDouble(); 
       
       System.out.print("Como te pagan la hora?");
       valor_hora = scanner.nextDouble();
       
       retefuente = 12.5/100;
       
       double salario_bruto = Calcular.salario_bruto(horas,valor_hora);
       double salario_neto = Calcular.salario_neto(salario_bruto,retefuente); 
       
       System.out.println("Tu salario bruto es:" + salario_bruto);
       System.out.println("Tu salario neto es:" + salario_neto);

    }
}  
}
