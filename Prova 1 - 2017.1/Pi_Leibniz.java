import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    int i, contador = 0;
    double pi = 0, denominador = 1;
    Scanner in = new Scanner(System.in);
    i = in.nextInt();
    while(i>0){
        pi = pi + (Math.pow(-1,contador)*(1/denominador));
        i -= 1;
        contador += 1;
        denominador +=2;
    }
    pi = 4*pi;
    System.out.printf("%.5f", pi);
  }
}