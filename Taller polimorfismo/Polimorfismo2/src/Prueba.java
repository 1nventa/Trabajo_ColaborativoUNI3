public class Prueba {
    public static void main(String[] args) {
        Persona persona1 = new Estudiante("Juan", "Ingeniería");
        Persona persona2 = new Profesor("Ana", "Matemáticas");

        persona1.presentarse(); // Muestra: Hola, soy Juan y estudio Ingeniería.
        persona2.presentarse(); // Muestra: Hola, soy el profesor Ana y enseño Matemáticas.
    }
}