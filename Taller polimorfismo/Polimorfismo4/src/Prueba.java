public class Prueba {
    public static void main(String[] args) {
        Vehiculo miVehiculo1 = new Coche();
        Vehiculo miVehiculo2 = new Bicicleta();
        
        miVehiculo1.mover(); // Muestra: El coche se está moviendo.
        miVehiculo2.mover(); // Muestra: La bicicleta se está moviendo.
    }
}