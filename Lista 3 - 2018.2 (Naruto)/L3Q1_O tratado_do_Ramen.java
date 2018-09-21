import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
        int dinheiro, dias, consumidas = 0, i;
        Scanner in = new Scanner(System.in);
        dinheiro = in.nextInt();
        dias = in.nextInt();
        int[] diasCorridos = new int[dias];
        for(i=0; i<diasCorridos.length; i++){
            diasCorridos[i] = in.nextInt();
        }
        for(i=0; i<diasCorridos.length; i++){
            if(diasCorridos[i]==1){
                consumidas += 10;
            }else if(diasCorridos[i]>=2 && diasCorridos[i]<=10) {
                consumidas += ((diasCorridos[i]*10)-((diasCorridos[i]*10)*10/100));
            }else{
                consumidas += ((diasCorridos[i]*10)-((diasCorridos[i]*10)*20/100));
            }
        }
        if(consumidas == 0){
            System.out.print("Naruto nao apareceu para comer");
        }else if(consumidas > dinheiro){
            System.out.printf("Naruto, faltam %d ryos!", consumidas-dinheiro);
        }else{
            System.out.printf("Naruto conseguiu pagar a sua conta!");
        }
  }
}