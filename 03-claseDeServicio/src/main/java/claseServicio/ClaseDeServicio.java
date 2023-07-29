package claseServicio;

import claseServicio.entities.CuentaBancaria;
import claseServicio.entities.Fraccion;
import claseServicio.entities.NIF;
import claseServicio.entities.Pass;
import claseServicio.entities.Persona;
import claseServicio.entities.Raices;
import claseServicio.entities.Tiempo;
import claseServicio.services.CuentaBancariaServicio;
import claseServicio.services.FraccionServicio;
import claseServicio.services.NIFServicio;
import claseServicio.services.PassServices;
import claseServicio.services.PersonaServicio;
import claseServicio.services.RaicesServicio;

public class ClaseDeServicio {

    public static void main(String[] args) {
        //--------------------------- EJ 1 -------------------------------------
        /*
        CuentaBancariaServicio sv = new CuentaBancariaServicio();
        CuentaBancaria cuenta = sv.crearCuenta();
        
        sv.ingresar(cuenta);
        sv.retirar(cuenta);
        System.out.println("Extracción rápida");
        sv.extraccionRapida(cuenta);
        sv.consultarSaldo(cuenta);
        sv.consultarDatos(cuenta);
        */
        //--------------------------- EJ 2 -------------------------------------
        /*
        CafeteraServicio sv = new CafeteraServicio();
        sv.llenarCafetera();
        sv.servirTaza();
        sv.vaciarCafetera();
        sv.agregarCafe();
        */
        //--------------------------- EJ 3 -------------------------------------
        /*
        int[] promIMC = new int[4];
        boolean[] promEdad = new boolean[4];
        Persona[] personas = new Persona[4];
        
        PersonaServicio sv = new PersonaServicio();
        
        for (int i = 0; i < personas.length; i++) {
            personas[i] = sv.crearPersona();
            sv.informe(personas[i]);
            promIMC[i] = sv.calcularIMC(personas[i]);
            promEdad[i] = sv.esMayorDeEdad(personas[i]);
        }       
        
        double prom1 = 0, prom2 = 0, prom3 = 0, prom4 = 0, prom5 = 0;

        for (int i = 0; i < promEdad.length; i++) {
            switch (promIMC[i]) {
                case 0 -> prom1++;
                case -1 -> prom2++;
                case 1 -> prom3++;
            }
            if (promEdad[i]) {
                prom4++;
            }else if (!promEdad[i]){
                prom5++;
            }
        }

        System.out.println("El promedio de personas en su peso ideal es: " + (prom1 / promIMC.length));
        System.out.println("El promedio de personas por debajo de su peso ideal es: " + (prom2 / promIMC.length));
        System.out.println("El promedio de personas por arriba de su peso ideal es: " + (prom3 / promIMC.length));
        System.out.println("El promedio de personas mayores de edad es: " + (prom4 / promEdad.length));
        System.out.println("El promedio de personas menores de edad es: " + (prom5 / promEdad.length));
        */
        //--------------------------------- EJ EX 1 -------------------------------------------------------------
        /*
        RaicesServicio sv = new RaicesServicio();
        Raices r = new Raices(2,3,1);
        
        sv.calcular(r);
        */
        //--------------------------------- EJ EX 2 ------------------------------------------------------------
        /*
        NIFServicio sv = new NIFServicio();
        NIF nif = sv.crearNIF();
        
        sv.mostrar(nif);
        */
       //------------------------------------- EJ EX EX 1 -------------------------------------------
        /*
        FraccionServicio sv = new FraccionServicio();
        Fraccion f = new Fraccion(4,4,3,3);
        sv.menu(f);
        */
       //------------------------------------- EJ EX EX 2 --------------------------------------------
        /*
        Tiempo t;
        t = new Tiempo(15,15,15);
        t.imprimirHoraCompleta();
        */
        //-------------------------------------EJ EX EX 3 -------------------------------------------
        PassServices sv = new PassServices();
        Pass p1 = sv.crearUsuario("Lucas", 20365712);
        sv.menu(p1);
        System.out.println(p1);

    }
}
