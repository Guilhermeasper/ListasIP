package com.company;

import java.util.Scanner;

public class L5Q5_Lets_eat {
    private static String comer(String[] amigos, int i, int comida){
        if(i==amigos.length-1){
            return null;
        }else if(Integer.parseInt(amigos[i].split(" ")[1])-comida > 400){
            return "\n"+"Fica tranquilo(a) "+amigos[i].split(" ")[0]+", pode se servir novamente!"
                    +"\n"+amigos[i].split(" ")[0]+" foi servido(a)."
                    +comer(amigos, i, 400);
        }else{
            return "\n"+amigos[i].split(" ")[0]+" foi servido(a)."
                    +comer(amigos, i+1, 0);
        }
    }
    public static void main(String[] args) {
        int amigos;
        Scanner in = new Scanner(System.in);
        amigos = in.nextInt();
        in.nextLine();
        String[] refeitorio = new String[amigos];
        for(int i = 0; i < refeitorio.length; i++){
            refeitorio[i] = in.nextLine();
        }
        System.out.println(comer(refeitorio, 0, 0));
    }
}
