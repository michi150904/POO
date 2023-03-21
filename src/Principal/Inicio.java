package Principal;
import Salud.Persona;
public class Inicio {
    public static void main(String[] args) throws Exception {
        Persona pedir= new Persona();
        pedir.pedirDatos();
        pedir.mostrarPersona();
        pedir.calcularlmc();
        pedir.mayorEdad();
    }
}
