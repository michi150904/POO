package Principal;
import java.util.Scanner;

import Salud.Empleado;
import Salud.Persona1;
public class Inicio2 {
    public static void main(String[] args) {
        Scanner lectura=new Scanner (System.in);
        Empleado pedir=new Empleado();
        pedir.pedirDatos();
        pedir.setHonorarios(pedir.calcularHonorarios());
        pedir.mostrarPersona();
        lectura.close();

    

    }
    
}
