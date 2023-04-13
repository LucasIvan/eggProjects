package claseServicio.entities;

public class Pass {
    private String pass;
    private String nombre;
    private int DNI;

    public Pass() {

    }

    public Pass(int DNI, String nombre) {
        this.DNI = DNI;
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPass() {
        return pass;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Pass{" + "pass=" + pass + ", nombre=" + nombre + ", DNI=" + DNI + '}';
    }

   
}
