/**
 * Clase Coche
 * Contiene toda la información referente a los coches
 * @author Willy
 * @version 1.0.0
 * */
public class Coche extends Vehiculo{
    // Atributos

    /**
     * Numero de puertas
     */
    protected int puertas;

    // Constructor

    /**
     * Constructor con 2 parametros que hereda de vehiculo
     * @param matricula
     * @param puertas
     */
    public Coche(String matricula, int puertas) {
        super(matricula);
        this.puertas = puertas;
    }

    // Métodos

    /**
     * Devuelve el numero de puertas
     */
    public int getPuertas() {
        return puertas;
    }


}
