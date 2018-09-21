import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    int i, novaLinha;
        String linha, inverte = "", resultado;
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            linha = in.nextLine();
            resultado = "";
            i=0;
            novaLinha = 0;
            for(;i<linha.length(); i++){
                if(linha.charAt(i) == ' '){
                    resultado = resultado + "";
                }else if(linha.charAt(i) >= 65 && linha.charAt(i)<=90){
                    resultado = resultado + (linha.charAt(i)-64);
                }else if(linha.charAt(i) >=33 && linha.charAt(i) <= 47 || linha.charAt(i) >=58 && linha.charAt(i) <= 64
                        || linha.charAt(i) >=91 && linha.charAt(i) <= 96 || linha.charAt(i) >=123 && linha.charAt(i) <= 126){
                    novaLinha += 1;
                }else if(linha.charAt(i) >= 48 && linha.charAt(i) <= 57){
                    switch (linha.charAt(i)) {
                        case '0':
                            resultado = resultado + '*';
                            break;
                        case '1':
                            resultado = resultado + ')';
                            break;
                        case '2':
                            resultado = resultado + '$';
                            break;
                        case '3':
                            resultado = resultado + '!';
                            break;
                        case '4':
                            resultado = resultado + '+';
                            break;
                        case '5':
                            resultado = resultado + '@';
                            break;
                        case '6':
                            resultado = resultado + '-';
                            break;
                        case '7':
                            resultado = resultado + '/';
                            break;
                        case '8':
                            resultado = resultado + '(';
                            break;
                        default:
                            resultado = resultado + '%';
                            break;
                    }
                }else if(linha.charAt(i) >= 97 && linha.charAt(i) <= 122){
                    if(novaLinha % 2 == 0) {
                        resultado = resultado + (char)(linha.charAt(i) - 32);
                    }else{
                        resultado = resultado + linha.charAt(i);
                    }
                }
            }
            if(!linha.equals("")){
                inverte = resultado + "\n" + inverte;
            }

        }
        in.close();
        System.out.print(inverte);
  }
}