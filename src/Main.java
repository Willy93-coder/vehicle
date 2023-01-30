public class Main {
    public static void main(String[] args) {
        Vehiculo [] arrayVehiculos = new Vehiculo[4];
        Vehiculo camion1 = new Camion("3343 AJK");
        Vehiculo camion2 = new Camion("5643 KLD");
        Vehiculo coche1 = new Coche("9321 JVD", 3);
        Vehiculo coche2 = new Coche("7894 GBS", 5);

        double velocitat = 120;
        Remolque remolque = new Remolque(5000);

        arrayVehiculos[0] = camion1;
        arrayVehiculos[1] = coche1;
        arrayVehiculos[2] = camion2;
        arrayVehiculos[3] = coche2;

        for (int i = 0; i < arrayVehiculos.length; i ++) {
            if (arrayVehiculos[i] instanceof Camion) {
                ((Camion) arrayVehiculos[i]).ponRemolque(remolque);
                System.out.println(arrayVehiculos[i]);
                try {
                    arrayVehiculos[i].accelerar(velocitat);
                } catch (DemasiadoRapidoException e){
                    System.err.println(e.getMessage());
                }
            }
            if (arrayVehiculos[i] instanceof Coche) {
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