import java.util.Scanner;

// Classe com a lista de pedidos
class ListaPedidos {
    private String pedido;
    private ListaPedidos proximo;

    // Método construtor da classe
    ListaPedidos() {
        pedido = " ";
        proximo = null;
    }

    // Método de inserção
    void inserir(String pedido) {
        if (this.pedido.equals(" ")) {
            this.pedido = pedido;
            this.proximo = new ListaPedidos();
        } else {
            this.proximo.inserir(pedido);
        }
    }

    // Método de remoção de pedido
    void remover(String pedido) {
        if (!this.pedido.equals(" ")) {
            if (this.pedido.equals(pedido)) {
                this.pedido = pedido;
                this.pedido = this.proximo.pedido;
                this.proximo = this.proximo.proximo;
            } else {
                this.proximo.remover(pedido);
            }
        }
    }

    // Método para imprimir lista de pedidos
    public String toString() {
        String resposta = "" + this.pedido;
        if (this.proximo != null) {
            if (this.proximo.proximo != null)
                resposta = resposta + "\n" + this.proximo.toString();
            else
                return resposta;
        }
        return resposta;
    }

    boolean vazia() {
        return this.pedido.equals("");
    }
}

public class L6Q3_Pedidos_De_Big_Smoke {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ListaPedidos pedidos = new ListaPedidos();
        String pedido = "";
        while (in.hasNextLine() && !pedido.equals("The End")) {
            pedido = in.nextLine();
            if (!pedido.equals("The End")) {
                pedidos.inserir(pedido);
            }
        }
        while (in.hasNextLine()) {
            pedido = in.nextLine();
            if (!pedido.equals("")) {
                pedidos.remover(pedido);
            }
        }
        System.out.print(pedidos.toString());
        if (pedidos.vazia()) {
            System.out.println("U gotta null pointer ma man");
        }
    }
}
