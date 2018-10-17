import java.util.Scanner;

public class L5Q6_Together {
    private static boolean caminhos(boolean[][] matriz, int indiceInicio, int indiceFim, int controle) {
        if(matriz[indiceFim][indiceInicio]){
            return true;
        }else if(matriz[controle][indiceInicio]){
            matriz[controle][indiceInicio]=false;
            if(caminhos(matriz, controle, indiceFim, 0))
                return true;
            else {
                if (controle < matriz.length-1) {
                    return caminhos(matriz, indiceInicio, indiceFim, controle + 1);
                } else {
                    return false;
                }
            }
        }else{
            if(controle<matriz.length-1){
                return caminhos(matriz, indiceInicio, indiceFim, controle+1);
            }else{
                return false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int indiceInicio = 0, indiceFim = 0;
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
        for (int i = 0; i < pessoas.length; i++) {
            if(pessoas[i].equals(pessoaInicio))
                indiceInicio = i;
            if(pessoas[i].equals(pessoaFim))
                indiceFim = i;
        }
        boolean entrega = caminhos(matrizAjdacencia, indiceInicio, indiceFim, 0);
        if (entrega) {
            System.out.print("We're all in this together!");
        } else {
            System.out.print("Mentira, nenhum filme da Disney da errado, nunca.");
        }
    }
}
