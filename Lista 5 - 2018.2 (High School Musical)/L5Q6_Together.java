import java.util.Scanner;

public class L5Q6_Together {
    private static String caminhos(boolean[][] matriz, String[] pessoas, int i, int j){
        if(i >= matriz.length-1 || j >= matriz.length-1){
            return pessoas[i];
        }else if(matriz[i][j]){
            return pessoas[i] + " " + caminhos(matriz, pessoas, i, j+1);
        }else{
            if(i==matriz.length-1){
                i=0;
                j++;
            return caminhos(matriz, pessoas, i+1, j);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int quantPessoas = in.nextInt();
        int quantConexoes = in.nextInt();
        boolean[][] matrizAjdacencia = new boolean[quantPessoas][quantPessoas];
        String[] pessoas = new String[quantPessoas];
        int[][] conexoes = new int[quantConexoes][2];
        for(int i = 0; i < pessoas.length; i++){
            pessoas[i] = in.next();
        }
        for(int i = 0; i < conexoes.length; i++){
            for(int j = 0; j < 2; j++){
                conexoes[i][j] = in.nextInt();
            }
            matrizAjdacencia[conexoes[i][1]][conexoes[i][0]] = true;
        }
        String pessoaInicio = in.next();
        String pessoaFim = in.next();

        String teste = caminhos(matrizAjdacencia, pessoas, 0, 0);
        System.out.println(teste);
    }
}
