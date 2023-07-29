package colecciones.services;

import colecciones.entities.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class PeliculaService {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    private Pelicula crearPelicula(){
        Pelicula peli = new Pelicula();
        
        System.out.print("Ingrese el Nombre de la Pelicula: ");
        peli.setTitulo(read.next().toUpperCase());
        System.out.print("Ingrese el Director de la Pelicula: ");
        peli.setDirector(read.next().toUpperCase());
        System.out.print("Ingrese la Duración de la Pelicula (En horas): ");
        peli.setDuracion(read.nextDouble());
        
        return peli;
        
    }
    
    public void cargarPelicula(ArrayList <Pelicula> peliculas){
        boolean flag;
        do {            
            peliculas.add(crearPelicula());
            System.out.print("Desea agregar otra película? (Y/N): ");
            flag = read.next().equalsIgnoreCase("Y");
        } while (flag);
    }
    
    public void mostrarLista(ArrayList <Pelicula> peliculas){
        for (Pelicula peli : peliculas) {
            System.out.println(peli);
        }
    }
    
    public void peliculasMayorUnaHora(ArrayList <Pelicula> peliculas){
        System.out.println("");
        System.out.println("Mostrar Peliculas de más de 1 hora de duración:");
        for (Pelicula peli : peliculas){
            if (peli.getDuracion()>1) {
                System.out.println(peli);
            }
        }
    }

    public Comparator <Pelicula> compararDuracion = new Comparator <Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p2.getDuracion().compareTo(p1.getDuracion());
        }
    };
    
    public Comparator <Pelicula> compararTitulo = new Comparator <Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getTitulo().compareTo(p2.getTitulo());
        }
    };
    
    public Comparator <Pelicula> compararDirector = new Comparator <Pelicula>(){
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getDirector().compareTo(p2.getDirector());
        }
    };
    
    public void ordenMenorMayor(ArrayList <Pelicula> peliculas){
        peliculas.sort(compararDuracion);
        Collections.reverse(peliculas);
        System.out.println("");
        System.out.println("Peliculas Ordenadas de Menor a Mayor:");
        mostrarLista(peliculas);
    }
    
    public void ordenMayorMenor(ArrayList <Pelicula> peliculas){
        peliculas.sort(compararDuracion);
        System.out.println("");
        System.out.println("Peliculas Ordenadas Mayor a Menor:");
        mostrarLista(peliculas);
    }
    
    public void ordenTitulo(ArrayList <Pelicula> peliculas){
        peliculas.sort(compararTitulo);
        System.out.println("");
        System.out.println("Peliculas Ordenadas por Titulo:");
        mostrarLista(peliculas);
    }
    
    public void ordenDirector(ArrayList <Pelicula> peliculas){
        peliculas.sort(compararDirector);
        System.out.println("");
        System.out.println("Peliculas Ordenadas por Director:");
        mostrarLista(peliculas);
    }
}
