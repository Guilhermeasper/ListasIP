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
    public int[] procurar(int numero, int indice){
        if(this.numeroDaSorte == numero){
            return new int[]{this.numeroDaSorte, indice+1};
        }else if(this.proximo != null){
            return this.proximo.procurar(numero, indice+1);
        }else{
            return new int[]{-1, indice+1};
        }
    }
}


public class L6Q1_Montanha_Russa_no_Del_Perro_Pier {
    public static void main(String[] args) {
        boolean achou = false;
        int bilhete = 0, i;
        Lista numeros = new Lista();
        Scanner in = new Scanner(System.in);
        while (bilhete != -1){
            bilhete = in.nextInt();
            numeros.inserir(bilhete);
        }
        int sorteado = in.nextInt();
        int[] achado = numeros.procurar(sorteado, 0);
        if(achado[0] == -1){
            System.out.println("Nenhum carrinho foi sorteado");
        }else{
            System.out.println("O bilhete sorteado e o " + sorteado + " e esta no carrinho " + achado[1]);
        }
    }
}
