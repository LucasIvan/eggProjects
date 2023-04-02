package introPOO.entidades;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Cuenta {

    private static Scanner read = new Scanner(System.in);
    private double saldo;
    private String titular;

    public Cuenta() {
    }

    public Cuenta(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public void retirarDinero() {
        DecimalFormat df = new DecimalFormat("####.##");
        boolean selec = true;
        
        System.out.println("Saldo Actual : $" + df.format(saldo) + "\n");
        System.out.print("Ingrese el monto que desea retirar >> $");
        double monto = read.nextDouble();

        while (saldo > 0 && selec) {
            if (monto < saldo) {
                saldo -= monto;
                System.out.print("Desea retirar más?\n Saldo: $" + df.format(saldo) + "\nY/N >> ");
                selec = read.next().equalsIgnoreCase("Y");
                if (selec) {
                    System.out.print("Ingrese el monto que desea retirar >> $");
                    monto = read.nextDouble();
                }
            } else {
                System.out.println("Monto Inválido");
                System.out.print("Ingrese el monto que desea retirar >> $");
                monto = read.nextDouble();
            }
        }

        System.out.println("El saldo restante es = $" + df.format(saldo));
    }
 

}
