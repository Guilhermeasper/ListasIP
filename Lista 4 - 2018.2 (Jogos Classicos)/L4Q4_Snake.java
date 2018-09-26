package com.company;

import java.util.Scanner;

public class L4Q4_Snake {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean perdeu = false;
        int tamanhoMatriz, quantJogadas, i, j, posicaoX = 0, posicaoY = 0;
        String jogada, auxiliar;
        tamanhoMatriz = in.nextInt();
        quantJogadas = in.nextInt();
        String[][] mapa = new String[tamanhoMatriz][tamanhoMatriz];
        for (i = 0; i < tamanhoMatriz; i++) {
            for (j = 0; j < tamanhoMatriz; j++) {
                mapa[i][j] = in.next();
                if (mapa[i][j].equals("#")) {
                    posicaoX = i;
                    posicaoY = j;
                }
            }
        }
        while (quantJogadas > 0 && !perdeu) {
            jogada = in.next();
            if (jogada.equals("D")) {
                if (posicaoY == tamanhoMatriz - 1) {
                    if (mapa[posicaoX][0].equals("@")) {
                        perdeu = true;
                    } else {
                        mapa[posicaoX][0] = "#";
                        mapa[posicaoX][posicaoY] = "*";
                        posicaoY = 0;
                    }
                } else {
                    if (mapa[posicaoX][posicaoY + 1].equals("@")) {
                        perdeu = true;
                    } else {
                        mapa[posicaoX][posicaoY + 1] = "#";
                        mapa[posicaoX][posicaoY] = "*";
                        posicaoY = posicaoY + 1;
                    }
                }
            } else if (jogada.equals("E")) {
                if (posicaoY == 0) {
                    if (mapa[posicaoX][tamanhoMatriz - 1].equals("@")) {
                        perdeu = true;
                    } else {
                        mapa[posicaoX][tamanhoMatriz - 1] = "#";
                        mapa[posicaoX][posicaoY] = "*";
                        posicaoY = tamanhoMatriz - 1;
                    }
                } else {
                    if (mapa[posicaoX][posicaoY - 1].equals("@")) {
                        perdeu = true;
                    } else {
                        mapa[posicaoX][posicaoY - 1] = "#";
                        mapa[posicaoX][posicaoY] = "*";
                        posicaoY = posicaoY - 1;
                    }
                }
            } else if (jogada.equals("C")) {
                if (posicaoX == 0) {
                    if (mapa[tamanhoMatriz - 1][posicaoY].equals("@")) {
                        perdeu = true;
                    } else {
                        mapa[tamanhoMatriz - 1][posicaoY] = "#";
                        mapa[posicaoX][posicaoY] = "*";
                        posicaoX = tamanhoMatriz - 1;
                    }
                } else {
                    if (mapa[posicaoX - 1][posicaoY].equals("@")) {
                        perdeu = true;
                    } else {
                        mapa[posicaoX - 1][posicaoY] = "#";
                        mapa[posicaoX][posicaoY] = "*";
                        posicaoX = posicaoX - 1;
                    }
                }
            } else {
                if (posicaoX == tamanhoMatriz - 1) {
                    if (mapa[0][posicaoY].equals("@")) {
                        perdeu = true;
                    } else {
                        mapa[0][posicaoY] = "#";
                        mapa[posicaoX][posicaoY] = "*";
                        posicaoX = 0;
                    }
                } else {
                    if (mapa[posicaoX + 1][posicaoY].equals("@")) {
                        perdeu = true;
                    } else {
                        mapa[posicaoX + 1][posicaoY] = "#";
                        mapa[posicaoX][posicaoY] = "*";
                        posicaoX = posicaoX + 1;
                    }
                }
            }
            quantJogadas -= 1;
        }
        for (i = 0; i < tamanhoMatriz; i++) {
            for (j = 0; j < tamanhoMatriz; j++) {
                System.out.print(mapa[i][j]);
                if (j != tamanhoMatriz - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        if (perdeu) {
            System.out.println("Game over.");
        }
    }
}