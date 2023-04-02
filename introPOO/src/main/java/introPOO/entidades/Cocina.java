package introPOO.entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cocina {

    private static Scanner read = new Scanner(System.in);
    
    private ArrayList<Receta> recetas;

    
    public Cocina() {
        this.recetas = new ArrayList<>();
    }

    
    public void crearReceta(){
        String ingrediente;
        System.out.println("Ingrese el nombre de la receta");
        String nombre = read.nextLine();
        
        List<String> ingredientes = new ArrayList<>();
        
        boolean opc = true;
        System.out.println("Ingrese ingredientes");
        
        while (opc){
            System.out.print(">> ");
            ingrediente = read.nextLine();
            ingredientes.add(ingrediente);
            
            System.out.print(" 'S' para añadir otro ingrediente >> ");
            opc = read.nextLine().equalsIgnoreCase("S");
        }
        
        
        Receta receta = new Receta(nombre, ingredientes);
        this.recetas.add(receta);
        
    }
    

    
    public Receta buscarReceta(String nombre) {
        for (Receta receta : this.recetas) {
            if (receta.getNombre().equals(nombre)) {
                return receta;
            }
        }
        return null;
    }
    
    public Receta buscarIngrediente(String ingrediente) {
        List<String> ing;
        for (Receta receta : this.recetas) {
            ing = receta.getIngredientes();
            for (String ingr : ing)
            if (ingr.equals(ingrediente)) {
                return receta;
            }
        }
        return null;
    }
   

    @Override
    public String toString() {
        return "Cocina{" + "recetas=" + recetas + '}';
    }
    
    
}