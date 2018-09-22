import java.util.Scanner;

public class L4Q1_Quem_vai_vencer_essa_batalha {
    public static void main(String args[]) {
        int tamanho, i, j, batalhas;
        double vidaKen, vidaRyu, ataqueRyu = 0, defesaRyu = 0, ataqueKen = 0, defesaKen = 0;
        String tipoAtaqueRyu, tipoAtaqueKen;
        Scanner in = new Scanner(System.in);
        tamanho = in.nextInt();
        vidaRyu = in.nextDouble();
        vidaKen = in.nextDouble();
        int[][] ryu = new int[tamanho][tamanho];
        int[][] ken = new int[tamanho][tamanho];
        for (i = 0; i < tamanho; i++) {
            for (j = 0; j < tamanho; j++) {
                ryu[i][j] = in.nextInt();
                if (i == j) {
                    ataqueRyu += ryu[i][j];
                }
                if (j == tamanho - i - 1) {
                    defesaRyu += ryu[i][j];
                }
            }
        }
        for (i = 0; i < tamanho; i++) {
            for (j = 0; j < tamanho; j++) {
                ken[i][j] = in.nextInt();
                if (i == j) {
                    ataqueKen += ken[i][j];
                }
                if (j == tamanho - i - 1) {
                    defesaKen += ken[i][j];
                }
            }
        }
        batalhas = in.nextInt();
        for (i = 0; i < batalhas; i++) {
            tipoAtaqueRyu = in.next();
            tipoAtaqueKen = in.next();
            if (tipoAtaqueRyu.equals("A") && tipoAtaqueKen.equals("A")) {
                if (ataqueRyu >= ataqueKen) {
                    vidaKen -= ataqueRyu - ataqueKen;
                } else {
                    vidaKen -= ataqueKen - ataqueRyu;
                }
            } else if (tipoAtaqueRyu.equals("D") && tipoAtaqueKen.equals("D")) {
            } else if (tipoAtaqueRyu.equals("A") && tipoAtaqueKen.equals("D")) {
                if (ataqueRyu >= defesaKen) {
                    vidaKen -= ataqueRyu - defesaKen;
                }
            } else {
                if (ataqueKen >= defesaRyu) {
                    vidaRyu -= ataqueKen - defesaRyu;
                }
            }
        }
        if (vidaRyu > vidaKen) {
            System.out.print("Ryu ganhou a batalha.");
        } else if (vidaKen > vidaRyu) {
            System.out.print("Ken ganhou a batalha.");
        } else {
            System.out.print("Houve empate.");
        }
    }
}
