/**
 * Clase Camion
 * Contiene toda la información referente a los camiones
 * @author Willy
 * @version 1.0.0
 */
public class Camion extends Vehiculo{
    // Atributos

    /**
     * Remolque del camion
     */
    protected Remolque remolque;

    // Constructor

    /**
     * Constructor con 1 parametro y que inicializa el remolque a null
     * @param matricula
     */
    public Camion(String matricula) {
        super(matricula);
        this.remolque = null;
    }

    // Métodos

    /**
     * Poner remolque al camion que recibe 1 parametro
     * @param remolque
     */
    public void ponRemolque(Remolque remolque) {
        this.remolque = remolque;
    }

    /**
     * Quitar remolque del camion
     */
    public void quitaRemolque(){
        this.remolque = null;
        System.out.println("Tu camión ya no tiene remolque");
    }

    /**
     * Sobreescritura del metodo acelerar que recibe 1 parametro, que controla la velocidad si tiene remolque
     * @param velocidad
     */
    @Override
    public double accelerar(double velocidad) throws DemasiadoRapidoException {
        if (velocidad > 100 && remolque != null ) {
            throw new DemasiadoRapidoException("La velocitat del camió amb remolc no pot superar els 100 km/h");
        } else {
            return super.accelerar(velocidad);
        }
    }

    // To string
    @Override
    public String toString() {
        return super.toString() + " y " + this.remolque;
    }
}
