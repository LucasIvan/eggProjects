package herencia;

import herencia.entities.Animal;
import herencia.entities.Caballo;
import herencia.entities.Circulo;
import herencia.entities.Electrodomestico;
import herencia.entities.Gato;
import herencia.entities.Implementacion;
import herencia.entities.Lavadora;
import herencia.entities.Perro;
import herencia.entities.Rectangulo;
import herencia.entities.Televisor;
import herencia.services.ElectrodService;
import herencia.services.LavadoraService;
import herencia.services.TelevisorService;
import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class Herencia {

    public static void main(String[] args) {
        //******************************** GUIA TEORICA *************************************************
        /*
        Implementacion imp = new Implementacion();
        imp.metodo();
        */
        //*********************************** EJ 1 ********************************************************
        /*
        Animal perro1 = new Perro("Pocho","Carne",15,"Doberman");
        perro1.alimentarse();
        Animal perro2 = new Perro("Tomy","Croquetas",5,"Caniche");
        perro2.alimentarse();
        Animal gato = new Gato("Jinchi","Galletas",7,"Siames");
        gato.alimentarse();
        Animal caballo = new Caballo("Dororo","Pasto",10,"Fino");
        caballo.alimentarse();
        */
        //******************************** EJ 2 ***********************************************************
        /*
        LavadoraService sv = new LavadoraService();
        Lavadora lavadora = sv.crearLavadora();
        
        TelevisorService tvsv = new TelevisorService();
        Televisor televisor = tvsv.crearTelevisor();
        
        sv.precioFinal(lavadora);
        System.out.print("Precio Lavadora : $");
        System.out.println(lavadora.getPrecio());
        tvsv.precioFinal(televisor);
        System.out.print("Precio Televisor : $");
        System.out.println(televisor.getPrecio());
        */
        //***************************** EJ 3 **************************************************************
        /*
        ArrayList <Electrodomestico> electrodomesticos = new ArrayList();
        ElectrodService sv = new ElectrodService();
        electrodomesticos.add(new Lavadora(8d,85000d,"negro",'A',18d));
        electrodomesticos.add(new Televisor(42,true,57000d,"negro",'A',4.3d));
        electrodomesticos.add(new Lavadora(5d,45000d,"negro",'F',13d));
        electrodomesticos.add(new Televisor(42,false,45000d,"blanco",'B',3.15d));
        
        double sumaPrecios = 0;
        
        for (Electrodomestico electrodomestico : electrodomesticos) {
            sv.precioFinal(electrodomestico);
            System.out.println(electrodomestico.getClass());
            System.out.println("precio: $ " + electrodomestico.getPrecio());           
            sumaPrecios += electrodomestico.getPrecio();
        }
        System.out.println("La suma total es de: $" + sumaPrecios);
        */
        //******************************** EJ 4 **************************************************************
 
        Circulo circulo = new Circulo(8);

        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());

        Rectangulo rectangulo = new Rectangulo(6, 8);

        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
    
    }
}
