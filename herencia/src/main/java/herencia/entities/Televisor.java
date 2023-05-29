package herencia.entities;

public class Televisor extends Electrodomestico{
    private Integer resolucion;
    private Boolean tdt;

    public Televisor() {
    }

    public Televisor(Integer resolucion, Boolean tdt, Double precio, String color, Character consumo, Double peso) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public Boolean getTdt() {
        return tdt;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public void setTdt(Boolean tdt) {
        this.tdt = tdt;
    }

    @Override
    public String toString() {
        return """
               Televisor
               ---------------------------------------------
               Resolucion = """ + resolucion + " Pulgadas\n"
                + "TDT = " + tdt + """
               ---------------------------------------------""";
    }
    
    
}
