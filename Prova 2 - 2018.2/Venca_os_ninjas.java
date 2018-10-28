import java.io.*;
import java.util.*;

public class Venca_os_ninjas {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int linhas, colunas, tamanhoVisitadas, tempo;
        double pontuacao, soma = 0;
        linhas = in.nextInt();
        colunas = in.nextInt();
        int[][] matriz = new int[linhas][colunas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = in.nextInt();
            }
        }
        tamanhoVisitadas = in.nextInt();
        int[][] visitadas = new int[tamanhoVisitadas][2];
        for (int i = 0; i < visitadas.length; i++) {
            for (int j = 0; j < visitadas[i].length; j++) {
                visitadas[i][j] = in.nextInt();
            }
        }
        tempo = in.nextInt();
        for (int i = 0; i < visitadas.length; i++) {
            for (int j = 0; j < visitadas[i].length; j += 2) {
                soma += matriz[visitadas[i][j] - 1][visitadas[i][j + 1] - 1];
            }
        }
        pontuacao = soma / tempo;
        System.out.printf("%.2f", pontuacao);
    }
}