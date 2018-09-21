import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
        int termos, tang, fatorialInical = 3, expoenteInical = 2, numero, contador=1;
        double newtang=0, fat;
        Scanner in = new Scanner(System.in);
        tang = in.nextInt();
        termos = in.nextInt();
        in.close();
        if(termos != 0){
            newtang = tang;
        }
        for(;termos>1;termos--, contador++, fatorialInical += 2,expoenteInical += 2){
            fat = 1;
            numero = fatorialInical;
            while(numero > 1){
                fat = fat * numero;
                numero -= 1;
            }
            newtang = newtang + Math.pow(-1, contador)*(Math.pow(tang, expoenteInical)/fat);
        }
        System.out.printf("%.3f", Math.abs(newtang));
  }
}