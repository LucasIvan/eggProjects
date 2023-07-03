package herenciaextras.services;

import herenciaextras.entities.AlquilerPuerto;
import herenciaextras.entities.Barco;
import herenciaextras.entities.Velero;
import herenciaextras.entities.Yate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class AlquilerPuertoService {
    private ArrayList <Barco> barcos = new ArrayList();
    private Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public void alquilarBarco(){
        barcos.add(new Velero(5,"SBG-55",50d,"1985"));
        barcos.add(new Yate(45,1500,"THG-011",100d,"1998"));
        barcos.add(new Velero(1,"SMN-77",15d,"1988"));
        barcos.add(new Velero(2,"RRR-00",25d,"2000"));
        barcos.add(new Yate(120,3500,"AAA-00",50d,"2011"));
        
        AlquilerPuerto alquiler = new AlquilerPuerto();
        System.out.println("Ingrese los datos para el alquiler de un barco");
        
        System.out.print("Nombre del Cliente: ");
        alquiler.setNombre(read.next());
        
        System.out.print("DNI: ");
        alquiler.setDni(read.nextInt());
        
        alquiler.setFechaAlquiler(new Date());
        System.out.println("Ingrese Fecha de Devolución:");
        System.out.print("Día >> ");
        int dia = read.nextInt();
        System.out.print("Mes >> ");
        int mes = read.nextInt();
        System.out.print("Año >> ");
        int anho = read.nextInt();
        alquiler.setFechaDevolucion(new Date(anho-1900,mes-1,dia));
        
        System.out.println("Fecha Actual : " + alquiler.getFechaAlquiler());
        System.out.println("Fecha Devolucion : " + alquiler.getFechaDevolucion());
        System.out.print("Amarre: ");
        alquiler.setAmarre(read.next());
        System.out.println("\nSeleccione uno de los barcos disponibles\n");
                
        for (int i = 0; i < barcos.size(); i++) {
            System.out.print((i+1) + " - ");
            System.out.println(barcos.get(i));
        }
        int eleccion = read.nextInt();
        alquiler.setBarco(barcos.get(eleccion-1));
        
        System.out.println("El precio de Alquiler es de $" + calcularAlquiler(alquiler));

    }
    
    public double calcularAlquiler(AlquilerPuerto alquiler){
        long diferenciaMilisegundos = alquiler.getFechaDevolucion().getTime() - alquiler.getFechaAlquiler().getTime();
        long diferenciaDias = (diferenciaMilisegundos / (24 * 60 * 60 * 1000))+1;
        
        double precio = diferenciaDias * (alquiler.getBarco().getEslora()*10);
        
        if (alquiler.getBarco() instanceof Velero) {
            Velero velero = (Velero)alquiler.getBarco();
            precio += velero.getNroMastiles();
        }else if(alquiler.getBarco() instanceof Yate){
            Yate yate = (Yate)alquiler.getBarco();
            precio += yate.getCv()+yate.getNroCamarotes();
        }
        return precio;
    }
}
