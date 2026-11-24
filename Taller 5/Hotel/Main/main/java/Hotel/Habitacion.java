package Hotel;

public class Habitacion {
    private int númeroHabitación;
    private boolean disponible;
    private double precioDía;
    private Huesped huésped;

    public Habitacion(int númeroHabitación, boolean disponible, double precioDía) {
        this.númeroHabitación = númeroHabitación;
        this.disponible = disponible;
        this.precioDía = precioDía;
    }

    public int getNúmeroHabitación() { return númeroHabitación; }
    public boolean getDisponible() { return disponible; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }
    public double getPrecioDía() { return precioDía; }
    public Huesped getHuésped() { return huésped; }
    public void setHuésped(Huesped huésped) { this.huésped = huésped; }
}
