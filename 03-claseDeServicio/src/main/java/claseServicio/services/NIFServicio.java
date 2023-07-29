package claseServicio.services;

import claseServicio.entities.NIF;
import java.util.Scanner;

public class NIFServicio {
    
    static Scanner read = new Scanner(System.in);
    
    static char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
    
    public NIF crearNIF(){
        System.out.print("Ingrese el nro de DNI: >> ");
        long DNI = (read.nextLong());
        
        long rest = DNI%23;
        
        char letra = (letras[(int)rest]);
        
        return new NIF(DNI,letra);
    }
    
    public void mostrar(NIF r){
        System.out.println(r.getDNI()+"-"+r.getLetra());
    }
}
