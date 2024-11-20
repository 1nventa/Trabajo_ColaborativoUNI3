public class Prueba {
    public static void main(String[] args) {
        Figura figura1 = new Circulo(5);
        Figura figura2 = new Rectangulo(4, 6);

        figura1.calcularArea(); // Muestra: El área del círculo es: 78.53981633974483
        figura2.calcularArea(); // Muestra: El área del rectángulo es: 24.0
    }
}