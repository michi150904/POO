package Salud;
import java.util.Scanner;
public class Persona {
    private String tipoDoc,nombre,apellido,sexo;
    private int documento,edad;
    private double peso,estatura,pesoActual;
    Scanner lectura=new Scanner (System.in);

    public void pedirDatos(){
        System.out.println("Digite el nombre: ");
        nombre=lectura.nextLine();
        System.out.println("Digite el apellido: ");
        apellido=lectura.nextLine();
        System.out.println("Digite el sexo: ");
        sexo=lectura.nextLine();
        System.out.println("Digite el tipo de documento: ");
        tipoDoc=lectura.nextLine();
        System.out.println("Digite el numero de documento: ");
        documento=lectura.nextInt();
        System.out.println("Digite la edad: ");
        edad=lectura.nextInt();
        System.out.println("Digite el peso: ");
        peso=lectura.nextDouble();
        System.out.println("Digite la estatura: ");
        estatura=lectura.nextDouble();
    }
    public void mostrarPersona(){
        System.out.println("tu nombre es: "+nombre+
        " tu apellido es: "+apellido+" tu sexo es: "+sexo+
        " tu tipo de documento es: "+tipoDoc+" tu número de documento es: "
        +documento+ " tu edad es: "+edad+" tu peso es: "+peso+
        " tu estatura es: "+estatura);
    }
    public void calcularlmc(){        
        pesoActual=Math.pow(estatura,2);
        pesoActual=(peso/pesoActual);
        if (pesoActual<20){
            System.out.println("El peso esta por debajo de lo cual, ya que tu lmc es: "+pesoActual);
        }
        else if (pesoActual>=20 && pesoActual<=25){
            System.out.println("El peso es ideal, ya que tu lmc es: "+pesoActual);
        }
        else if (pesoActual>25){
            System.out.println("Tienes sobrepeso, ya que tu lmc es: "+pesoActual);
        }
    }
    public void mayorEdad(){
        if (edad >=18){
            System.out.println("es mayor de edad");
        }
        else{
            System.out.println("es menor de edad");
        }
    }
}
