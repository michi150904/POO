package Salud;
import java.util.Scanner;
public class Empleado extends Persona1 {
    private String post,department;
    private double honorarios,reteica;
    Scanner lectura=new Scanner (System.in);

    //constructores

    public Empleado(){}
    public Empleado(String tipoDoc,String nombre,String apellido,String sexo,int documeno, int edad,double peso,double estatura,double pesoActual,String post,String department,double honorarios,double valueHour, double hourWorked,double reteica){
        super (tipoDoc,nombre,apellido,sexo,documeno,edad,peso,estatura,pesoActual,valueHour,hourWorked);
        this.post=post;
        this.department=department;
        this.honorarios=honorarios;
        this.reteica=reteica;
    }
    //metodos accesores
    public String getPost() {
        return post;
    }
    public String getDepartment() {
        return department;
    }
    public double getHonorarios() {
        return honorarios;
    }
    public void setHonorarios(int honorarios) {
        this.honorarios = honorarios;
    }
    public void setPost(String post) {
        this.post = post;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    public double calcularHonorarios(){
        honorarios=(getValueHour()*getHourWorked());
        reteica=(honorarios*0.996)/100;
        honorarios=honorarios-reteica;
        return honorarios;
    }
   
    
}
