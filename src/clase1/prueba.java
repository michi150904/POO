package clase1;
import java.util.Scanner;
import clase1.Movie;
public class prueba {
    public static void main(String[] args) throws Exception {
        Scanner lectura=new Scanner (System.in);
        Animal guacamaya=new Animal();
        Movie titanic=new Movie();
        Animal panda=new Animal("bambu", 10);
        guacamaya.setNombre("pancho");
        System.out.println("el nombre es: "+guacamaya.getNombre()+" la edad es: "+guacamaya.getEdad());
        Movie up= new Movie("up", "infantil", 2020, 110)  ;
      Movie laNocheDelDemonio= new Movie ("la noche del demonio","terror",2019,110);
      up.mostrarPelicula();
      laNocheDelDemonio.mostrarPelicula("la noche del demonio","terror",2010,110);
      laNocheDelDemonio.mostrarPelicula("terror",2010,"la noche del demonio",110);
 
      panda.mostrarAnimal();
      System.out.println("Ingrese el nombre del animal");
       String name=lectura.nextLine();
        System.out.println("Ingrese la edad del animal");
        int age=lectura.nextInt();
//argumentos
        guacamaya.registrarAnimal(name, age);
        guacamaya.mostrarAnimal();
        int duplicado=guacamaya.duplicarEdad(age);
        System.out.println("La edad duplicada del animal es: "+duplicado);
        }
    
    
}
