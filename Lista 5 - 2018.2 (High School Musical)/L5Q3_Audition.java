import java.util.Scanner;

public class L5Q3_Audition {
    private static double pontuacao(String nome){
        if(nome.length() == 1){
            return (int)nome.charAt(0);
        }else{
            return (int)nome.charAt(nome.length()-1) + pontuacao(nome.substring(0,nome.length()-1));
        }
    }
    public static void main(String args[]) {
        int quantidadePapeis;
        double paciencia, valorGanhador=0;
        String nomeGanhador="";
        Scanner in = new Scanner(System.in);
        paciencia = in.nextDouble();
        quantidadePapeis = in.nextInt();
        in.nextLine();
        while(quantidadePapeis>0){
            String nome = in.nextLine();
            double total = pontuacao(nome);
            total = total * paciencia;
            if(nome.equals("Troy Bolton") || nome.equals("Gabriella Montez") || nome.equals("Sharpay Evans") ||
                    nome.equals("Ryan Evans")){
                total += 350;
            }
            if(total>valorGanhador){
                valorGanhador = total;
                nomeGanhador = nome;
            }
            paciencia = paciencia * 0.99;
            quantidadePapeis--;
        }
        System.out.printf("O grande vencedor(a) do papel principal desse ano foi %s!", nomeGanhador);
    }
}
