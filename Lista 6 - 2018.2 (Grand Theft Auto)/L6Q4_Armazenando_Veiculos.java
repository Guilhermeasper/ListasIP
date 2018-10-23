import java.util.Scanner;

class ListaVeiculos {
    private String veiculos;
    private ListaVeiculos proximo;
    public ListaVeiculos () {
        veiculos = " ";
        proximo = null;
    }
    public void inserir(String veiculos) {
        if (this.veiculos.equals(" ")) {
            this.veiculos = veiculos;
            this.proximo = new ListaVeiculos();
        } else {
            this.proximo.inserir(veiculos);
        }
    }
    public void remover(String veiculos){
        if(!this.veiculos.equals(" ")){
            if(this.veiculos.equals(veiculos)){
                this.veiculos = veiculos;
                this.veiculos = this.proximo.veiculos;
                this.proximo = this.proximo.proximo;
            } else {
                this.proximo.remover(veiculos);
            }
        }
    }
    public String repetido(String veiculos){
        if(this.veiculos.equals(" ")){
            return "";
        }else{
            if(this.veiculos.equals(this.proximo.busca(this.veiculos))){
                this.remover(this.veiculos);
                return veiculos + " " + this.repetido(this.proximo.veiculos);
            }else{
                return this.proximo.repetido(this.proximo.veiculos);
            }
        }
    }
    public String toString() {
        String resposta = "" + this.veiculos;
        if (this.proximo != null) {
            resposta = resposta + " " + this.proximo.toString();
        }
        return resposta;
    }
    public String busca(String veiculo){
        if(!this.veiculos.equals(" ")){
            if(this.veiculos.equals(veiculo)){
                return veiculo;
            }else{
                return this.proximo.busca(veiculo);
            }
        }else{
            return "AINDA NAO";
        }
    }
}

public class L6Q4_Armazenando_Veiculos {
    private static String organiza(String veiculos){
        if("".equals(veiculos)){
            return "";
        }else{
            int[] teste = new int[veiculos.split(" ").length];
            String retorno = "";
            for(int i = 0; i<veiculos.split(" ").length; i++){
                teste[i] = Integer.parseInt(veiculos.split(" ")[i]);
            }
            for(int i = 0; i<teste.length-1; i++){
                for(int j = 0; j<teste.length; j++){
                    if(teste[j]>teste[i+1]){
                        int aux = teste[i];
                        teste [j] = teste[i+1];
                        teste [i+1] = aux;
                    }
                }
            }
            for(int i = 0; i<veiculos.split(" ").length; i++){
                retorno += " " + teste[i];
            }
            return retorno;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ListaVeiculos carro = new ListaVeiculos();
        ListaVeiculos aviao = new ListaVeiculos();
        ListaVeiculos moto = new ListaVeiculos();
        ListaVeiculos bicicleta = new ListaVeiculos();
        ListaVeiculos tanque = new ListaVeiculos();
        ListaVeiculos submarino = new ListaVeiculos();
        String retorno;
        while(in.hasNext()){
            String entrada = in.next();
            String veiculo = in.next();
            if(entrada.equals("VERIFICAR")){
                switch (veiculo.substring(0, 2)) {
                    case "67":
                        if (carro.busca(entrada).equals(entrada)) {
                            System.out.println("EXISTE");
                        } else {
                            System.out.println("AINDA NAO");
                        }
                        break;
                    case "65":
                        if (aviao.busca(entrada).equals(entrada)) {
                            System.out.println("EXISTE");
                        } else {
                            System.out.println("AINDA NAO");
                        }
                        break;
                    case "77":
                        if (moto.busca(entrada).equals(entrada)) {
                            System.out.println("EXISTE");
                        } else {
                            System.out.println("AINDA NAO");
                        }
                        break;
                    case "66":
                        if (bicicleta.busca(entrada).equals(entrada)) {
                            System.out.println("EXISTE");
                        } else {
                            System.out.println("AINDA NAO");
                        }
                        break;
                    case "84":
                        if (tanque.busca(entrada).equals(entrada)) {
                            System.out.println("EXISTE");
                        } else {
                            System.out.println("AINDA NAO");
                        }
                        break;
                    default:
                        if (submarino.busca(entrada).equals(entrada)) {
                            System.out.println("EXISTE");
                        } else {
                            System.out.println("AINDA NAO");
                        }
                        break;
                }
            }else if(entrada.equals("IMPRIMIR")){
                switch (veiculo.substring(0, 2)) {
                    case "67":
                        retorno = organiza(carro.toString());
                        if(retorno.equals("")){
                            System.out.println("A GARAGEM ESTA VAZIA :(");
                        }else{
                            System.out.println(retorno);
                        }
                        break;
                    case "65":
                        retorno = organiza(aviao.toString());
                        if(retorno.equals("")){
                            System.out.println("A GARAGEM ESTA VAZIA :(");
                        }else{
                            System.out.println(retorno);
                        }
                        break;
                    case "77":
                        retorno = organiza(moto.toString());
                        if(retorno.equals("")){
                            System.out.println("A GARAGEM ESTA VAZIA :(");
                        }else{
                            System.out.println(retorno);
                        }
                        break;
                    case "66":
                        retorno = organiza(bicicleta.toString());
                        if(retorno.equals("")){
                            System.out.println("A GARAGEM ESTA VAZIA :(");
                        }else{
                            System.out.println(retorno);
                        }
                        break;
                    case "84":
                        retorno = organiza(tanque.toString());
                        if(retorno.equals("")){
                            System.out.println("A GARAGEM ESTA VAZIA :(");
                        }else{
                            System.out.println(retorno);
                        }
                        break;
                    default:
                        retorno = organiza(submarino.toString());
                        if(retorno.equals("")){
                            System.out.println("A GARAGEM ESTA VAZIA :(");
                        }else{
                            System.out.println(retorno);
                        }
                }
            }else if(entrada.equals("VEICULO!!!")){
                switch (veiculo.substring(0, 2)) {
                    case "67":
                        carro.inserir(veiculo);
                        break;
                    case "65":
                        aviao.inserir(veiculo);
                        break;
                    case "77":
                        moto.inserir(veiculo);
                        break;
                    case "66":
                        bicicleta.inserir(veiculo);
                        break;
                    case "84":
                        tanque.inserir(veiculo);
                        break;
                    case "83":
                        submarino.inserir(veiculo);
                        break;
                    default:
                        System.out.println("VERIFICAR TIPO DE VEICULO");
                        break;
                }
            }else{
                switch (veiculo.substring(0, 2)) {
                    case "67":
                        System.out.println(carro.repetido(""));
                        break;
                    case "65":
                        System.out.println(aviao.repetido(""));
                        break;
                    case "77":
                        System.out.println(moto.repetido(""));
                        break;
                    case "66":
                        System.out.println(bicicleta.repetido(""));
                        break;
                    case "84":
                        System.out.println(tanque.repetido(""));
                        break;
                    default:
                        System.out.println(submarino.repetido(""));
                }
            }
        }

    }
}
