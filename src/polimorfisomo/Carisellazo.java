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
        
    }
    @  Override
    public void finalizar(){
        System.out.println("seleccion 1 cara, 2 sello");
        election=lectura.nextInt();
        if (lanzamiento==1 && election==1){
            System.out.println(name+"ganaste con cara y selecciono cara");
            
        }
        else if (lanzamiento==1 && election==2){
            System.out.println(name+"perdiste con cara y selecciono sello");
            
        }
        else if (lanzamiento==2 && election==2){
            System.out.println(name+"ganaste con sello y selecciono sello");
            
        }
        else if (lanzamiento==2 && election==1){
            System.out.println(name+"perdiste con sello y selecciono cara");
            
        }
    }
    
}
