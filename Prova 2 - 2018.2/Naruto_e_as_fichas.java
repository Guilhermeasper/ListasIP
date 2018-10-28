import java.io.*;
import java.util.*;

public class Naruto_e_as_fichas {
    public static void main(String args[]) {
        int quantidade, escolhida, controleTamanhos;
        String controleNomes;
        Scanner in = new Scanner(System.in);
        quantidade = in.nextInt();
        String[] nomes = new String[quantidade];
        int[] tamanhos = new int[quantidade];
        for (int i = 0; i < quantidade; i++) {
            nomes[i] = in.next();
            tamanhos[i] = in.nextInt();
        }
        escolhida = in.nextInt();
        for (int i = 0; i < tamanhos.length; i++) {
            for (int j = 0; j < tamanhos.length - 1; j++) {
                if (tamanhos[j] > tamanhos[j + 1]) {
                    controleNomes = nomes[j];
                    controleTamanhos = tamanhos[j];
                    nomes[j] = nomes[j + 1];
                    tamanhos[j] = tamanhos[j + 1];
                    nomes[j + 1] = controleNomes;
                    tamanhos[j + 1] = controleTamanhos;
                }
            }
        }
        System.out.printf("Naruto devera usar a shuriken %s para esta maquina.", nomes[escolhida - 1]);
    }
}