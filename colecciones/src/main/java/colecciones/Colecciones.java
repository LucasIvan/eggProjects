package colecciones;

import colecciones.entities.Alumno;
import colecciones.entities.Perros;
import colecciones.services.AlumnoService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class Colecciones {
    
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        //----------------------------------- EJ 1 y 2 -----------------------------------------------------------
        /*
        Perros razas = new Perros();
        razas.crearRazas();
        razas.eliminarRaza();
        */
        //----------------------------------- EJ 3 -----------------------------------------------------------
        /*
        AlumnoService as = new AlumnoService();
        
        ArrayList <Alumno> alumnos = new ArrayList();
        boolean flag;
        do {
            alumnos.add(as.crearAlumno());
            
            System.out.println("desea cargar otro alumno Y/N:");
            flag = read.next().equalsIgnoreCase("y");
            
        } while (flag);
        
        System.out.println("Ingresa el alumno a calcular el promedio:");
        String nombreAlumno = read.next();
        
        as.notaFinal(nombreAlumno, alumnos);
        */
        //----------------------------------- EJ 4 -----------------------------------------------------------
        
        //----------------------------------- EJ 5 -----------------------------------------------------------
        
        //----------------------------------- EJ 6 -----------------------------------------------------------
    }
}
