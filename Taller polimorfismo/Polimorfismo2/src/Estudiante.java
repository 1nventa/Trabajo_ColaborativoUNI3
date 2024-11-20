public class Estudiante extends Persona {
    private String nombre;
    private String carrera;

    public Estudiante(String nombre, String carrera) {
        this.nombre = nombre;
        this.carrera = carrera;
    }

    @Override
    public void presentarse() {
        System.out.println("Hola, soy " + nombre + " y estudio " + carrera + ".");
    }
}