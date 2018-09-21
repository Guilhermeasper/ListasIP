import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String pessoa1, pessoa2, pessoa3, pessoa4, pessoa5;
        pessoa1 = in.next();
        pessoa2 = in.next();
        pessoa3 = in.next();
        pessoa4 = in.next();
        pessoa5 = in.next();
        if(pessoa4.equals("Mario")){
            pessoa4 = pessoa2;
            pessoa2 = "Mario";
        }else if(pessoa4.equals("Toad") && !pessoa2.equals("Mario")) {
            pessoa4 = pessoa2;
            pessoa2 = "Toad";
        }else if(pessoa4.equals("Luigi") && (!pessoa2.equals("Mario") && !pessoa2.equals("Toad"))){
            pessoa4 = pessoa2;
            pessoa2 = "Luigi";
        }
        if(pessoa5.equals("Mario")){
            pessoa5 = pessoa3;
            pessoa3 = "Mario";
        }else if(pessoa5.equals("Toad") && !pessoa3.equals("Mario")){
            pessoa5 = pessoa3;
            pessoa3 = "Toad";
        }else if(pessoa5.equals("Luigi") && (!pessoa3.equals("Mario") && !pessoa3.equals("Toad"))){
            pessoa5 = pessoa3;
            pessoa3 = "Luigi";
        }
        System.out.printf("%s%n%s%n%s%n%s%n%s", pessoa1, pessoa2, pessoa3, pessoa4, pessoa5);
  }
}