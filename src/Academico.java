public class Academico extends Persona {

    public String paper;
    public Academico(String nombre, String ocupacion, int edad, String paper) {
        super(nombre, ocupacion, edad);
        this.paper = paper;
    }

    public String publicarPaper() {
        return paper;
    }

    public String hacerLoSuyo() {
        return "Hago Cuarentena y aprendo ZOOM ";
    }
    public void dormir() {
        System.out.println("ZzzZzZz");
    }
}
