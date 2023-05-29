package herencia;

import herencia.entities.Lavadora;
import herencia.entities.Televisor;
import herencia.services.LavadoraService;
import herencia.services.TelevisorService;
import java.util.Arrays;
import java.util.Collections;

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
        perro1.Alimentarse();
        Animal perro2 = new Perro("Tomy","Croquetas",5,"Caniche");
        perro2.Alimentarse();
        Animal gato = new Gato("Jinchi","Galletas",7,"Siames");
        gato.Alimentarse();
        Animal caballo = new Caballo("Dororo","Pasto",10,"Fino");
        caballo.Alimentarse();
        */
        //******************************** EJ 2 ***********************************************************
        
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
        
        
        
    }
}
