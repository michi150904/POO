package polimorfisomo;
import java.util.Scanner;
public class Ppt implements Juego{
    Scanner lectura=new Scanner (System.in);
    private  int number;
    private int number2;
    @Override
    public void iniciar (){
        System.out.println("Eliga 1 para papel, 2 para piedra y 3 para tijera");
        number2=lectura.nextInt();
    }
    @Override
    public void jugar (){
        number = (int) (Math.random() * (4 - 1)) + 1;
    }
    @Override
    public void finalizar(){
    if (number==1){
        if(number2==1){
        System.out.println("has ganado,escogiste papel");
        }
        else if(number2==2){
        System.out.println("has perdido,escogiste piedra");
        }
        else if(number2==3){
        System.out.println("has perdido,escogiste tijera");
        }
    }
    else if (number==2){
        if(number2==2){
        System.out.println("has ganado,escogiste piedra");
        }
        else if(number2==1){
        System.out.println("has perdido,escogiste papel");
        }
        else if(number2==3){
        System.out.println("has perdido,escogiste tijera");
        }
    }
    else if (number==3){
        if(number2==3){
        System.out.println("has ganado,escogiste tijera");
        }
        else if(number2==1){
        System.out.println("has perdido,escogiste papel ");
        }
        else if(number2==2){
        System.out.println("has perdido,escogiste piedra");
        }
    }
    }
}
