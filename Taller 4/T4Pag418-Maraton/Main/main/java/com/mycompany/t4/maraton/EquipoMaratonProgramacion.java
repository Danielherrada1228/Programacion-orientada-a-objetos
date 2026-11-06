package com.mycompany.t4.maraton;

public class EquipoMaratonProgramacion {

    private String nombreEquipo;
    private String universidad;
    private String lenguajeProgramacion;
    private Programador[] programadores;
    private int tamañoEquipo;

    public EquipoMaratonProgramacion(String nombreEquipo, String universidad, String lenguajeProgramacion) {
        this.nombreEquipo = nombreEquipo;
        this.universidad = universidad;
        this.lenguajeProgramacion = lenguajeProgramacion;
        this.programadores = new Programador[3]; // Máximo 3 integrantes
        this.tamañoEquipo = 0;
    }

    public void añadirProgramador(Programador p) throws Exception {
        // Validar que el objeto no esté vacío ni incompleto
        if (p.getNombre().trim().isEmpty() || p.getApellidos().trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre y los apellidos del programador no pueden estar vacíos.");
        }

        // Validar el límite máximo de integrantes
        if (tamañoEquipo >= 3) {
            throw new Exception("El equipo ya está completo (Máximo 3 programadores).");
        }

        // Si pasa las validaciones, se agrega al arreglo
        programadores[tamañoEquipo] = p;
        tamañoEquipo++;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public String getUniversidad() {
        return universidad;
    }

    public String getLenguajeProgramacion() {
        return lenguajeProgramacion;
    }

    public Programador[] getProgramadores() {
        return programadores;
    }

    public int getTamañoEquipo() {
        return tamañoEquipo;
    }
}
