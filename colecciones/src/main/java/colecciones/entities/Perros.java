package colecciones.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Perros {

    Scanner read;
    List<String> razas;

    public Perros() {
        this.razas = new ArrayList();
        this.read = new Scanner(System.in).useDelimiter("\n");
    }

    public void crearRazas() {
        boolean flag;
        do {
            System.out.println("Ingrese raza");
            razas.add(read.next());
            System.out.println("Desea ingresar otra? Y/N");
            flag = read.next().equalsIgnoreCase("Y");
        } while (flag);

        System.out.println(razas.toString());
    }

    public void eliminarRaza() {
        System.out.println("Ingrese una raza");
        String raza = read.next();

        Iterator<String> it = razas.iterator();
        String aux;
        if (razas.contains(raza)) {
            while (it.hasNext()) {
                aux = it.next();
                if (aux.equalsIgnoreCase(raza)) {
                    it.remove();
                }
            }
        } else {
            System.out.println("La raza ingresada no se encuentra en la lista");
        }
        Collections.sort(razas);
        System.out.println(razas.toString());
    }
}
