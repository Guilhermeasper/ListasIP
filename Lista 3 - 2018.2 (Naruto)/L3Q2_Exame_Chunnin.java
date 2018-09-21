package com.company;

import java.util.Scanner;

public class L3Q2_Exame_Chunnin {
    public static void main(String[] args){
        int i;
        String ganhadorQ1, ganhadorQ2, ganhadorQ3, ganhadorQ4, ganhadorS1, ganhadorS2, ganhadorF;
        String[] ninjas = new String[8];
        int[] posicoes = new int[8];

        Scanner in = new Scanner(System.in);

        for(i = 0; i < ninjas.length; i++){
            ninjas[i] = in.nextLine();
        }
        for(i = 0; i < ninjas.length; i++){
            posicoes[i] = Integer.parseInt(in.next());
        }
        System.out.println("Bem vindos ao Exame Chunnin!");
        System.out.printf("Quartas de final 1: %s x %s\n", ninjas[posicoes[0]], ninjas[posicoes[1]]);
        System.out.printf("Quartas de final 2: %s x %s\n", ninjas[posicoes[2]], ninjas[posicoes[3]]);
        System.out.printf("Quartas de final 3: %s x %s\n", ninjas[posicoes[4]], ninjas[posicoes[5]]);
        System.out.printf("Quartas de final 4: %s x %s\n", ninjas[posicoes[6]], ninjas[posicoes[7]]);
        ganhadorQ1 = in.next();
        ganhadorQ2 = in.next();
        if(ganhadorQ1.equals("A") && ganhadorQ2.equals("A")){
            System.out.printf("Semifinal 1: %s x %s\n", ninjas[posicoes[0]], ninjas[posicoes[2]]);
        }else if(ganhadorQ1.equals("B") && ganhadorQ2.equals("B")){
            System.out.printf("Semifinal 1: %s x %s\n", ninjas[posicoes[1]], ninjas[posicoes[3]]);
        }else if(ganhadorQ1.equals("A") && ganhadorQ2.equals("B")){
            System.out.printf("Semifinal 1: %s x %s\n", ninjas[posicoes[0]], ninjas[posicoes[3]]);
        }else{
            System.out.printf("Semifinal 1: %s x %s\n", ninjas[posicoes[1]], ninjas[posicoes[2]]);
        }
        ganhadorQ3 = in.next();
        ganhadorQ4 = in.next();
        if(ganhadorQ3.equals("A") && ganhadorQ4.equals("A")){
            System.out.printf("Semifinal 2: %s x %s\n", ninjas[posicoes[4]], ninjas[posicoes[6]]);
        }else if(ganhadorQ3.equals("B") && ganhadorQ4.equals("B")){
            System.out.printf("Semifinal 2: %s x %s\n", ninjas[posicoes[5]], ninjas[posicoes[7]]);
        }else if(ganhadorQ3.equals("A") && ganhadorQ4.equals("B")){
            System.out.printf("Semifinal 2: %s x %s\n", ninjas[posicoes[4]], ninjas[posicoes[7]]);
        }else{
            System.out.printf("Semifinal 2: %s x %s\n", ninjas[posicoes[5]], ninjas[posicoes[6]]);
        }
        ganhadorS1 = in.next();
        ganhadorS2 = in.next();
        if(ganhadorS1.equals("X") && ganhadorS2.equals("X")){
            System.out.printf("Final: %s x %s\n", ninjas[posicoes[0]], ninjas[posicoes[4]]);
        }else if(ganhadorS1.equals("Y") && ganhadorS2.equals("Y")){
            System.out.printf("Final: %s x %s\n", ninjas[posicoes[0]], ninjas[posicoes[4]]);
        }else if(ganhadorS1.equals("X") && ganhadorS2.equals("Y")){
            System.out.printf("Final: %s x %s\n", ninjas[posicoes[0]], ninjas[posicoes[4]]);
        }else{
            System.out.printf("Final: %s x %s\n", ninjas[posicoes[0]], ninjas[posicoes[4]]);
        }

        System.out.printf("O grande vencedor e %s!", ninjas[posicoes[0]]);
    }
}
