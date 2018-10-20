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
        int bilhete = 0;
        Lista numeros = new Lista();
        Scanner in = new Scanner(System.in);
        while (bilhete != -1){
            bilhete = in.nextInt();
            numeros.inserir(bilhete);
        }
        int sorteado = in.nextInt();
        for(int i = 0; i<numeros.toString().split(",").length; i++){
            if(numeros.toString().split(",")[i].equals())
        }
    }
}
