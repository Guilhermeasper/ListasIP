import java.util.Scanner;

class ListaEstantes {
    private String livros;
    private ListaEstantes proximo;
    public ListaEstantes () {
        this.livros = " ";
        this.proximo = null;
    }
    public void inserir(String livro) {
        if (this.livros.equals(" ")) {
            this.livros = livro;
            this.proximo = new ListaEstantes();
        } else {
            this.proximo.inserir(livro);
        }
    }
    public int procurar(int indice){
        if(this.livros.equals("Livro de Rimas")){
            return indice+1;
        }else if(this.proximo != null){
            return this.proximo.procurar(indice+1);
        }else{
            return -1;
        }
    }
}

public class L6Q2_Livro_de_Rimas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean achou = false;
        int quantidade = in.nextInt();
        int posLivro = 0, i;
        if(quantidade>0) {
            ListaEstantes[] estantes = new ListaEstantes[quantidade];
            for (i = 0; i < estantes.length; i++) {
                int quantidadeLivros = in.nextInt();
                in.nextLine();
                estantes[i] = new ListaEstantes();
                for (int j = 0; j < quantidadeLivros; j++) {

                    String livro = in.nextLine();
                    estantes[i].inserir(livro);
                }
            }
            for (i = 0; i < estantes.length && !achou; i++) {
                posLivro = estantes[i].procurar(0);
                if (posLivro != -1 && !achou) {
                    achou = true;
                }
            }
            if (achou) {
                System.out.printf("Og Loc, o livro esta na estante %d, na posicao  %d", i, posLivro);
            } else {
                System.out.println("Og Loc, o livro nao esta aqui!");
            }
        }else{
            System.out.println("Nao tem livros por aqui");
        }
    }
}
