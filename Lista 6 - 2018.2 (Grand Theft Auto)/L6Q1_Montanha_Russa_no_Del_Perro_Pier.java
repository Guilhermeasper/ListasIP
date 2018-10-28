import java.util.Scanner;

// Classe da lista de números
class ListaNumeros {
    private int numeroDaSorte;
    private int indice;
    private ListaNumeros proximo;

    // Método construtor da lista que recebe indice inicial
    ListaNumeros(int indice) {
        this.numeroDaSorte = -1;
        this.proximo = null;
        this.indice = indice;
    }

    // Método de inserção que insere um número e aumenta em 1 o indice do próximo
    void inserir(int numero) {
        if (this.numeroDaSorte == -1) {
            this.numeroDaSorte = numero;
            this.indice += 1;
            this.proximo = new ListaNumeros(this.indice);
        } else {
            this.proximo.inserir(numero);
        }
    }

    // Método de procura do indice de um dado número, caso não exista, retorna -1
    int procurar(int numero) {
        if (this.numeroDaSorte == numero) {
            return this.indice;
        } else if (this.proximo != null) {
            return this.proximo.procurar(numero);
        } else {
            return -1;
        }
    }
}

public class L6Q1_Montanha_Russa_no_Del_Perro_Pier {
    public static void main(String[] args) {
        int bilhete = 0;
        ListaNumeros numeros = new ListaNumeros(0);
        Scanner in = new Scanner(System.in);
        while (bilhete != -1) {
            bilhete = in.nextInt();
            numeros.inserir(bilhete);
        }
        int sorteado = in.nextInt();
        int achado = numeros.procurar(sorteado);
        if (achado == -1) {
            System.out.println("Nenhum carrinho foi sorteado");
        } else {
            System.out.println("O bilhete sorteado e o " + sorteado + " e esta no carrinho " + achado);
        }
    }
}