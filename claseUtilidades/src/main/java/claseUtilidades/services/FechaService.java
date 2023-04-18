package claseUtilidades.services;

import java.util.Date;

public class FechaService {

    public Date fechaNacimiento(int dia,int mes, int anho) {
        return new Date(anho - 1900, mes - 1, dia);
    }

    public Date fechaActual() {
        return new Date();
    }

    public int diferencia(Date nacimiento, Date fechaActual) {
        int edad = fechaActual.getYear() - nacimiento.getYear();

        if (nacimiento.getMonth() > fechaActual.getMonth() || (nacimiento.getMonth() == fechaActual.getMonth() && nacimiento.getDate() > fechaActual.getDate())) {
            edad--;
        }
        return edad;
    }
    
    
}
