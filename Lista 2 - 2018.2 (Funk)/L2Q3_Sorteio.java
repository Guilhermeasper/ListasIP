import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int quantidade, numero, contador = 1;
    quantidade = in.nextInt();
    do{
        numero = in.nextInt();
        if(numero == contador){
            System.out.printf("o ingresso de numero %d foi sorteado", numero);
            break;
        }
        contador += 1;
    }while(quantidade>0);
    
  }
}