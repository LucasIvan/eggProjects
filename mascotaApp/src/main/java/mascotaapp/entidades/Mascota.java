package mascotaapp.entidades;

public class Mascota {
    
    //------------------ atributos -----------------------------------------------------------------
    
    private String nombre;
    private String apodo;
    //Perro, gato, conejo, etc
    private String tipo;
    private String color;
    private int edad;
    private boolean cola;
    private String raza;
    private int energia;
    
    //------------------ constructor ----------------------------------------------------------------
    
    public Mascota() {
        energia = 1000;
    }

    public Mascota(String nombre, String apodo, String tipo) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        
        energia = 1000;
    }

    public Mascota(String nombre, String apodo, String tipo, String color, int edad, boolean cola, String raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
        
        energia = 1000;
    }

//---------------------- setters --------------------------------------------------------------------
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

//----------------------- getters -----------------------------------------------------------------
   
    public String getNombre() {
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCola() {
        return cola;
    }

    public String getRaza() {
        return raza;
    }

    //---------------------------------------------------------------------------------------------
    public int pasear(int energiaRestar){
        energia -= energiaRestar;
        return energia;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + ", energia=" + energia + '}';
    }
            
  
    
    
    
}
