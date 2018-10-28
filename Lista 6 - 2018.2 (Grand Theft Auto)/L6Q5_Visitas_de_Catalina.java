import java.util.Scanner;

// Classe com a lista de locais
class ListaLocais {
    private String locais;
    private int distancia;
    private ListaLocais proximo;

    // Método construtor
    public ListaLocais() {
        locais = "";
        distancia = -1;
        proximo = null;
    }

    // Método de inserção ordenado
    public void inserir(String locais, int distancia) {
        if (this.locais.equals("")) { // É o ultimo, então insere e cria o próximo
            this.locais = locais;
            this.distancia = distancia;
            this.proximo = new ListaLocais();
        } else if (distancia < this.distancia) { // É menor que a distancia atual, insere na posição atual
            String aux = this.locais;
            int aux2 = this.distancia;
            this.locais = locais;
            this.distancia = distancia;
            this.proximo.inserir(aux, aux2); // Chama o método inserir para quem estava nessa posição
        } else {
            this.proximo.inserir(locais, distancia); // Não é o último, nem menor que o elemento a inserir
        }
    }

    // Método para imprimir lista
    public String toString() {
        String resposta = "" + this.locais;
        if (this.proximo != null) {
            if (this.proximo.proximo != null)
                resposta = resposta + "\n" + this.proximo.toString();
            else
                return resposta;
        }
        return resposta;
    }
}

public class L6Q5_Visitas_de_Catalina {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ListaLocais locais = new ListaLocais();
        while (in.hasNext()) {
            String local = in.nextLine();
            int distancia = Integer.parseInt(in.nextLine());
            locais.inserir(local, distancia);
        }
        System.out.println(locais.toString());
    }
}