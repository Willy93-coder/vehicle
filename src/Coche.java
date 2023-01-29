/**
 * Clase Coche
 * Contiene toda la información referente a los coches
 * @author Willy
 * @version 1.0.0
 * */
public class Coche extends Vehiculo{
    // Atributos
    private int puertas;

    // Constructor
    public Coche(String matricula, int puertas) {
        super(matricula);
        this.puertas = puertas;
    }

    // Método getPuertas
    public int getPuertas() {
        return puertas;
    }


}
