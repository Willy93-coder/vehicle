/**
 * Clase Remolque
 * Contiene toda la información referente del remolque
 * @author Willy
 * @version 1.0.0
 * */
public class Remolque {
    // Atributos
    private int peso;

    // Contructor
    public Remolque(int peso) {
        this.peso = peso;
    }

    // To string
    @Override
    public String toString() {
        return "el remolque pesa " + peso + " kg";
    }
}
