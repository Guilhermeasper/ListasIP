import java.util.Scanner;

public class L4Q5_extra_Pecas_capturadas {
    public static void main(String args[]) {
        int posX, posY, quantJogadas;
        String movimento;
        Scanner in = new Scanner(System.in);
        String[][] tabuleiro = new String[8][8];
        for(int i =0; i < tabuleiro.length; i++){
            for(int j = 0; j<tabuleiro[i].length; j++){
                tabuleiro[i][j] = in.next();
                if(tabuleiro[i][j].equals("#")){
                    posX = j;
                    posY = i;
                }
            }
        }
        quantJogadas = in.nextInt();
        while(quantJogadas>0){
            movimento = in.next();
            if(movimento.equals("D")){

            }else{

            }
            quantJogadas--;
        }
    }
}
