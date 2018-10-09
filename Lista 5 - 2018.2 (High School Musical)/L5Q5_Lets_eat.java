import java.util.Scanner;

public class L5Q5_Lets_eat {
    private static String[] comer(String[] amigos, String[] teste, int i){
        teste[amigos.length-1-i] = amigos[i];
        if(i==amigos.length-1){
            return teste;
        }else{
            return comer(amigos, teste, i+1);
        }
    }
    private static String distribuir(String[] invertida,int i, int comida){
        if(i==invertida.length){
            return "";
        }else if(Integer.parseInt(invertida[i].split(" ")[1])-comida>0){
            return "\n"+invertida[i].split(" ")[0]+" foi servido(a)."
                    +"\n"+"Fica tranquilo(a) "+invertida[i].split(" ")[0]+", pode se servir novamente!"
                    +distribuir(invertida, i, comida+400);
        }else{
            return "\n"+invertida[i].split(" ")[0]+" foi servido(a)."
                    +distribuir(invertida, i+1, 400);
        }
    }
    public static void main(String[] args) {
        int amigos;
        Scanner in = new Scanner(System.in);
        amigos = in.nextInt();
        in.nextLine();
        String[] refeitorio = new String[amigos];
        for(int i = 0; i < refeitorio.length; i++){
            refeitorio[i] = in.nextLine();
        }
        String[] vazia = new String[amigos];
        String[] invertida = comer(refeitorio, vazia, 0);
        System.out.println(distribuir(invertida,0, 400));

    }
}