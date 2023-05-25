package herencia.services;

import herencia.entities.Electrodomestico;
import java.util.Scanner;

public class ElectrodService {

    public Character comprobarConsumoEnergetico(char letra){
        letra = Character.toUpperCase(letra);
        
        if (letra == 'A' || letra =='B' || letra=='C' || letra=='D' || letra=='E' || letra == 'F') {
            return letra;
        }else{
           return 'F'; 
        }
    }
    
    public String comprobarColor(String color){
        color = color.toLowerCase();
        if (color.equals("blanco") || color.equals("negro") || color.equals("rojo") || color.equals("azul") || color.equals("gris") ) {
            return color;
        }else{
           return "blanco"; 
        }
        
    }
    
    public Electrodomestico crearElectrodomestico(){
        Electrodomestico elec = new Electrodomestico();
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        elec.setPrecio(1000d);
        
        System.out.println("Ingrese el color del producto: ");
        String color = read.next();
        elec.setColor(comprobarColor(color));
        
        System.out.println("Ingrese el consumo del producto: ");
        String consumo = read.next();
        elec.setConsumo(comprobarConsumoEnergetico(consumo.charAt(0)));
        
        System.out.println("Ingrese el peso del producto: ");
        elec.setPeso(read.nextDouble());
        return elec;
    }
    
    public void precioFinal(Electrodomestico elec){
        char consumo = elec.getConsumo();
        switch (consumo){
            case 'A':
                elec.setPrecio(elec.getPrecio()+1000);
                break;
            case 'B':
                elec.setPrecio(elec.getPrecio()+800);
                break;
            case 'C':
                elec.setPrecio(elec.getPrecio()+600);
                break;
            case 'D':
                elec.setPrecio(elec.getPrecio()+500);
                break;
            case 'E':
                elec.setPrecio(elec.getPrecio()+300);
                break;
            case 'F':
                elec.setPrecio(elec.getPrecio()+100);
                break;
        }
        
        if (elec.getPeso() >= 1 && elec.getPeso() <= 19) {
            elec.setPrecio(elec.getPrecio() + 100);
        } else if (elec.getPeso() >= 20 && elec.getPeso() <= 49) {
            elec.setPrecio(elec.getPrecio() + 500);
        } else if (elec.getPeso() >= 50 && elec.getPeso() <= 79) {
            elec.setPrecio(elec.getPrecio() + 800);
        } else if (elec.getPeso() >= 80) {
            elec.setPrecio(elec.getPrecio() + 1000);
        }
      
            
    }
}
