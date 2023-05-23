package herencia.entities;

public class Gato extends Animal {
    @Override
    public void hacerRuido(){
        System.out.println("Miau!");
    }
}
