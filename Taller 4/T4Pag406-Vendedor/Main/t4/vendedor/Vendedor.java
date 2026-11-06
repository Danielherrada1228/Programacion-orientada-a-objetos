package t4.vendedor;


public class Vendedor {
    public String nombre;
    public String apellidos;
    public int edad;

    public Vendedor(String nombre, String apellidos, int edad) {
        verificarEdad(edad); 
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    private void verificarEdad(int edad) {
        if (edad < 18 || edad > 120) {
            throw new IllegalArgumentException("El vendedor debe tener entre 18 y 120 años");
        }
    }
}
