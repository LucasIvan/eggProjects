package claseServicio.services;

import claseServicio.entities.Pass;
import java.util.Scanner;

public class PassServices {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    public Pass crearUsuario(String nombre, int dni){
        Pass p = new Pass(dni, nombre);
        return p;
    }

    public void crearPass(Pass p){
        boolean validate;
        String pass;
        do { 
            System.out.println("Ingrese su nueva Contraseña");
            System.out.print(">> ");
            pass = read.next();
            validate = pass.length() == 10;
            if (validate) {
                p.setPass(pass);
            }else{
                System.out.println("La longitud de la contraseña debe ser de 10 caracteres");
            }
        } while (!validate);
    }

    public String analizarPass(Pass p){
        boolean tiene_z = false;
        int contador_a = 0;
        char caracter;
        
        for (int i = 0; i < p.getPass().length(); i++) {
            
            if (p.getPass().charAt(i) == 'z') {
                tiene_z = true;
            } else if (p.getPass().charAt(i) == 'a') {
                contador_a++;
            }
        }
        
        if (tiene_z && contador_a >= 2) {
            return "Nivel de contraseña ALTO";
        } else if (tiene_z) {
            return "Nivel de contraseña MEDIO";
        } else {
            return "Nivel de contraseña BAJO";
        }
    }

    public void cambiarNombre(Pass p, String password) {
        if (p.getPass().equals(password)) {
            System.out.println("Ingrese el nuevo Nombre");
            System.out.print(">> ");
            p.setNombre(read.next());
            System.out.println("El nombre ha sido modificado correctamente.");
        } else {
            System.out.println("Acceso denegado. Contraseña incorrecta.");
        }
    }

    public void cambiarDNI(Pass p, String password) {
        if (p.getPass().equals(password)) {
            System.out.println("Ingrese el nuevo DNI");
            p.setDNI(read.nextInt());
            System.out.println("El DNI ha sido modificado correctamente.");
        } else {
            System.out.println("Acceso denegado. Contraseña incorrecta.");
        }
    }

    public void cambiarPass(Pass p, String passActual) {
        
        if (p.getPass().equals(passActual)) {
            crearPass(p);
            System.out.println("La contraseña ha sido modificada correctamente.");
        } else {
            System.out.println("Acceso denegado. La contraseña actual no coincide.");
        }
    }

    public void menu(Pass p){
        boolean salir = false;

        do {
            System.out.println("\n=== Menú ===");
            System.out.println("1. Ingresar contraseña");
            System.out.println("2. Ver nivel de contraseña");
            System.out.println("3. Modificar contraseña");
            System.out.println("4. Modificar nombre");
            System.out.println("5. Modificar DNI");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opción >> ");

            int opcion = read.nextInt();

            switch (opcion) {
                case 1:
                    crearPass(p);
                    break;
                case 2:
                    System.out.println(analizarPass(p));
                    break;
                case 3:
                    System.out.print("Ingrese su contraseña >> ");
                    cambiarPass(p, read.next());
                    break;
                case 4:
                    System.out.print("Ingrese su contraseña >> ");
                    cambiarNombre(p, read.next());
                    break;
                case 5:
                    System.out.print("Ingrese su contraseña >> ");
                    cambiarDNI(p, read.next());
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (!salir);


    }
}
