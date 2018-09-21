package com.company;

import java.util.Scanner;

public class L3Q7_Perseguicao {
    public static void main(String[] args) {
        int amarradas, i, j, somaPositiva = 0, somaNegativa = 0, posInicial = 1, posFinal = 1, somaLoop = 0, maiorSoma = 0;
        Scanner in = new Scanner(System.in);
        amarradas = in.nextInt();
        int[] fila = new int[amarradas];
        for (i = 0; i < fila.length; i++) {
            fila[i] = in.nextInt();
            if (fila[i] > 0) {
                somaPositiva += fila[i];
            } else {
                somaNegativa += fila[i];
            }
        }
        if (somaPositiva == 0) {
            System.out.print("E uma armadilha");
        } else if (somaNegativa == 0 && fila.length > 1) {
            System.out.printf("Naruto deve libertar da posicao %d ate a posicao %d", 1, fila.length);
        } else {
            for (i = 0; i < fila.length; i++) {
                somaLoop = fila[i];
                for (j = i; j < fila.length; j++) {
                    if (j != i) {
                        somaLoop += fila[j];
                    }
                    if (somaLoop >= maiorSoma) {
                        maiorSoma = somaLoop;
                        posInicial = i + 1;
                        if (j != i) {
                            posFinal = j + 1;
                        }
                    }
                }
            }
            if (posFinal == posInicial) {
                System.out.printf("Naruto deve libertar somente a posicao %d", posInicial);
            } else {
                System.out.printf("Naruto deve libertar da posicao %d ate a posicao %d", posInicial, posFinal);
            }
        }
    }
}
