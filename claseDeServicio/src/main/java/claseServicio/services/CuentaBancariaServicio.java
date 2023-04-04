package claseServicio.services;

import claseServicio.entities.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicio {
    
    static Scanner read = new Scanner(System.in);

    public CuentaBancaria crearCuenta() {

        System.out.println("Ingrese el numero de cuenta");
        int numCuenta = read.nextInt();

        System.out.println("Ingrese el DNI del cliente");
        long dni = read.nextLong();

        System.out.println("Ingrese el monto inicial");
        double saldo = read.nextDouble();

        return new CuentaBancaria(numCuenta, dni, saldo);
    }

    public void ingresar(CuentaBancaria cuenta) {
        System.out.println("Indique cuanto desea ingresar:");
        double monto = read.nextDouble();
        cuenta.setSaldoActual(cuenta.getSaldoActual() + monto);
    }

    public void retirar(CuentaBancaria cuenta) {
        boolean verif = false;
        do {
            System.out.println("Indique cuanto desea retirar:");
            double monto = read.nextDouble();
            if (cuenta.getSaldoActual() != 0 && monto <= cuenta.getSaldoActual() && monto > 0) {
                cuenta.setSaldoActual(cuenta.getSaldoActual() - monto);
                System.out.println("Su saldo es el siguiente: $" + cuenta.getSaldoActual());
                verif = false;
            } else if (cuenta.getSaldoActual() == 0 || cuenta.getSaldoActual() < monto) {
                System.out.println("Saldo Insuficiente\n Saldo actual $"+ cuenta.getSaldoActual()+"\nVolver a intentar? Y/N");
                verif = read.next().equalsIgnoreCase("Y");
            }
        } while (verif);
    }

}
