package polimorfisomo;
import java.util.Scanner;
public class Rectangle extends Figure {
    private float side;
    private float height;
    private float area;
    Scanner lectura=new Scanner (System.in);

    public float getSide() {
        return side;
    }
    public float getHeight() {
        return height;
    }
        public float getArea() {
        return area;
    }
    public void setArea(float area) {
        this.area = area;
    }

    public void setSide(float side) {
        this.side = side;
    }
    public void setHeight(float height) {
        this.height = height;
    }
    @Override
    public void calcularArea (){
        System.out.println("digite el valor de la base");
        side=lectura.nextFloat();
        System.out.println("digite el valor de la altura");
        height=lectura.nextFloat();
        area=side*height;
        System.out.println("el lado es: "+side+" la altura es: "+height+" el area es: "+area);
    }
}
