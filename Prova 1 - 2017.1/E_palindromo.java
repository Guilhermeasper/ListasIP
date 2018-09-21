import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    String entrada, saida="", saidaComparacao="";
	    Scanner in = new Scanner(System.in);
	    entrada = in.nextLine();
	    for(int i = 0; i<entrada.length(); i++){
	        if(entrada.charAt(i)>=65 && entrada.charAt(i) <= 90){
	            saidaComparacao = saidaComparacao + (char)(entrada.charAt(i) + 32);
	            saida = (char)(entrada.charAt(i) + 32) + saida;
            }else if(entrada.charAt(i)==32){
            }else{
	            saidaComparacao = saidaComparacao + entrada.charAt(i);
	            saida = entrada.charAt(i) + saida;
            }
        }
        if(saida.equals(saidaComparacao)){
            System.out.print("SIM");
        }else{
            System.out.print("NAO");
        }
  }
}