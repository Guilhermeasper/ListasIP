import java.util.Scanner;

class ListaPedidos {
    private String pedido;
    private ListaPedidos proximo;
    public ListaPedidos () {
        pedido = " ";
        proximo = null;
    }
    public void inserir(String pedido) {
        if (this.pedido.equals(" ")) {
            this.pedido = pedido;
            this.proximo = new ListaPedidos();
        } else {
            this.proximo.inserir(pedido);
        }
    }
    public void remover(String pedido){
        if(!this.pedido.equals(" ")){
            if(this.pedido.equals(pedido)){
                this.pedido = pedido;
                this.pedido = this.proximo.pedido;
                this.proximo = this.proximo.proximo;
            } else {
                this.proximo.remover(pedido);
            }
        }
    }
    public String toString() {
        String resposta = "" + this.pedido;
        if (this.proximo != null) {
            resposta = resposta + "\n" + this.proximo.toString();
        }
        return resposta;
    }
}

public class L6Q3_Pedidos_De_Big_Smoke {
    public static void main(String[] args) {
        int nullPointer = 0;
        Scanner in = new Scanner(System.in);
        ListaPedidos pedidos = new ListaPedidos();
        String pedido = "";
        while(in.hasNextLine() && !pedido.equals("The End")){
            pedido = in.nextLine();
            if(!pedido.equals("The End")){
                pedidos.inserir(pedido);
                nullPointer += 1;
            }
        }
        while(in.hasNextLine()){
            pedido = in.nextLine();
            if(pedido != null) {
                pedidos.remover(pedido);
                nullPointer -= 1;
            }
        }
        pedido = pedidos.toString();
        System.out.print(pedido);
        if(nullPointer == 0){
            System.out.println("U gotta null pointer ma man");
        }
    }
}
