import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    String ordem, nome;
        int ninjas, i, j, chakra, jutsu, aprovados = 0;
        Scanner in = new Scanner(System.in);
        ordem = in.nextLine();
        ninjas = Integer.parseInt(in.nextLine());
        String[] nomes = new String[ninjas];
        int[] chakras = new int[ninjas];
        int[] jutsus = new int[ninjas];
        int[] jutsusControle = new int[ninjas];
        for(i = 0; i<ninjas; i++) {
            nome = in.next();
            chakra = in.nextInt();
            jutsu = in.nextInt();
            nomes[i] = nome;
            chakras[i] = chakra;
            jutsus[i] = jutsu;
        }
        if(ordem.equals("Esse naruto...")){
            for(i=0; i<ninjas; i++){
                jutsusControle[i] = jutsus[i];
            }
            for(i=0; i<ninjas; i++){
                jutsus[i] = jutsusControle[ninjas-i-1];
            }
        }
        for(i=0; i< ninjas; i++){
            for(j= 0; j<ninjas-1; j++) {
                if (chakras[j] - jutsus[j] < chakras[j+1] - jutsus[j+1]) {
                    String nomeControle = nomes[j];
                    int chakraControle = chakras[j];
                    int jutsuControle = jutsus[j];

                    nomes[j] = nomes[j + 1];
                    chakras[j] = chakras[j + 1];
                    jutsus[j] = jutsus[j + 1];

                    nomes[j + 1] = nomeControle;
                    chakras[j + 1] = chakraControle;
                    jutsus[j + 1] = jutsuControle;
                }
            }
        }
        for (i = 0; i < ninjas; i++) {
            if (chakras[i]-jutsus[i]>0) {
                aprovados ++;
                System.out.printf("%s esta classificado(a)%n", nomes[i]);
            } else {
                System.out.printf("%s esta desclassificado(a)%n", nomes[i]);
            }
        }
        if(aprovados == 0){
            System.out.printf("%nEsse semestre ninguem veio treinar na aldeia da folha");
        }else{
            System.out.printf("%nKakashi tera um total de %d aluno(s) nesse semestre", aprovados);
        }
  }
}