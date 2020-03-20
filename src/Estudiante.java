public class Estudiante extends Persona {

    public Estudiante(String nombre, String ocupacion, int edad) {
        super(nombre, ocupacion, edad);
    }

    public void comer() {
        System.out.println("Completos de Gorbea a domicilio!");
    }

    public void dormir() {
        System.out.println("ZzzZzZ");
    }

    public String hacerLoSuyo() {
        return "Hago Cuarentena y Veo Netflix, que vida!";
    }
}
