package claseServicio.entities;

import java.text.DecimalFormat;

public class Tiempo {
    private int hora, minutos, segundos;

    public Tiempo (int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public Tiempo() {
    }

    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setHora (int hora) {
        this.hora = hora;
    }

    public void setMinutos (int minutos) {
        this.minutos = minutos;
    }

    public void setSegundos (int segundos) {
        this.segundos = segundos;
    }
    
    public void imprimirHoraCompleta() {
    DecimalFormat formato = new DecimalFormat("00");

     if (hora >= 0 && hora <= 23 && minutos >= 0 && minutos <= 59 && segundos >= 0 && segundos <= 59) {
        String horaCompleta = formato.format(hora) + ":" + formato.format(minutos) + ":" + formato.format(segundos);
        System.out.println(horaCompleta);
    } else {
        System.out.println("Hora inválida");
    }
    }
}


