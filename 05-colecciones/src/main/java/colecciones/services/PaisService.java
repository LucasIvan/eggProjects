package colecciones.services;

import colecciones.entities.Pais;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class PaisService {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public HashSet cargarPaises(){
        HashSet <Pais> paises = new HashSet();
        System.out.println("Desea crear una lista de paises? Y/N");
        boolean flag = read.next().equalsIgnoreCase("y");
        while (flag){
            Pais pais = new Pais();
            System.out.println("Ingrese un país");
            pais.setNombre(read.next());
            paises.add(pais);
            System.out.println("Desea añadir otro país Y/N");
            flag = read.next().equalsIgnoreCase("y");
        }
        System.out.println(paises.toString());
        return paises;
    }
    
    public void eliminarPais(ArrayList<Pais> paises){
        Iterator <Pais> it = paises.iterator();
        String aux;
        System.out.println("Ingrese el país que desea eliminar");
        String pais = read.next();
        if (paises.contains(pais)) {
            while (it.hasNext()) {
                aux = it.next().getNombre();
                if (aux.equalsIgnoreCase(pais)) {
                    it.remove();
                }
            }
        } else {
            System.out.println("El País ingresado no se encuentra en la lista");
        }
        System.out.println(paises.toString());
    }
    
    public Comparator <Pais> compararNombre = new Comparator <Pais>(){
        @Override
        public int compare(Pais p1, Pais p2) {
            return p2.getNombre().compareTo(p1.getNombre());
        }
    };
    
    
}
