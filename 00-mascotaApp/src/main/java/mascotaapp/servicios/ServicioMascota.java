package mascotaapp.servicios;

import java.util.Scanner;
import mascotaapp.entidades.Mascota;

public class ServicioMascota {
    
    private Scanner read = new Scanner(System.in);
    
    public Mascota crearMascota(){
        
        System.out.println("Ingrese el nombre");
        String nombre = read.nextLine();
        
        System.out.println("Ingrese el apodo");
        String apodo = read.nextLine();
        
        System.out.println("Ingrese el tipo");
        String tipo = read.nextLine();
        
        return new Mascota(nombre, apodo, tipo);
        
    }
}
