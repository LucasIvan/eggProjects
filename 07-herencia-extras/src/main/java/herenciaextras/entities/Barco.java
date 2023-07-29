package herenciaextras.entities;

public abstract class Barco {
    private String matricula;
    private Double eslora;
    private String anhoFabricacion;

    public Barco() {
    }

    public Barco(String matricula, Double eslora, String anhoFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anhoFabricacion = anhoFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public Double getEslora() {
        return eslora;
    }

    public String getAnhoFabricacion() {
        return anhoFabricacion;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setEslora(Double eslora) {
        this.eslora = eslora;
    }

    public void setAnhoFabricacion(String anhoFabricacion) {
        this.anhoFabricacion = anhoFabricacion;
    }

    @Override
    public String toString() {
        return "Barco{" + "matricula=" + matricula + ", eslora=" + eslora + ", añoFabricacion=" + anhoFabricacion + '}';
    }
    
}
