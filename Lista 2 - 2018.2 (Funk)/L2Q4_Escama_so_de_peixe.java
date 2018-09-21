import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    double cache, arrecadacao=0;
    String cursoNome;
    Scanner in = new Scanner(System.in);
    cache = in.nextDouble();
    while(in.hasNext()){
        cursoNome = in.next();
        in.nextLine();
        switch (cursoNome) {
            case "CC":
                arrecadacao += 5.0;
                break;
            case "EC":
                arrecadacao += 10.0;
                break;
            default:
                arrecadacao += 15.0;
                break;
        }
    }
    if(cache>arrecadacao){
        System.out.print("Escamou!");
    }else{
        System.out.print("Cebruthius!");
    }
    in.close();
  }
}