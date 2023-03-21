package polimorfisomo;
import java.util.Scanner;
public class Execute {
    public static void main(String[] args) {
        Scanner lectura= new Scanner (System.in);
        int op=1;
        int option;
        while (op==1){
            System.out.println("Digite 1 si quiere calcular el area de un circulo,2 si es el area del cuadrado, 3 si es el area del triangulo y 4 si es el area del rectangulo");
            option=lectura.nextInt();
            if (option==1){
                Circle circulo=new Circle();
                circulo.calcularArea();
            }
            else if (option==2){
                Square cuadrado= new Square();
                cuadrado.calcularArea();
            }
            else if (option==3){
                Triangle triagulo =new Triangle();
                triagulo.calcularArea();
            }
            else if (option==4){
                Rectangle rectangulo=new Rectangle();
                rectangulo.calcularArea();
            }
            System.out.println("quiere volver a calcular, digite 1 para si y 2 para no");
            op=lectura.nextInt();
        }
    }
}
