import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Lista {
    private int numeroDaSorte;
    private Lista proximo;
    public Lista () {
        numeroDaSorte = -1;
        proximo = null;
    }
    public void inserir(int numero) {
        if (this.numeroDaSorte == -1) {
            this.numeroDaSorte = numero;
            this.proximo = new Lista();
        } else {
            this.proximo.inserir(numero);
        }
    }
    public int procurar(int numero, int indice){
        if(this.numeroDaSorte == numero){
            return indice+1;
        }else if(this.proximo != null){
            return this.proximo.procurar(numero, indice+1);
        }else{
            return -1;
        }
    }
    public String toString() {
        String resposta = "" + this.numeroDaSorte;
        if (this.proximo != null) {
            resposta = resposta + "," + this.proximo.toString();
        }
        return resposta;
    }
}


public class L6Q1_Montanha_Russa_no_Del_Perro_Pier {
    public static void main(String[] args) {
        boolean achou = false;
        int bilhete = 0, i;
        List<int[]> myList = new ArrayList<>();
        Lista numeros = new Lista();
        Scanner in = new Scanner(System.in);
        while (bilhete != -1){
            bilhete = in.nextInt();
            myList.add(int[]{bilhete});
        }
        int sorteado = in.nextInt();
        lista.sort();
        int achado = numeros.procurar(sorteado, 0);
//        for(i = 0; i<numeros.toString().split(",").length && !achou; i++){
//            if(numeros.toString().split(",")[i].equals(sorteado) && !achou){
//                achou = true;
//            }
//        }
        if(achado == -1){
            System.out.println("Nenhum carrinho foi sorteado");
        }else{
            System.out.println("O bilhete sorteado e o " + sorteado + " e esta no carrinho " + achado);
        }
    }
}