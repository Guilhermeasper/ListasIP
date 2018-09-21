import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
        int dinheiro, custo, custoTotal = 0, i = 6;
        Scanner in = new Scanner(System.in);
        dinheiro = in.nextInt();
        while(i>0){
            custo = in.nextInt();
            in.next();
            custoTotal += custo;
            i -= 1;
        }
        if(dinheiro>=custoTotal){
            System.out.printf("Mario gastara um total de R$ %d.", custoTotal);
        }else{
            System.out.printf("Infelizmente nao sera possivel comprar tudo, faltam R$ %d.", custoTotal-dinheiro);
        }
    }
}