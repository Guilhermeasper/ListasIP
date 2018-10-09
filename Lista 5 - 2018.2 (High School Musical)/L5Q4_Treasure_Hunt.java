package com.company;

import java.util.Scanner;

public class L5Q4_Treasure_Hunt {
    private static String buscaArmario(int[][] escola, int i, int j){
        if(escola[i][j] == 0){
            return "O armario a ser invadido fica no corredor "+(i+1)+", e e o armario de numero " +(j+1)+".";
        }else if(escola[i][j] < 0){
            return "Voce foi descoberto! Corra dancando Bop To the Top!!";
        }else if(i==escola.length-1 && j==escola[i].length-1){
            return "Sharpay endoidou!";
        }else{
            i++;
            if(i==escola.length) {
                i = 0;
                j++;
            }
            return buscaArmario(escola, i, j);
        }
    }
    public static void main(String[] args) {
        int quantCorredores, quantArmarios;
        String resultado;
        Scanner in = new Scanner(System.in);
        quantCorredores = in.nextInt();
        quantArmarios = in.nextInt();
        int[][] escola = new int[quantCorredores][quantArmarios];
        for(int i = 0; i < escola.length; i++){
            for(int j = 0; j < escola[i].length; j++){
                escola[i][j] = in.nextInt();
            }
        }
        resultado = buscaArmario(escola, 0, 0);
        System.out.print(resultado);
    }
}
