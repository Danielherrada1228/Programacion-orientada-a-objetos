package Nómina;

public class Empleado {
    private String nombre;
    private String apellidos;
    private String cargo;
    private String género;
    private double salarioDía;
    private int díasTrabajados;
    private double otrosIngresos;
    private double pagosSalud;
    private double aportePensiones;

public Empleado(String nombre, String apellidos, TipoCargo cargo, TipoGénero género,
                double salarioDía, int díasTrabajados, double otrosIngresos,
                double pagosSalud, double aportePensiones) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.salarioDía = salarioDía;
    this.díasTrabajados = díasTrabajados;
    this.otrosIngresos = otrosIngresos;
    this.pagosSalud = pagosSalud;
    this.aportePensiones = aportePensiones;
}

    public String getNombre() { return nombre; }
    public String getApellidos() { return apellidos; }
    public String getCargo() { return cargo; }
    public String getGénero() { return género; }
    public double getSalarioDía() { return salarioDía; }
    public int getDíasTrabajados() { return díasTrabajados; }
    public double getOtrosIngresos() { return otrosIngresos; }
    public double getPagosSalud() { return pagosSalud; }
    public double getAportePensiones() { return aportePensiones; }

    public double calcularNómina() {
        return ((salarioDía * díasTrabajados) + otrosIngresos - pagosSalud - aportePensiones);
    }
}
