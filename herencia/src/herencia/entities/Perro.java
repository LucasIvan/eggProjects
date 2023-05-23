package herencia.entities;

public class Perro extends Animal {
    @Override
    public void hacerRuido(){
        System.out.println("Guau!");
    }
}
