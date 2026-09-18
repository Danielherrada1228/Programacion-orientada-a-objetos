package Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
       double edjuan, edalber, edana, edmama;
       
       Scanner scanner = new Scanner(System.in);
       System.out.print("Cuantos años tiene juan?");
       edjuan = scanner.nextDouble();
       
       edalber = Edades.calcular_edalber(edjuan);
       edana = Edades.calcular_edana(edjuan);
       edmama = Edades.calcular_edmama(edjuan,edalber,edana);
       
       System.out.println("La edad de juan es" + edjuan);
       System.out.println("La edad de alber es" + edalber);
       System.out.println("La edad de ana es" + edana);
       System.out.println("La edad de la mamá es" + edmama);
    }
}
