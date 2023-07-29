package herenciaextras.entities;

public class Velero extends Barco {
    private Integer nroMastiles;

    public Velero() {
    }

    public Velero(Integer nroMastiles, String matricula, Double eslora, String anhoFabricacion) {
        super(matricula, eslora, anhoFabricacion);
        this.nroMastiles = nroMastiles;
    }

    public Integer getNroMastiles() {
        return nroMastiles;
    }

    public void setNroMastiles(Integer nroMastiles) {
        this.nroMastiles = nroMastiles;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return  "Velero{" + "nroMastiles=" + nroMastiles + '}';
    }

   
    
    
}
