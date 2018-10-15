import java.util.Scanner;

public class L5Q6_Together {
    private static String caminhos(boolean[][] matriz, String[] pessoas, int i, int j) {
        if (i == matriz.length - 1 && !matriz[i][j]) {
            return pessoas[j];
        } else if (matriz[i][j]) {
            if (i > j)
                return pessoas[j] + " " + caminhos(matriz, pessoas, j, i);
            else
                return pessoas[j];
        } else {
            i++;
            return caminhos(matriz, pessoas, i, j);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean inicio = false, fim = false;
        int quantPessoas = in.nextInt();
        int quantConexoes = in.nextInt();
        boolean[][] matrizAjdacencia = new boolean[quantPessoas][quantPessoas];
        String[] pessoas = new String[quantPessoas];
        int[][] conexoes = new int[quantConexoes][2];
        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i] = in.next();
        }
        for (int i = 0; i < conexoes.length; i++) {
            for (int j = 0; j < 2; j++) {
                conexoes[i][j] = in.nextInt();
            }
            matrizAjdacencia[conexoes[i][1]][conexoes[i][0]] = true;
        }
        String pessoaInicio = in.next();
        String pessoaFim = in.next();
        String teste = caminhos(matrizAjdacencia, pessoas, 0, 0);
        for (int i = 0; i < teste.split(" ").length; i++) {
            if (teste.split(" ")[i].equals(pessoaInicio)) {
                inicio = true;
            }
            if (teste.split(" ")[i].equals(pessoaFim)) {
                fim = true;
            }
        }
        if (inicio && fim) {
            System.out.print("We're all in this together!");
        } else {
            System.out.print("Mentira, nenhum filme da Disney da errado, nunca.");
        }
    }
}
