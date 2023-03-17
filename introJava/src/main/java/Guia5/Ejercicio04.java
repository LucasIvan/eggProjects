package Guia5;

/**
    Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
    y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
    A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa)
 * @author lucas
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] array = new int [4][4];
        
        llenarArray(array);
        System.out.println("Arreglo original\n");
        mostrarArray(array);
        System.out.println("\n===========================\n");
        System.out.println("Arreglo Traspuesto\n");
        mostrarArrayTraspuesto(array);
        
    }
    
    public static void llenarArray(int[][] array){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = (int) (Math.random() * 98) + 1;
            }
        }
    }

    public static void mostrarArray(int[][] array){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + array[i][j] + "]");
            }
            System.out.println("");
        }
    }
    
    public static void mostrarArrayTraspuesto(int[][] array){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("[" + array[j][i] + "]");
            }
            System.out.println("");
        }
    }
    
    
    
}
