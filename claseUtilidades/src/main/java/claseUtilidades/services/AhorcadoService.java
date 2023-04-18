package claseUtilidades.services;

import claseUtilidades.entities.Ahorcado;
import java.util.Scanner;

public class AhorcadoService {
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    /**
     * le pide la palabra al usuario y cantidad de
jugadas máxima. Con la palabra del usuario, pone la longitud de la
palabra, como la longitud del vector. Después ingresa la palabra en el
vector, letra por letra, quedando cada letra de la palabra en un índice
del vector. Y también, guarda la cantidad de jugadas máximas y el
valor que ingresó el usuario.
     * @return 
     */
    public Ahorcado crearJuego(){
        Ahorcado juego = new Ahorcado();
        System.out.println("Ingrese una palabra");
        String palabra = read.next();
        juego.setDimension(palabra.length());
        String[] array = juego.getPalabra();
        for (int i = 0; i < palabra.length(); i++) {
            array[i]= "" + palabra.charAt(i);
        }
        juego.setPalabra(array);
        System.out.println("Ingrese la cantidad de jugadas máximas");
        juego.setJugadasMaximas(read.nextInt());
        
        
        return juego;
    }
    
    public void longitud(Ahorcado juego){
        System.out.println(juego.getPalabra().length);
    }
    
    public void buscar(Ahorcado juego, String letra){
        String[] array = juego.getPalabra();
        for (int i = 0; i < juego.getPalabra().length; i++) {
            if (array[i].equalsIgnoreCase(letra)) {
                System.out.println("Mensaje: La letra pertenece a la palabra");
                break;
            }else{
                System.out.println("Mensaje: La letra no pertenece a la palabra");
            }
        }
    }
    /**
     * que reciba una letra ingresada por el
usuario y muestre cuantas letras han sido encontradas y cuántas le
faltan. Este método además deberá devolver true si la letra estaba y
false si la letra no estaba, ya que, cada vez que se busque una letra
que no esté, se le restará uno a sus oportunidades
     */
    public boolean encontradas(Ahorcado juego, String letra){
        int cont = 0;
        String[] array = juego.getPalabra();
        for (int i = 0; i < juego.getPalabra().length; i++) {
            if (array[i].equalsIgnoreCase(letra)) {
                cont++;
            }else{
                return false;
            }
        }
        juego.setLetrasEncontradas(juego.getLetrasEncontradas()+cont);
        System.out.println("Número de letras (encontradas, faltantes): " + juego.getLetrasEncontradas()+ "," + ((juego.getPalabra().length)-juego.getLetrasEncontradas()));
        return cont>0;
    }
    
    public void intentos(){
        
    }
    
}
