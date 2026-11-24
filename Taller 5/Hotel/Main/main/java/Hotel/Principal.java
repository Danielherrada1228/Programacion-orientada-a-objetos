package Hotel;

public class Principal {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        VentanaPrincipal miVentana = new VentanaPrincipal(hotel);
        miVentana.setVisible(true);
    }
}
