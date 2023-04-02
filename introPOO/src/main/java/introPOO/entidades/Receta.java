package introPOO.entidades;

import java.util.List;

public class Receta {

    private String nombre;
    private List<String> ingredientes;
    private List<String> pasos;

    public Receta(String nombre, List<String> ingredientes) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }
    
    public Receta(String nombre, List<String> ingredientes, List<String> pasos) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.pasos = pasos;
    }

    public String getNombre() {
        return this.nombre;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    @Override
    public String toString() {
        return "Receta{" + "Nombre: " + nombre + ""
                + "Ingredientes: " + ingredientes + ""
                + "Pasos: " + pasos + '}';
    }
    
    
}