package mascotaapp;

import mascotaapp.entidades.Mascota;
import mascotaapp.servicios.ServicioMascota;

public class MascotaApp {

    public static void main(String[] args) {
        
        ServicioMascota mascota = new ServicioMascota();
        
        Mascota m1 = mascota.crearMascota();
        
        System.out.println(m1);
        
    }
}
