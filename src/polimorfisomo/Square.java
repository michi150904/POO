package polimorfisomo;
import java.util.Scanner;
// subclase square superclase figure
public class Square extends Figure{
    private float side;
    private float area;
    Scanner lectura=new Scanner (System.in);

//metodos accesores
    public float getside(){
        return side;
    }
    public void setside(float side){
        this.side=side;
    }
    
    public float getArea() {
        return area;
    }
    public void setArea(float area) {
        this.area = area;
    }
    @Override//sobreescribir en un metodo
    //metodo calcular area del cuadrado
    public void calcularArea (){
        System.out.println("digite el valor del lado");
        side=lectura.nextFloat();
        area=side*side;
        System.err.println("El lado es: "+side+" y el area del cuadrado es: "+area);
    }
}
