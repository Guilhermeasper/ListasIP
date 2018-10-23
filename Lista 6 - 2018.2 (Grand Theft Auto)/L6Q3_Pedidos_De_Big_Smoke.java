
class ListaPedidos {
    private String pedido;
    private ListaPedidos proximo;
    public ListaPedidos () {
        pedido = " ";
        proximo = null;
    }
    public void inserir(String pedido) {
        if (this.pedido == " ") {
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
                this.proximo = this.proximo.proximo/
            }
        }else{
            this.remover(pedido);
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

public class L6Q3_Pedidos_De_Big_Smoke {
    public static void main(String[] args) {

    }
}
