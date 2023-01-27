public abstract class Vehiculo{
    // Atributos
    private String matricula;
    private double velocidad;

    // Constructor
    public Vehiculo(String matricula) {
        this.matricula = matricula;
        this.velocidad = 0;
    }

    // Métodos
    public double acelerar (double velocidad) {
        return this.velocidad = velocidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getVelocidad() {
        return velocidad;
    }

    // To string
    @Override
    public String toString() {
        return "Tú vehiculo tiene la matricula " + matricula + " y velocidad " + velocidad;
    }
}
