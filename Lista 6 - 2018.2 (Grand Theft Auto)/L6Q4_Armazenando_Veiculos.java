import java.util.Scanner;

// Classe com a lista de veiculos
class ListaVeiculos {
    private String veiculos;
    private ListaVeiculos proximo;

    // Método construtor da classe
    ListaVeiculos() {
        veiculos = "";
        proximo = null;
    }

    // Método de inserção ordenada, do menor para o maior
    void inserir(String veiculos) {
        if (this.veiculos.equals("")) {
            this.veiculos = veiculos;
            this.proximo = new ListaVeiculos();
        } else if (Integer.parseInt(this.veiculos) > Integer.parseInt(veiculos)) {
            String aux = this.veiculos;
            this.veiculos = veiculos;
            this.proximo.inserir(aux);
        } else {
            this.proximo.inserir(veiculos);
        }
    }

    // Método de remover veiculo
    private void remover(String veiculos) {
        if (!this.veiculos.equals("")) {
            if (this.veiculos.equals(veiculos)) {
                this.veiculos = veiculos;
                this.veiculos = this.proximo.veiculos;
                this.proximo = this.proximo.proximo;
            } else {
                this.proximo.remover(veiculos);
            }
        }
    }

    // Método de verificação de repetição
    String repetido() {
        if ("".equals(this.veiculos)) {
            return "";
        } else {
            if (this.veiculos.equals(this.proximo.busca(this.veiculos))) {
                this.remover(this.veiculos);
                return this.veiculos + " " + this.repetido();
            } else {
                return this.proximo.repetido();
            }
        }
    }

    // Método para imprimir lista
    public String toString() {
        String resposta = "" + this.veiculos;
        if (this.proximo != null) {
            if (this.proximo.proximo != null)
                resposta = resposta + " " + this.proximo.toString();
            else
                return resposta;
        }
        return resposta;
    }

    // Método para procurar veiculo na lista
    String busca(String veiculo) {
        if (!this.veiculos.equals("")) {
            if (this.veiculos.equals(veiculo)) {
                return veiculo;
            } else {
                return this.proximo.busca(veiculo);
            }
        } else {
            return "";
        }
    }
}

public class L6Q4_Armazenando_Veiculos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ListaVeiculos carro = new ListaVeiculos();
        ListaVeiculos aviao = new ListaVeiculos();
        ListaVeiculos moto = new ListaVeiculos();
        ListaVeiculos bicicleta = new ListaVeiculos();
        ListaVeiculos tanque = new ListaVeiculos();
        ListaVeiculos submarino = new ListaVeiculos();
        String retorno;
        while (in.hasNext()) {
            String entrada = in.next();
            String veiculo = in.next();
            switch (entrada) {
                case "VERIFICAR":
                    switch (veiculo.substring(0, 2)) {
                        case "67":
                            if (carro.busca(veiculo).equals(veiculo)) {
                                System.out.println("EXISTE");
                            } else {
                                System.out.println("AINDA NAO");
                            }
                            break;
                        case "65":
                            if (aviao.busca(veiculo).equals(veiculo)) {
                                System.out.println("EXISTE");
                            } else {
                                System.out.println("AINDA NAO");
                            }
                            break;
                        case "77":
                            if (moto.busca(veiculo).equals(veiculo)) {
                                System.out.println("EXISTE");
                            } else {
                                System.out.println("AINDA NAO");
                            }
                            break;
                        case "66":
                            if (bicicleta.busca(veiculo).equals(veiculo)) {
                                System.out.println("EXISTE");
                            } else {
                                System.out.println("AINDA NAO");
                            }
                            break;
                        case "84":
                            if (tanque.busca(veiculo).equals(veiculo)) {
                                System.out.println("EXISTE");
                            } else {
                                System.out.println("AINDA NAO");
                            }
                            break;
                        default:
                            if (submarino.busca(veiculo).equals(veiculo)) {
                                System.out.println("EXISTE");
                            } else {
                                System.out.println("AINDA NAO");
                            }
                            break;
                    }
                    break;
                case "IMPRIMIR":
                    switch (veiculo.substring(0, 2)) {
                        case "67":
                            retorno = carro.toString();
                            if (retorno.equals("")) {
                                System.out.println("A GARAGEM ESTA VAZIA :(");
                            } else {
                                System.out.println(retorno);
                            }
                            break;
                        case "65":
                            retorno = aviao.toString();
                            if (retorno.equals("")) {
                                System.out.println("A GARAGEM ESTA VAZIA :(");
                            } else {
                                System.out.println(retorno);
                            }
                            break;
                        case "77":
                            retorno = moto.toString();
                            if (retorno.equals("")) {
                                System.out.println("A GARAGEM ESTA VAZIA :(");
                            } else {
                                System.out.println(retorno);
                            }
                            break;
                        case "66":
                            retorno = bicicleta.toString();
                            if (retorno.equals("")) {
                                System.out.println("A GARAGEM ESTA VAZIA :(");
                            } else {
                                System.out.println(retorno);
                            }
                            break;
                        case "84":
                            retorno = tanque.toString();
                            if (retorno.equals("")) {
                                System.out.println("A GARAGEM ESTA VAZIA :(");
                            } else {
                                System.out.println(retorno);
                            }
                            break;
                        default:
                            retorno = submarino.toString();
                            if (retorno.equals("")) {
                                System.out.println("A GARAGEM ESTA VAZIA :(");
                            } else {
                                System.out.println(retorno);
                            }
                    }
                    break;
                case "VEICULO!!!":
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
                    break;
                default:
                    switch (veiculo.substring(0, 2)) {
                        case "67":
                            String aux1 = carro.repetido();
                            if (!"".equals(aux1)) {
                                System.out.println(aux1.substring(0, aux1.length() - 1));
                            } else {
                                System.out.println("NADA REPETIDO POR ENQUANTO :)");
                            }
                            break;
                        case "65":
                            String aux2 = aviao.repetido();
                            if (!"".equals(aux2)) {
                                System.out.println(aux2.substring(0, aux2.length() - 1));
                            } else {
                                System.out.println("NADA REPETIDO POR ENQUANTO :)");
                            }
                            break;
                        case "77":
                            String aux3 = moto.repetido();
                            if (!"".equals(aux3)) {
                                System.out.println(aux3.substring(0, aux3.length() - 1));
                            } else {
                                System.out.println("NADA REPETIDO POR ENQUANTO :)");
                            }
                            break;
                        case "66":
                            String aux4 = bicicleta.repetido();
                            if (!"".equals(aux4)) {
                                System.out.println(aux4.substring(0, aux4.length() - 1));
                            } else {
                                System.out.println("NADA REPETIDO POR ENQUANTO :)");
                            }
                            break;
                        case "84":
                            String aux5 = tanque.repetido();
                            if (!"".equals(aux5)) {
                                System.out.println(aux5.substring(0, aux5.length() - 1));
                            } else {
                                System.out.println("NADA REPETIDO POR ENQUANTO :)");
                            }
                            break;
                        default:
                            String aux6 = submarino.repetido();
                            if (!"".equals(aux6)) {
                                System.out.println(aux6.substring(0, aux6.length() - 1));
                            } else {
                                System.out.println("NADA REPETIDO POR ENQUANTO :)");
                            }
                    }
                    break;
            }
        }
    }
}
