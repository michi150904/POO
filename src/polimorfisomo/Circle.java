package polimorfisomo;
import java.util.Scanner;
public class Circle extends Figure {
    private double radio;
    private double area;
    private double pi=3.1416;
    Scanner lectura=new Scanner (System.in);
    public double getradio(){
        return radio;
    }
    public void setradio(double radio){
        this.radio=radio;
    }
    public double getArea() {
        return area;
    }
    public double getPi() {
        return pi;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public void setPi(double pi) {
        this.pi = pi;
    }
    @Override//sobreescribir en un metodo

    public void calcularArea (){
        System.out.println("Digite el radio");
        radio=lectura.nextDouble();
        radio=radio*radio;
        area=radio*pi;
        System.err.println("El radio es: "+radio+" y el area del circulo es: "+area);
    }

}
