package herencia.services;

import herencia.entities.Lavadora;
import java.util.Scanner;

public class LavadoraService extends ElectrodService{
    private Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public Lavadora crearLavadora(){
        Lavadora lavadora = new Lavadora();
        System.out.println("---------------------------------");
        System.out.println("Ingrese los datos de la lavadora");
        System.out.println("---------------------------------");
        crearElectrodomestico(lavadora);
        System.out.print("Capacidad de carga (Lts): ");
        lavadora.setCarga(read.nextDouble());
        System.out.println("---------------------------------");
        System.out.println("--Datos de la lavadora cargados--");
        System.out.println("---------------------------------");
        return lavadora;
    }

    public void precioFinal(Lavadora lavadora) {
        super.precioFinal(lavadora);
        if (lavadora.getCarga()>30) {
            lavadora.setPrecio(lavadora.getPrecio()+500);
        }
    }
    
    
}
