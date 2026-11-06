package com.mycompany.t4pag427.archivos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LectorArchivo {

    public static String leerArchivo(String ruta) throws FileNotFoundException, IOException {
        File archivo = new File(ruta);
        
        if (!archivo.exists()) {
            throw new FileNotFoundException("El archivo '" + ruta + "' no existe en la ruta especificada.");
        }

        StringBuilder contenido = new StringBuilder();
        
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                contenido.append(linea).append("\n");
            }
        }
        
        return contenido.toString();
    }
}
