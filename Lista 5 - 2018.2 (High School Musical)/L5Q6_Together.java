import java.util.Scanner;

public class L5Q6_Together {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int quantPessoas = in.nextInt();
        int quantConexoes = in.nextInt();
        boolean[][] matrizAjdacencia = new boolean[quantPessoas][quantPessoas];
        String[] pessoas = new String[quantPessoas];
        for(int i = 0; i < pessoas.length; i++){
            pessoas[i] = in.next();
        }
        for(int i = 0; i < matrizAjdacencia.length; i++){
            for(int j = 0; j < matrizAjdacencia.length; j++){
                if(pessoas[i].equals("Troy")){
                    if(pessoas[j].equals("Sharpay") || pessoas[j].equals("Gabriela")){
                        matrizAjdacencia[i][j] = true;
                    }
                }else if(pessoas[i].equals("Sharpay")){
                    if(pessoas[j].equals("Gabriela")){
                        matrizAjdacencia[i][j] = true;
                    }
                }else if(pessoas[i].equals("Gabriela")){
                    if(pessoas[j].equals("Ryan")){
                        matrizAjdacencia[i][j] = true;
                    }
                }
            }
        }
        
    }
}
