package com.company;

import java.util.Scanner;

public class L4Q2_100_atualizado {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[][] jogadores = new String[3][3];
        jogadores[0][0] = in.next();
        jogadores[1][0] = in.next();
        jogadores[2][0] = in.next();
        jogadores[0][1] = in.next();
        jogadores[1][1] = in.next();
        jogadores[2][1] = in.next();
        jogadores[0][2] = in.next();
        jogadores[1][2] = in.next();
        jogadores[2][2] = in.next();
        System.out.print(jogadores[0][0]+" ");
        System.out.print(jogadores[0][1]+" ");
        System.out.println(jogadores[0][2]);
        System.out.print(jogadores[1][0]+" ");
        System.out.print(jogadores[1][1]+" ");
        System.out.println(jogadores[1][2]);
        System.out.print(jogadores[2][0]+" ");
        System.out.print(jogadores[2][1]+" ");
        System.out.print(jogadores[2][2]);
    }
}
