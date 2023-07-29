package relaciones.entities;

public class Persona {
    private String nombre;
    private String apellido;
    private Integer edad;
    private Dni dni;
    private Perro perro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Dni dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Dni getDni() {
        return dni;
    }

    public Integer getEdad() {
        return edad;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(Dni dni) {
        this.dni = dni;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + '}';
    }
    
    
}
