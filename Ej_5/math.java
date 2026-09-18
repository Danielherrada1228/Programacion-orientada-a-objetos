public class math {
    public static void main(String[] args){
       double suma, x, y, X, Suma, SUMA;
       Scanner scanner = new Scanner(System.in);
       System.out.print("Donde inicia la suma?");
       suma = scanner.nextDouble(); 
       
       System.out.print("Ingrese su primer valor 'x'?");
       x = scanner.nextDouble();
       
       System.out.print("Ingrese su segundo valor 'y'?");
       y = scanner.nextDouble();
       
       X = x + Math.pow(y, 2);
       Suma = suma + x;
       
       SUMA = Suma+X/y;
       
       System.out.println("EL VALOR DE LA SUMA ES:" + SUMA);
    }
    
}
