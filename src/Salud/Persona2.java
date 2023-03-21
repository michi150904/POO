package Salud;
import java.util.Scanner;
public class Persona2 extends Persona1 {
    private String post,department;
    private int valueHour,hourWorked;
    //constructores

    public Persona2(){}
    public Persona2(String tipoDoc,String nombre,String apellido,String sexo,int documeno, int edad,double peso,double estatura,double pesoActual,String post,String department,int valueHour, int hourWorked){
        super (tipoDoc,nombre,apellido,sexo,documeno,edad,peso,estatura,pesoActual);
        this.post=post;
        this.department=department;
        this.valueHour=valueHour;
        this.hourWorked=hourWorked;
    }

    //metodos accesores
    
}
