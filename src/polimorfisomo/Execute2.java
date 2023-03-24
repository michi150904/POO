package polimorfisomo;
import java.util.Scanner;
public class Execute2 {
    public static void main(String[] args) {
        Scanner lectura=new Scanner (System.in);
        int op=1;
        int option;
        while(op==1){
            System.out.println("digite 1 si quiere jugar carisellazo o 2 si quiere jugar piedra papel o tijera");
            option=lectura.nextInt();
            if(option==1){
                Carisellazo game2= new Carisellazo();
                game2.iniciar();
                game2.jugar();
                game2.finalizar();
            }
            else if (option==2){
                Ppt game=new  Ppt();
                game.iniciar();
                game.jugar();
                game.finalizar(); 
            }
            else {
                System.out.println("error, vuelva a emepzar");
            }
            System.out.println("digite 1 si quiere volver a jugar o 2 si quiere finalizar");
        op=lectura.nextInt();
        }
        lectura.close();
    }
}
