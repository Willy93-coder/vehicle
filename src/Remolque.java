/**
 * Clase Remolque
 * Contiene toda la información referente del remolque
 * @author Willy
 * @version 1.0.0
 * */
public class Remolque {
    // Atributos

    /**
     * Peso del remolque
     */
    private int peso;

    // Contructor

    /**
     * Contructor con 1 parametro
     * @param peso
     */
    public Remolque(int peso) {
        this.peso = peso;
    }

    // To string
    @Override
    public String toString() {
        return "el remolque pesa " + peso + " kg";
    }
}
