package claseServicio.services;

import claseServicio.entities.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicio {
    
    Scanner read = new Scanner(System.in);

    public CuentaBancaria crearCuenta() {
        
        CuentaBancaria cuenta = new CuentaBancaria();
        
        System.out.println("Ingrese el numero de cuenta");
        cuenta.setNumeroCuenta(read.nextInt());

        System.out.println("Ingrese el DNI del cliente");
        cuenta.setDniCliente(read.nextLong());

        System.out.println("Ingrese el monto inicial");
        cuenta.setSaldoActual(read.nextDouble());

        return cuenta;
    }

    public void ingresar(CuentaBancaria cuenta) {
        System.out.print("Indique cuanto desea ingresar: $");
        double monto = read.nextDouble();
        cuenta.setSaldoActual(cuenta.getSaldoActual() + monto);
    }

    public void retirar(CuentaBancaria cuenta) {
        boolean verif = false;
        do {
            System.out.print("Ingrese el monto a retirar: $");
            double monto = read.nextDouble();
            if (cuenta.getSaldoActual() != 0 && monto <= cuenta.getSaldoActual() && monto > 0) {
                cuenta.setSaldoActual(cuenta.getSaldoActual() - monto);
                System.out.println("Su saldo es el siguiente: $" + cuenta.getSaldoActual());
                verif = false;
            } else if (cuenta.getSaldoActual() == 0 || cuenta.getSaldoActual() < monto) {
                System.out.println("Saldo Insuficiente\n Saldo actual $" + cuenta.getSaldoActual() + "\nVolver a intentar? Y/N");
                verif = read.next().equalsIgnoreCase("Y");
            }
        } while (verif);
    }
    
    public void extraccionRapida(CuentaBancaria cuenta){
        System.out.print("Extracción rápida solo puede retirar hasta el 20%\n"
                + "Su saldo actual es: $" + cuenta.getSaldoActual() + "\n\n"
                        + "Ingrese el monto a retirar >> $");
        double monto = read.nextDouble();
        if (cuenta.getSaldoActual()>= 50 && monto <= cuenta.getSaldoActual()*0.2) {
            cuenta.setSaldoActual(cuenta.getSaldoActual()- monto);
            System.out.println("Saldo: $" + cuenta.getSaldoActual());
        }else{
            System.out.println("El monto ingresado no es válido o su saldo es insuficiente para usar extracción rápida");
        }
    }
    
    public void consultarSaldo(CuentaBancaria cuenta){
        System.out.println("Su saldo actual es: $" + cuenta.getSaldoActual());
    }
    
    public void consultarDatos(CuentaBancaria cuenta){
        System.out.println("Nro de cuenta: " + cuenta.getNumeroCuenta() + "\n"
                + "DNI: " + cuenta.getDniCliente() + "\n"
                + "Saldo: $" + cuenta.getSaldoActual());
    }
}
