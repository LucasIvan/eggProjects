package herencia.entities;

public class Lavadora extends Electrodomestico{
    private Double carga;

    public Lavadora() {
    }
    
    public Lavadora(Double carga, Double precio, String color, Character consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public Double getCarga() {
        return carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return """
               Lavadora 
               -------------------------
               Carga = """ + carga + " lts\n"
                + "-------------------------";
    }
    
}
