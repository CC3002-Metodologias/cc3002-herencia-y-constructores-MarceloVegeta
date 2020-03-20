public class Main {

    public static void main(String[] args) {
    Estudiante Marcelo = new Estudiante( "Marcelo", "IngElectrico",  23  );
    Academico Jaime = new Academico("Jaime", "Informatico",50,"Como Instalar Yutub et al");
    Persona juan = new Persona("juan", "vendedor", 30);

    System.out.println("Marcelo Estudiante");
    Marcelo.dormir();
    Marcelo.comer();
    System.out.println(Marcelo.hacerLoSuyo());

        System.out.println("Jaime Academico");
        Jaime.dormir();
        Jaime.comer();
        System.out.println(Jaime.publicarPaper());
        System.out.println(Jaime.hacerLoSuyo());

        System.out.println("Juan Persona");
        juan.dormir();
        juan.comer();
        System.out.println(juan.hacerLoSuyo());
    }
}





