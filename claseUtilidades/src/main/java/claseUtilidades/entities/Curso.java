package claseUtilidades.entities;

import java.util.Scanner;

/**
 * clase entidad llamada Curso, cuyos atributos
serán: nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana,
turno (mañana o tarde), precioPorHora y alumnos. Donde alumnos es un
arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno
 * @author lucas
 */
public class Curso {
    private String nombreCurso;
    private double cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private double precioPorHora;
    private String[] alumnos = new String[5];
    
    Scanner read = new Scanner(System.in).useDelimiter("\n");
    
    public Curso() {
    }

    public Curso(String nombreCurso, double cantidadHorasPorDia, int cantidadDiasPorSemana, String turno, double precioPorHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public double getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void setCantidadHorasPorDia(double cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    
    public void cargarAlumnos(){
        System.out.println("Ingrese los nombres de sus alumnos");
        for (int i = 0; i < alumnos.length; i++) {
            System.out.print((i+1) + ">> ");
            alumnos[i] = read.next();
        }
    }
    
    public void crearCurso(){
        System.out.print("Ingrese el nombre del curso >> ");
        nombreCurso = read.next();
        System.out.print("Ingrese la cantidad de horas por día >> ");
        cantidadHorasPorDia = read.nextDouble();
        System.out.print("Ingrese la cantidad de días por semana >> ");
        cantidadDiasPorSemana = read.nextInt();
        System.out.print("Ingrese el turno >> ");
        turno = read.next();
        System.out.print("Ingrese el precio por hora >> ");
        precioPorHora = read.nextDouble();
        cargarAlumnos();
    }
    
    public double calcularGananciaSemanal(){
        return cantidadHorasPorDia * precioPorHora * alumnos.length * cantidadDiasPorSemana;
    }
    
}
