package claseUtilidades.services;

import claseUtilidades.entities.Estudiante;
import java.util.ArrayList;

public class EstudianteService {
    
    public static double promedio(Estudiante[] estudiantes){
        double suma = 0;
        for (Estudiante estudiante : estudiantes) {
            suma += estudiante.getNota();
        }
        return suma/estudiantes.length;
    }
    
    public static ArrayList destacados(Estudiante[] estudiantes){
        ArrayList<String> destacados = new ArrayList<>();
        
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNota() > promedio(estudiantes)) {
                destacados.add(estudiante.getNombre());
            }
        }
        return destacados;
    }
}
