
package Guia3;

/**
    EJ 2 - Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una. 
    A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C tome el valor de A, A tome
    el valor de D y D tome el valor de B. Mostrar los valores iniciales y los valores finales de cada variable. 
    Utilizar sólo una variable auxiliar.
 */
public class Extra02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           
        int a = 1, b = 2, c = 3, d = 4, aux;
        
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);
        System.out.println("D = " + d);
        
        aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;
        System.out.println("============");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);
        System.out.println("D = " + d);
    }
    
}
