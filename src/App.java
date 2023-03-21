import clase1.Animal;
import clase1.Movie;
import polimorfisomo.Carisellazo;
import clase1.Ave;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Animal tigre= new Animal();
        Movie minions= new Movie();
        Movie avatar= new Movie();

        avatar.setName("avatar");
        avatar.setCategory("infantil");
        avatar.setYear(2020);
        avatar.setDuration(110);
        System.out.println("el nombre de la pelicula es: "+avatar.getName()+" la categoria es: "+avatar.getCategory()+" el año de estreno es: "+avatar.getYear()+" y la duracion de la pelicula es: "+avatar.getDuration());
        Ave condorito=new Ave();
        condorito.setNombre("condorito");
        condorito.setEdad(50);
        condorito.setEnvergadura("trescientos centimetros");

        condorito.mostrarAve();
        Carisellazo juego1=new Carisellazo();
        juego1.iniciar();
        juego1.jugar();
        juego1.finalizar();
    }
}

