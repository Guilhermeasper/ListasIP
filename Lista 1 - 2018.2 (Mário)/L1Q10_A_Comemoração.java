import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    int mario, yoshi, toad;
    int dist1, dist2, dist3, dist4;
    boolean marioHole = true, yoshiHole = true, toadHole = true;
    String curva1, curva2, curva3, curva4;
    //Mario
    curva1 = in.next();
    dist1 = in.nextInt();
    curva2 = in.next();
    dist2 = in.nextInt();
    curva3 = in.next();
    dist3 = in.nextInt();
    curva4 = in.next();
    dist4 = in.nextInt();
    mario = dist1 + dist2 + dist3 + dist4;
    if((curva1.equals("Esquerda") && curva2.equals("Esquerda") && curva3.equals("Esquerda")) 
            || (curva2.equals("Esquerda") && curva3.equals("Esquerda") && curva4.equals("Esquerda"))){
        marioHole = false;
    }
    //Yoshi
    curva1 = in.next();
    dist1 = in.nextInt();
    curva2 = in.next();
    dist2 = in.nextInt();
    curva3 = in.next();
    dist3 = in.nextInt();
    curva4 = in.next();
    dist4 = in.nextInt();
    yoshi = dist1 + dist2 + dist3 + dist4;
    if((curva1.equals("Esquerda") && curva2.equals("Esquerda") && curva3.equals("Esquerda"))
            || (curva2.equals("Esquerda") && curva3.equals("Esquerda") && curva4.equals("Esquerda"))){
        yoshiHole = false;
    }
    //Toad
    curva1 = in.next();
    dist1 = in.nextInt();
    curva2 = in.next();
    dist2 = in.nextInt();
    curva3 = in.next();
    dist3 = in.nextInt();
    curva4 = in.next();
    dist4 = in.nextInt();
    toad = dist1 + dist2 + dist3 + dist4;
    if((curva1.equals("Esquerda") && curva2.equals("Esquerda") && curva3.equals("Esquerda"))
            || (curva2.equals("Esquerda") && curva3.equals("Esquerda") && curva4.equals("Esquerda"))){
        toadHole = false;
    }
    
    if(marioHole && yoshiHole && toadHole){
        if(mario < yoshi && mario < toad){
            System.out.print("Mario venceu a corrida!");
        }else if(yoshi <= mario && yoshi <= toad){
            System.out.print("Yoshi venceu a corrida!");
        }else{
            System.out.print("Toad venceu a corrida!");
        }
    }else if(marioHole && yoshiHole){
        if(mario < yoshi){
            System.out.println("Toad caiu em um buraco negro.");
            System.out.print("Mario venceu a corrida!");
        }else{
            System.out.println("Toad caiu em um buraco negro.");
            System.out.print("Yoshi venceu a corrida!");
        }
    }else if(marioHole && toadHole){
        if(mario < toad){
            System.out.println("Yoshi caiu em um buraco negro.");
            System.out.print("Mario venceu a corrida!");
        }else{
            System.out.println("Yoshi caiu em um buraco negro.");
            System.out.print("Toad venceu a corrida!");
        }
    }else if(yoshiHole && toadHole){
        if(yoshi < toad){
            System.out.println("Mario caiu em um buraco negro.");
            System.out.print("Yoshi venceu a corrida!");
        }else{
            System.out.println("Mario caiu em um buraco negro.");
            System.out.print("Toad venceu a corrida!");
        }
    }else if(marioHole){
        System.out.println("Yoshi caiu em um buraco negro.");
        System.out.println("Toad caiu em um buraco negro.");
        System.out.print("Mario venceu a corrida!");
    }else if(yoshiHole){
        System.out.println("Mario caiu em um buraco negro.");
        System.out.println("Toad caiu em um buraco negro.");
        System.out.print("Yoshi venceu a corrida!");
    }else if(toadHole){
        System.out.println("Mario caiu em um buraco negro.");
        System.out.println("Yoshi caiu em um buraco negro.");
        System.out.print("Toad venceu a corrida!");
    }
  }
}