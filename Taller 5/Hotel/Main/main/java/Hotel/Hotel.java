package Hotel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Vector;

public class Hotel {

    public static Vector listaHabitaciones;

    public Hotel() {
        listaHabitaciones = new Vector();
        for (int i = 1; i <= 5; i++) {
            listaHabitaciones.add(new Habitacion(i, true, 120000));
        }
        for (int i = 6; i <= 10; i++) {
            listaHabitaciones.add(new Habitacion(i, true, 160000));
        }
    }

    public String buscarFechaIngresoHabitación(int número) {
        for (int i = 0; i < listaHabitaciones.size(); i++) {
            Habitacion hab = (Habitacion) listaHabitaciones.elementAt(i);
            if (hab.getNúmeroHabitación() == número && hab.getHuésped() != null) {
                DateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
                return formato.format(hab.getHuésped().getFechaIngreso());
            }
        }
        return "";
    }

    public boolean buscarHabitaciónOcupada(int número) {
        for (int i = 0; i < listaHabitaciones.size(); i++) {
            Habitacion hab = (Habitacion) listaHabitaciones.elementAt(i);
            if (hab.getNúmeroHabitación() == número && !hab.getDisponible()) {
                return true;
            }
        }
        return false;
    }
}
