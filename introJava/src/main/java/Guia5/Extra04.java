package Guia5;

import java.util.Scanner;

/**
    Los profesores del curso de programación de Egg necesitan llevar un registro 
    de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad 
    de aprobados y desaprobados. Durante el período de cursado cada alumno 
    obtiene 4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales. 
    Las ponderaciones de cada nota son:

    Primer trabajo práctico evaluativo 10%
    Segundo trabajo práctico evaluativo 15%
    Primer Integrador 25%
    Segundo integrador 50%

    Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. 
    Al final del programa los profesores necesitan obtener por pantalla la cantidad 
    de aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos 
    con promedio mayor o igual al 7 de sus notas del curso.
 * @author lucas
 */
public class Extra04 {
static Scanner read = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int aprobados = 0;
        int desaprobados = 0;
        double[][] notas = new double[10][4];
        double[] promedio = new double [10];
        
        ingresoNotas(notas);
        
        promedio(notas, promedio);
        
        for (int i = 0; i < 10; i++) {
            if (promedio[i]>= 7) {
                aprobados++;
            }else{
                desaprobados++;
            }
        }
        
        System.out.println("La cantidad de aprobados es: " + aprobados);
        System.out.println("La cantidad de desaprobados es: " + desaprobados);

        
    }
    
    public static void ingresoNotas(double[][] notas){
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese las notas para el alumno " + (i+1));
            for (int j = 0; j < 4; j++) {
                System.out.print((j+1) + "° >> ");
                notas[i][j] = read.nextDouble();
            }
        }
        
    }
    
    public static void promedio(double[][] notas, double[] promedio){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                switch (j){
                    case 0:
                        promedio[i] += notas[i][j]*0.10;
                        break;
                    case 1:
                        promedio[i] += notas[i][j]*0.15;
                        break;
                    case 2:
                        promedio[i] += notas[i][j]*0.25;
                        break;
                    case 3:
                        promedio[i] += notas[i][j]*0.50;
                        break;
                }
            }
        }
    }
    
}
