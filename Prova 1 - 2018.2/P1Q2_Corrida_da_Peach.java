import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
        String nome, vencedor = "";
        boolean comeco = true;
        int quantidade, distancia, tempoLivre, tempoObstaculo, tempoTotal, intervalo, tempoVencedor = 0;
        Scanner in = new Scanner(System.in);
        quantidade = in.nextInt();
        distancia = in.nextInt();
        while(quantidade>0){
            nome = in.next();
            tempoLivre = in.nextInt();
            intervalo = in.nextInt();
            tempoObstaculo = in.nextInt();
            tempoTotal = (tempoLivre*60) + ((distancia/intervalo)*tempoObstaculo);
            if(comeco){
                vencedor = nome;
                tempoVencedor = tempoTotal;
                comeco = false;
            }
            if(tempoVencedor>tempoTotal){
                vencedor = nome;
                tempoVencedor = tempoTotal;
            }

            quantidade -= 1;
        }
        System.out.printf("%s venceu a corrida em %d segundos!", vencedor, tempoVencedor);
  }
}