package com.company;

import java.util.Scanner;

public class L4Q3_Voce_tem_sorte {
    public static void main(String[] args) {
        int tamanhoMatriz, i, j, quantJogadas, coordenadaX, coordenadaY, soma1, soma2, soma3;
        boolean perdeu = false;
        Scanner in = new Scanner(System.in);
        tamanhoMatriz = in.nextInt();
        quantJogadas = in.nextInt();
        int[][] coordenadas = new int[tamanhoMatriz][tamanhoMatriz];
        for (i = 0; i < tamanhoMatriz; i++) {
            for (j = 0; j < tamanhoMatriz; j++) {
                coordenadas[i][j] = in.nextInt();
            }
        }
        while (quantJogadas > 0 && !perdeu) {
            coordenadaX = in.nextInt();
            coordenadaY = in.nextInt();
            soma1 = 0;
            soma2 = 0;
            soma3 = 0;
            if (coordenadas[coordenadaX][coordenadaY] == -1) {
                System.out.println("Essa casa ja foi selecionada.");
            } else {
                for (i = coordenadaX; i < tamanhoMatriz; i++) {
                    if (coordenadas[i][coordenadaY] != -1) {
                        soma1 += coordenadas[i][coordenadaY];
                    }
                }
                for (j = coordenadaY; j < tamanhoMatriz; j++) {
                    if (coordenadas[coordenadaX][j] != -1) {
                        soma2 += coordenadas[coordenadaX][j];
                    }
                }
                for (i = coordenadaX, j = coordenadaY; i < tamanhoMatriz && j < tamanhoMatriz; j++, i++) {
                    if (coordenadas[i][j] != -1) {
                        soma3 += coordenadas[i][j];
                    }
                }
                coordenadas[coordenadaX][coordenadaY] = -1;
                if (soma1 == soma2 && soma2 == soma3) {
                    System.out.println("Bomba Encontrada");
                    System.out.println("Voce perdeu.");
                    perdeu = true;
                } else {
                    System.out.println("Boa jogada, a casa (" + coordenadaX + "," + coordenadaY + ") nao tinha bomba.");
                }
            }
            quantJogadas -= 1;
        }
        if (!perdeu) {
            System.out.println("Voce e uma pessoa de sorte.");
        }
    }
}
