package clase1;
import java.util.Scanner;
public class Movie {
    Scanner lectura=new Scanner (System.in);
    private String name;
    private String category;
    private int year;
    private int duration;
    public Movie(){}
    public Movie (String name,String category,int year,int duration){
        this.name=name;
        this.category=category;
        this.year=year;
        this.duration=duration;
        
        }
    public String getName(){
        return name;
    }
    public String getCategory(){
        return category;
    }
    public int getDuration(){
        return duration;
    }
    public int getYear(){
        return year;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setCategory(String category){
        this.category=category;
    }
    public void setYear(int year){
        this.year=year;
    }
    public void setDuration(int duration){
        this.duration=duration;
    }










    public void mostrarPelicula(){
        System.out.println(" el nombre es: "+this.name+" la categoria es: "+this.category+" el año es: "+year+" la duracion es: "+duration);
    }
    public void mostrarPelicula(String name,String category,int year,int duration){
        System.out.println(" el nombre es: "+this.name+" la categoria es: "+this.category+" el año es: "+year+" la duracion es: "+duration);
}
    public void mostrarPelicula(String category,int year,String name,int duration){
        System.out.println(" el nombre es: "+this.name+" la categoria es: "+this.category+" el año es: "+year+" la duracion es: "+duration);
}


    
}
