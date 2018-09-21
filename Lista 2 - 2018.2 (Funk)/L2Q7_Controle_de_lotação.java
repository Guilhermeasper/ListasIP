import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
        int lotacao, quantidade, pessoasDentro = 0, fila = 0, foramPraFila;
        String porta, tipo;
        lotacao = in.nextInt();
        while(in.hasNext()){
            porta = in.next();
            tipo = in.next();
            if(porta.equals("Entraram")){
                if(tipo.equals("VIP")){
                    pessoasDentro += 1;
                    System.out.printf("1 pessoas entraram na casa. Atualmente ha %d pessoas no evento.%n", pessoasDentro);
                }else{
                    quantidade = Integer.parseInt(tipo);
                    if(pessoasDentro+quantidade > lotacao){
                        if(lotacao - pessoasDentro > 0){
                            foramPraFila = quantidade - (lotacao - pessoasDentro);
                            pessoasDentro += lotacao - pessoasDentro;
                            System.out.printf("%d pessoas entraram na casa. Atualmente ha %d pessoas no evento.%n", quantidade - foramPraFila, pessoasDentro);
                            fila += foramPraFila;
                            System.out.printf("Infelizmente a casa esta lotada, %d pessoas foram redirecionadas para a fila.%n", foramPraFila);
                            System.out.printf("A fila agora contem %d pessoas.%n", fila);
                        }else{
                            foramPraFila = quantidade;
                            fila += foramPraFila;
                            System.out.printf("Infelizmente a casa esta lotada, %d pessoas foram redirecionadas para a fila.%n", foramPraFila);
                            System.out.printf("A fila agora contem %d pessoas.%n", fila);
                        }
                    }else{
                        pessoasDentro += quantidade;
                        System.out.printf("%d pessoas entraram na casa. Atualmente ha %d pessoas no evento.%n", quantidade, pessoasDentro);
                    }
                }
            }else{
                quantidade = Integer.parseInt(tipo);
                pessoasDentro -= quantidade;
                System.out.printf("%d pessoas sairam da casa. Atualmente ha %d pessoas no evento.%n", quantidade, pessoasDentro);
                if(pessoasDentro < lotacao && fila > 0){
                    if(lotacao - pessoasDentro >= fila){
                        System.out.printf("%d pessoas da fila entraram na casa.%n", fila);
                        pessoasDentro += fila;
                        fila = 0;
                        System.out.printf("Todos que estavam na fila de espera conseguiram entrar, atualmente nao ha fila de espera.%n");
                    }else{
                        fila = fila - (lotacao - pessoasDentro);
                        System.out.printf("%d pessoas da fila entraram na casa.%n", lotacao-pessoasDentro);
                        System.out.printf("A fila agora contem %d pessoas.%n", fila);
                        pessoasDentro += (lotacao - pessoasDentro);

                    }

                }

            }
            System.out.printf("%n");
        }
        System.out.print("Vai Troinha, agora pede o ubii!");
  }
}