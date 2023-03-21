package polimorfisomo;
import java.util.Scanner;
public class Carisellazo implements Juego {
    Scanner lectura=new Scanner (System.in);

    private String name;
    private int election;
    private int lanzamiento;

    @Override
   public void iniciar(){
        System.out.println("digite el nombre: ");
        name=lectura.nextLine();
    }
    @Override
    public void jugar(){
        lanzamiento=(int)(Math.random()*2+1);
        System.out.println("seleccion 1 cara, 2 sello");
        election=lectura.nextInt();
    }
    @  Override
    public void finalizar(){
        if (lanzamiento==1 & election==1){
            
        }

    }
}
