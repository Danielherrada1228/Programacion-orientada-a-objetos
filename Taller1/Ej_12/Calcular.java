public class Calcular {
    public static double salario_bruto(double horas, double valor_hora) {
    return horas*valor_hora;
    }
    
    public static double salario_neto (double salario_bruto, double retefuente){
    return salario_bruto-(salario_bruto*retefuente);
    }
    
    
}
