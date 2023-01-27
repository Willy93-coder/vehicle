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
