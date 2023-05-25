/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package herencia;

import herencia.entities.Electrodomestico;
import herencia.services.ElectrodService;

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
        
        ElectrodService ele = new ElectrodService();
        Electrodomestico electro1 = ele.crearElectrodomestico();
        
        
        ele.precioFinal(electro1);
        
        System.out.println(electro1);
        
        
    }
}
