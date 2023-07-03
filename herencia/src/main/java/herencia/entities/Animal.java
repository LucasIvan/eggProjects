package herencia.entities;

public abstract class Animal {
    private String nombre;
    private String alimento;
    private Integer edad;
    private String raza;

    public Animal() {
    }

    public Animal(String nombre, String alimento, Integer edad, String raza) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }
    
    public void alimentarse(){
        System.out.println(nombre + " come " + alimento);
    }
}
