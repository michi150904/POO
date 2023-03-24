package Salud;
import java.util.Scanner;
public class Persona1 {
    private String tipoDoc,nombre,apellido,sexo;
    private int documento,edad;
    private double peso,estatura,pesoActual;
    private double valueHour,hourWorked,honorarios;
    Scanner lectura=new Scanner (System.in);
    //CONSTRUCTOR
    public Persona1(){}
    public Persona1(String tipoDoc,String nombre,String apellido,String sexo,int documeno, int edad,double peso,double estatura,double pesoActual,double valueHour, double hourWorked){
        this.tipoDoc=tipoDoc;
        this.nombre=nombre;
        this.apellido=apellido;
        this.sexo=sexo;
        this.documento=documeno;
        this.edad=edad;
        this.peso=peso;
        this.estatura=estatura;
        this.pesoActual=pesoActual;
        this.valueHour=valueHour;
        this.hourWorked=hourWorked;
    }
    //metodos accesores

    public String gettipoDoc(){
        return tipoDoc;
    }
    public String getNombre(){
        return nombre;
    }
    public double getValueHour() {
        return valueHour;
    }
    public double getHourWorked() {
        return hourWorked;
    }
    public void setValueHour(int valueHour) {
        this.valueHour = valueHour;
    }
    public void setHourWorked(int hourWorked) {
        this.hourWorked = hourWorked;
    }

    
    public double getHonorarios() {
        return honorarios;
    }
    public void setHonorarios(double honorarios) {
        this.honorarios = honorarios;
    }
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
        System.out.println("Digie el valor por hora");
        valueHour=lectura.nextDouble();
        System.out.println("digite las horas trabajadas");
        hourWorked=lectura.nextDouble();
    }
    
    public void mostrarPersona(){
    
        
        System.out.println("tu nombre es: "+nombre+
        " tu apellido es: "+apellido+" tu sexo es: "+sexo+
        " tu tipo de documento es: "+tipoDoc+" tu número de documento es: "
        +documento+ " tu edad es: "+edad+" tu peso es: "+peso+
        " tu estatura es: "+estatura+" El valor por horas es: "+valueHour
        +" la cantidad de horas trabajadas es: "+hourWorked+ " y el total de lo trabajado es: "+
        honorarios);
    }
    public String calcularlmc(){     
        String result="";
        pesoActual=Math.pow(estatura,2);
        pesoActual=(peso/pesoActual);
        if (pesoActual<20){
            result="PESOBAJO";
         }
        else if (pesoActual>=20 && pesoActual<=25){
            result="PESOIDEAL";
        }
        else if (pesoActual>25){
            result="SOBREPESO";
        }
        return result;    

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