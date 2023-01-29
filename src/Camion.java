/**
 * Clase Camion
 * Contiene toda la información referente a los camiones
 * @author Willy
 * @version 1.0.0
 * */
public class Camion extends Vehiculo{
    // Atributos
    Remolque remolque;

    // Constructor
    public Camion(String matricula) {
        super(matricula);
        this.remolque = null;
    }

    // Método ponRemolque
    public void ponRemolque(Remolque remolque) {
        this.remolque = remolque;
    }

    // Método quitaRemolque
    public void quitaRemolque(){
        this.remolque = null;
        System.out.println("Tu camión ya no tiene remolque");
    }

    // Método acelerar

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
