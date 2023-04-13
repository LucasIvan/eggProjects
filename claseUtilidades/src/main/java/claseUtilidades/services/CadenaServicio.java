package claseUtilidades.services;

import claseUtilidades.entities.Cadena;
import java.util.Scanner;

public class CadenaServicio {

    public Cadena crearCadena(String a) {
        return new Cadena(a);
    }
    
    public String mostrarVocales(Cadena cadena) {
        int cont = 0;
        for (char caracter : cadena.getFrase().toLowerCase().toCharArray()) {
            if ("aeiou".contains(String.valueOf(caracter))) {
                cont++;
            }
        }
        return "La cadena tiene " + cont + " vocales.";
    }

    public String invertirFrase(Cadena cadena) {
        String frase = cadena.getFrase();
        String fraseInvertida = "";

        for (int i = frase.length()-1; i >= 0; i--) {
            fraseInvertida += frase.charAt(i);
        }

        return fraseInvertida;
    }

    public int vecesRepetido(Cadena cadena, String letra) {
        int cont = 0;
        char caracter = letra.charAt(0);
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (cadena.getFrase().charAt(i) == caracter) {
                cont++;
            }
        }
        return cont;
    }
    
    public String compararLongitud(Cadena cadena, String otraFrase){
        if (cadena.getLongitud() == otraFrase.length()) {
            return "Las frases tienen la misma longitud: " + cadena.getLongitud();
        }else{
            return "La frase almacenada tiene longitud " + cadena.getLongitud() + "\n"
                    + "La frase ingresada tiene longitud: " + otraFrase.length();
        }
    }
    
    public String unirFrases(Cadena cadena, String otraFrase){
        return cadena.getFrase() + " " + otraFrase;
    }
    
    public String reemplazar(Cadena cadena, String caracter){
        String frase = "";
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (cadena.getFrase().charAt(i) == 'a') {
                frase += caracter;
            }else{
                frase += cadena.getFrase().charAt(i);
            }
        }
        return frase;
    }
    
    public boolean contiene(Cadena cadena, String letra){
        return cadena.getFrase().contains(letra);
    }
    
    
}
