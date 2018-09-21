import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    String artistas;
    int i, anitta=0, ludmilla=0, jojo=0, kevinho=0, livinho=0, outros=0;
    i = in.nextInt();
    while(i > 0){
        artistas = in.next();
        if(artistas.equals("Anitta")){
            anitta += 1;
        }else if(artistas.equals("Ludmilla")){
            ludmilla += 1;
        }else if(artistas.equals("Jojo")){
            jojo += 1;
        }else if(artistas.equals("Kevinho")){
            kevinho += 1;
        }else if(artistas.equals("Livinho")){
            livinho += 1;
        }else{
            outros +=1;
        }
        i -= 1;
    }
    if(anitta>ludmilla && anitta>jojo && anitta>kevinho && anitta>livinho && anitta>=outros){
        System.out.print("As pessoas estao esperando por Anitta.");
    }else if(ludmilla>anitta && ludmilla>jojo && ludmilla>kevinho && ludmilla>livinho && ludmilla>=outros){
        System.out.print("As pessoas estao esperando por Ludmilla.");
    }else if(jojo>ludmilla && jojo>anitta && jojo>kevinho && jojo>livinho && jojo>=outros){
        System.out.print("As pessoas estao esperando por Jojo.");
    }else if(kevinho>ludmilla && kevinho>jojo && kevinho>anitta && kevinho>livinho && kevinho>=outros){
        System.out.print("As pessoas estao esperando por Kevinho.");
    }else if(livinho>ludmilla && livinho>jojo && livinho>kevinho && livinho>anitta && livinho>=outros){
        System.out.print("As pessoas estao esperando por Livinho.");
    }else if(outros>anitta && outros>jojo && outros > ludmilla && outros > livinho && outros > kevinho ){
        System.out.print("As pessoas querem ver outra pessoa");
    }else{
        if(anitta == ludmilla && anitta+ludmilla != 0){
            System.out.print("Houve um empate entre: Anitta, Ludmilla");
        }else if(anitta == jojo && anitta+jojo != 0){
            System.out.print("Houve um empate entre: Anitta, Jojo");
        }else if(anitta == kevinho && anitta+kevinho != 0){
            System.out.print("Houve um empate entre: Anitta, Kevinho");
        }else if(anitta == livinho && anitta+livinho != 0){
            System.out.print("Houve um empate entre: Anitta, Livinho");
        }else if(ludmilla == jojo && ludmilla+jojo != 0){
            System.out.print("Houve um empate entre: Jojo, Ludmilla");
        }else if(ludmilla == kevinho && ludmilla+kevinho != 0){
            System.out.print("Houve um empate entre: Kevinho, Ludmilla");
        }else if(ludmilla == livinho && ludmilla+livinho != 0){
            System.out.print("Houve um empate entre: Livinho, Ludmilla");
        }else if(jojo == kevinho && jojo+kevinho != 0){
            System.out.print("Houve um empate entre: Jojo, Kevinho");
        }else if(jojo == livinho && jojo+livinho != 0){
            System.out.print("Houve um empate entre: Jojo, Livinho");
        }else if(kevinho == livinho && kevinho+livinho != 0){
            System.out.print("Houve um empate entre: Kevinho, Livinho");
        }
    }
  }
}