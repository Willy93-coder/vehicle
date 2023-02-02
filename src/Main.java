public class Main {
    public static void main(String[] args) {
        // Creacion del array de vehiculos
        Vehiculo [] arrayVehiculos = new Vehiculo[4];

        // Creación de los vehiculos
        Vehiculo camion1 = new Camion("3343 AJK");
        Vehiculo camion2 = new Camion("5643 KLD");
        Vehiculo coche1 = new Coche("9321 JVD", 3);
        Vehiculo coche2 = new Coche("7894 GBS", 5);

        // Creacion de la velocidad
        double velocitat = 120;

        // Creación del remolque
        Remolque remolque = new Remolque(5000);

        // Asignacion de cada vehiculo a una posicion del array
        arrayVehiculos[0] = camion1;
        arrayVehiculos[1] = coche1;
        arrayVehiculos[2] = camion2;
        arrayVehiculos[3] = coche2;

        // Bucle for para recorrer el array de vehiculos
        for (int i = 0; i < arrayVehiculos.length; i ++) {
            // Comprobamos si el vehiculo es camion
            if (arrayVehiculos[i] instanceof Camion) {
                // Ponemos el remolque
                ((Camion) arrayVehiculos[i]).ponRemolque(remolque);
                System.out.println(arrayVehiculos[i]);
                // Intentamos acelerar
                try {
                    arrayVehiculos[i].accelerar(velocitat);
                } catch (DemasiadoRapidoException e){
                    System.err.println(e.getMessage());
                }
            }
            // Comprobamos si el vehiculo es coche
            if (arrayVehiculos[i] instanceof Coche) {
                // Intentamos acelerar
                try{
                    arrayVehiculos[i].accelerar(velocitat);
                    System.out.println(arrayVehiculos[i]);
                } catch (DemasiadoRapidoException e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}