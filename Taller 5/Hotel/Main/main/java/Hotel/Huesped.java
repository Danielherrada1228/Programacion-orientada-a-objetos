package Hotel;

import java.util.Date;

public class Huesped {

    private String nombres;
    private String apellidos;
    private int documentoIdentidad;
    private Date fechaIngreso;
    private Date fechaSalida;

    public Huesped(String nombres, String apellidos, int documentoIdentidad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setFechaIngreso(Date fecha) {
        this.fechaIngreso = fecha;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaSalida(Date fecha) {
        this.fechaSalida = fecha;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public int obtenerDíasAlojamiento() {
        return (int) ((fechaSalida.getTime() - fechaIngreso.getTime()) / 86400000);
    }
}
