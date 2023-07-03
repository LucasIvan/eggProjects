package herenciaextras.entities;

public class Yate extends Barco{
    private Integer nroCamarotes;
    private Integer cv;

    public Yate() {
    }

    public Yate(Integer nroCamarotes, Integer cv, String matricula, Double eslora, String anhoFabricacion) {
        super(matricula, eslora, anhoFabricacion);
        this.nroCamarotes = nroCamarotes;
        this.cv = cv;
    }

    public Integer getNroCamarotes() {
        return nroCamarotes;
    }

    public Integer getCv() {
        return cv;
    }

    public void setNroCamarotes(Integer nroCamarotes) {
        this.nroCamarotes = nroCamarotes;
    }

    public void setCv(Integer cv) {
        this.cv = cv;
    }

    @Override
    public String toString() {
        return "Yate{" + "nroCamarotes=" + nroCamarotes + ", cv=" + cv + '}';
    }
    
    
    
}
