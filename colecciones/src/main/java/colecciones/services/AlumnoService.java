package colecciones.services;

import colecciones.entities.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoService {
    
    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Alumno crearAlumno() {
        Alumno alumno = new Alumno();

        System.out.println("Ingresa el nombre del alumno");
        alumno.setNombre(read.next());
        System.out.println("Ingresa las 3 notas:");

        for (int i = 0; i < 3; i++) {
            System.out.println((i+1) + "° >> ");
            alumno.getNota().add(read.nextInt());
        }
        return alumno;
    }

    public void notaFinal(String nombre, ArrayList <Alumno> alumnos) {
        double notaF = 0;
        boolean flag = false;
        
        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                flag = true;
                for (Integer nota : alumno.getNota()) {
                    notaF += nota;
                }
                double promedio = notaF/alumno.getNota().size();
                System.out.println("La nota final de " + nombre + " es: " + promedio);
            }
        }
        if (!flag) {
            System.out.println("El alumno no se encuentra en la lista");
        }
    }
}
