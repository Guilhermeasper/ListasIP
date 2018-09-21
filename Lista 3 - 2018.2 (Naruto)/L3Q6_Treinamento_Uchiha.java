package com.company;

import java.util.Scanner;

public class L3Q6_Treinamento_Uchiha {
    public static void main(String[] args) {
        int tamamnhoDoAlvo, quantidadeDeKunais, i, j=1, pontuacaoSasuke=0, pontuacaoItachi=0;
        Scanner in = new Scanner(System.in);
        tamamnhoDoAlvo = in.nextInt();
        quantidadeDeKunais = in.nextInt();
        if(tamamnhoDoAlvo >0 && quantidadeDeKunais > 0) {
            int[] alvo = new int[tamamnhoDoAlvo];
            int[] sasuke = new int[quantidadeDeKunais];
            int[] itachi = new int[quantidadeDeKunais];
            for (i = 0; i < alvo.length; i++) {
                if (alvo.length % 2 == 0) {
                    if (i < alvo.length / 2 - 1) {
                        alvo[i] = j++;
                    } else if (i == alvo.length / 2 - 1) {
                        alvo[i] = j;
                    } else {
                        alvo[i] = j--;
                    }
                } else {
                    if (i < alvo.length / 2) {
                        alvo[i] = j++;
                    } else {
                        alvo[i] = j--;
                    }
                }
            }
            for (i = 0; i < sasuke.length; i++) {
                sasuke[i] = in.nextInt();
            }
            for (i = 0; i < itachi.length; i++) {
                itachi[i] = in.nextInt();
            }
            for (i = 0; i < sasuke.length; i++) {
                for (j = 0; j < sasuke.length; j++) {
                    if (sasuke[j] - 1 < alvo.length && sasuke[j] > 0 && sasuke[i] == sasuke[j] && i != j) {
                        sasuke[j] = 0;
                    }
                }
            }
            for (i = 0; i < itachi.length; i++) {
                for (j = 0; j < itachi.length - 1; j++) {
                    if (itachi[j] - 1 < alvo.length && itachi[j] > 0 && itachi[j] == itachi[j] && i != j) {
                        itachi[j] = 0;
                    }
                }
            }
            for (i = 0; i < sasuke.length; i++) {
                if (sasuke[i] - 1 < alvo.length && sasuke[i] > 0) {
                    pontuacaoSasuke += alvo[sasuke[i] - 1];
                }
            }
            for (i = 0; i < itachi.length; i++) {
                if (itachi[i] - 1 < alvo.length && itachi[i] > 0) {
                    pontuacaoItachi += alvo[itachi[i] - 1];
                }
            }
        }
        System.out.printf("Sasuke: %d\n", pontuacaoSasuke);
        System.out.printf("Itachi: %d\n", pontuacaoItachi);
        if(pontuacaoItachi == 0 && pontuacaoSasuke == 0){
            System.out.println("Os Uchihas nem sao tao bons mesmo");
        }else if(pontuacaoSasuke>pontuacaoItachi){
            System.out.println("Sasuke Uchiha");
            if(pontuacaoItachi==0){
                System.out.println("Um genjutsu desse nivel nao funciona em mim");
            }
        }else if(pontuacaoSasuke<pontuacaoItachi){
            System.out.println("Itachi Uchiha");
            if(pontuacaoSasuke == 0){
                System.out.println("Voce e fraco, lhe falta odio");
            }
        }else{
            System.out.println("O empate nunca existiu, voce esta preso num genjutsu");
        }
    }
}
