import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
        int ninjas, i, j, k;
        String teste;
        boolean contrato = true;
        Scanner in = new Scanner(System.in);
        teste = in.nextLine();
        ninjas = Integer.parseInt(teste);
        if(ninjas>0){
        String[] nomes = new String[ninjas];
        String[] poder = new String[ninjas];
        String[] sapos = new String[ninjas];
        String[] cobras = new String[ninjas];
        String[] lesmas = new String[ninjas];
        String[] macacos = new String[ninjas];
        String[] caes = new String[ninjas];
        String[] nomeEPoder = new String[2];
        for(i=0; i<nomes.length; i+= 1){
            nomeEPoder = in.nextLine().split(" ");
            nomes[i] = nomeEPoder[0];
            if(nomeEPoder.length == 1){
                poder[i] = "";
            }else {
                poder[i] = nomeEPoder[1];
            }
            if (poder[i].equals("Coragem") || poder[i].equals("Determinacao") || poder[i].equals("Conviccao")) {
                sapos[i] = nomes[i];
                contrato = false;
            }else if (poder[i].equals("Ambicao") || poder[i].equals("Astucia") || poder[i].equals("Expertise")) {
                cobras[i] = nomes[i];
                contrato = false;
            }else if (poder[i].equals("Analise") || poder[i].equals("Suporte") || poder[i].equals("Tecnica")) {
                lesmas[i] = nomes[i];
                contrato = false;
            }else if (poder[i].equals("Agilidade") || poder[i].equals("Inteligencia") || poder[i].equals("Destreza")) {
                macacos[i] = nomes[i];
                contrato = false;
            }else if (poder[i].equals("Experiencia") || poder[i].equals("Perspicacia") || poder[i].equals("Pericia")) {
                caes[i] = nomes[i];
                contrato = false;
            }
        }
        if(contrato){
            System.out.print("Nao havera Jounins forte esse ano");
        }else{
            System.out.println("Sapos:");
            for(i=0;i<sapos.length;i++){
                if(sapos[i] != null){
                    System.out.printf("- %s%n", sapos[i]);

                }
            }
            System.out.println("Cobras:");
            for(i=0;i<cobras.length;i++){
                if(cobras[i] != null){
                    System.out.printf("- %s%n", cobras[i]);
                }
            }
            System.out.println("Lesmas:");
            for(i=0;i<lesmas.length;i++){
                if(lesmas[i] != null){
                    System.out.printf("- %s%n", lesmas[i]);
                }
            }
            System.out.println("Macacos:");
            for(i=0;i<macacos.length;i++){
                if(macacos[i] != null){
                    System.out.printf("- %s%n", macacos[i]);
                }
            }
            System.out.println("Caes:");
            for(i=0;i<caes.length;i++){
                if(caes[i] != null){
                    System.out.printf("- %s%n", caes[i]);
                }
            }
        }
        }else{
            System.out.print("Nao havera Jounins forte esse ano");
        }
  }
}