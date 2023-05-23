package herencia;

import herencia.entities.Animal;
import herencia.entities.Perro;
import herencia.entities.Gato;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        
        ArrayList <Animal> animales = new ArrayList();
        
        Animal a = new Animal();
        Animal b = new Perro();
        Animal c = new Gato();
        
        animales.add(a);
        animales.add(b);
        animales.add(c);
        
        for (Animal animal : animales) {
            animal.hacerRuido();
        }
        System.out.println("QUE ONDA");
    }

}
