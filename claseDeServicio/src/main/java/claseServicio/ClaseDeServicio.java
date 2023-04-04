package claseServicio;

import claseServicio.entities.Persona;
import claseServicio.services.PersonaServicio;

public class ClaseDeServicio {

    public static void main(String[] args) {
        //--------------------------- EJ 1 -------------------------------------
        /*
        CuentaBancariaServicio servicio = new CuentaBancariaServicio();
        CuentaBancaria cuenta = servicio.crearCuenta();
        
        servicio.ingresar(cuenta);
        servicio.retirar(cuenta);
        
        System.out.println(cuenta);
        //faltan algunos métodos
        */
        
        //--------------------------- EJ 2 -------------------------------------
        
        
        
        //--------------------------- EJ 3 -------------------------------------
        
        int[] promIMC = new int[3];
        boolean[] promEdad = new boolean[3];
        
        PersonaServicio per1 = new PersonaServicio();
        PersonaServicio per2 = new PersonaServicio();
        PersonaServicio per3 = new PersonaServicio();
        PersonaServicio per4 = new PersonaServicio();

        Persona registro = per1.crearPersona();
        
        boolean mayor = per1.esMayorDeEdad(registro);
        
        if (per1.calcularIMC(registro) == 0){
            System.out.println("La persona se encuentra en su peso ideal");
            System.out.println("Es mayor de edad? = "+ mayor);
        }else if (per1.calcularIMC(registro) == -1){
            System.out.println("La persona se encuentra por debajo de su peso ideal");
            System.out.println("Es mayor de edad? = "+ mayor);
        }else if (per1.calcularIMC(registro) == 1){
            System.out.println("La persona se encuentra por ensima de su peso ideal");
            System.out.println("Es mayor de edad = "+ mayor);
        }
        promIMC[0] = per1.calcularIMC(registro);
        promEdad[0] = per1.esMayorDeEdad(registro);
        
        registro = per2.crearPersona();
        
        if (per2.calcularIMC(registro) == 0){
            System.out.println("La persona se encuentra en su peso ideal");
            System.out.println("Es mayor de edad? = "+ mayor);
        }else if (per2.calcularIMC(registro) == -1){
            System.out.println("La persona se encuentra por debajo de su peso ideal");
            System.out.println("Es mayor de edad? = "+ mayor);
        }else if (per2.calcularIMC(registro) == 1){
            System.out.println("La persona se encuentra por ensima de su peso ideal");
            System.out.println("Es mayor de edad = "+ mayor);
        }
        promIMC[1] = per2.calcularIMC(registro);
        promEdad[1] = per2.esMayorDeEdad(registro);
        
        registro = per3.crearPersona();
        
        if (per3.calcularIMC(registro) == 0){
            System.out.println("La persona se encuentra en su peso ideal");
            System.out.println("Es mayor de edad? = "+ mayor);
        }else if (per3.calcularIMC(registro) == -1){
            System.out.println("La persona se encuentra por debajo de su peso ideal");
            System.out.println("Es mayor de edad? = "+ mayor);
        }else if (per3.calcularIMC(registro) == 1){
            System.out.println("La persona se encuentra por ensima de su peso ideal");
            System.out.println("Es mayor de edad = "+ mayor);
        }
        
        promIMC[2] = per3.calcularIMC(registro);
        promEdad[2] = per3.esMayorDeEdad(registro);
        
        double prom1 = 0;
        double prom2 = 0;
        double prom3 = 0;
        
        for (int i = 0; i < 3; i++) {
            if (promIMC[i]==0) {
                prom1++;
            }else if (promIMC[i]==-1) {
                prom2++;
            }else if (promIMC[i]==1) {
                prom3++;
            }
        }
        
        System.out.println("El promedio de personas por debajo de su peso ideal es: "+(prom2/3));
        System.out.println("El promedio de personas por arriba de su peso ideal es: "+(prom3/3));
        System.out.println("El promedio de personas en su peso ideal es: "+(prom1/3));
        
        double prom4 = 0;
        double prom5 = 0;
        
        for (int i = 0; i < 3; i++) {
            if (promEdad[i]==true) {
                prom4++;
            }else if (promEdad[i]==false) {
                prom5++;
            }
        }
        System.out.println("El promedio de personas menores de edad es: "+(prom5/3));
        System.out.println("El promedio de personas mayores de edad es: "+(prom4/3));
        
    }
}
