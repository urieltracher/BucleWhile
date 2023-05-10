package buclewhile;

/**
 *
 * @author maryse
 * 
 * While --> Bucle de muestra con while
 */
public class BucleWhile {

    public static void main(String[] args) {
        int contador = 1;

        while (contador <= 6) {
            System.out.println("Contador: " + contador);
            contador++;
        }

        System.out.println("Terminado. Contador final: " + contador);
    }

}
