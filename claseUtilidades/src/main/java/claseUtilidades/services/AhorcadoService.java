package claseUtilidades.services;

import claseUtilidades.entities.Ahorcado;
import java.util.Scanner;

public class AhorcadoService {

    public static Ahorcado crearJuego(String palabra, int jugadas) {
        Ahorcado juego = new Ahorcado();

        juego.setDimension(palabra.length());

        for (int i = 0; i < juego.getDimension(); i++) {
            juego.getPalabra()[i] = "" + palabra.charAt(i);
        }

        juego.setJugadasMaximas(jugadas);

        return juego;
    }

    public static void longitud(Ahorcado juego) {
        System.out.println("Longitud de la palabra: " + juego.getPalabra().length);
    }

    public static void buscar(Ahorcado juego, String letra) {
        boolean flag = false;

        for (String x : juego.getPalabra()) {
            if (x.equalsIgnoreCase(letra)) {
                flag = true;
            }
        }
        if (flag) {
            System.out.println("Mensaje: La letra pertenece a la palabra");
        } else {
            System.out.println("Mensaje: La letra no pertenece a la palabra");
        }
    }

    public static boolean encontradas(Ahorcado juego, String letra) {
        int cont = 0;
        int totalEncontradas = 0;
        if (juego.getLetrasEncontradas()==juego.getDimension()) {
            return false;
        }else{
            for (String x : juego.getPalabra()) {
                for (int i = 0; i < x.length(); i++) {
                    if (x.charAt(i) == letra.charAt(0)) {
                        cont++;
                        juego.getPalabra()[i]= "$";
                    }
                }
                totalEncontradas += cont;
                cont = 0;
            }
            if (totalEncontradas == 0) {
                System.out.println("Número de letras (encontradas, faltantes): (" + juego.getLetrasEncontradas() + "," + ((juego.getPalabra().length) - juego.getLetrasEncontradas()) + ")");
                juego.setJugadasMaximas(juego.getJugadasMaximas()-1);
                return false;
            } else {
                juego.setLetrasEncontradas(juego.getLetrasEncontradas() + totalEncontradas);
                System.out.println("Número de letras (encontradas, faltantes): (" + juego.getLetrasEncontradas() + "," + ((juego.getPalabra().length) - juego.getLetrasEncontradas()) + ")");
                return true;
            }
        }
        
    }

    public static int intentos(Ahorcado juego) {
        if (juego.getLetrasEncontradas()==juego.getPalabra().length) {
            System.out.println("VICTORIA");
            return 0;
        }else{
            System.out.println("Intentos restantes: " + juego.getJugadasMaximas());
            return juego.getJugadasMaximas();
        }
        
    }
    
    public static void juego(){
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese una palabra");
        String palabra = read.next();
        System.out.println("Ingrese la cantidad de jugadas máximas");
        int jugadas = read.nextInt();
        
        Ahorcado juego = crearJuego(palabra, jugadas);
        longitud(juego);
        String letra;
        
        while (intentos(juego)>0){
            System.out.print("Ingrese la letra a buscar >> ");
        letra = read.next();
        buscar(juego, letra);
        encontradas(juego, letra);
        
    }}

}
