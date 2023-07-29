package claseUtilidades.entities;

import java.util.Scanner;

public class MesSecreto {
    private String[] mes = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre"};
    private String mesSecreto = mes[10];
    
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public void adivineMes(){
        boolean ver;
        do {
            System.out.println("Adivine el mes\nIngrese un mes del año en minúsculas");
            String a = read.next();
            ver = a.equalsIgnoreCase(mesSecreto);
            if (ver){
                System.out.println("ENORABUENA USTED ACERTÓ");
            }else{
                System.out.println("NO HA ACERTADO. Intente adivinarlo introduciendo otro mes");
            }
        } while (!ver);
    }
}
