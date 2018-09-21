package com.company;

import java.util.Scanner;

public class L3Q5_Atividade_da_Himawari {
    public static void main(String[] args) {
        int tamanho, i = 0, somaTotal, soma = 0, somaInicio = 0, loops=0, somaAnterior;
        boolean errado=false;
        Scanner in = new Scanner(System.in);
        tamanho = in.nextInt();
        int[] valores = new int[tamanho];
        for (i = 0; i < valores.length; i++) {
            valores[i] = in.nextInt();
            somaInicio += valores[i];

        }
        somaTotal = in.nextInt();
        if(somaTotal < 0 && somaInicio >= 0){
            errado = true;
        }else if(somaTotal > 0 && somaInicio <= 0){
            errado = true;
        }else{
            i = 0;
            while(true){
                soma += valores[i];
                if(soma==somaTotal){
                    break;
                }if(somaInicio>0 && soma>somaTotal){
                    errado = true;
                    break;
                }else if(somaInicio<0 && soma<somaTotal){
                    errado = true;
                    break;
                }
                if(i==valores.length-1){
                    loops += 1;
                    i=-1;
                }
                i++;
            }
        }
        if(errado){
            System.out.print("Esse numero deve estar errado...");
        }else {
            System.out.printf("%d %d", i, loops);
        }
    }
}
