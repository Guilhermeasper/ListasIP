import java.io.*;
import java.util.*;

class Lista {
    private int numeroDaSorte;
    private int indice;
    private Lista proximo;
    public Lista (int indice) {
        this.numeroDaSorte = -1;
        this.proximo = null;
        this.indice = indice;
    }
    public void inserir(int numero) {
        if (this.numeroDaSorte == -1) {
            this.numeroDaSorte = numero;
            this.indice += 1;
            this.proximo = new Lista(this.indice);
        } else {
            this.proximo.inserir(numero);
        }
    }
    public int procurar(int numero){
        if(this.numeroDaSorte == numero){
            return this.indice;
        }else if(this.proximo != null){
            return this.proximo.procurar(numero);
        }else{
            return -1;
        }
    }
}

public class L6Q1_Montanha_Russa_no_Del_Perro_Pier {
    public static void main(String[] args) {
        boolean achou = false;
        int bilhete = 0, i;
        Lista numeros = new Lista(0);
        Scanner in = new Scanner(System.in);
        while (bilhete != -1){
            bilhete = in.nextInt();
            numeros.inserir(bilhete);
        }
        int sorteado = in.nextInt();
        int achado = numeros.procurar(sorteado);
        if(achado == -1){
            System.out.println("Nenhum carrinho foi sorteado");
        }else{
            System.out.println("O bilhete sorteado e o " + sorteado + " e esta no carrinho " + achado);
        }
    }
}