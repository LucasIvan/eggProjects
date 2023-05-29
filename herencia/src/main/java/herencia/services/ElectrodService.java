package herencia.services;

import herencia.entities.Electrodomestico;
import java.util.Scanner;

public abstract class ElectrodService {
    private Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    protected Character comprobarConsumoEnergetico(char letra) {
        letra = Character.toUpperCase(letra);

        if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F') {
            return letra;
        } else {
            return 'F';
        }
    }

    protected String comprobarColor(String color) {
        color = color.toLowerCase();
        if (color.equals("blanco") || color.equals("negro") || color.equals("rojo") || color.equals("azul") || color.equals("gris")) {
            return color;
        } else {
            return "blanco";
        }
    }

    protected Electrodomestico crearElectrodomestico(Electrodomestico electrodomestico) {
        electrodomestico.setPrecio(1000d);

        System.out.print("Color: ");
        String color = read.next();
        electrodomestico.setColor(comprobarColor(color));

        System.out.print("Consumo: ");
        String consumo = read.next();
        electrodomestico.setConsumo(comprobarConsumoEnergetico(consumo.charAt(0)));

        System.out.print("Peso (Kg): ");
        electrodomestico.setPeso(read.nextDouble());
        return electrodomestico;
    }

    protected void precioFinal(Electrodomestico electrodomestico) {
        char consumo = electrodomestico.getConsumo();
        double precio = electrodomestico.getPrecio();
        double peso = electrodomestico.getPeso();
        
        switch (consumo) {
            case 'A' -> precio += 1000;
            case 'B' -> precio += 800;
            case 'C' -> precio += 600;
            case 'D' -> precio += 500;
            case 'E' -> precio += 300;
            case 'F' -> precio += 100;
        }
        if (peso >= 1 && peso <= 19) {
            precio += 100;
        } else if (peso >= 20 && peso <= 49) {
            precio += 500;
        } else if (peso >= 50 && peso <= 79) {
            precio += 800;
        } else if (peso >= 80) {
            precio += 1000;
        }
        electrodomestico.setPrecio(precio);
    }
}
