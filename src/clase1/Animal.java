package clase1;
import java.util.Scanner;
public class Animal {
        
    private String name;
    private int age;
    private String tipo;

    //metodo constructor
    public Animal (){}
    public Animal (String name,int age){
        this.name=name;
        this.age=age;
    }
    public Animal (String name,String tipo){

    }
    //metodos accesores
    //get
    public int getEdad(){
        return age;
    }
    public String getNombre(){
        return name;
    }
    //set
    public void setEdad(int age){
        this.age=age;
    }
    public void setNombre(String name){
        this.name=name;
    }

    //metodos propios
    Scanner lectura=new Scanner (System.in);
    //parametros
    public void registrarAnimal (String n, int e){
        name=n;
        age=e;

    }

    public void mostrarAnimal(){
        System.out.println("El nombre del animal es: "+name+
        " y su edad es: "+age);
    }
//metodo con retorno
public int duplicarEdad(int edad){
    int duplicado=edad*2; 
    return (duplicado);
}
} 

