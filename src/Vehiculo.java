/**
 * Clase Vehiculo
 * Contiene toda la información referente a los vehículos
 * @author Willy
 * @version 1.0.0
 * */
public abstract class Vehiculo{
    // Atributos
    /**
     * Matricula del vehiculo
     */
    protected String matricula;
    /**
     * Velocidad del vehiculo
     */
    protected double velocidad;

    // Constructor
    /**
     * Constructor con 1 parametro y que inicializa velocidad a 0
     * @param matricula*/
    public Vehiculo(String matricula) {
        this.matricula = matricula;
        this.velocidad = 0;
    }

    // Métodos
    /**
     * Metodo que acelera el vehiculo, recibe 1 parametro lanza y una excepcion de DemasiadoRapidoExceptio
     * @param velocidad
     */
    public double accelerar (double velocidad) throws DemasiadoRapidoException {
        this.velocidad += velocidad;
        return this.velocidad;
    }

    /**
     * Devuelve la matricula del coche
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Devuelve la velocidad del coche
     */
    public double getVelocidad() {
        return velocidad;
    }

    // To string
    @Override
    public String toString() {
        return "Tú vehiculo tiene la matricula " + matricula + " y velocidad " + velocidad + " km/h";
    }
}
