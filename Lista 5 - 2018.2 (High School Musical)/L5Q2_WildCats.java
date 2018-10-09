import java.util.Scanner;

public class L5Q2_WildCats {
    private static long fatorial(long voltas){
        if(voltas == 0 || voltas == 1){
            return 1;
        }else{
            return voltas*fatorial(voltas-1);
        }
    }
    public static void main(String args[]) {
        int total = 0;
        Scanner in = new Scanner(System.in);
        while (in.hasNextLong()){
            long voltas = in.nextLong();
            long arremessos = fatorial(voltas);
            if(arremessos > 50){
                System.out.println(arremessos);
            }else{
                System.out.println(arremessos*2);
            }
            total += voltas;
        }
        if(total>100){
            System.out.print("WildCats, get the head in the game!");
        }
    }
}
