package claseUtilidades.entities;
/**
 * un vector con la palabra a buscar, la
cantidad de letras encontradas y la cantidad jugadas máximas que
puede realizar el usuario. 
 * @author lucas
 */
public class Ahorcado {
    private int dimension;
    private String[] palabra = new String[dimension];
    private int letrasEncontradas;
    private int jugadasMaximas;

    public Ahorcado() {
    }

    public Ahorcado(int dimension, int letrasEncontradas, int jugadasMaximas) {
        this.dimension = dimension;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadasMaximas = jugadasMaximas;
    }

    

    public int getDimension() {
        return dimension;
    }
    
    public String[] getPalabra() {
        return palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }
    
    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + palabra + ", letrasEncontradas=" + letrasEncontradas + ", jugadasMaximas=" + jugadasMaximas + '}';
    }
    

    
}
