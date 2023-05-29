package herencia.services;

import herencia.entities.Televisor;
import java.util.Scanner;

public class TelevisorService extends ElectrodService {
    private Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public Televisor crearTelevisor(){
        Televisor televisor = new Televisor(); 
        System.out.println("---------------------------------");
        System.out.println("Ingrese los datos del televisor");
        System.out.println("---------------------------------");
        crearElectrodomestico(televisor);
        System.out.print("Resolución (pulg): ");
        televisor.setResolucion(read.nextInt());
        System.out.print("TDT (Y/N): ");
        televisor.setTdt(read.next().equalsIgnoreCase("Y"));
        System.out.println("---------------------------------");
        System.out.println("--Datos del televisor cargados--");
        System.out.println("---------------------------------");
        return televisor;
    }

    public void precioFinal(Televisor televisor) {
        super.precioFinal(televisor);
        double precio = televisor.getPrecio();
        if (televisor.getResolucion() > 40) {
            precio += precio * 0.3;
        }
        if (televisor.getTdt()) {
            precio += 500;
        }
        televisor.setPrecio(precio);
    }
}
