import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
        int comprimento, largura, coordenadaX, coordenadaY;
        String tipo;
        comprimento = in.nextInt();
        largura = in.nextInt();
        in.nextLine();
        tipo = in.nextLine();
        coordenadaX = in.nextInt();
        coordenadaY = in.nextInt();

        if(tipo.equals("Saque")){
            if((coordenadaX < comprimento/4 || coordenadaX >= comprimento/2) || (coordenadaY < 0 || coordenadaY > largura )){
                System.out.print("A bola foi para fora");
            }else{
                System.out.print("A bola foi rebatida");
            }
        }else{
            if((coordenadaX < 0 || coordenadaX >= comprimento/2) || (coordenadaY < 0 || coordenadaY > largura )){
                System.out.print("A bola foi para fora");
            }else{
                System.out.print("A bola foi rebatida");
            }
        }
  }
}