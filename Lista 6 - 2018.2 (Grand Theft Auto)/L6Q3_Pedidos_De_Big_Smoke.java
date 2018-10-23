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
    public int remover(String pedido){
        if(!this.pedido.equals(" ")){
            if(this.pedido.equals(pedido)){
                this.pedido = pedido;
                this.pedido = this.proximo.pedido;
                this.proximo = this.proximo.proximo;
                if(this.pedido.equals(" ")){
                    return -1;
                }
                return 0;
            } else {
                this.proximo.remover(pedido);
            }
        }else{
            return -1;
        }
        return -1;
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
        int nullPointer = -1;
        Scanner in = new Scanner(System.in);
        ListaPedidos pedidos = new ListaPedidos();
        String pedido = "";
        while(in.hasNextLine() && !pedido.equals("The End")){
            pedido = in.nextLine();
            if(!pedido.equals("The End")){
                nullPointer = 0;
                pedidos.inserir(pedido);
            }
        }
        while(in.hasNextLine()){
            pedido = in.nextLine();
            if(pedido != null)
                nullPointer = pedidos.remover(pedido);
        }
        pedido = pedidos.toString();
        System.out.print(pedido);
        if(pedido == null && nullPointer == -1){
            System.out.println("U gotta null pointer ma man");
        }
    }
}
