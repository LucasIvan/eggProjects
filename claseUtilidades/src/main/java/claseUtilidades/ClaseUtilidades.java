package claseUtilidades;

import claseUtilidades.entities.Cadena;
import claseUtilidades.entities.ParDeNumeros;
import claseUtilidades.services.ArreglosService;
import claseUtilidades.services.CadenaServicio;
import claseUtilidades.services.ParDeNumerosService;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class ClaseUtilidades {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in).useDelimiter("\n");
        
        //---------------------------------------------- EJ 1 -------------------------------------------------------
        /*
        CadenaServicio sv = new CadenaServicio();
        
        System.out.println("Ingrese una frase");
        Cadena frase = sv.crearCadena(read.next());
        System.out.println(sv.mostrarVocales(frase));
        System.out.println(sv.invertirFrase(frase));
        System.out.println("Ingrese la letra a buscar");
        System.out.println("La letra se encontró " + sv.vecesRepetido(frase, read.next()) + " vez/veces.");
        System.out.println("Ingrese otra frase");
        System.out.println(sv.compararLongitud(frase, read.next()));
        System.out.println("Ingrese la frese que quiere concatenar a la almacenada");
        System.out.println(sv.unirFrases(frase, read.next()));
        System.out.println("Ingrese un caracter para reemplazar las 'a'");
        System.out.println(sv.reemplazar(frase, read.next()));
        System.out.println("Ingrese la letra que desea saber si se encuentra en la frase");
        System.out.println(sv.contiene(frase, read.next()));
        */
        //---------------------------------------------- EJ 2 -------------------------------------------------------
        /*
        ParDeNumerosService sv = new ParDeNumerosService();
        ParDeNumeros numeros = sv.crearPar();
        
        sv.mostrarValores(numeros);
        System.out.println(sv.devolverMayor(numeros));
        System.out.println(sv.calcularPotencia(numeros));
        System.out.println(sv.calcularRaiz(numeros));
        
        */
        
        //---------------------------------------------- EJ 0 -------------------------------------------------------
        ArreglosService sv = new ArreglosService();
        
        double[] a1 = new double[50];
        double[] a2 = new double[20];
        
        sv.inicializarA(a1);
        sv.mostrar(a1);
        sv.ordenar(a1);
        System.out.println("Arreglo 1 ordenado");
        sv.mostrar(a1);
        sv.inicializarB(a1, a2);
        System.out.println("Arreglo 1");
        sv.mostrar(a1);
        System.out.println("Arreglo 2");
        sv.mostrar(a2);
        
        //Arrays.equals(a1, a2);
        
        
        //---------------------------------------------- EJ 0 -------------------------------------------------------
        
        
        //---------------------------------------------- EJ 0 -------------------------------------------------------
    }
}
